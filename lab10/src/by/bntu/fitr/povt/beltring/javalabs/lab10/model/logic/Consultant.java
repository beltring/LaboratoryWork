package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Car;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.CarShow;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Lorry;
import static by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const.*;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Consultant {
    private static final Logger LOG = LogManager.getLogger(Consultant.class);
    
    public List<Car> maximumCarCost(CarShow carShow) throws DataException {

        if (carShow == null) { // ref
            throw new DataException("Car show cannot be null");
        }

        List<Car> maxCar = new LinkedList<>();
        maxCar.add(carShow.get(0));

        LOG.debug("Finding the maximum cost of the car");
        for (int i = 1; i < carShow.size(); i++) {

            if (maxCar.get(0).getCost() < carShow.get(i).getCost()) {
                maxCar.clear();
                maxCar.add(carShow.get(i));
            } else if (maxCar.get(0).getCost() == carShow.get(i).getCost()) {
                maxCar.add(carShow.get(i));
            }
        }
        
        double max = maxCar.get(0).getCost();
        LOG.trace("Found the car with the maximum cost " + max);
        
        return maxCar;
    }

    public List<Car> minimumCarCost(CarShow carShow) throws DataException {
        if (carShow == null) {
            throw new DataException("Car show cannot be null");
        }

        List<Car> minCar = new LinkedList<>();
        minCar.add(carShow.get(0));

        LOG.debug("Finding the minimum cost of the car");
        for (int i = 1; i < carShow.size(); i++) {

            if (minCar.get(0).getCost() > carShow.get(i).getCost()) {
                minCar.clear();
                minCar.add(carShow.get(i));
            } else if (minCar.get(0).getCost() == carShow.get(i).getCost()) {
                minCar.add(carShow.get(i));
            }

        }
        
        double min = minCar.get(0).getCost();
        LOG.trace("Found the car with the minimum cost " + min);
        
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
        LOG.debug("Car search by year of manufacture");
        
        for (int i = 0; i < carShow.size(); i++) {
            
            if (carShow.get(i).getYear() == year) {
                cars.add(carShow.get(i));
                LOG.trace("Found car " + year +" release");
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

        LOG.debug("Search for the maximum load capacity of the car");
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
        
        LOG.trace("Found a car with a maximum capacity of " + max + "tons");
        
        return maxCar;
    }
}
