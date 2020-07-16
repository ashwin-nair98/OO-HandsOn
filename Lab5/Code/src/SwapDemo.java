public class SwapDemo {
	static int arg1 = 100;
	static int arg2 = 200;
	
	public static void main(String[] args) {
		
	
	// make call to swapValues() and displayValues()
		displayValues("The arguments before swapping: ", arg1, arg2);
		swapValues();
		displayValues("The arguments after swapping: ", arg1, arg2);

	}

	private static void swapValues() {
	
	// Write logic to swap values
		int temp = arg1;
		arg1 = arg2;
		arg2 = temp;

	}
	
	private static void displayValues(String str,int arg1, int arg2) {
		System.out.println(str);
		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);
	}
}