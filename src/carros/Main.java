/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        Address Direccion= new Address("3,102","Bógota","1002");
        Store tienda= new Store(Direccion);
        Scanner in = new Scanner(System.in);
        int continuar= 1;
       
       
       
       do{ 
        System.err.println("Bienvenido a Carros Store");
        System.out.println("1. Agregar carro. ");
        System.out.println("2.Mostrar lista de carros. ");
        int opcion = in.nextInt();
        
        if(opcion==1){
           System.out.println("Categoria del carro.");
           System.out.println("Ingrese la categoria del carro");
           String nombreCategoria = in.next();      
           System.out.println("Modelo del carro ");
           System.out.println("Ingrese el modelo del carro");
                String modelNumber = in.next();
           System.out.println("Ingrese el precio del carro ");
                int precio = in.nextInt();
           System.out.println("Ingrese el traveled del carro ");
                int traveled=in.nextInt();
      
           Category category= new Category(nombreCategoria);
           CarModel modelCar= new CarModel (precio, category, modelNumber);
           Car newcar= new Car( modelCar, traveled);
            boolean resultado=tienda.addCar(newcar );
           
            if(resultado==true){
                System.err.println("Carro creado");
            }else{
                System.err.println("error");
            }     
        }else if(opcion==2){
            Car[] car = tienda.getCar();
            System.out.println("----------");
                for (int i = 0; i < tienda.getCantidadCarros(); i++) {
                    System.out.println("-"+car[i].getModel().getCategory().getName()+ car[i].getModel().getModelNumber());  
                    
        }
           
        }
        }while(continuar==1); 
    
       } 

