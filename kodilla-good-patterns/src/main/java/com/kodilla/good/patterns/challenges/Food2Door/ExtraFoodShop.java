package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private String name;
    private final Map<String, Integer> warehouseOfExtraFoodShop = new HashMap<>();

    public ExtraFoodShop() {
        this.name = "Extra Food Shop";
        putProductsInMap();
    }

    private void putProductsInMap() {
        warehouseOfExtraFoodShop.put("Tieguanyin tea", 300);
        warehouseOfExtraFoodShop.put("Japanese Matsutake mushrooms", 4002);
        warehouseOfExtraFoodShop.put("Kobe beef", 800);
    }

    private void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = warehouseOfExtraFoodShop.get(product) - quantityOfProducts;
        warehouseOfExtraFoodShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        if (warehouseOfExtraFoodShop.containsKey(order.getTypeOfProduct()) && warehouseOfExtraFoodShop.get(order.getTypeOfProduct()) >= order.getQuantity()) {
            updateDepotStatus(order.getTypeOfProduct(), order.getQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you and come back again");
        } else {
            System.out.println("The selected product is not available.");
        }
    }
}
