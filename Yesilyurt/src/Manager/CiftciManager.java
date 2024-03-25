package Manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Database.IBaseDatabase;
import Database.IDatabase;
import Entity.Ciftci;

public class CiftciManager implements IRepositoryBase<Ciftci> {

	private IDatabase<Ciftci> database;

	public CiftciManager(IDatabase<Ciftci> database) {
		this.database = database;
		
	}

	@Override
	public void add(Object T) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object T) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object T) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ciftci get(String query) {
		Ciftci ciftci=new Ciftci();
		try {
			 ciftci=database.get(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return ciftci;
		
	}

	@Override
	public List<Ciftci> getAll() throws SQLException {
		ResultSet liste = database
				.getAll("SELECT DosyaNo,TcKimlikNo,NameSurname,FatherName,Birthday,MobilePhone,Village FROM "
						+ "yesilyurtdb2024.cks as cks inner join yesilyurtdb2024.ciftciler as ciftciler "
						+ "on cks.CiftciId=ciftciler.Id");
		
		ArrayList<Ciftci> result=new ArrayList<Ciftci>();
		
		while(liste.next()) {
			Ciftci ciftci=new Ciftci();
			ciftci.setName(liste.getString(3));
			result.add(ciftci);
		}
		
		return result;

	}
	

}
