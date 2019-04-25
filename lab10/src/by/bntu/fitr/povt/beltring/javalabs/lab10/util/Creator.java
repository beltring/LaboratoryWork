package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarDealerNetwork;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.MiniBus;

public class Creator {
    public static Car CreateCarObject(){
        Car car = new Car();
        
        return car;
    }
    
    public static Lorry CreateLorryObject(){
        Lorry lorry = new Lorry();
        
        return lorry;
    }
    public static MiniBus CreateMiniBusObject(){
        MiniBus miniBus = new MiniBus();
        
        return miniBus;
    }
    
    public static CarShow CreateCarShowObject(){
        CarShow carShow = new CarShow();
        
        return carShow;
    }
    
    public static CarDealerNetwork CreateCarDealerObject(){
        CarDealerNetwork dealerNetwork = new CarDealerNetwork();
        
        return dealerNetwork;
    }
}
