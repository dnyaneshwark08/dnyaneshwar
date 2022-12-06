package com.springmvctask.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvctask.entity.UserDetails;

@Repository
public class UserDetailsRepository {
	@Autowired
	private JdbcTemplate jdbctemplate;

	public boolean validateUser(UserDetails user) {
		try {
			String sql = "select password from login.cust where email=?";
			String password = jdbctemplate.queryForObject(sql, String.class, user.getEmail());
			if (password != null && password.equals(user.getPassword())) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean userRegister(UserDetails user) {

		try {
			String sql = "insert into login.cust values(?,?,?)";
			int a = jdbctemplate.update(sql,  user.getEmail(), user.getUsername(),
					user.getPassword());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
