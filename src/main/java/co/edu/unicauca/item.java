/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca;

/**
 *
 * @author soces
 */
class item {

    private Dish dish;
    private int amount;

    public item() {
    }

    public item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }
    //Getters y Setters
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
