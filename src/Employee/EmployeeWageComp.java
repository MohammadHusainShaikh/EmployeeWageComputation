package Employee;

import java.util.Random;


public class EmployeeWageComp {



		int attendance;
		int employee_type;
		int dailyWage = 0;
		int total_wage = 0;
		int total_working_hr = 0;
		int total_working_days = 1;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS = 20;
		
		
//		public void companyInput() {
//			Scanner scanner = new Scanner(System.in);
//				System.out.println("Enter the Wage Per Hours:");
//				wage_per_hr = scanner.nextInt();
//				System.out.println("Enter the Working Days in Month:");
//				Working_days = scanner.nextInt();
//				System.out.println("Enter the Working Hours per MOnth:");
//				working_hr_month = scanner.nextInt();
//	}
		public void employeeWageCalc(){
			System.out.println("Welcome to Employee Wage Computation Program");
		
			while(total_working_hr <= 100 && total_working_days <= 20) {
				
				System.out.println("Day"+total_working_days);
				Random random = new Random();
				attendance = random.nextInt(9) % 2;
				switch(attendance) {
				case 0:
					System.out.println("Employee is Absent");
					
					break;
				case 1:
					System.out.println("Employee is Present");
					
					employee_type = random.nextInt(9) % 2;
						switch(employee_type) {
						case 0:
							System.out.println("Employee is Part Time");
							dailyWage = WAGE_PER_HR * PART_TIME_HR;
							total_working_hr += PART_TIME_HR;
							break;
						case 1:
							System.out.println("Employee is Full Time");
							dailyWage = WAGE_PER_HR * FULL_TIME_HR;
							total_working_hr += FULL_TIME_HR;
							break;
						}
						total_wage += dailyWage;
						System.out.println("Employee Wage = "+ dailyWage);
						break;
				}
					System.out.println("Total Wokring Hr="+total_working_hr);
					System.out.println("---------------------");
					total_working_days++;
		}
			System.out.println("Total Monthly Wag="+total_wage);
	}
//		public EmployeeWageComp(int wage_per_hr, int working_days, int working_hr_month) {
//			   this.wage_per_hr = wage_per_hr;
//			   this.working_days = working_days;
//			   this.working_hr_month = working_hr_month;
//		}
	
		
			public static void main(String[] args) {
			EmployeeWageComp employeeWageComp = new EmployeeWageComp();
			employeeWageComp.employeeWageCalc();
	}
}
	


