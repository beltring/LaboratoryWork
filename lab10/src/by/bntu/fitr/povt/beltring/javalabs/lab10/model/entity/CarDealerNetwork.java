package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
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

    public void setCity(String city) {
        this.city = city;
    }
    
    public void add(CarShow carShow){
        carShows.add(carShow);
    }
    
    public void size(){
        carShows.size();
    }
    public void remove(CarShow carShow){
        carShows.remove(carShow);
    }
    public void remove(int index){
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
