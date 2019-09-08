package com.lichcay.guice.learn.log;

import java.util.List;

import com.lichcay.guice.learn.entity.Pizza;

public class DatabaseTransactionLog implements TransactionLog {
	private List<Pizza> food;

	private String cost = "$80";

	private String cash = "$100";
	private String change = "$20";
	public void doLog() {
		System.out.println(this.getClass().toString());
		System.out.println("Pizza cost "+cost+", get cash "+cash+", give change "+change);
	}
	public List<Pizza> getFood() {
		return food;
	}

	public void setFood(List<Pizza> food) {
		this.food = food;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}
}
