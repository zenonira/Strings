import java.util.Scanner;
class Checkout {
	public static void main(String[] args) {
	ShoppingCart cart = new ShoppingCart();	
	Item tShirt = new Item("T-Shirt", 15.00);
	Item hoodie = new Item("Hoodie", 35.00);
	Item fleece = new Item("Fleece", 40.00);
	Item sweatpants = new Item("Sweatpants", 35.00);

	cart.addItem(tShirt);
	cart.addItem(hoodie);

	cart.getTotal();	

	cart.removeItem(tShirt);
	cart.addItem(sweatpants);
	cart.addItem(sweatpants);
 
	cart.getTotal();

	cart.checkout();
	}




}