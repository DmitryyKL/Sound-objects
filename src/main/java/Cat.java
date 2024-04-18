public class Cat implements Sounding{

    private String name;
    private String color;
    private double weight;
    private int age;

    public Cat(String name, String color, double weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void eat(){
        this.weight += 1.00;
        System.out.printf("%s поел. Теперь его вес %s.\n", name, weight);
        sound();
    }

    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
}
