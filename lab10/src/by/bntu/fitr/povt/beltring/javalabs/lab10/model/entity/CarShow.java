package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.UserInput;
import java.util.Arrays;

public class CarShow { //автосалон
    
    private String name;//ref
    private Car[] cars;

    public CarShow() {
        cars = new Car[0];
    }
   
    public CarShow(String name) {
        this.name = name;
        this.cars = new Car[0];
    }
    
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    
    public void add(){
        cars = Arrays.copyOf(cars, cars.length + 1);
        
        String bodyNumber = UserInput.inputStr("Enter the number of the car body(8 characters):");
        int year = UserInput.inputInt("Enter the year of release:");
        String brand = UserInput.inputStr("Enter the brand of the car:");
        int cost = UserInput.inputInt("Enter the cost:");
        int kilometrage = UserInput.inputInt("Enter the mileage of the car:");
        int warrantyPeriod = UserInput.inputInt("Enter the warranty period:");
        cars[cars.length - 1] = new Car(bodyNumber, year, brand, cost, kilometrage, warrantyPeriod);
    }
    
    public void addRandom(int count){
        
        for(int i = 0;i < count;i++){
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[i] = Initialization.createCarObject(name);
        }
    }
    
    public Car get(int index){
        return cars[index];
    }
    
    public int size(){
       return cars.length;
    }
   
    @Override
    public String toString(){
       StringBuilder builder;
       builder = new StringBuilder("***Car show " + name + "***\nList of available cars:\n");
       
       for(Car car : cars){
           builder.append(car.toString()).append("\n");
       }
       
       return builder.toString();
    }
}