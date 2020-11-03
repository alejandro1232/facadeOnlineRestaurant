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
    /**
     * creador de Order con cliente
     * @param customer 
     */
    public void createOrder(Customer customer) {
        order = new Order(customer);
    }
    /**
     * se agrefa un plato con su coste
     * @param dish
     * @param amount 
     */
    public void addDish(Dish dish, int amount) {
        order.addDish(dish, amount);
    }
    /**
     * Cambio de estado
     * @param state 
     */
    public void changeState(State state) {
        order.setState(state);
    }
    /**
     * Cancela la orden
     */
    public void cancelOrder() {
        order.setState(State.CANCELLED);
    }
    
    /**
     * coste total
     * @return 
     */
    public int calculateTotal() {
        return order.calculateTotal();
    }
    /**
     * un get de retorno de la orden
     * @return 
     */
    public Order getOrder() {
        return order;
    }
    /**
     * cantidad de platos en la lista
     * @return 
     */
    public String totalDishes() {
        List<item> list;
        list = order.getDetails();
        int res = 0;

        for (item i : list) {
            res = res + 1;
        }
        return Integer.toString(res);
    }

     /**
      * creador de orden
      * @param order 
      */
    @Override
    public void createOrder(Order order) {
        this.order=order;
   }

}
