**Занятие №28. JMM.**

**Цели занятия**
- Познакомиться с основными проблемами многопоточности.
- Понять зачем придумали _JMM_
- Узнать основные положения _JMM_

**Краткое содержание**
- Основная проблема многопоточности
- «Железные» оптимизации
- «Программные» оптимизации
- _JMM_
- _Volatile_
- Happens before
- Lock-free алгоритмы, _CAS_

**Результаты**
- Понимание основных принципов _JMM_

---

**Задание №14. Последовательность чисел.**

Реализовать последовательность вывода чисел на консоль.<br>
(Задача шагающего робота)

**1.** Два потока печатают числа от 1 до 10, потом от 10 до 1.

**2.** Сделать так, чтобы числа чередовались, т.е. получился такой вывод:
- Поток 1: 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 2 3 4...
- Поток 2:  1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 2 3...

**Решение**

Реализованы все требования задачи