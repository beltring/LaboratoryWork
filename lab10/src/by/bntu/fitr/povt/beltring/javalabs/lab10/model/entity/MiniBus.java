package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;

public class MiniBus extends Car {

    private int numberOfSeats;

    public MiniBus() {
        numberOfSeats = MIN_NUMBER_OF_SEATS;
    }

    public MiniBus(int numberOfSeats, String bodyNumber, int year,
            String brand, int cost, int kilometrage, int warrantyPeriod) {

        super(bodyNumber, year, brand, cost, kilometrage, warrantyPeriod);
        this.numberOfSeats = numberOfSeats;
    }

    public MiniBus(int numberOfSeats, Car car) {
        super(car);
        this.numberOfSeats = numberOfSeats;
    }

    public MiniBus(MiniBus miniBus) {
        super(miniBus);
        this.numberOfSeats = miniBus.numberOfSeats;
    }

    @Override
    public double getCost(){
        int year = DEFAULT_YEAR_RATIO - super.getYear();
        double cost = super.getCost() * DEFAULT_RATIO * year;
        return cost;
        
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) throws DataException {
        if (numberOfSeats >= MIN_NUMBER_OF_SEATS) {
            this.numberOfSeats = numberOfSeats;

        } else {
            throw new DataException("The number of seats must be "
                    + "greater than " + MIN_NUMBER_OF_SEATS + "\n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", number of seats for passengers:"
                + numberOfSeats + "\n";
    }

}
