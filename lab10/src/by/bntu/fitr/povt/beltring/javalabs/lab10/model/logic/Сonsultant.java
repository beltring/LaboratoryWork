package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.exception.DataException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;
import java.util.Arrays;

public class Сonsultant {

    public static Car maximumCarCost(CarShow carShow) {
        Car maxCar = null;
        try {
            int max = carShow.get(0).getCost();
            maxCar = carShow.get(0);

            for (int i = 0; i < carShow.size(); i++) {

                if (max < carShow.get(i).getCost()) {
                    max = carShow.get(i).getCost();
                    maxCar = carShow.get(i);
                }

            }
        } catch (DataException e) {
            e.getMessage();
        }

        return maxCar;
    }

    public static Car minimumCarCost(CarShow carShow) {
        Car minCar = null;

        try {
            int min = carShow.get(0).getCost();
            minCar = carShow.get(0);

            for (int i = 0; i < carShow.size(); i++) {

                if (min > carShow.get(i).getCost()) {
                    min = carShow.get(i).getCost();
                    minCar = carShow.get(i);
                }

            }
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }
        return minCar;
    }

    public static Car[] searchByYear(CarShow carShow, int year) {
        Car[] cars = new Car[0];
        try {
            for (int i = 0; i < carShow.size(); i++) {

                if (carShow.get(i).getYear() == year) {
                    cars = Arrays.copyOf(cars, cars.length + 1);
                    cars[cars.length - 1] = carShow.get(i);
                }
            }
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }
        return cars;
    }

    public static Car maximumCargoCapacity(CarShow carShow) {
        double max = 0;
        Car maxCar = null;
        try {
            maxCar = carShow.get(0);
            Lorry lorry;

            for (int i = 0; i < carShow.size(); i++) {

                if (carShow.get(i) instanceof Lorry) {
                    lorry = (Lorry) carShow.get(i);

                    if (max < lorry.getCargoCapacity()) {
                        max = lorry.getCargoCapacity();
                        maxCar = carShow.get(i);
                    }
                }
            }
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }

        return maxCar;
    }
}
