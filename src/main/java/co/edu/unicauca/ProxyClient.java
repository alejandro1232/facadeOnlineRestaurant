/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.access.IOrderService;

/**
 *
 * @author soces
 */
public class ProxyClient {

    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    /**
     * creador de la orden
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }

}
