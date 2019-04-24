package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarDealerNetwork;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.MiniBus;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Сonsultant;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;
import java.util.Arrays;

public class Lab10 {
    
    public static void main(String[] args) { // для тестов 
        boolean notExit = true;
        int choice;
        
        CarShow carShow1 = new CarShow("AUDI");
        CarShow carShow2 = new CarShow("BMW");
        
        for (int i = 0; i < 4; i++) {
            carShow1.add(Initialization.createCarObject("AUDI"));
            carShow2.add(Initialization.createCarObject("BMW"));
        }
        
        Lorry lorry = new Lorry(1200, 1.8 , Initialization.createCarObject("Mersedes"));
        Printer.print(lorry);
        Lorry lorry1 = new Lorry(lorry);
        lorry = null;
        Printer.print(lorry);
        Printer.print(lorry1);
        
        //carShow2.add(Initialization.createCarObject("BMW"));
        
        //CarDealerNetwork carNetwork = new CarDealerNetwork("Minsk");
        //carNetwork.add(carShow1);
        //carNetwork.add(carShow2);    
        
//        while(notExit){
//            Printer.print("\n1.List of available cars.\n2.Add car.\n"
//                    + "3.Remove car.\n4.Find the most cost car.\n"
//                    + "5.Find the cheapest car.\n"
//                    + "6.Find a car by year of manufacture.\n0.Exit");
//            choice = UserInput.inputInt("\nSelect menu item:");
//            
//            switch(choice){
//                case 1: Printer.print(carNetwork); break;
//                case 2: Car car = Initialization.createCarObject(); 
//                carShow1.add(car); break;
//                case 3: String bodyNumber = UserInput.inputStr("Enter "
//                        + "the number of the car body:");
//                        carShow1.remove(bodyNumber); break;
//                case 4: Printer.print(Сonsultant.maximumCarCost(carShow1) + "\n"); break;
//                case 5: Printer.print(Сonsultant.minimumCarCost(carShow1) + "\n"); break;
//                case 6: int year = UserInput.inputInt("Enter car year:"); 
//                        Car[] cars = Сonsultant.searchByYear(carShow1, year); 
//                        Printer.print(Arrays.toString(cars)); break;
//                case 0: notExit = false; break;
//            }
//        }        
    }
}