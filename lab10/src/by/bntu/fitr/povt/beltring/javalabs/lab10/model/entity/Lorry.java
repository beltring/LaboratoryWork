package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

public class Lorry extends Car { // грузовик
    private final double MIN_CARGO_CAPACITY = 1.5; // минимальная грузоподъемность
    
    private double cargoCapacity; // грузоподъемность
    private double cargoHeight; // высота груза

    public Lorry() {
        cargoCapacity = 0;
        cargoHeight = 0;
    }

    public Lorry(double cargoCapacity, double cargoHeight, String bodyNumber, int year, String brand, int cost, int kilometrage, int warrantyPeriod) {
        super(bodyNumber, year, brand, cost, kilometrage, warrantyPeriod);
        this.cargoCapacity = cargoCapacity;
        this.cargoHeight = cargoHeight;
    }

    public Lorry(double cargoCapacity, double cargoHeight, Car car) {
        super(car);
        this.cargoCapacity = cargoCapacity;
        this.cargoHeight = cargoHeight;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        if(cargoCapacity > MIN_CARGO_CAPACITY){
            this.cargoCapacity = cargoCapacity;
        }
    }

    public double getCargoHeight() {
        return cargoHeight;
    }

    public void setCargoHeight(double cargoHeight) {
        if(cargoHeight > 0){
            this.cargoHeight = cargoHeight;
        }
    }

    @Override
    public String toString() {
        return super.getBrand() + "(body number:"+ super.getBodyNumber() +", year:" 
                + super.getYear() + ", cost:" + super.getCost() + "$, kilometrage:" 
                + super.getKilometrage() + ", warranty period:" + super.getWarrantyPeriod() 
                + " year" + ", cargo capacity:" + cargoCapacity + " tons', cargo height:" 
                + cargoHeight + " metres')";
    }
    
    
}
