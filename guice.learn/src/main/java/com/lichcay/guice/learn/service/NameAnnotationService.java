package com.lichcay.guice.learn.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.entity.Receipt;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.CreditCardProcessor;

public class NameAnnotationService {

	@Inject
	@Named("Paypal")
	private CreditCardProcessor payPalProcessor;
	
	@Inject
	@Named("Alipay")
	private CreditCardProcessor aliPayProcessor;
	
	@Inject
	private TransactionLog transactionLog;

	public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
		payPalProcessor.process(order);
		aliPayProcessor.process(order);
		transactionLog.doLog();
		System.out.println("");
		return null;
	}
	
}
