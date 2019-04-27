package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;
import java.util.LinkedList;
import java.util.List;

public class Сonsultant {

    public List<Car> maximumCarCost(CarShow carShow) throws DataException {

        if (carShow == null) {
            throw new DataException("Car show cannot be null");
        }

        List<Car> maxCar = new LinkedList<>();
        maxCar.add(carShow.get(0));

        for (int i = 1; i < carShow.size(); i++) {

            if (maxCar.get(0).getCost() < carShow.get(i).getCost()) {
                maxCar.clear();
                maxCar.add(carShow.get(i));
            } else if (maxCar.get(0).getCost() == carShow.get(i).getCost()) {
                maxCar.add(carShow.get(i));
            }
        }

        return maxCar;
    }

    public List<Car> minimumCarCost(CarShow carShow) throws DataException {
        if (carShow == null) {
            throw new DataException("Car show cannot be null");
        }

        List<Car> minCar = new LinkedList<>();
        minCar.add(carShow.get(0));

        for (int i = 1; i < carShow.size(); i++) {

            if (minCar.get(0).getCost() > carShow.get(i).getCost()) {
                minCar.clear();
                minCar.add(carShow.get(i));
            } else if (minCar.get(0).getCost() == carShow.get(i).getCost()) {
                minCar.add(carShow.get(i));
            }

        }
        return minCar;
    }

    public List<Car> searchByYear(CarShow carShow, int year) throws DataException {
        if (carShow == null) {
            throw new DataException("Car show cannot be null");
        }
        if (year < RELEASE_FIRST_CAR) {
            throw new DataException("Year of manufacture can not "
                    + "be less than 1885");
        }

        List<Car> cars = new LinkedList<>();

        for (int i = 0; i < carShow.size(); i++) {

            if (carShow.get(i).getYear() == year) {
                cars.add(carShow.get(i));
            }
        }
        return cars;
    }

    public List<Car> maximumCargoCapacity(CarShow carShow) throws DataException {

        if (carShow == null) {
            throw new DataException("Car show cannot be null");
        }

        double max = 0;
        List<Car> maxCar = new LinkedList<>();
        Lorry lorry;

        for (int i = 1; i < carShow.size(); i++) {

            if (carShow.get(i) instanceof Lorry) {
                lorry = (Lorry) carShow.get(i);

                if (max < lorry.getCargoCapacity()) {
                    max = lorry.getCargoCapacity();
                    maxCar.clear();
                    maxCar.add(lorry);
                } else if (max == lorry.getCargoCapacity()) {
                    maxCar.add(lorry);
                }
            }
        }

        return maxCar;
    }
}
