package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product something = new Product("Something");
        Item item = new Item(something, BigDecimal.valueOf(1500.0), 5, BigDecimal.valueOf(1000.0));
        Item item2 = new Item(something, BigDecimal.valueOf(1000.0), 5, BigDecimal.valueOf(800.0));
        Invoice invoice = new Invoice("666");

        item.setProduct(something);
        item2.setProduct(something);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        something.getItems().add(item);
        something.getItems().add(item2);
        invoice.getItem().add(item);
        invoice.getItem().add(item2);

        //When
        invoiceDao.save(invoice);
        productDao.save(something);
        itemDao.save(item);

        int id = invoice.getId();

        //Then

        Assert.assertNotEquals(0, id);

        //CleanUp
       try{
           invoiceDao.deleteById(id);
           productDao.deleteAll();
           itemDao.deleteAll();
        }catch (Exception o) {
          //do nothing
       }
    }
}
