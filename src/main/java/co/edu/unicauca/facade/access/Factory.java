/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

import co.edu.unicauca.OrderFacade;

/**
 *
 * @author soces
 */
public class Factory {
    
    private static Factory instance;
    
      private Factory() {
    }
        /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    
     public IOrderRepository getRepository(String type) {
        IOrderRepository repo = null;

        switch (type) {
            case "default":
                repo = new OrderFacade();
                break;
        }
        return repo;
    }
    
}
