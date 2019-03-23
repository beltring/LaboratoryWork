package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.Arrays;

public class CarDealerNetwork {
    private final int DEFAULT_SIZE = 0;
    
    private CarShow[] carShows; // ref CarShow
    private String city;

    public CarDealerNetwork() {
        carShows = new CarShow[DEFAULT_SIZE];
    }

    public CarDealerNetwork(String city) {
        this.city = city;
        carShows = new CarShow[DEFAULT_SIZE];
    }

    public CarDealerNetwork(CarShow[] carShows, String city) {
        this.carShows = carShows;
        this.city = city;
    }

    public CarDealerNetwork(CarDealerNetwork carDealerNetwork) {
        city = carDealerNetwork.city;
        carShows = Arrays.copyOf(carDealerNetwork.carShows, 
                carDealerNetwork.carShows.length);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void add(CarShow carShow){
        carShows = Arrays.copyOf(carShows, carShows.length + 1);
        
        carShows[carShows.length - 1] = carShow;
    }

    @Override
    public String toString() {//ref
        StringBuilder builder;
        builder = new StringBuilder(city + "\n");
        
        for (CarShow carShow : carShows) {
            builder.append(carShow.toString());
        }
       
        return builder.toString();
    }
    
    
}
