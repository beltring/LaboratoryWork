package by.bntu.fitr.poisit.task52.model.entity;

public class Vegetable {
    static final double DEFAULT_VALUE = 0.0;
    
    private double weight;
    private double calories;
    private String sort;
    
    public Vegetable(){
        weight = DEFAULT_VALUE;
        calories = DEFAULT_VALUE;
    }

    public Vegetable(double weight, double calories) {
        this.weight = weight;
        this.calories = calories;
    }
    
    public Vegetable(Vegetable vegetable){
        weight = vegetable.weight;
        calories = vegetable.calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    
    @Override
    public String toString() {
        return "weight=" + weight + ", calories=" 
                + calories + ", sort" + sort;
    }

}
