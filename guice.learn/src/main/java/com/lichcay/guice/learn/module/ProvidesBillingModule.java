package com.lichcay.guice.learn.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.lichcay.guice.learn.log.DatabaseTransactionLog;
import com.lichcay.guice.learn.log.TransactionLog;
import com.lichcay.guice.learn.processor.AlipayCreditCardProcessor;
import com.lichcay.guice.learn.processor.CreditCardProcessor;
import com.lichcay.guice.learn.processor.PaypalCreditCardProcessor;

public class ProvidesBillingModule extends AbstractModule {
	@Override
	protected void configure() {

		// bind(TransactionLog.class).to(DatabaseTransactionLog.class);

		bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);

		//bind(CreditCardProcessor.class).annotatedWith(Names.named("Paypal")).to(PaypalCreditCardProcessor.class);

		bind(CreditCardProcessor.class).annotatedWith(Names.named("Alipay")).to(AlipayCreditCardProcessor.class);

	}

	@Provides
	TransactionLog provideDatabaseTransactionLog() {
		DatabaseTransactionLog log = new DatabaseTransactionLog();
		log.setCost("$50");
		log.setChange("$50");
		return log;
	}
	
	@Provides @Named("Paypal")
	  CreditCardProcessor providePayPalCreditCardProcessor() {
	    PaypalCreditCardProcessor processor = new PaypalCreditCardProcessor();
	    processor.setType("Wechat");
	    return processor;
	  }
}
