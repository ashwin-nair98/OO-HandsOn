public class DecimalSplitter {
	static boolean isOdd(int num) {
		//Complete the logic
		return (num%2 != 0);
	}
	static int getWhole(double num) {
		//Complete the logic
		return (int) num;
	}
	
	static double getFraction(double num) {
		//Complete the logic
		double fraction = num - getWhole(num);
		return fraction;
	}
}









