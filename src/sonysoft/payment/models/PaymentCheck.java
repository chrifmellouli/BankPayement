package sonysoft.payment.models;

public class PaymentCheck extends Payment {

	@Override
	void pay(float montant) {
		System.out.println("you payd with CHECK from your account " + montant + "dinars");		
	}
	

}
