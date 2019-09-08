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
import com.lichcay.guice.learn.provider.DatabaseLogProvider;

public class ProviderInterfaceModule extends AbstractModule {
	@Override
	protected void configure() {

		bind(CreditCardProcessor.class).annotatedWith(Names.named("Paypal")).to(PaypalCreditCardProcessor.class);

		bind(CreditCardProcessor.class).annotatedWith(Names.named("Alipay")).to(AlipayCreditCardProcessor.class);
		
		bind(TransactionLog.class).toProvider(DatabaseLogProvider.class);

	}
}
