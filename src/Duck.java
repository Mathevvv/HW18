public class Duck extends Animal {

    public Duck(double weight, double age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("Утка по имени " + getName() + " летит в облаках");
    }

}