package com.lichcay.guice.learn.entity;

import java.util.List;

public class Receipt {
	private List<Pizza> food;
	private String money;

	public List<Pizza> getFood() {
		return food;
	}

	public void setFood(List<Pizza> food) {
		this.food = food;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
}
