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
public class Order implements IOrderRepository {

    private State state;
    private int despatch;
    private Customer custumer;
    private LocalDate date;
    
    private List<item> details;

    public Order(Customer custumer) {
        this.custumer = custumer;
        details=new ArrayList<item>();
    }

    
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
    public void addDish(Dish dish,int amont){
        item i=new item();
        i.setAmount(amont);
        i.setDish(dish);
        details.add(i);
    }
    
    public int calculateTotal(){
        int res=0;  
        for(item i:details)
        {
            res=res+i.getAmount();
        }        
        return res;}
}
