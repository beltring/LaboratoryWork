package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.exception.DataException;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;

public class Car {

    private String bodyNumber;
    private int year;
    private String brand;
    private int cost;
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
        if (bodyNumber == null) {
            throw new DataException("Brand cannot be null\n");
        }
        this.bodyNumber = bodyNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws DataException {
        if (year < RELEASE_FIRST_CAR) {
            throw new DataException("Year of manufacture must be greater than "
                    + RELEASE_FIRST_CAR + "\n");
        }
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws DataException {
        if (brand == null) {
            throw new DataException("Brand cannot be null\n");
        }
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) throws DataException {
        if (cost <= 0) {
            throw new DataException("Price must be greater than 0\n");
        }
        this.cost = cost;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) throws DataException {
        if (kilometrage < 0) {
            throw new DataException("Kilometrage cannot be less than 0\n");
        }
        this.kilometrage = kilometrage;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) throws DataException {
        if (warrantyPeriod < 0) {
            throw new DataException("Warranty period cannot be less than 0\n");
        }
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return brand + ":  body number:" + bodyNumber + ", year:" + year
                + ", cost:" + cost + "$, kilometrage:" + kilometrage
                + ", warranty period:" + warrantyPeriod + " year";
    }
}
