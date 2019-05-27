package by.bntu.fitr.poisit.task52.model.logic;

import by.bntu.fitr.poisit.task52.model.entity.Salad;

public class Calculator {
    public static double calculateWeight(Salad salad){
        if (salad == null || salad.size() < 1) {
            return -1.0;
        }
        
        double weight = 0;
        
        for (int i = 0; i < salad.size(); i++) {
            weight += salad.get(i).getWeight();
        }
        
        return weight;
    }
    
    public static double calculateCalories(Salad salad){
        if (salad == null || salad.size() < 1) {
            return -1.0;
        }
        
        double calories = 0;
        
        for (int i = 0; i < salad.size(); i++) {
            calories += salad.get(i).getCalories();
        }
        
        return calories;
    }
}
