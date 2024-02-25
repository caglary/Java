package Chapter03;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		switch (8) {
		case 0:
			System.out.println("compute tax for single filers");
			break;
		case 1:
			System.out.println("compute tax for married jointly or qualifying widow(er)");
			break;
		case 2:
			System.out.println("compute tax for married filing separately");
			break;
		case 3:
			System.out.println("compute tax for head of household");
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(1);
		}

	}

}
