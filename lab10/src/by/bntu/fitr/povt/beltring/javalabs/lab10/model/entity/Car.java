package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const;

public class Car {
    private String bodyNumber;
    private int year;
    private String brand;
    private int cost;
    private int kilometrage;
    private int warrantyPeriod;

    public Car() {
        bodyNumber = "";
        year = Const.DEFAULT_VALUE;
        brand = "no name";
        cost = Const.DEFAULT_VALUE;
        kilometrage = Const.DEFAULT_VALUE;
        warrantyPeriod = Const.DEFAULT_VALUE;
    }
    
    public Car(String bodyNumber, int year, String brand, int cost, int kilometrage, int warrantyPeriod){
        this.bodyNumber = bodyNumber;
        this.year = year;
        this.brand = brand;
        this.cost = cost;
        this.kilometrage = kilometrage;
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public Car(Car car){
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

    public void setBodyNumber(String bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > Const.RELEASE_FIRST_CAR){
          this.year = year;  
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost > 0){
           this.cost = cost; 
        } 
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        if(kilometrage > 0){
           this.kilometrage = kilometrage; 
        }
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod > 0){
            this.warrantyPeriod = warrantyPeriod;   
        }
    }
    
    @Override
    public String toString(){ 
        return brand + ":  body number:"+bodyNumber +", year:" + year 
                + ", cost:" + cost + "$, kilometrage:" + kilometrage 
                + ", warranty period:" + warrantyPeriod +" year";
    }
}