package ru.valiullin;

import java.util.List;
import java.util.Map;

public interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    Map<String,Integer> getProducts();
    int getProductQuantity(String product);
}
