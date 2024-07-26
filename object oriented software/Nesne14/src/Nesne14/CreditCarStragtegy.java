package Nesne14;

public class CreditCarStragtegy  implements PaymentStrategy{
	private String name;
	private String cardnumber;
	private String daeOfExpiry;
	
	public CreditCarStragtegy(String name, String cardnumber, String daeOfExpiry) {
		this.name = name;
		this.cardnumber = cardnumber;
		this.daeOfExpiry = daeOfExpiry;
	}

	@Override
	public void Pay(int amount) {
		System.out.println(amount+"paid with credit/debit card");
	}
}
