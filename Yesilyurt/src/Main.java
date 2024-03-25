import java.sql.*;
import java.util.Iterator;
import java.util.List;

import Database.*;
import Entity.Ciftci;
import Manager.CiftciManager;

public class Main {

	public static void main(String[] args) throws Exception {

			ConnectionInfo connection=new ConnectionInfo();
			Connection mysqlConnection=connection.MysqlConnection("yesilyurtdb2024", "root", "root");
			CiftciManager manager=new CiftciManager(new CiftciDal(mysqlConnection))  ;
			var result=manager.get("SELECT DosyaNo,TcKimlikNo,NameSurname,FatherName,Birthday,MobilePhone,Village"
					+ " FROM yesilyurtdb2024.cks as cks"
					+ " inner join yesilyurtdb2024.ciftciler as ciftciler"
					+ " on cks.CiftciId=ciftciler.Id "
					+ " where TcKimlikNo='26450305106'");
			System.out.println(result.getName());
		
	}

}
