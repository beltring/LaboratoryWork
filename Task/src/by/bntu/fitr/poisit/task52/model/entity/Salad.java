package by.bntu.fitr.poisit.task52.model.entity;

import java.util.Arrays;

public class Salad {
    private String name;
    private Vegetable[] product;

    public Salad(){
        product = new Vegetable[0];
    }
    
    public Salad(String name){
        this.name = name;
        product = new Vegetable[0];
    }
    
    public Salad(String name, Vegetable[] product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Vegetable get(int index){
        return product[index];
    }

    public int size(){
        return product.length;
    }
    
    public void add(Vegetable vegetable){
        product = Arrays.copyOf(product, product.length + 1);
        
        product[product.length - 1] = vegetable;
    }

    @Override
    public String toString() {
        StringBuilder builder;
        
        builder = new StringBuilder(name + "\n");
       
        for (Vegetable vegetables : product) {
            builder.append(product.toString()).append("\n");
        }
       
        return builder.toString();
    }
    
    
}
