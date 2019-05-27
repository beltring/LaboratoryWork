package by.bntu.fitr.poisit.task52.model.entity;

public class Potato extends Vegetable{
    private String skinColor;

    public Potato(String skinColor) {
        this.skinColor = skinColor;
    }

    public Potato(String skinColor, double weight, double calories) {
        super(weight, calories);
        this.skinColor = skinColor;
    }

    public Potato(String skinColor, Vegetable vegetable) {
        super(vegetable);
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Potato: skinColor:" + skinColor + super.toString();
    }
    
    
}
