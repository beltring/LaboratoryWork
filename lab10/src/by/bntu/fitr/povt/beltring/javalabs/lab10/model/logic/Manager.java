package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;

public class Manager { //отдел продаж (+ отдел ремонта в отдельный класс )
    public static int MaximumCarCost(CarShow carShow){
        int max = carShow.getCars()[0].getCost();
        for(Car car : carShow.getCars()){
            if(max < car.getCost()){
                max = car.getCost();
            }
        }
      
        return max;
    }
    
    public static int MinimumCarCost(CarShow carShow){
        int min = carShow.getCars()[0].getCost();
        for(Car car : carShow.getCars()){
            if(min > car.getCost()){
                min = car.getCost();
            }
        }
      
        return min;
    }
    
    // контейнер динамический и ограниченный
}