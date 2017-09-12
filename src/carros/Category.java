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
public class Category {
    private String Name; 
    private CarModel carModel;

    public CarModel getCarModel() {
        return carModel;
    }

    public Category(CarModel carModel) {
        this.carModel = carModel;
    }
    public Category(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
   
    public boolean addCategory(String name){
        Category category= new Category(name);
        return true; 
    }
    
}
