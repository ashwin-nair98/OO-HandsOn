public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	
	// Create setter and getter methods 
	

	public void displayMarks() {
		System.out.println("Mark 1: " + getM1());
		System.out.println("Mark 2: " + getM2());
		System.out.println("Mark 3: " + getM3());
	
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public int getTotal() {
//		complete the logic
		return getM1()+getM2()+getM3();
	}
	public double getAverage() {
//		complete the logic
		return getTotal()/3;
	}
	
	public String getResult() {

//		complete the logic
		int passCounter = 0;
		if(getM1() >= 35)
			passCounter++;
		if(getM2() >= 35)
			passCounter++;
		if(getM3() >= 35)
			passCounter++;
		return passCounter + " passed and " + (3 - passCounter) + " failed.";

	}
}
