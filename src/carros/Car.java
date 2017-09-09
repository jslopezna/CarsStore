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
public class Car {
    private CarModel Model; 

    public Car(CarModel Model, int Traveled) {
        this.Model = Model;
        this.Traveled = Traveled;
    }
    private int Traveled; 

    public CarModel getModel() {
        return Model;
    }

    public int getTraveled() {
        return Traveled;
    }

    public void setTraveled(int Traveled) {
        this.Traveled = Traveled;
    }
    
    
}
