package com.sayhanabi.daoimple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sayhanabi.dao.ManagerDao;
import com.sayhanabi.db.MySQLIntrop;
import com.sayhanabi.vo.Manager;

public class ManagerDaoImple implements ManagerDao 
{

	@Override
	public int authenticationManager(String username, String password) 
	{
		int id = -1;
		boolean check[] = {false,false};//0-id,1-name
		List<HashMap<String,String>> result = 
				MySQLIntrop.getMySQL().select("tb_manager",Manager.FIELDS);
		if(result != null)
		{
			for(HashMap<String,String> map : result)//check user
			{
				for (Map.Entry<String, String> entry : map.entrySet())//check 
	        	{
					if(entry.getKey().equals(Manager.FIELDS[0]))//check id
					{
						id = Integer.parseInt(entry.getValue());
						{
							check[0] = true;//id get!
							continue;//check name
						}
					} 
					if(check[1] == false)//if name checked then check password
					{
						if(entry.getKey().equals(Manager.FIELDS[1]))//check user-name
						{
							if(entry.getValue().equals(username))
							{
								check[1] = true;//name checked
								continue;//check password
							}
						} 
					}
					else
					{
						if(entry.getKey().equals(Manager.FIELDS[2]))//check password
						{
							if(entry.getValue().equals(password))//here the guy we want
							{
								return id;
							}
						} 
					}
	        	}
				
			}
		}
		return -1;
	}
	
	

}
