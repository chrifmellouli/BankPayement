package sonysoft.payment.models;

public class PaymentVisa extends Payment {

	@Override
	void pay(float montant) {
		System.out.println("you payd with VISA from your account " + montant + "dinars");
	}

}
