package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

public class MiniBus extends Car{ //коструктрр копирования
    private final int MIN_NUMBER_OF_SEATS = 10;
    
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if(numberOfSeats > MIN_NUMBER_OF_SEATS)
        this.numberOfSeats = numberOfSeats;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", number of seats for passengers:" 
                + numberOfSeats + ")";
    }
    
}
