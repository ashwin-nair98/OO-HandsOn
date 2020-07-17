public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		
		
		System.out.println("Enter number of employees: ");
		int n = Console.readInt();
		System.out.println("Enter employee details: ");
		Employee employees[] = new Employee[n];
		for(int i=0; i<n; i++) {
			Employee temp = new Employee();
			System.out.println("Enter details of employee " + (i+1) + ":");
			System.out.println("Enter name: ");
			String name = Console.readLine();
			System.out.println("Enter employee id: ");
			int id = Console.readInt();
			System.out.println("Enter role id: ");
			int roleId = Console.readInt();
			System.out.println("Enter basic: ");
			float basic = Console.readFloat();
			System.out.println("Enter Allowance percentage: ");
			float allowancePer = Console.readFloat();
			System.out.println("Enter HRA: ");
			float hra = Console.readFloat();
			temp.setName(name);
			temp.setId(id);
			temp.setRoleId(roleId);
			temp.setBasic(basic);
			temp.setHra(hra);
			temp.setAllowancePer(allowancePer);
			employees[i] = temp;
		}
		
	// Assign objects of Employee to employees declared above
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empRep = new EmployeeReport(dtReport);
		
	// Invoke display() method by passing the employee array
		empRep.display(employees);
	}		
}


















