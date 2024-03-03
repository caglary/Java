package KodlamaVakti;

public class Employee {

	public String name;
	public double salary;
	public int workHours, hireYear;

	public Employee(int hireYear, int workHours, double salary, String name) {

		this.hireYear = hireYear;
		this.workHours = workHours;
		this.salary = salary;
		this.name = name;

	}

	public double tax() {
		if (this.salary >= 1000) {
			return salary * 0.03;

		}
		return 0;
	}

	public double bonus() {
		int extraWorkHours = this.workHours - 40;
		if (extraWorkHours > 0) {
			return 30 * extraWorkHours;
		}
		return 0.0;
	}

	public double increase() {
		int year = 2020 - this.hireYear;
		if (year < 10) {
			return salary * 0.5;
		} else if (year >= 10 && year < 20) {
			return salary * 0.1;
		} else {
			return salary * 0.15;
		}
	}
}
