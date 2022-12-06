package com.springtassk2.entity;

import org.springframework.stereotype.Component;

@Component
public class Order {
private int oid;
private String oname;
private int price;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getOname() {
	return oname;
}
public void setOname(String oname) {
	this.oname = oname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Order(int oid, String oname, int price) {
	super();
	this.oid = oid;
	this.oname = oname;
	this.price = price;
}
@Override
public String toString() {
	return "Order [oid=" + oid + ", oname=" + oname + ", price=" + price + "]";
}

}
