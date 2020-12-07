package diexamp;

import diexamp.services.*;

public class AppRunner {
    public static void main(String[] args) {
        // International customer who is shopping from Amazon.
        ShoppingService shoppingService = new ShoppingServiceAmazonImpl();
        Customer customer = new CustomerInternationalImpl(shoppingService);
        customer.buyProduct();

        // International customer who is shopping from bazaar.
        shoppingService = new ShoppingServiceBazaarImpl();
        customer = new CustomerInternationalImpl(shoppingService);
        customer.buyProduct();
    }
}

