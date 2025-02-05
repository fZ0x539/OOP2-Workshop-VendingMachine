package se.lexicon.model;

public class TwixProduct extends Product{

    public TwixProduct(double price, String productName) {
        super(price, productName);
    }

    @Override
    public String examine() {
        return "Product ID: " + getId() + ", Product Name: " + getProductName() + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return getProductName() + " is a chocolate containing milk & eggs that consists of a biscuit with caramel topping wrapped in chocolate";
    }
}
