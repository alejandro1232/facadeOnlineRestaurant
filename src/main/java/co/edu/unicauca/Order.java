/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca;

import co.edu.unicauca.facade.access.IOrderRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author soces
 */
public class Order  {

    private State state;
    private int despatch;
    private Customer custumer;
    private LocalDate date;
    //lista de items
    private List<item> details;
    
    /**
     * Constructor
     * @param custumer 
     */
    public Order(Customer custumer) {
        this.custumer = custumer;
        details=new ArrayList<item>();
    }

    //Getters y Setters
    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustumer() {
        return custumer;
    }

    public void setCustumer(Customer custumer) {
        this.custumer = custumer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<item> getDetails() {
        return details;
    }

    public void setDetails(List<item> details) {
        this.details = details;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    /**
     * agregar un plat
     * @param dish el plato
     * @param amont valor del plato
     */
    public void addDish(Dish dish,int amont){
        item i=new item();
        i.setAmount(amont);
        i.setDish(dish);
        details.add(i);
    }
    /**
     * Calculo el total del valor de los platos
     * @return  valor total
     */
    public int calculateTotal(){
        int res=0;  
        for(item i:details)
        {
            res=res+i.getDish().getPrice();
        }        
        return res;}

   
}
