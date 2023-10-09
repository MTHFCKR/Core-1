package task2_java;

public class TheoryTaskJava {

    /**
     * Где будут храниться данные переменные при выполнении кода?
     */

    class MemoryTest {
        public static void main(String[] args) {
            int x = 5;
            String str = "Hello";
            Object obj = new Object();
        }
    }

    /**
     * Какие классы могут получить доступ к переменным ?

     */
    class MemoryTest1 {
        public static void main(String[] args) {
            int x = 5;
            String str = "Hello";
            Object obj = new Object();
        }
    }

    /**
     * Каков порядок жизни и уничтожения объектов в Java?
     */




















    /**
     * 1. стек , куча , куча
     * 2. примитив только внутри класса , остальные доступны везде
     * 3.Объекты в Java создаются в куче (heap) во время выполнения программы
     *       и уничтожаются автоматически, когда на них нет ссылок. Когда объект больше не доступен,
     *       он подвергается сборке мусора (garbage collection) и освобождает память.
     *          Управление стеком (stack) автоматически осуществляется JVM (Java Virtual Machine)
     *         для хранения данных о вызовах методов и переменных.
     */

}
