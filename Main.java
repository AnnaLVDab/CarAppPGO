public class Main {
    public static void main(String[] args) {
        Car car = new Car("mark", "model", 2024, 23456, 2679);
        System.out.println(car.calculateFuelEfficiency());

        Truck truck = new Truck("mark", "model", 2024, 12345, 6789, 1234);
        System.out.println(truck.calculateFuelEfficiency());
    }
}