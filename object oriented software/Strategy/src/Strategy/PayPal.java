package Strategy;

public class PayPal implements PaymentStrategy {
	private String email;
	private String password;
	public  PayPal(String email, String pwd){
		this.email=email;
		this.password=pwd;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount+"paid using paypal");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
