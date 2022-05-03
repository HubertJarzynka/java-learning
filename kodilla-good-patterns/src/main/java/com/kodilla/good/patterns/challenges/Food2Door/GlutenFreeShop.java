package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private String name;
    private final Map<String, Integer> warehouseOfGlutenFreeShop = new HashMap<>();

    public GlutenFreeShop() {
        this.name = "Healthy Shop";
        putProductsInMap();
    }

    private void putProductsInMap() {
        warehouseOfGlutenFreeShop.put("Tapioca", 100);
        warehouseOfGlutenFreeShop.put("Milk", 200);
        warehouseOfGlutenFreeShop.put("Cheese", 300);
    }

    private void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = warehouseOfGlutenFreeShop.get(product) - quantityOfProducts;
        warehouseOfGlutenFreeShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        if (warehouseOfGlutenFreeShop.containsKey(order.getTypeOfProduct()) && warehouseOfGlutenFreeShop.get(order.getTypeOfProduct()) >= order.getQuantity()) {
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
