public class Dog extends Animal {

    public Dog(double weight, double age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("Собака по кличке " + getName() + " бежит по земле");
    }

}
