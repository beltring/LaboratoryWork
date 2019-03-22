package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import java.util.UUID;

public class Initialization {
    
    
    public static Car createCarObject(String brand){
        String bodyNumber = UUID.randomUUID().toString().toUpperCase();
        bodyNumber = bodyNumber.substring(0, Const.BODY_NUMBER_LENGTH);
        int year = rnd(Const.MIN_YEAR,Const.MAX_YEAR);
        int cost = rnd(Const.MIN_COST,Const.MAX_COST);
        int kilometrage = rnd(0,Const.MAX_KILOMETRAGE);
        int warrantyPeriod = rnd(Const.MIN_WARRANTY_PERIOD,
                Const.MAX_WARRANTY_PERIOD);

        return new Car(bodyNumber,year,brand,cost,kilometrage,warrantyPeriod);
    }
    
    public static Car createCarObject(){
        String brand = UserInput.inputStr("Enter brand:");
        String bodyNumber = UserInput.inputStr("Enter body number:");
        int year = UserInput.inputInt("Enter the year of release:");
        int cost = UserInput.inputInt("Enter the cost:");
        int kilometrage = UserInput.inputInt("Enter the mileage of the car:");
        int warrantyPeriod = UserInput.inputInt("Enter the warranty period:");
        
        return new Car(bodyNumber,year,brand,cost,kilometrage,warrantyPeriod);
    }
    
    public static int rnd(int min, int max){
	max -= min;
	return (int) (Math.random() * ++max) + min;
    }
}