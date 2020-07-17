public class EmployeeReport {
	private String dtReport;
	public EmployeeReport(String dtReport) {
		this.dtReport = dtReport;
	}
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 	
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOW\tSALARY");
		for(Employee i: empArr) {
			System.out.printf(i.getId()+"\t"+i.getName()+"\t");
			System.out.printf(i.getRoleDescription() + "\t");
			System.out.printf(i.getBasic()+"\t"+i.getHra()+"\t");
			System.out.printf(i.getAllowance()+"\t");
			System.out.printf(i.getSalary()+"\n");
		}
		
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}