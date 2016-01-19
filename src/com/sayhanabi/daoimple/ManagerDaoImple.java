package com.sayhanabi.daoimple;

import com.sayhanabi.dao.ManagerDao;
import com.sayhanabi.db.MySQLIntrop;

public class ManagerDaoImple implements ManagerDao 
{
	private MySQLIntrop mysql;
	
	public ManagerDaoImple()
	{
		mysql = new MySQLIntrop();
	}

	public static void main(String[] args) 
	{
		
	}

	@Override
	public int authenticationManager(String username, String password) 
	{
		// TODO Auto-generated method stub
		return -1;
	}
	
	

}
