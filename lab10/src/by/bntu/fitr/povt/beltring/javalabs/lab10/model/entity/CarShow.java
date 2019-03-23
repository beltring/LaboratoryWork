package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.Arrays;

public class CarShow { //автосалон
    
    private String name;
    private Car[] cars;

    public CarShow() {
        cars = new Car[0];
    }
   
    public CarShow(String name) {
        this.name = name;
        cars = new Car[0];
    }

    public CarShow(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    
    public CarShow(CarShow carShow){
        name = carShow.name;
        cars = Arrays.copyOf(carShow.cars, carShow.cars.length);
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
    
    public Car get(int index){
        return cars[index];
    }
    
    public int size(){
       return cars.length;
    }
    
    public void add(Car car){ 
        cars = Arrays.copyOf(cars, cars.length + 1);
        
        cars[cars.length - 1] = car;
    }
    
    public void remove(String bodyNumber){
        for(int i = 0;i < cars.length;i++){
            if(cars[i].getBodyNumber().equals(bodyNumber)){
                for(int j = i; j < cars.length - 1; j++){
                    cars[j] = cars[j+1];
                }
                cars = Arrays.copyOf(cars, cars.length - 1);
                break;
            }
        }
    }
   
    @Override
    public String toString(){
       StringBuilder builder;
       builder = new StringBuilder(name + "\n");
       
        for (Car car : cars) {
            builder.append(car.toString()).append("\n");
        }
       
       return builder.toString();
    }
}