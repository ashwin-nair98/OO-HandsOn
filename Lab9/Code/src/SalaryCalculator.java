public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
	// Complete the logic
		salary += emp.getBasic() + (emp.getBasic() * getAllowance(emp)/100);
		salary += emp.getHra();

		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
		switch(emp.getRoleId()) {
			case Roles.TEST_ENGINEER:
				allowance = 5.0;
				break;
			case Roles.DEVELOPER:
				allowance = 10.0;
				break;
			case Roles.SR_DEVELOPER:
				allowance = 15.0;
				break;
			case Roles.DESIGNER:
				allowance = 20.0;
				break;
			default:	
				System.out.println("Invalid choice detected.");
		}

		return allowance; 
	}
}
