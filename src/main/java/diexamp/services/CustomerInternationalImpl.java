package diexamp.services;

public class CustomerInternationalImpl implements Customer {
    // shoppingService is dependency so i use its reference variable in my consumer class.
    ShoppingService shoppingService;

    public CustomerInternationalImpl(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @Override
    public void buyProduct() {
        System.out.println("International customers buy electronic items and alcohol from " );
        shoppingService.sellProduct();
    }
}
