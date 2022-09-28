package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.Random;

public class MeatForPizzaDecorator extends AbstractPizzaOrderDecorator{
    public MeatForPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription(){
        Random random = new Random();
        if (random.nextBoolean()){
            return super.getDescription() + " chicken";
        } else {
            return super.getDescription() + " prosciutto";
        }
    }
}