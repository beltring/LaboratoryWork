package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.exception.InputException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;
import java.util.Random;
import java.util.UUID;

public class Initializer {

    public static Car initRandomCarObject(Car car) {
        try {
            String[] brands;
            brands = new String[]{"BMW", "AUDI", "Volkswagen", "Mercedes-Benz",
                "Volvo", "Infiniti", "Honda", "Renault", "Chrysler"};
            car.setBrand(brands[randomInt(0, 8)]);

            String bodyNumber = UUID.randomUUID().toString().toUpperCase();
            bodyNumber = bodyNumber.substring(0, BODY_NUMBER_LENGTH);
            car.setBodyNumber(bodyNumber);

            int year = randomInt(MIN_YEAR, MAX_YEAR);
            car.setYear(year);

            int cost = randomInt(Const.MIN_COST, Const.MAX_COST);
            car.setCost(cost);

            int kilometrage = randomInt(0, MAX_KILOMETRAGE);
            car.setKilometrage(kilometrage);

            int warrantyPeriod = randomInt(MIN_WARRANTY_PERIOD,
                    MAX_WARRANTY_PERIOD);
            car.setWarrantyPeriod(warrantyPeriod);
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }
        return car;
    }

    public static Car initCarObject(Car car) {
        try {
            String brand = UserInput.inputStr("Enter brand:");
            car.setBrand(brand);

            String bodyNumber = UserInput.inputStr("Enter body number:");
            car.setBodyNumber(bodyNumber);

            int year = UserInput.inputInt("Enter the year of release:");
            car.setYear(year);

            int cost = UserInput.inputInt("Enter the cost:");
            car.setCost(cost);

            int kilometrage = UserInput.inputInt("Enter the mileage "
                    + "of the car:");
            car.setKilometrage(kilometrage);

            int warrantyPeriod = UserInput.inputInt("Enter the "
                    + "warranty period:");
            car.setWarrantyPeriod(warrantyPeriod);
        } catch (InputException | DataException e) {
            Printer.print(e.getMessage());
        }

        return car;
    }

    public static Lorry initLorryObject(Lorry lorry) {
        try {
            String[] brands;
            brands = new String[]{"Volkswagen", "Mercedes-Benz", "Ford",
                "Peugeot", "MAN", "Opel"};
            lorry.setBrand(brands[randomInt(0, 5)]);

            String bodyNumber = UUID.randomUUID().toString().toUpperCase();
            bodyNumber = bodyNumber.substring(0, BODY_NUMBER_LENGTH);
            lorry.setBodyNumber(bodyNumber);

            int year = randomInt(MIN_YEAR, MAX_YEAR);
            lorry.setYear(year);

            int cost = randomInt(Const.MIN_COST, Const.MAX_COST);
            lorry.setCost(cost);

            int kilometrage = randomInt(0, MAX_KILOMETRAGE);
            lorry.setKilometrage(kilometrage);

            int warrantyPeriod = randomInt(MIN_WARRANTY_PERIOD,
                    MAX_WARRANTY_PERIOD);
            lorry.setWarrantyPeriod(warrantyPeriod);

            double cargoCapacity = randomDouble(MIN_CARGO_CAPACITY,
                    MAX_CARGO_CAPACITY);
            lorry.setCargoCapacity(cargoCapacity);

            double cargoHeight = randomDouble(DEFAULT_VALUE, MAX_CARGO_HEIGHT);
            lorry.setCargoHeight(cargoHeight);
        } catch (DataException e) {
            Printer.print(e.getMessage());
        }

        return lorry;
    }

    public static int randomInt(int min, int max) {
        max -= min;

        return (int) (Math.random() * ++max) + min;
    }

    public static double randomDouble(double min, double max) {
        double number = min + Math.random() * (max - 1.5);
        number = Math.round(number * 10.0) / 10.0;
        return number;
    }
}
