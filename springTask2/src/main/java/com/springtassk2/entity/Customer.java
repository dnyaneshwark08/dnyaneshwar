package com.springtassk2.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
private int cid;
private String cname;
private int oid;

private Order order;
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", oid=" + oid + ", order=" + order + "]";
}

public Customer(int cid, String cname, int oid, Order order) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.oid = oid;
	this.order = order;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
}
