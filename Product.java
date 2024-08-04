//package com.mycompany.productsmanager;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product(String name, double price, int stockQuantity)
    {
        this.name = name;
        if(price > 0.0)
            this.price = price;
        if(stockQuantity >= 0)
            this.stockQuantity = stockQuantity;
    }
    
    public String getName()
            
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getStockQuantity()
    {
        return stockQuantity;
    }
}