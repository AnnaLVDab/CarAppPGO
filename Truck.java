public class Truck extends Vehicle{

   private double milesDriven;
   private double fuelConsumed; // w galonach?
   private double cargoWeight; // w tonach?

    public Truck(String mark, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(mark, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
