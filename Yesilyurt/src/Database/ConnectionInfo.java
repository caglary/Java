package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionInfo implements IBaseDatabase {

	public Connection MysqlConnection(String chooseDatabaseFromDb, String username, String password) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/" + chooseDatabaseFromDb;
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
		
	}
	
	
}
