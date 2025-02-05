package se.lexicon.model;

public abstract class Product {
    private static int idCounter = 0;
    private int id;
    private double price;
    private String productName;

    public Product(int id, double price, String productName) {
        this.id = ++idCounter;
        setPrice(price);
        setProductName(productName);
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price is not valid");
        }
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.trim().isEmpty()){
            throw new IllegalArgumentException("Product name is not valid");
        }
        this.productName = productName;
    }


    public abstract String examine();
    public abstract String use();

}
