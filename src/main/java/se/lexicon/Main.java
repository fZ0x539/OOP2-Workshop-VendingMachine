package se.lexicon;
import se.lexicon.model.*;


public class Main {
    public static void main(String[] args) {
        var twixProduct = new TwixProduct(12.99, "Twix");
        var cocacolaProduct = new CocaColaProduct(9.99, "Coca Cola");


        Product[] prodArray = {twixProduct, cocacolaProduct};
        var vm = new VendingMachineImpl(prodArray);

        System.out.println(vm.getProducts());
//        vm.addCurrency(20);
//        System.out.println("deposit pool: " + vm.getBalance());
//        System.out.println(vm.getDescription(1));
//        System.out.println(vm.getDescription(2));
//        vm.makePurchase(1);
//        int change = vm.endSession();


    }
}