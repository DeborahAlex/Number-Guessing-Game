package com.dao;

public interface ILoginDao {
	boolean validateUser(String username, String password);
	String checkType(String username, String password);
	void InsertUser(String username, String password, String Type);
}
