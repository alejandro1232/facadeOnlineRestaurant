/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Dish {

    private String name;
    private int price;
    private int id;
   

    public Dish(int id, String name, int price) {
        this.name = name;
        this.id=id;
        this.price = price;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
