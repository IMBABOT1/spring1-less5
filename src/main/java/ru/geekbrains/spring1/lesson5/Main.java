package ru.geekbrains.spring1.lesson5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            Product p = productDao.findByID(1l);
            List<Product> products = productDao.findAll();
            System.out.println(products);
            productDao.deleteById(1l);
            List<Product> products1 = productDao.findAll();
            System.out.println(products1);
            productDao.saveOrUpdate(new Product(2l, "fdsa", 684));
            List<Product> products2 = productDao.findAll();
            System.out.println(products2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
