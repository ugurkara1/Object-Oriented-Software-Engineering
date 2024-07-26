package Nesne14;


public class Main {
    public static void main(String[] args) {
        ShopppingCart cart = new ShopppingCart();
        
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        
        cart.addItem(item1);
        cart.addItem(item2);
        
        // Pay by PayPal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        
        // Pay by credit card
        cart.pay(new CreditCarStragtegy("Pankaj Kumar", "1234567890123456", "786"));
    }
}
