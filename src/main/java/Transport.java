public class Transport implements Sounding{

    private String nameBrand;
    private String modelCar;
    private int yearCar;
    private boolean isEngineOn;

    public Transport(String nameBrand, String modelCar, int year, boolean isEngineOn) {
        this.nameBrand = nameBrand;
        this.modelCar = modelCar;
        this.yearCar = year;
        this.isEngineOn = isEngineOn;
    }

    public boolean setIsEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
        System.out.println("Зажигание включено.");
        return isEngineOn;
    }

    @Override
    public void sound() {
        if (!isEngineOn) {
            System.out.println("Машина не заведина. Попробуй сначала ее завести.");
        } else {
            System.out.println("вжжжж, жжжж, жжжж.");
        }
    }
}
