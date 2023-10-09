package task2_java;

public class TheoreticalTaskJava {

    /**
     * Где будут храниться данные переменные при выполнении кода?
     */


        public static void main(String[] args) {
            int x = 5;
            String str = "Hello";
            Object obj = new Object();
        }


    /**
     * Какие классы могут получить доступ к переменным ?

     */
    class MemoryTest1 {
        public static void main(String[] args) {
            int y = 5;
            String string = "Hello";
            Object object = new Object();
        }
    }

    /**
     * Каков порядок жизни и уничтожения объектов в Java?
     */


    /**
     * При вызове doSomething() будет использоваться метод из ?
     */
    public interface  A {
        default void doSomething() {
            System.out.println("Метод в Interface A");
        }
    }

    public interface B extends  A {
        default void doSomething() {
            System.out.println("Метод в Interface B");
        }
    }

    public class ClassA implements  A,  B {

    }



















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
