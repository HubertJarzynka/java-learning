package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("1");
        Product product2 = new Product("2");
        Item item1 = new Item(new BigDecimal(2222), 2, new BigDecimal(12345));
        Item item2 = new Item(new BigDecimal(33333), 3, new BigDecimal(444444));
        item1.setProduct(product1);
        item2.setProduct(product2);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        Invoice invoice1 = new Invoice(2, new ArrayList<>());


        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}