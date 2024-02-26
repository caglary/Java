package Chapter04;

public class Loop {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		int count = 0;
		while (count < 1000) {
			System.out.println("Welcome to Java!" + count);
			count++;
		}
		long endTime = System.currentTimeMillis();
		
		long testTime=startTime-endTime;
		System.out.println("Test time is "+(testTime/1000)+" seconds");
		System.out.println(startTime);
		System.out.println(endTime);
	}

}
