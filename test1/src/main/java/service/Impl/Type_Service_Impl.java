package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import model.Type;
@Service
public class Type_Service_Impl {
	@Autowired
	Type_Dao dao;
	public List<Type> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}
}
