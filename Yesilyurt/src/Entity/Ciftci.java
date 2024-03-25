package Entity;

public class Ciftci implements IEntity {
	//Database nesnesi olup olmadığını işaretlemek için oluşturuldu.
	private int id;
	
	private String tcNo;
	private String Name;
	private String Surname;
	private String MahalleKoy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getName() {
		return  Name.toUpperCase();
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname.toUpperCase();
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getMahalleKoy() {
		return MahalleKoy;
	}
	public void setMahalleKoy(String mahalleKoy) {
		MahalleKoy = mahalleKoy;
	}
	
}
