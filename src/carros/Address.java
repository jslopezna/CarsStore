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
public class Address {
    private String House; 
    private String Country; 
    private String PostCode; 

    public Address(String House, String Country, String PostCode) {
        this.House = House;
        this.Country = Country;
        this.PostCode = PostCode;
    }

    public String getHouse() {
        return House;
    }

   

    public String getCountry() {
        return Country;
    }

   

    public String getPostCode() {
        return PostCode;
    }
    
}
