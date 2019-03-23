package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.Arrays;

public class CarDealerNetwork {
    private final int DEFAULT_SIZE = 0;
    
    private Car[][] carShows; // ref CarShow
    private String city;

    public CarDealerNetwork() {
        carShows = new Car[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public CarDealerNetwork(String city) {
        this.city = city;
        carShows = new Car[DEFAULT_SIZE][DEFAULT_SIZE];
    }
    
    public CarDealerNetwork(Car[][] carShows, String city) {
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
        
        carShows[carShows.length - 1] = carShow.getCars();
    }

    @Override
    public String toString() {//ref
        StringBuilder builder;
        builder = new StringBuilder("\t\t\t\t" + city + "\n");
        
        for (int i = 0; i < carShows.length; i++) {
            builder.append(carShows[i][0].getBrand()).append("\n");
            for (int j = 0; j < carShows[i].length; j++) {
                builder.append(carShows[i][j].toString()).append("\n");
            }
        }
       
        return builder.toString();
    }
    
    
}
