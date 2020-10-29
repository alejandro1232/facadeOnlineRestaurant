/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca;

import co.edu.unicauca.facade.access.IOrderRepository;
import java.util.List;

/**
 *
 * @author soces
 */
public class OrderFacade implements IOrderRepository {

    private Order order;

    public void createOrder(Customer customer) {
        order = new Order(customer);
    }

    public void addDish(Dish dish, int amount) {
        order.addDish(dish, amount);
    }

    public void changeState(State state) {
        order.setState(state);
    }

    public void cancelOrder() {
        order.setState(State.CANCELLED);
    }

    public int calculateTotal() {
        return order.calculateTotal();
    }

    public Order getOrder() {
        return order;
    }

    public String totalDishes() {
        List<item> list;
        list=order.getDetails();
        int res=0;
        
        for(item i:list){
            res=res+1;
        }
        return Integer.toString(res);
    }

    public void save(IOrderRepository repo) {
        
    }

}
