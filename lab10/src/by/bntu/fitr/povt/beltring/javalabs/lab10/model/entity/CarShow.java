package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarShow {

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

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car get(int index) {
        return cars.get(index);
    }

    public int size() {
        return cars.size();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(String bodyNumber) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getBodyNumber().equals(bodyNumber)) {
                cars.remove(cars.get(i));
                break;
            }
        }
    }
    
    public void remove(int index) {
        cars.remove(index);
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
