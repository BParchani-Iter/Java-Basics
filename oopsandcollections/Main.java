package oopsandcollections;

public class Main{
    public static void main(String[] args){
        Vehicle vehicle1 = new Car("Toyota", "Camry", 2002, 4);
        Vehicle vehicle2 = new Motorcycle("Yamaha", "R15", 2005, false);

        System.out.println("Vehicle 1");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println("Maintenance Cost:" + vehicle1.calculateMaintenanceCost());

        Drivable Car = (Drivable) vehicle1;
        Car.start();
        Car.stop();
        Car.accelerate();

        System.out.println();


        System.out.println("Vehicle 2");
        System.out.println("Brand: " + vehicle2.getBrand());
        System.out.println("Model: " + vehicle2.getModel());
        System.out.println("Year: " + vehicle2.getYear());
        System.out.println("Maintenance Cost:" + vehicle2.calculateMaintenanceCost());

        Drivable Motorcycle = (Drivable) vehicle2;
        Motorcycle.start();
        Motorcycle.stop();
        Motorcycle.accelerate();

    }
}