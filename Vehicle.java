public abstract class Vehicle {

    String mark;

    String model;
    int year;

    public Vehicle(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    abstract double calculateFuelEfficiency();
}
