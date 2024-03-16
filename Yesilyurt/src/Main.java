import java.sql.*;
import java.util.Iterator;
import java.util.List;

import Database.*;
import Entity.Ciftci;

public class Main {

	public static void main(String[] args) {

		try {
			CiftciDal dal = new CiftciDal("yesilyurtdb2024", "root", "root");
			ResultSet liste = dal.getAll(
					"SELECT DosyaNo,TcKimlikNo,NameSurname,FatherName,Birthday,MobilePhone,Village FROM "
					+ "yesilyurtdb2024.cks as cks inner join yesilyurtdb2024.ciftciler as ciftciler "
					+ "on cks.CiftciId=ciftciler.Id");
			int sayac=1;
			Ciftci ciftci=new Ciftci();
			
			while (liste.next()) {
				ciftci.setName(liste.getString(3));
				System.out.println(sayac+"-> "+ ciftci.getName());
				sayac++;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
