package sonysoft.payment.models;

public class Customer {

	private String name;
	private String rib;
	private Payment payment;

	public Customer() {
	}

	public Customer(String name, String rib) {
		this.name = name;
		this.rib = rib;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", rib=" + rib + "]";
	}

}
