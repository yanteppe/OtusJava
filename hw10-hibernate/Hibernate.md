**Занятие №20. Hibernate.**

**Цели занятия**
- Закомство с _Hibernate_

**Краткое содержание**<br>
- _Hibernate_, место _Hibernate_ в современном стеке тнхнологий
- Конфигурирование _Hibernate_ в коде и в XML.
- Java persistence query language.
- _DBSevice pattern_.

**Результаты**
- Понимание принципов работы _Hibernate_

---

**Задание №10. Использование Hibernate.**

Работа должна использовать базу данных H2.

**1.** Возьмите за основу предыдущее задание (Самодельный ORM).
и реализуйте функционал сохранения и чтения объекта `User` через Hibernate.
(Рефлексия больше не нужна)

**2.** Конфигурация Hibernate должна быть вынесена в файл.

**3.** Добавьте в User поля:
- адрес (OneToOne)
- телефон (OneToMany)

`class AddressDataSet {
private String street;
}
class PhoneDataSet {
private String number;
}`

**4.** Разметьте классы таким образом, чтобы при сохранении/чтении объека `User` каскадно сохранялись/читались вложенные
объекты.

Не забывайте про сохранение абстракций в приложении (см. комментарий в вебинаре).

**Решение**

Реализованы все требования задачи