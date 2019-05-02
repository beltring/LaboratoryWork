package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Consultant;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Creator;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Initializer;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Lab10 {
//    private static final Logger LOG;
//    
//    static{
//        LOG = Logger.getRootLogger();
//    }
    //private static final Logger LOG = LogManager.getLogger(Lab10.class);
    
    public static void main(String[] args) { // для тестов 
        boolean notExit = true;
        int choice;
        
        CarShow carShow1 = new CarShow("AUDI");
        CarShow carShow2 = new CarShow("BMW");
        for (int i = 0; i < 4; i++) {
            Car car1 = Creator.CreateCarObject();
            Car car2 = Creator.CreateCarObject();
            carShow1.add(Initializer.initRandomCarObject(car1));
            carShow2.add(Initializer.initRandomCarObject(car2));
        }
        
        try {
            Printer.print(carShow1.get(0));
            //carShow1.get(5);
            Consultant consultant = new Consultant();
            Printer.print(consultant.maximumCarCost(carShow2));
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }
        
        //carShow2.add(Initializer.createCarObject("BMW"));

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
//                case 2: Car car = Initializer.createCarObject(); 
//                carShow1.add(car); break;
//                case 3: String bodyNumber = UserInput.inputStr("Enter "
//                        + "the number of the car body:");
//                        carShow1.remove(bodyNumber); break;
//                case 4: Printer.print(Consultant.maximumCarCost(carShow1) + "\n"); break;
//                case 5: Printer.print(Consultant.minimumCarCost(carShow1) + "\n"); break;
//                case 6: int year = UserInput.inputInt("Enter car year:"); 
//                        Car[] cars = Consultant.searchByYear(carShow1, year); 
//                        Printer.print(Arrays.toString(cars)); break;
//                case 0: notExit = false; break;
//            }
//        }        
    }
}
