package ru.otus.hw;

import ru.otus.hw.atm.ATM;
import ru.otus.hw.atm.ATMImpl;
import ru.otus.hw.banknote.Ruble;

/**
 * ATMImpl emulator demo<br>
 * 1. Add banknotes to an ATMImpl<br>
 * 2. Display account status after inserting banknotes<br>
 * 3. Receive banknotes for the required amount<br>
 * 4. Displays the status of the account after receiving banknotes<br>
 */
public class ATMDemo {

    public static void main(String[] args) {
        ATM atm = new ATMImpl();
        atm.acceptBanknotes(Ruble.RUB_50, 3);
        atm.acceptBanknotes(Ruble.RUB_100, 3);
        atm.acceptBanknotes(Ruble.RUB_200, 3);
        atm.acceptBanknotes(Ruble.RUB_500, 3);
        atm.acceptBanknotes(Ruble.RUB_1000, 3);
        atm.acceptBanknotes(Ruble.RUB_2000, 3);
        atm.acceptBanknotes(Ruble.RUB_5000, 3);
        atm.displayAccountStatus();
        atm.getBanknotes(26550);
        atm.displayAccountStatus();
    }
}
