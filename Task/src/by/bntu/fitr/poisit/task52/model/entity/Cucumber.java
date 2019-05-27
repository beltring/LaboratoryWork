package by.bntu.fitr.poisit.task52.model.entity;

public class Cucumber extends Vegetable{
    private String typeSkin;

    public Cucumber(String typeSkin) {
        this.typeSkin = typeSkin;
    }

    public Cucumber(String typeSkin, double weight, double calories) {
        super(weight, calories);
        this.typeSkin = typeSkin;
    }

    public Cucumber(String typeSkin, Vegetable vegetable) {
        super(vegetable);
        this.typeSkin = typeSkin;
    }

    public String getTypeSkin() {
        return typeSkin;
    }

    public void setTypeSkin(String typeSkin) {
        this.typeSkin = typeSkin;
    }

    @Override
    public String toString() {
        return "Cucumber:" + "typeSkin:" + typeSkin + super.toString();
    }
    
    
}
