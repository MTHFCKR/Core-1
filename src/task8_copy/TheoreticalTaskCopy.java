package task8_copy;

/**
 * 1.Что такое "конструктор клона" (copy constructor) и в чем его отличие от метода clone() при создании копии объекта?
 * Какие преимущества и недостатки у каждого из подходов?
 *
 * 2.Какие существуют альтернативы интерфейсу Cloneable для создания копий объектов,
 * и какие они могут быть полезны в более сложных сценариях клонирования?
 */
public class TheoreticalTaskCopy {
    static class Person implements Cloneable {
        private final String name;
        private String[] friends;
        private int friendCount;

        public Person(String name, int maxFriends) {
            this.name = name;
            this.friends = new String[maxFriends];
            this.friendCount = 0;
        }

        public void addFriend(String friend) {
            if (friendCount < friends.length) {
                friends[friendCount] = friend;
                friendCount++;
            }
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            Person cloned = (Person) super.clone();
            cloned.friends = new String[this.friends.length];
            System.arraycopy(this.friends, 0, cloned.friends, 0, this.friends.length);
            return cloned;
        }

        public void printFriends() {
            System.out.print(name + "'s friends: ");
            for (int i = 0; i < friendCount; i++) {
                System.out.print(friends[i]);
                if (i < friendCount - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person originalPerson = new Person("Alice", 3);
        originalPerson.addFriend("Bob");
        originalPerson.addFriend("Charlie");

        Person clonedPerson = (Person) originalPerson.clone();
        clonedPerson.addFriend("David");

        originalPerson.printFriends();
        clonedPerson.printFriends();
    }
}



















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

