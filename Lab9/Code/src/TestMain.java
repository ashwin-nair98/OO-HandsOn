public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee(1, "John", Roles.DEVELOPER , 20_000.0f, 5_000.0f);
		Employee emp2 = new Employee(2, "Doe", Roles.DESIGNER, 15_000.0f, 4_000.0f);
		Employee emp3 = new Employee(3, "Foo", Roles.SR_DEVELOPER, 30_000.0f, 7_000.0f);
		Employee emp4 = new Employee(4, "Bar", Roles.TEST_ENGINEER, 32_000.0f, 7_000.0f);
		
		Employee employees[] = new Employee[4];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
	// Assign objects of Employee to employees declared above
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empRep = new EmployeeReport();
		empRep.setDtReport(dtReport);
		
	// Invoke display() method by passing the employee array
		empRep.display(employees);
	}		
}


















