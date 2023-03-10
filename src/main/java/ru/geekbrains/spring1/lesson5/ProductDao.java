package ru.geekbrains.spring1.lesson5;

import java.util.List;

public interface ProductDao {
    Product findByID(Long id);
    List<Product> findAll();
    void deleteById(Long id);
    Product saveOrUpdate(Product product);
}
