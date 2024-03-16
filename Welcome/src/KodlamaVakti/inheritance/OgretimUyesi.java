package KodlamaVakti.inheritance;

public class OgretimUyesi extends Akademisyen {
String unvan;
	public String getUnvan() {
	return unvan;
}
public void setUnvan(String unvan) {
	this.unvan = unvan;
}
public OgretimUyesi(String asSoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
		String unvan) {
	super(asSoyad, eposta, telefon, bolum, gorevler, ders);
	this.unvan = unvan;
}

	@Override
		public String giris() {
			// TODO Auto-generated method stub
			return getUnvan()+" "+super.giris();
		}

}
