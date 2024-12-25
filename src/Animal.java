abstract class Animal {

    private double weight;
    private double age;
    private String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(double weight, double age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public void walk() {
        System.out.println("Животное " + name +  " идет по земле");
    }

    abstract void move();
}
