package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Entity.IEntity;

public interface IDatabase<T extends IEntity> {
	//Database objesinden başka bir obje kullanmamak için IEntity extend edildi.
	int add(Object T);
	int update(Object T);
	int delete(Object T);
	T get(String query) throws SQLException;
	ResultSet getAll(String query) throws SQLException;
	void closeConnection() throws Exception;
}

