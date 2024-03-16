package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IDatabase<T> {
	int add(Object T);
	int update(Object T);
	int delete(Object T);
	T get(String query);
	ResultSet getAll(String query) throws SQLException;
	
}
