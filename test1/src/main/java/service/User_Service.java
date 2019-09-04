package service;

import java.util.List;

import model.User;

public interface User_Service {
	public User login(User u);
	
	public List<User> getAll();
	
	public List<User> getWhere(String where);
	
	public User getByid(int id);
	
	public int delete(int id);
	
	public Integer insert(User u);
	
	public Integer update(User u);
	
}
