package by.bntu.fitr.poisit.task52.model.entity;

public class Onion extends Vegetable {
    private int size;

    public Onion(int size) {
        this.size = size;
    }

    public Onion(int size,double weight, double calories) {
        super(weight, calories);
        this.size = size;
    }

    public Onion(int size, Vegetable vegetable) {
        super(vegetable);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Onion:" + "size=" + size + super.toString();
    }

    
    
}
