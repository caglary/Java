package Chapter04;

public class KeywordsContinue {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 5) {
			number++;
			if (number == 3 || number == 4)
				continue;
			sum += number;
		}

		System.out.println("The sum is " + sum);
	}

}
