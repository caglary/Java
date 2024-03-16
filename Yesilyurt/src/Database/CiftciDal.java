package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Entity.Ciftci;

public class CiftciDal implements IDatabase<Ciftci> {

	private String url;
	private String username;
	private String password;
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	public CiftciDal(String chooseDatabaseFromDb, String username, String password) throws SQLException {
		this.url = "jdbc:mysql://localhost:3306/" + chooseDatabaseFromDb;
		this.username = username;
		this.password = password;
		this.connection = DriverManager.getConnection(url, username, password);
	}

	@Override
	public int add(Object T) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Object T) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object T) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ciftci get(String query) {
		// TODO Auto-generated method stub
		return new Ciftci();
	}

	

	public ResultSet getAll(String sqlQuery) throws SQLException {
		//"SELECT DosyaNo,TcKimlikNo,NameSurname,FatherName,Birthday,MobilePhone,Village FROM yesilyurtdb2024.cks as cks inner join yesilyurtdb2024.ciftciler as ciftciler on cks.CiftciId=ciftciler.Id "
		resultSet=null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return resultSet;
	}


}