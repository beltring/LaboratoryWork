package by.bntu.fitr.poisit.task52.model.entity;

public class Tomato extends Vegetable {

    private String color;
    private double diameter;

    public Tomato(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public Tomato(String color, double diameter, double weight, double calories) {
        super(weight, calories);
        this.color = color;
        this.diameter = diameter;
    }

    public Tomato(String color, double diameter, Vegetable vegetable) {
        super(vegetable);
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    
    @Override
    public String toString() {
        return super.toString() + " tomato: color:" + color + 
                " diameter = " + diameter;
    }

}
