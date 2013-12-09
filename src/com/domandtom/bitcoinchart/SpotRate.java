package com.domandtom.bitcoinchart;

public class SpotRate {
	private float amount = 0;
	private String currency = "";
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
