package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Impl.User_Service_Impl;
import service.Impl.Type_Service_Impl;
import model.User;

@Controller
public class userController2 {
	@Autowired 
	 User_Service_Impl service;
	@Autowired
	Type_Service_Impl tservice;
@RequestMapping("index")
public String index(String txt,ModelMap m)
{
	String where1 ="";
	if(txt!=null) {	where1="where User.name like '%"+txt+"%'";}
	m.put("list", service.select(where1));
	return "index";
}
@RequestMapping("add")
public String  add(ModelMap m) {
	m.put("typelist", tservice.select());
	return "edit";
}

@RequestMapping("edit")
public String  edit(int id,ModelMap m) {
	m.put("info", service.getByid(id));
	return add(m);
}

@RequestMapping("insert")
public String  insert(User b,ModelMap m) {
	service.insert(b);
	return index(null,m);
}
@RequestMapping("update")
public String  update(User b,ModelMap m) {
	service.update(b);
	return index(null,m);
}
@RequestMapping("delete")
public String  delete(int id,ModelMap m) {
	service.delete(id);
	return index(null,m);
}

}
