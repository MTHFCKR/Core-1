package task8_copy;

/**
 * 1.Что такое "конструктор клона" (copy constructor) и в чем его отличие от метода clone() при создании копии объекта?
 * Какие преимущества и недостатки у каждого из подходов?
 *
 * 2.Какие существуют альтернативы интерфейсу Cloneable для создания копий объектов,
 * и какие они могут быть полезны в более сложных сценариях клонирования?

 */
public class TheoryTaskCopy {



















    /**
     * 1.Конструктор клона (copy constructor) - это специальный конструктор, который создает новый объект путем копирования значений полей из существующего объекта. Этот конструктор позволяет создать глубокую копию объекта. В отличие от метода clone(), конструктор клона не зависит от интерфейса Cloneable и более явно контролирует процесс копирования объекта.
     * Преимущества конструктора клона:
     * Явное управление процессом клонирования.
     * Не требует реализации интерфейса Cloneable.
     * Позволяет создать неизменяемую копию объекта.
     * Недостатки конструктора клона:
     * Требует ручной реализации конструктора для каждого класса.
     * Может быть менее удобным в случае сложных иерархий классов.
     *
     * 2.Использование конструкторов клона.
     * Использование библиотек для клонирования, таких как Apache Commons Lang.
     * Создание собственного метода копирования (copy() или cloneObject()).
     * Выбор альтернативы зависит от конкретных требований и структуры классов.
     */
}
