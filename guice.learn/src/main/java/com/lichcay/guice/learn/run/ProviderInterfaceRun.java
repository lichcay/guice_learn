package com.lichcay.guice.learn.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.module.BillingModule;
import com.lichcay.guice.learn.module.NameAnnotationBillingModule;
import com.lichcay.guice.learn.module.ProviderInterfaceModule;
import com.lichcay.guice.learn.module.ProvidesBillingModule;
import com.lichcay.guice.learn.service.BillingService;
import com.lichcay.guice.learn.service.NameAnnotationService;

public class ProviderInterfaceRun {
	public static void main( String[] args )
    {
		PizzaOrder order = new PizzaOrder();
        CreditCard creditCard = new CreditCard();
        
        Injector injector = Guice.createInjector(new ProviderInterfaceModule());
        NameAnnotationService billingService = injector.getInstance(NameAnnotationService.class);
        
        billingService.chargeOrder(order, creditCard);
        
    }
}
