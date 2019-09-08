package com.lichcay.guice.learn.module;

import com.google.inject.AbstractModule;
import com.lichcay.guice.learn.annotation.Alipay;
import com.lichcay.guice.learn.annotation.PayPal;
import com.lichcay.guice.learn.log.DatabaseTransactionLog;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.AlipayCreditCardProcessor;
import com.lichcay.guice.learn.processor.CreditCardProcessor;
import com.lichcay.guice.learn.processor.PaypalCreditCardProcessor;

public class AnnotationBillingModule extends AbstractModule {
	@Override
	protected void configure() {

		bind(CreditCardProcessor.class).annotatedWith(PayPal.class).to(PaypalCreditCardProcessor.class);
		
		bind(CreditCardProcessor.class).annotatedWith(Alipay.class).to(AlipayCreditCardProcessor.class);
		
		bind(TransactionLog.class).to(DatabaseTransactionLog.class);
	}
}
