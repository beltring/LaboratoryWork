package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.exception.DataException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CarShow {
    private static final Logger LOG = LogManager.getLogger(CarShow.class);
    
    private String name;
    private List<Car> cars;
    //add number of visitors

    public CarShow() {
        cars = new ArrayList<>();
    }

    public CarShow(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public CarShow(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public CarShow(CarShow carShow) {
        name = carShow.name;
        cars = new ArrayList<>();
        for (Car car : carShow.cars) {
            cars.add(new Car(car));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws DataException {
        if (name != null) {
            throw new DataException("Car show name cannot be null\n");
        } else {

            this.name = name;
        }

    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car get(int index) throws DataException {
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);

        } else {
            throw new DataException("Index should be less than size "
                    + "and more or equal to 0\n");
        }
    }

    public int size() {
        return cars.size();
    }

    public void add(Car car) {
        cars.add(car);
        LOG.debug("Car: " + car + " added");
    }

    public void remove(String bodyNumber) throws DataException {
        if (bodyNumber != null) {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getBodyNumber().equals(bodyNumber)) {
                    LOG.trace("Car: " + cars.get(i) + " remove");
                    cars.remove(cars.get(i));
                    break;
                }
            }
        } else {
            throw new DataException("Body Number cannot be null\n");
        }

    }

    public void remove(int index) throws DataException {
        if (index >= 0 && index < cars.size()) {
            cars.remove(index);

        } else {
            throw new DataException("Index should be less than size and "
                    + "more or equal to 0\n");
        }

    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder(name + "\n");

        for (Car car : cars) {
            builder.append(car.toString()).append("\n");
        }

        return builder.toString();
    }
}
