package task8_copy;

/**
 * Напишите пример глубокого копирования.
 */
public class PracticeTaskCopy {


















































//    static class Address {
//        private String street;
//
//        public Address(String street) {
//            this.street = street;
//        }
//
//        public String getStreet() {
//            return street;
//        }
//
//        public void setStreet(String street) {
//            this.street = street;
//        }
//
//        public Address clone() {
//            return new Address(this.street);
//        }
//    }
//
//    static class Person {
//        private String name;
//        private Address address;
//
//        public Person(String name, Address address) {
//            this.name = name;
//            this.address = address;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Address getAddress() {
//            return address;
//        }
//
//        public Person clone() {
//            return new Person(this.name, this.address.clone());
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Address address = new Address("123 Main St");
//        Person originalPerson = new Person("Alice", address);
//
//        Person copiedPerson = originalPerson.clone();
//
//        // Изменяем адрес в скопированном объекте
//        copiedPerson.getAddress().setStreet("456 Elm St");
//
//        // Проверяем, что адрес в оригинальном объекте не изменился
//        System.out.println("Оригинальный адрес: " + originalPerson.getAddress().getStreet());
//        System.out.println("Копированный адрес: " + copiedPerson.getAddress().getStreet());
//    }
}
