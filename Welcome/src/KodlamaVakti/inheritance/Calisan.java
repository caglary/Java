package KodlamaVakti.inheritance;

public class Calisan {

    public Calisan(String asSoyad, String eposta, String telefon) {
		super();
		this.asSoyad = asSoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}

	private String asSoyad, eposta, telefon;
	
    public String getAsSoyad() {
		return asSoyad;
	}

	public void setAsSoyad(String asSoyad) {
		this.asSoyad = asSoyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	static int girisSayisi=0;

    protected String giris() {
        return "Çalışan sınıfından "+this.asSoyad+" giriş yaptı.";
       
    }
    public static void listele(Calisan[] girisYapanlar) {
    	for(Calisan c: girisYapanlar) {		
    		System.out.println(c.giris());
    		
    	}
    }

}
 