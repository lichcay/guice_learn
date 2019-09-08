package com.lichcay.guice.learn.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.module.NameAnnotationBillingModule;
import com.lichcay.guice.learn.service.NameAnnotationService;

public class NameAnnotationBindingRun {
	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new NameAnnotationBillingModule());
		PizzaOrder order = new PizzaOrder();
		CreditCard creditCard = new CreditCard();
		NameAnnotationService annotationService = injector.getInstance(NameAnnotationService.class);
		annotationService.chargeOrder(order, creditCard);
	}
}
