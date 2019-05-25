package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;

public class Car {

    private String bodyNumber;
    private int year;
    private String brand;
    private double cost;
    private int kilometrage;
    private int warrantyPeriod;

    public Car() {
        bodyNumber = "";
        year = DEFAULT_VALUE;
        brand = "no name";
        cost = DEFAULT_VALUE;
        kilometrage = DEFAULT_VALUE;
        warrantyPeriod = DEFAULT_VALUE;
    }

    public Car(String bodyNumber, int year, String brand, int cost, int kilometrage, int warrantyPeriod) {
        this.bodyNumber = bodyNumber;
        this.year = year;
        this.brand = brand;
        this.cost = cost;
        this.kilometrage = kilometrage;
        this.warrantyPeriod = warrantyPeriod;
    }

    public Car(Car car) {
        bodyNumber = car.bodyNumber;
        year = car.year;
        brand = car.brand;
        cost = car.cost;
        kilometrage = car.kilometrage;
        warrantyPeriod = car.warrantyPeriod;
    }

    public String getBodyNumber() {
        return bodyNumber;
    }

    public void setBodyNumber(String bodyNumber) throws DataException {
        if (bodyNumber != null) {
            this.bodyNumber = bodyNumber;

        } else {
            throw new DataException("Brand cannot be null\n");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws DataException {
        if (year > RELEASE_FIRST_CAR) {
            this.year = year;
        } else {
            throw new DataException("Year of manufacture must be greater than "
                    + RELEASE_FIRST_CAR + "\n");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws DataException {
        if (brand != null) {
            this.brand = brand;

        } else {
            throw new DataException("Brand cannot be null\n");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) throws DataException {
        if (cost > DEFAULT_VALUE) {
            this.cost = cost;

        } else {
            throw new DataException("Price must be greater than 0\n");
        }
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) throws DataException {
        if (kilometrage > DEFAULT_VALUE) {
            this.kilometrage = kilometrage;

        } else {
            throw new DataException("Kilometrage cannot be less than 0\n");
        }
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) throws DataException {
        if (warrantyPeriod > 0) {
            this.warrantyPeriod = warrantyPeriod;

        } else {
            throw new DataException("Warranty period cannot be less than 0\n");
        }

    }

    @Override
    public String toString() {
        return brand + ":  body number:" + bodyNumber + ", year:" + year
                + ", cost:" + cost + "$, kilometrage:" + kilometrage
                + ", warranty period:" + warrantyPeriod + " year";
    }
}
