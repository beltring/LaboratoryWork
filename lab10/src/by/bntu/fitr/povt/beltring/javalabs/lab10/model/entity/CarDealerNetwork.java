package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.exception.DataException;
import java.util.ArrayList;
import java.util.List;

public class CarDealerNetwork {

    private List<CarShow> carShows;
    private String city;

    public CarDealerNetwork() {
        carShows = new ArrayList<>();
    }

    public CarDealerNetwork(String city) {
        this.city = city;
        carShows = new ArrayList<>();
    }

    public CarDealerNetwork(List<CarShow> carShows, String city) {
        this.carShows = carShows;
        this.city = city;
    }

    public CarDealerNetwork(CarDealerNetwork carDealer) {
        city = carDealer.city;
        carShows = new ArrayList<>();
        for (CarShow carShow : carDealer.carShows) {
            carShows.add(new CarShow(carShow));
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws DataException {
        if (city == null) {
            throw new DataException("Body Number cannot be null\n");
        }
        this.city = city;
    }

    public void add(CarShow carShow) {
        carShows.add(carShow);
    }

    public void size() {
        carShows.size();
    }

    public void remove(CarShow carShow) throws DataException {
        if (carShow == null) {
            throw new DataException("Car show cannot be null\n");
        }
        carShows.remove(carShow);
    }

    public void remove(int index) throws DataException {
        if (index < 0 || index >= carShows.size()) {
            throw new DataException("Index should be less than size "
                    + "and more or equal to 0\n");
        }
        carShows.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder(city + "\n");

        for (CarShow carShow : carShows) {
            builder.append(carShow.toString());
        }

        return builder.toString();
    }

}
