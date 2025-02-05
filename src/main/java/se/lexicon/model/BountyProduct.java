package se.lexicon.model;

public class BountyProduct extends Product{

    public BountyProduct(double price, String productName){
        super(price, productName);
    }

    @Override
    public String examine() {
        return "Product ID: " + getId() + ", Product Name: " + getProductName() + ", Price: ";
    }

    @Override
    public String use() {
        return getProductName() + "is a coconut-flavored chocolate containing both milk & eggs";
    }
}
