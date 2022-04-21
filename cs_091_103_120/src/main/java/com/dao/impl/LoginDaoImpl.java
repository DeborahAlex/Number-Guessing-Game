package com.dao.impl;

import com.dao.ILoginDao;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.ILoginDao;
@Repository
public class LoginDaoImpl implements ILoginDao {

	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		int count=jdbcTemplate.queryForObject("select count(*) from Users  where username=? and password=?",Integer.class,username,password);
		if (count==1)
		{	
			return true;
		}
		else
			return false;
	}
	public String checkType(String username, String password) {
		
			 String type=jdbcTemplate.queryForObject("select Type from Users  where username=? and password=? ",String.class,username,password);
			 return type;
		 
	}
	public void InsertUser(String username, String password, String Type)
	{
		String sql="insert into Users values (?,?,?)";
		jdbcTemplate.update(sql,username,password, Type);
	}
}
