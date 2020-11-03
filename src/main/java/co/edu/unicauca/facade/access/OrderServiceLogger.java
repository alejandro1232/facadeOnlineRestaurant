/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

import co.edu.unicauca.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 *
 * @author soces
 */
public class OrderServiceLogger implements IOrderService {

    private OrderFacade orderFacade;
    /**
     * Servicio logger
     * @param orderFacade 
     */
    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());

        //Se hace el log
        org.slf4j.Logger logger = LoggerFactory.getLogger(OrderServiceLogger.class);
        String message = "Pedido guardado en la base de datos";
        logger.info(message);
        logger.debug("Mensaje de depuración");
        logger.error("Mensaje de error");

    }

}
