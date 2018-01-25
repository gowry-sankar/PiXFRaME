package com.DAO;

import java.util.List;

import com.Model.Role;

public interface RoleDAO {
	
	public List<Role> list();	
	
	public Role getByUsername(String username);
	
	public Role getByEmail(String email);
	
	public Role getByContactnumber(int contactnumber);
	
	public void saveOrUpdate(Role role);
		
    public void delete(String username);

	
}