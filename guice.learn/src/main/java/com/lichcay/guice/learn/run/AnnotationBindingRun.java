package com.lichcay.guice.learn.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lichcay.guice.learn.entity.CreditCard;
import com.lichcay.guice.learn.entity.PizzaOrder;
import com.lichcay.guice.learn.module.AnnotationBillingModule;
import com.lichcay.guice.learn.service.AnnotationService;

public class AnnotationBindingRun {
	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new AnnotationBillingModule());
		PizzaOrder order = new PizzaOrder();
		CreditCard creditCard = new CreditCard();
		AnnotationService annotationService = injector.getInstance(AnnotationService.class);
		annotationService.chargeOrder(order, creditCard);
	}
}
