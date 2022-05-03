package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRunner {
    public static void main(String[] args) {

        Order order1 = new Order("Tomato", 5, 458962);
        Order order2 = new Order("Tieguanyin tea", 3,256942);
        Order order3 = new Order("Kobe beef", 6,258952);

        SupplierFinal supplierFinal = new SupplierFinal();
        supplierFinal.process(order1);
        supplierFinal.process(order2);
        supplierFinal.process(order3);
    }
}
