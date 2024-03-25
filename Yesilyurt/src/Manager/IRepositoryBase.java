package Manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Entity.IEntity;

public interface IRepositoryBase <T extends IEntity>{
	void add(Object T);
	void update(Object T);
	void delete(Object T);
	T get(String query);
	List<T> getAll() throws Exception;
}
