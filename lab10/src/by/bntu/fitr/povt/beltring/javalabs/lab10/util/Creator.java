package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarDealerNetwork;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.MiniBus;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Creator {
    private static final Logger LOG = LogManager.getLogger(Creator.class);
    
    public static Car CreateCarObject(){
        Car car = new Car();
        LOG.debug("Create car Object");
        
        return car;
    }
    
    public static Lorry CreateLorryObject(){
        Lorry lorry = new Lorry();
        LOG.debug("Create car Object");
        
        return lorry;
    }
    public static MiniBus CreateMiniBusObject(){
        MiniBus miniBus = new MiniBus();
        LOG.debug("Create car Object");
        
        return miniBus;
    }
    
    public static CarShow CreateCarShowObject(){
        CarShow carShow = new CarShow();
        LOG.debug("Create car Object");
        
        return carShow;
    }
    
    public static CarDealerNetwork CreateCarDealerObject(){
        CarDealerNetwork dealerNetwork = new CarDealerNetwork();
        
        return dealerNetwork;
    }
}
