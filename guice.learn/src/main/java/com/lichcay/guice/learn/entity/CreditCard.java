package com.lichcay.guice.learn.entity;

public class CreditCard {
private String cardNumber;
private String cardHolder;
private String bank;
	private String csvNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCsvNumber() {
		return csvNumber;
	}

	public void setCsvNumber(String csvNumber) {
		this.csvNumber = csvNumber;
	}
}
