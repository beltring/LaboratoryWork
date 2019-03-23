package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import java.util.Arrays;

public class Сonsultant {  
    public static Car maximumCarCost(CarShow carShow){
        int max = carShow.get(0).getCost();
        Car maxCar = carShow.get(0);
        
        for(int i = 0; i < carShow.size(); i++){
            
            if(max < carShow.get(i).getCost()){
                max = carShow.get(i).getCost();
                maxCar = carShow.get(i);
            }
            
        }
        
        return maxCar;
    }
    
    public static Car minimumCarCost(CarShow carShow){
        int min = carShow.get(0).getCost();
        Car minCar = carShow.get(0);
        
        for(int i = 0; i < carShow.size(); i++){
            
            if(min > carShow.get(i).getCost()){
                min = carShow.get(i).getCost();
                minCar = carShow.get(i);
            }
            
        }
      
        return minCar;
    }
    
    public static Car[] searchByYear(CarShow carShow, int year){
        Car[] cars = new Car[0];
        
        for (int i = 0; i < carShow.size(); i++) {
            
            if(carShow.get(i).getYear() == year){
                cars = Arrays.copyOf(cars, cars.length + 1);
                cars[cars.length - 1] = carShow.get(i);
            }
        }
        
        return cars;
    }
    
    public static Car maximumCargoCapacity(CarShow carShow){
        double max = 0;
        Car maxCar = carShow.get(0);
        Lorry lorry;
        
        for(int i = 0; i < carShow.size(); i++){
            
            if(carShow.get(i) instanceof Lorry){
                lorry = (Lorry)carShow.get(i);
                
                if(max < lorry.getCargoCapacity()){
                    max = lorry.getCargoCapacity();
                    maxCar = carShow.get(i);
                }
            }
        }
      
        return maxCar;
    }
}