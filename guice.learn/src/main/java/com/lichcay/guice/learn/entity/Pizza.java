package com.lichcay.guice.learn.entity;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	public Pizza() {
		this.type = "mozzarella";
		this.size = "7 inch";
		this.top = new ArrayList<String>();
		this.top.add("Cheese");
		this.top.add("Tomato");
		this.top.add("Prosciutto");
	}

	private String type;

	private String size;

	private List<String> top;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<String> getTop() {
		return top;
	}

	public void setTop(List<String> top) {
		this.top = top;
	}

	@Override
	public String toString() {
		String s = "";
		s = s + "Pizza type:" + type + ", " + "size:" + size + ", " + "top:";
		for (int i = 0; i < this.top.size(); i++) {
			s = s + top.get(i) + " ";
		}
		return s;
	}
}
