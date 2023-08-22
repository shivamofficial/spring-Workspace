package com.springcore.lifecycle;

public class LifecycleLearn {

	
	public int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifecycleLearn [price=" + price + "]";
	}

	public LifecycleLearn(int price) {
		super();
		this.price = price;
	}

	public LifecycleLearn() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("inside init method");
	}
	public void destroy()
	{
		System.out.println("inside destroy method");
	}
}
