package com.DAO;

import java.util.List;

import com.Model.User;

public interface UserDAO {
	
		public List<User> list();
		
		public User getByUserId(int userid);
		
		public User getByUserName(String username);		
		
		public User getByEmail(String email);
		
	   public User getByPassword(String password);
	    
	    public User getByContactNumber(int contact);
	    
	    public User getByAddress(String address);
	    
	    public User getByRole(String role);
		
		public boolean isAllReadyRegister(String email, boolean b);
		
		public void saveOrUpdate(User user);
			
		public void delete(int UserId);

		}