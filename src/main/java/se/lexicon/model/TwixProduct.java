package se.lexicon.model;

public class TwixProduct extends Product{

    public TwixProduct(double price, String productName) {
        super(price, productName);
    }

    @Override
    public String examine() {
        return "Product ID: " + getId() + ", Product Name: " + getProductName() + ", Price: ";
    }

    @Override
    public String use() {
        return getProductName() + " contains milk & eggs";
    }
}
