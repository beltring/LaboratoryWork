package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Сonsultant { //отдел продаж (+ отдел ремонта в отдельный класс )
    public static Car MaximumCarCost(CarShow carShow){
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
    
    public static Car MinimumCarCost(CarShow carShow){
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
    
    public static void searchByYear(CarShow carShow, int year){
        boolean check = true;
        
        for (int i = 0; i < carShow.size(); i++) {
            if(carShow.get(i).getYear() == year){
                Printer.print("\n" + carShow.get(i) + "\n");
                check = false;
            }
        }
        
        Printer.print("There is no such car");
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