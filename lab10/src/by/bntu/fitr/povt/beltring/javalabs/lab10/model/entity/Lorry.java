package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.exception.DataException;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;

public class Lorry extends Car {

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

    public Lorry(Lorry lorry) {
        super(lorry);
        this.cargoCapacity = lorry.cargoCapacity;
        this.cargoHeight = lorry.cargoHeight;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) throws DataException {
        if (cargoCapacity < MIN_CARGO_CAPACITY) {
            throw new DataException("Load capacity should be more than "
                    + MIN_CARGO_CAPACITY + "\n");
        }
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoHeight() {
        return cargoHeight;
    }

    public void setCargoHeight(double cargoHeight) throws DataException {
        if (cargoHeight < 0) {
            throw new DataException("Height must be greater than 0\n");
        }
        this.cargoHeight = cargoHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", cargo capacity:" + cargoCapacity
                + " tons', cargo height:"
                + cargoHeight + " metres' \n";
    }

}
