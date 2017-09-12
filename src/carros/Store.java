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
public class Store {
    private Address address;
    private int cantidadCarros;
    private Car [] car;

    public Store(Address address) {
        this.address = address;
        this.cantidadCarros = 0;
        this.car = new Car[20];
    }

   
    

    public Address getAddress() {
        return address;
    }

    public int getCantidadCarros() {
        return cantidadCarros;
    }
 
   
    public boolean addCar(Car newcar){ 
        boolean resultado = false;
        
       
        
        
       if(this.cantidadCarros < 20){
           
       
         
         this.car[this.cantidadCarros] = newcar;
         this.cantidadCarros++;
         return true;
      }else{ 
          return false;
    } 
   
       
    }

  

    public Car[] getCar() {
        return car;
    }
      
}
  
    

