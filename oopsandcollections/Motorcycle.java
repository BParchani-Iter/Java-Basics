package oopsandcollections;

public class Motorcycle extends Vehicle implements Drivable {
    private boolean sideCar;

    public Motorcycle(String brand, String model, int year, boolean sideCar){
        super(brand, model, year);
        this.sideCar = sideCar;
    }

    public boolean isSideCar(){
        return sideCar;
    }

    public void setSideCar(){
        this.sideCar = sideCar;
    }

    @Override
    public double calculateMaintenanceCost(){
        return 4500;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " Motorcycle stopped");
    }

    @Override
    public void accelerate() {
        System.out.println(getBrand() + " Motorcycle is accelerating");
    }

}