/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author equipo
 */
public class CarModel {
    
    private int price; 
    private Category category; 
    private String ModelNumbre; 

    public CarModel(int price, Category category, String ModelNumbre) {
        this.price = price;
        this.category = category;
        this.ModelNumbre = ModelNumbre;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getModelNumbre() {
        return ModelNumbre;
    }
    
}
