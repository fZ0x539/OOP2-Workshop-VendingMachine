package se.lexicon.model;

public class CocaColaProduct extends Product {

    public CocaColaProduct(double price, String productName) {
        super(price, productName);
    }

    @Override
    public String examine() {
        return "Product ID: " + getId() + ", Product Name: " + getProductName() + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return getProductName() + " is a cola-flavored soft drink containing large amounts of sugar";
    }
}
