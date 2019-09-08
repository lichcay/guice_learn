package com.lichcay.guice.learn.processor;

import com.lichcay.guice.learn.entity.PizzaOrder;

public class AlipayCreditCardProcessor implements CreditCardProcessor {
	private String type = "Alipay";
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void process(PizzaOrder order) {
		System.out.println("Processed by"+this.type + " "+this.getClass().toString());
		for (int i=0;i<order.getOrder().size();i++) {
			System.out.println(order.getOrder().get(i).toString());
		}
	}

}
