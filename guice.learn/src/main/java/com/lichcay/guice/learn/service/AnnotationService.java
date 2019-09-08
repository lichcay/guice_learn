package com.lichcay.guice.learn.service;

import com.google.inject.Inject;
import com.lichcay.guice.learn.annotation.Alipay;
import com.lichcay.guice.learn.annotation.PayPal;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.entity.Receipt;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.CreditCardProcessor;

public class AnnotationService {

	@Inject
	@PayPal
	private CreditCardProcessor payPalProcessor;
	
	@Inject
	@Alipay
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
