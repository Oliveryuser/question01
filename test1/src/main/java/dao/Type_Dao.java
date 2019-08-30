package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import model.Type;

public interface Type_Dao{
	@Select("select *  from type")
	public List<Type> select();
}
