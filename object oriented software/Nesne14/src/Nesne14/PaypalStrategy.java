package Nesne14;

public class PaypalStrategy implements PaymentStrategy {
	private String email;
	private String password;
	public PaypalStrategy(String email,String passaword) {
		this.email=email;
		this.password=password;
	}
	@Override
	public void Pay(int amount) {
			System.out.println(amount+"paid using Paypal");
	}
	
}
