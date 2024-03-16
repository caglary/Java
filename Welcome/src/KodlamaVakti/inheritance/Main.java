package KodlamaVakti.inheritance;

public class Main {
    public static void main(String[] args) {
        //Calisan c = new Calisan("mehmet","ahmet@ahmet.com","1234564654");
    
        
    	Akademisyen a=new Akademisyen("ahmet","ahmet@ahmet.com","1234564654", "bölüm", "görev", "ders");
        
       
        
        
    	OgretimUyesi o=new OgretimUyesi("ali", "ali@ali.com","1313213","tarih","hoca","tarih-1","Yrd.Doç.Dr");
        
        
        
    	Memurlar m=new Memurlar("hande",null, null);
    	
       Calisan[] girisListesi= {a,o,m};
       Calisan.listele(girisListesi);
       	
       
        
    }
}
