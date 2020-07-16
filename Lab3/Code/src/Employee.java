
public class Employee {
	private String empId;
	private String empName;
	private Address addr;
	
	public String getEmpId() {
		return this.empId;
	}
	public String getEmpName() {
		return this.empName;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
