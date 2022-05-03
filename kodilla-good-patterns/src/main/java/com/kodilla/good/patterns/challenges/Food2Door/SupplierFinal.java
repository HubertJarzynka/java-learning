package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class SupplierFinal {
    private Map<String,Supplier> suppliers = new HashMap<>();

    public SupplierFinal(){
        fillMap();
    }

    private void fillMap(){
        Supplier extraFoodShop = new ExtraFoodShop();
        Supplier glutenFreeShop = new GlutenFreeShop();
        Supplier healthyShop = new HealthyShop();
        suppliers.put("Tieguanyin tea", extraFoodShop);
        suppliers.put("Japanese Matsutake mushrooms", extraFoodShop);
        suppliers.put("Kobe beef", extraFoodShop);
        suppliers.put("Chia seeds", healthyShop);
        suppliers.put("Protein suplement", healthyShop);
        suppliers.put("Tomato", healthyShop);
        suppliers.put("Tapioca", glutenFreeShop);
        suppliers.put("Milk", glutenFreeShop);
        suppliers.put("Cheese", glutenFreeShop);
    }

    public void process(Order order){
        if(suppliers.containsKey(order.getTypeOfProduct())){
            suppliers.get(order.getTypeOfProduct()).process(order);
        }else{
            System.out.println("Your order has not fulfil");
        }
    }
}

