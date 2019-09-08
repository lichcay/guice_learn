package com.lichcay.guice.learn.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.module.BillingModule;
import com.lichcay.guice.learn.service.BillingService;

public class SimpleRun {
	public static void main( String[] args )
    {
    	/*
         * Guice.createInjector() takes your Modules, and returns a new Injector
         * instance. Most applications will call this method exactly once, in their
         * main() method.
         */
        Injector injector = Guice.createInjector(new BillingModule());

        /*
         * Now that we've got the injector, we can build objects.
         */
        PizzaOrder order = new PizzaOrder();
        CreditCard creditCard = new CreditCard();
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.chargeOrder(order, creditCard);
    }
}
