package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Book_Service;
import service.Impl.Book_Service_Impl;

@Controller
public class testController {
	@Autowired 
	 Book_Service_Impl service;
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
@RequestMapping("index")
public void index(String txt,ModelMap m)
{
	String where1 ="";
	if(txt!=null) {	where1="where book.name like '%"+txt+"%'";}
	m.put("list", service.select(where1));
 
}

}
