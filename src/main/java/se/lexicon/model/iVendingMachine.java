package se.lexicon.model;

public interface iVendingMachine {

    void addCurrency(int amount);
    int getBalance();
    Product request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    StringBuilder getProducts();

}
