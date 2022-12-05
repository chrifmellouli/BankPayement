package sonysoft.payment.models;

public class Transaction {

	public static void main(String[] args) {

		Customer sonia = new Customer("sonia", "1700 1235 5456 0000");
		Customer mohamed = new Customer("mohamed", "0000 0000 00000 0000");

		Payment payWithCheck = new PaymentCheck();
		Payment payWithVisa = new PaymentVisa();

		sonia.setPayment(payWithCheck);
		mohamed.setPayment(payWithVisa);
		
		sonia.getPayment().pay(1000);
		mohamed.getPayment().pay(1111);

	}

}
