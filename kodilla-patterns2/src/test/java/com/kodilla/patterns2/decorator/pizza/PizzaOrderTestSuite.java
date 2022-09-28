package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    void testFullPizzaGetCost(){
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new MeatForPizzaDecorator(pizza);
        pizza = new PeppersForPizzaDecorator(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(31), cost);
    }

    @Test
    void testFullPizzaGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new MeatForPizzaDecorator(pizza);
        pizza = new PeppersForPizzaDecorator(pizza);
        System.out.println(pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("You ordered a pizza with: extra cheese prosciutto peppers", description);
    }
}