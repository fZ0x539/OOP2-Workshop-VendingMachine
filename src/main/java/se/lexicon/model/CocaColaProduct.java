package se.lexicon.model;

public class CocaColaProduct extends Product {

    public CocaColaProduct(double price, String productName) {
        super(price, productName);
    }

    @Override
    public String examine() {
        return "Product ID: " + getId() + ", Product Name: " + getProductName() + ", Price: ";
    }

    @Override
    public String use() {
        return "Warning: " + getProductName() + " contains high doses of sugar";
    }
}
