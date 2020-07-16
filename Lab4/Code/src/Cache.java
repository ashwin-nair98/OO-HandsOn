public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block

	static int getMaxCapacity() {
		while(MAX_CAPACITY <= 0)
		{
			System.out.println("Enter max capacity: ");
			MAX_CAPACITY = Console.readInt();
		}
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}