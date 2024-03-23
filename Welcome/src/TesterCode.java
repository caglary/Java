import Utilities.*;
import FirstProject.*;
import KodlamaVakti.*;


public class TesterCode {

	public static void main(String[] args) {
		
		Product product=new Product();
		
		product.setDescription("Asus");
		product.setName("a-11");
		product.setPrice(-11);
		
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getId());

		Product product2=new Product();
		
		product2.setDescription("Hp");
		product2.setName("11BB");
		product2.setPrice(122);

		productManager.add(product2);
		System.out.println(product2.getId());
		

	}
	

}
