package se.lexicon.model;

public enum acceptableCoins {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500),
    THOUSAND(1000);

    private int value;

    acceptableCoins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isValid(int amount){
        for(acceptableCoins coin : acceptableCoins.values()){
            if(coin.getValue() == amount){
                return true;
            }
        }
        return false;
    }
}
