package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.User_Dao;
import model.User;
import service.User_Service;
@Service
public class User_Service_Impl implements User_Service{
	@Autowired
	User_Dao dao;
	public List<User> getWhere(String where){
		return dao.getWhere(where);
	}
	
	public List<User> getAll() {
		return dao.getAll();
	}
	
	public User getByid(int id) {
		return dao.getByid(id);
	}
	
	public Integer update(User u) {
		return dao.update(u);
	}
	
	public int delete(int id) {
		return dao.delete(id);
	}
	
	public User login(User u) {
		return dao.login(u);
	}

	public Integer insert(User u) {
		// TODO Auto-generated method stub
		return dao.insert(u);
	}

	public Object select(String where1) {
		// TODO Auto-generated method stub
		return null;
	}
}
