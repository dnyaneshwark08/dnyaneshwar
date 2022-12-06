package com.demo.springCore.Setters;


// bike class by using setter injection

public class Bike {
	
	
	private String color;
	private String brand;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Bike(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	public Bike() {
		super();
	}
	@Override
	public String toString() {
		return "Bike [color=" + color + ", brand=" + brand + "]";
	}
	
	
}
