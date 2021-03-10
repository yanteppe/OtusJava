**Занятие №7. Сборщик мусора.**

**Цели занятия**
- Знакомство со сборщиком мусора в Java

**Краткое содержание**
- Концепция сборки мусора в JVM
- Виды сборщиков мусора
- Мониторинг работы сборщиков
- Примеры проблем производительности, связанных с мусором

**Результаты**
- Понимание принципа работы сборщика мусора
- Понимание видов сборщиков - для чего они нужны, когда и какой применять

---

**Задание №3. Сравнение разных сборщиков мусора.**

Написать приложение, которое следит за сборками мусора и пишет в лог количество сборок каждого типа
(young, old) и время которое ушло на сборки в минуту.
<p>
Добиться OutOfMemory в этом приложении через медленное подтекание по памяти
(например добавлять элементы в List и удалять только половину).
<p>
Настроить приложение (можно добавлять Thread.sleep(...)) так чтобы оно падало
с OOM примерно через 5 минут после начала работы.
<p>
Собрать статистику (количество сборок, время на сборки) по разным GC.
<p>
Сделать выводы. Какой GC лучше и почему/
<p>
Выводы оформить в файле _Сonclusions.md_ в корне папки проекта.
Результаты измерений сведите в таблицу.

**Решение**

Статистика измерений сборщиков мусора выводятся на консоль.
<br>
_(Сделать таблицу...)_ 








