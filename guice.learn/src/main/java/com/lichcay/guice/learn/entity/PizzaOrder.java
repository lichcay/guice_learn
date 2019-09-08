package com.lichcay.guice.learn.entity;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
	private List<Pizza> order;
	private String table;
	private String comment;

	public PizzaOrder(){
		this.order = new ArrayList<Pizza>();
		this.order.add(new Pizza());
	}
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<Pizza> getOrder() {
		return order;
	}

	public void setOrder(List<Pizza> order) {
		this.order = order;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
}
