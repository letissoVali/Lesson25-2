package ru.valiullin;

import java.util.HashMap;
import java.util.Map;

public class impBasket implements Basket {
    private Map<String,Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.replace(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public Map<String, Integer> getProducts() {
        return basket;
    }

    @Override
    public int getProductQuantity(String product) {
        Integer result = basket.get(product);
        return result;
    }


}
