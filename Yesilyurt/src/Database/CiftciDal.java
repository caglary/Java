package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Entity.Ciftci;

public class CiftciDal implements IDatabase<Ciftci>,IBaseDatabase {


	Connection connection;
	Statement statement;
	ResultSet resultSet;

	public CiftciDal(Connection connection) {
	
		this.connection = connection;
	}

	@Override
	public int add(Object T) {
		// TODO Auto-generated method stub
		System.out.println("ekleme metotdu çalıştı.");
		return 0;
	}

	@Override
	public int update(Object T) {
		// TODO Auto-generated method stub
		System.out.println("güncelleme metotdu çalıştı.");
		return 0;
	}

	@Override
	public int delete(Object T) {
		// TODO Auto-generated method stub
		System.out.println("silme metotdu çalıştı.");
		return 0;
	}

	@Override
	public Ciftci get(String query) throws SQLException {
		
		try {
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

		} catch (Exception e) {
			// TODO: handle exception
		}
		Ciftci ciftci=new Ciftci();
		while(resultSet.next()) {
			String name=resultSet.getString(3);
			ciftci.setName(name);
		}
		return ciftci;
	}

	public ResultSet getAll(String sqlQuery) throws SQLException {
		// "SELECT
		// DosyaNo,TcKimlikNo,NameSurname,FatherName,Birthday,MobilePhone,Village FROM
		// yesilyurtdb2024.cks as cks inner join yesilyurtdb2024.ciftciler as ciftciler
		// on cks.CiftciId=ciftciler.Id "
		resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return resultSet;
	}

	public void closeConnection() throws Exception {
		try {
			if (!this.connection.isClosed()) {
			this.connection.close();
		}
		} catch (Exception e) {
			throw new Exception("Bağlantı açık olup olmadığı kontrol edilemedi ve bağlantı açık ise kapatılamadı.");
		}
		
	}
	
	public boolean statusConnection() throws SQLException {
		return this.connection.isClosed();
	}

}