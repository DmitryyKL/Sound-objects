public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", "черный", 4.00, 6);
        Transport bmwM5 = new Transport("BMW", "M5", 2023, false);
        Guitar elvis = new Guitar("Elvis", 2020, false);

        elvis.sound();
        bmwM5.sound();
        bmwM5.setIsEngineOn(true);
        bmwM5.sound();
        barsik.eat();
    }
}
