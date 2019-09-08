package com.lichcay.guice.learn.service;

import com.google.inject.Inject;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.entity.Receipt;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.CreditCardProcessor;

public class BillingService {
	  private final CreditCardProcessor processor;
	  private final TransactionLog transactionLog;

	  //To make it explicit that the BillingService constructor is invoked by Guice, we add the @Inject annotation
	  @Inject
	  BillingService(CreditCardProcessor processor, 
	      TransactionLog transactionLog) {
	    this.processor = processor;
	    this.transactionLog = transactionLog;
	  }

	  public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
		  processor.process(order);
		  transactionLog.doLog();
		  System.out.println("");
	    return null;
	  }
	}
