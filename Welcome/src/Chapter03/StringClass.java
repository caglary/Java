package Chapter03;

import java.util.Locale;

public class StringClass {

	public static void main(String[] args) {
		String yazi = "Merhaba Java!";

		System.out.println(yazi.length());
		// System.out.println(message.charAt(13));//Hata
		// java.lang.StringIndexOutOfBoundsException:

		String yazi2 = "java çok güzel";
		String yazi3 = yazi.concat(yazi2);

		System.out.println(yazi3.toUpperCase(new Locale("tr", "TR")));// for turkish characters
		yazi = "          merhaba         ";
		System.out.println(yazi.trim());

		// Will coding...

	}

}
