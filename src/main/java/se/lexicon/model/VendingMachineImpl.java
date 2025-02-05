package se.lexicon.model;


public class VendingMachineImpl implements iVendingMachine {
    private Product[] products;
    private int depositPool;


    public VendingMachineImpl(Product... products){
        this.products = products;
        this.depositPool = 0;
    }

    public void makePurchase(int productNumber){
        Product purchasedProd = request(productNumber);
        System.out.println(purchasedProd.getProductName() + " Purchased at " + purchasedProd.getPrice());
        System.out.println("Remaining balance: " + depositPool);
    }


    @Override
    public void addCurrency(int amount) {
        if (acceptableCoins.isValid(amount)) {
            depositPool += amount;
            System.out.println(amount  + " added to the pool");
        } else {
            throw new IllegalArgumentException("Invalid coin");
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int productNumber) {
        if (productNumber <= 0) {
            throw new IllegalArgumentException("Product number is not valid");
        }
        for (Product product : products) {
            if (product.getId() == productNumber) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= (int) Math.round(product.getPrice());  //Rounds up because product.price is a double, and the VM owner isn't in it to lose money
                    return product;
                } else {
                    throw new IllegalArgumentException("Insufficient funds");
                }
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        if(change > 0)
            System.out.println("Returning change: " + change);
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        if (productNumber <= 0) {
            throw new IllegalArgumentException("Product number is not valid");
        }
        for (Product product : products) {
            if (product.getId() == productNumber) {
                return product.use();
            }
        }
        return "Product not found";
    }

    @Override
    public StringBuilder getProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.examine()).append("\n");
        }
        return sb;
    }
}
