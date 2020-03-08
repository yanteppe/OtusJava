package ru.otus.orm.jdbc.session_manager;

import ru.otus.orm.core.session_manager.SessionManager;
import ru.otus.orm.core.session_manager.SessionManagerException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class SessionManagerJdbc implements SessionManager {
    private static final int TIMEOUT_IN_SECONDS = 5;
    private final DataSource dataSource;
    private Connection connection;
    private DatabaseSessionJdbc databaseSession;

    public SessionManagerJdbc(DataSource dataSource) {
        if (dataSource == null) {
            throw new SessionManagerException("Datasource is null");
        }
        this.dataSource = dataSource;
    }

    @Override
    public void beginSession() {
        try {
            connection = dataSource.getConnection();
            databaseSession = new DatabaseSessionJdbc(connection);
        } catch (SQLException e) {
            throw new SessionManagerException(e);
        }
    }

    @Override
    public void commitSession() {
        checkConnection();
        try {
            connection.commit();
        } catch (SQLException e) {
            throw new SessionManagerException(e);
        }
    }

    @Override
    public void rollbackSession() {
        checkConnection();
        try {
            connection.rollback();
        } catch (SQLException sqlException) {
            throw new SessionManagerException(sqlException);
        }
    }

    @Override
    public void close() {
        checkConnection();
        try {
            connection.close();
        } catch (SQLException sqlException) {
            throw new SessionManagerException(sqlException);
        }
    }

    @Override
    public DatabaseSessionJdbc getCurrentSession() {
        checkConnection();
        return databaseSession;
    }

    private void checkConnection() {
        try {
            if (connection == null || !connection.isValid(TIMEOUT_IN_SECONDS)) {
                throw new SessionManagerException("Connection is invalid");
            }
        } catch (SQLException sqlException) {
            throw new SessionManagerException(sqlException);
        }
    }
}
