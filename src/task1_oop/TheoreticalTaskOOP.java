package task1_oop;

/**
 * 1.Какие принципы ООП реализованы в Java?
 * 2.Что такое прокси-классы и как они могут быть использованы для управления доступом к объектам?
 * */
public class TheoreticalTaskOOP {

    /**
     * Какие принципы ООП реализованы в коде ниже *
     * */
    interface Shape {
        double calculateArea();
    }

    class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle implements Shape {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }




























    /**
     * 2.Прокси-классы (или прокси-объекты) являются объектами, которые выступают в качестве посредников или
     * заместителей для других объектов. Они используются для управления доступом к объектам, контроля их поведения
     * и обеспечения дополнительной функциональности без изменения кода самого объекта. Прокси-классы полезны в следующих
     * случаях:
     *
     * Ленивая загрузка (Lazy Loading): Прокси может загружать объект только при необходимости, что полезно при работе
     * с большими данными или ресурсами.
     * Контроль доступа: Прокси может проверять права доступа к объекту и разрешать или запрещать операции.
     * Логирование: Прокси может вести журнал действий, выполняемых над объектом.
     * Кэширование: Прокси может кэшировать результаты выполнения методов для оптимизации производительности.
     *
     *
     * 3.наследование и полиморфизм
     */

}