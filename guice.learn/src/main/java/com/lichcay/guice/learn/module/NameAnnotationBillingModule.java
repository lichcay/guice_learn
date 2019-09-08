package com.lichcay.guice.learn.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.lichcay.guice.learn.log.DatabaseTransactionLog;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.AlipayCreditCardProcessor;
import com.lichcay.guice.learn.processor.CreditCardProcessor;
import com.lichcay.guice.learn.processor.PaypalCreditCardProcessor;

public class NameAnnotationBillingModule extends AbstractModule {
	@Override
	protected void configure() {

		bind(CreditCardProcessor.class).annotatedWith(Names.named("Paypal")).to(PaypalCreditCardProcessor.class);
		
		bind(CreditCardProcessor.class).annotatedWith(Names.named("Alipay")).to(AlipayCreditCardProcessor.class);
		
		bind(TransactionLog.class).to(DatabaseTransactionLog.class);
	}
}
