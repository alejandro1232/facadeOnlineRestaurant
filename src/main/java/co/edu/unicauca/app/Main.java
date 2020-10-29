/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.app;

import co.edu.unicauca.Customer;
import co.edu.unicauca.Dish;
import co.edu.unicauca.OrderFacade;
import co.edu.unicauca.State;
import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.access.Factory;


/**
 * Cliente que llama a los servicios de la facada
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class Main {

    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + facade.calculateTotal());
        System.out.println("Total de platos pedidos: " + facade.totalDishes());
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        facade.save(repo);
        System.out.println("Pedido grabado con éxito en la base de datos");
    }
}
