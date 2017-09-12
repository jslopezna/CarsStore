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
    private String ModelNumber; 

    public CarModel(int price, Category category, String modelNumber) {
        this.price = price;
        this.category = category;
        this.ModelNumber = modelNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    

   
    
}
