public class Main {
    public static void main(String[] args) {
       //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.

        Dog grizly = new Dog(8.0, 9.1, "Гризли");
        grizly.move();
        grizly.walk();

        System.out.println();

        Duck donald = new Duck(2.5, 5.5, "Дональд");
        donald.move();
        donald.walk();


    }
}
