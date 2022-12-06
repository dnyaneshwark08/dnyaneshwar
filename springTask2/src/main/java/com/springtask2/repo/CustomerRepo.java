package com.springtask2.repo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springtassk2.entity.Customer;
import com.springtassk2.entity.Order;

@Repository
public class CustomerRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private Order order;

	// insert
	public int insert(Customer customer) {
		String queryforcustomer = "insert into login.Customer(cid,cname,oid) values(?,?,?)";
		int update = this.template.update(queryforcustomer, customer.getCid() , customer.getCname() , customer.getOid());
   return update;
	}

	// For  updating the values
	
	public int change(Customer customer1) {

		String updatevalue = "update  login.Customer set cname=? where cid=? ";
		int updating = this.template.update(updatevalue, customer1.getCname(), customer1.getCid());
		return updating;
	}

//	// delete
	public int delete(Customer customer2) {
		
		String query1 = "Delete from login.Customer where cid=?";
		int updating1 = this.template.update(query1, customer2.getCid());
		return updating1;
		
	
	}
}


