package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Manager { //отдел продаж (+ отдел ремонта в отдельный класс )
    public static Car MaximumCarCost(CarShow carShow){
        int max = carShow.getCars()[0].getCost();
        Car maxCar = carShow.getCars()[0];
        
        for(Car car : carShow.getCars()){
            if(max < car.getCost()){
                max = car.getCost();
                maxCar = car;
            }
        }
      
        return maxCar;
    }
    
    public static Car MinimumCarCost(CarShow carShow){
        int min = carShow.getCars()[0].getCost();
        Car minCar = carShow.getCars()[0];
        
        for(Car car : carShow.getCars()){
            if(min > car.getCost()){
                min = car.getCost();
                minCar = car;
            }
        }
      
        return minCar;
    }
    
    public static void searchByYear(CarShow carShow, int year){
        
        for (int i = 0; i < carShow.size(); i++) {
            if(carShow.get(i).getYear() == year){
                Printer.print("\n" + carShow.get(i) + "\n");
            }
        }
    }
    
    public static Car MaximumCargoCapacity(CarShow carShow){
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
    
    // контейнер динамический и ограниченный
}