package com.lichcay.guice.learn.processor;

import com.lichcay.guice.learn.entity.PizzaOrder;

public abstract interface CreditCardProcessor {
	public void process(PizzaOrder order);
}
