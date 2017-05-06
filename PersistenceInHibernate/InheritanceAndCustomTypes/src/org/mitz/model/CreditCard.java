package org.mitz.model;

public class CreditCard extends BillingDetails{

	private String number;
	private String expMonth;
	private String expYear;
	public CreditCard() {
		super();
	}
	
	@Override
	public String toString() {
		return "CreditCard [number=" + number + ", expMonth=" + expMonth
				+ ", expYear=" + expYear + "]";
	}

	public CreditCard(Long id,String owner, String number, String expMonth,
			String expYear) {
		super(id,owner);
		this.number = number;
		this.expMonth = expMonth;
		this.expYear = expYear;
	}
	
	public CreditCard(String owner, String number, String expMonth,
			String expYear) {
		super(owner);
		this.number = number;
		this.expMonth = expMonth;
		this.expYear = expYear;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	

	
}