package com.lichcay.guice.learn.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.module.BillingModule;
import com.lichcay.guice.learn.module.NameAnnotationBillingModule;
import com.lichcay.guice.learn.module.ProvidesBillingModule;
import com.lichcay.guice.learn.service.BillingService;
import com.lichcay.guice.learn.service.NameAnnotationService;

public class ProvideRun {
	public static void main( String[] args )
    {
		PizzaOrder order = new PizzaOrder();
        CreditCard creditCard = new CreditCard();

        Injector injector1 = Guice.createInjector(new BillingModule());   
        BillingService billingService1 = injector1.getInstance(BillingService.class);
        billingService1.chargeOrder(order, creditCard);
        
        Injector injector2 = Guice.createInjector(new ProvidesBillingModule());
        BillingService billingService2 = injector2.getInstance(BillingService.class);
        billingService2.chargeOrder(order, creditCard);
        
        Injector injector3 = Guice.createInjector(new NameAnnotationBillingModule());
        NameAnnotationService billingService3 = injector3.getInstance(NameAnnotationService.class);
        billingService3.chargeOrder(order, creditCard);
        
        Injector injector4 = Guice.createInjector(new ProvidesBillingModule());
        NameAnnotationService billingService4 = injector4.getInstance(NameAnnotationService.class);
        billingService4.chargeOrder(order, creditCard);
        
    }
}
