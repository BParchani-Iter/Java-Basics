package oopsandcollections;

public class Car extends Vehicle implements Drivable {
    private int doorNum;

    public Car(String brand, String model, int year, int doorNum) {
        super(brand, model, year);
        this.doorNum = doorNum;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 8000;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " Car started");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println(getBrand() + " Car speeding up");
    }
}