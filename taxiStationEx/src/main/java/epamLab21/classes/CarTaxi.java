package epamLab21.classes;

/**
 * Created by TleuAkma on 05.02.2017.
 */
public abstract class CarTaxi implements Comparable<CarTaxi> {
    private String model;
    private double volumeOfEngine;
    private int modelYear;
    private int licencePlate;
    private int maxSpeed;
    private int price;
    private int petrolConsumption;

    public CarTaxi(String model, double volumeOfEngine, int modelYear, int licencePlate, int maxSpeed, int price, int petrolConsumption) {
        this.model = model;
        this.volumeOfEngine = volumeOfEngine;
        this.modelYear = modelYear;
        this.licencePlate = licencePlate;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.petrolConsumption = petrolConsumption;
    }

    public String getModel() {
        return model;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public int getPetrolConsumption() {
        return petrolConsumption;
    }




    abstract public int getFare(int distance, int travelTime);

    public int compareTo(CarTaxi carTaxi) {

        int comparePetrolConsumption = (carTaxi.getPetrolConsumption());

        return this.petrolConsumption-comparePetrolConsumption;
    }


    @Override
    public String toString() {
        return "CarTaxi{" +
                "model='" + model + '\'' +
                ", volumeOfEngine=" + volumeOfEngine +
                ", petrolConsumption=" + petrolConsumption +
                '}';
    }
}
