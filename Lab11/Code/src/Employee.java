public class Employee {
	
	// Identity variables of Employee 
	private int id;
	private String name;
	private int roleId;
	private float basic;
	private float hra;
	private float allowancePer;
	// Create getter and setter methods
	Employee(int id, String name, int roleId, float basic, float allowancePer, float hra){
		this.id  = id;
		this.name = name;
		this.roleId = roleId;
		this.basic = basic;
		this.hra = hra;
		this.allowancePer = allowancePer;
	}
	Employee(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getAllowancePer() {
		return allowancePer;
	}
	public void setAllowancePer(float allowancePer) {
		this.allowancePer = allowancePer;
	}
	
	public double getSalary() {
		return SalaryCalculator.getSalary(this);
	}
	
	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
	}
	public String getRoleDescription() {
		return RoleBuilder.getRoleDescription(this.roleId);
	}
}




















