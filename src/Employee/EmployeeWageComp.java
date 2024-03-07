package Employee;

import java.util.Random;

public class EmployeeWageComp {

	
			public static void main(String args[]) {

				System.out.println("Welcome to Employee Wage Computation");
				int attendance = 0;
				Random random = new Random();
				attendance = random.nextInt(9) % 2;

				if(attendance == 0) {
					System.out.println("Employee is Absent");
				}
				else {
					System.out.println("Employee is Present");
				}
			}
}
	


