package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface User_Dao {
	@Select("select User.* from User where name=#{name} and pass=#{pass}")
	public User login(User u);
	
	@Select("select User.* from User ${where}")
	public List<User> getWhere(@Param("where") String where);
	
	@Select("select User.* from User ${where}")
	public List<User> getAll();
	
	@Select("select User.* from User where id=#{id}")
	public User getByid(int id);
	
	@Delete("delete from User where id=#{id}")
	public int delete(int id);
	
	@Update("update User set name=#{name},pass=#{sex}")
	public Integer update(User u);
	
	@Insert("insert into User(name,pass) values(#{name},#{pass}")
	public Integer insert(User u);
	
}

