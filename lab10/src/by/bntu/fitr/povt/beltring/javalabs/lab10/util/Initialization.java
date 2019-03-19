package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import java.util.UUID;

public class Initialization {
    static final int BODY_NUMBER_LENGTH = 8;
    static final int MIN_YEAR = 2015;
    static final int MAX_YEAR = 2019;
    static final int MAX_WARRANTY_PERIOD = 6;
    
    public static Car createCarObject(String brand){
        String bodyNumber = UUID.randomUUID().toString().toUpperCase();
        bodyNumber = bodyNumber.substring(0, BODY_NUMBER_LENGTH);
        int year = rnd(MIN_YEAR,MAX_YEAR);
        int cost = rnd(30000,48000);
        int kilometrage = rnd(0,3000);
        int warrantyPeriod = rnd(1,MAX_WARRANTY_PERIOD);

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