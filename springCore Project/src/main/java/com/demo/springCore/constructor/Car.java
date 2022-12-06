package com.demo.springCore.constructor;



// car class by using constructor injection
public class Car {
	
	private String name;
	private String color;
	private double price;
	private String brand;
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}
	public Car() {
		super();
	}
	public Car(String name, String color, double price, String brand) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
