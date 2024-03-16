package KodlamaVakti.inheritance;

public class Memurlar extends Calisan {
    public Memurlar(String asSoyad, String eposta, String telefon) {
		super(asSoyad, eposta, telefon);
		// TODO Auto-generated constructor stub
	}

	String departman,mesai;
	public String giris() {
		return "memur "+super.giris();
	}
}
