public class AccManager {
	public void fillAccountData(Account a1) {
	
	//Complete the statements
		System.out.println("Enter acc no: ");
		String accNo = Console.readLine();
		System.out.println("Enter name: ");
		String name = Console.readLine();
		System.out.println("Enter balance: ");
		double balance = Console.readDouble(); 
		a1.setName(name);
		a1.setBalance(balance);
		a1.setAccNo(accNo);

	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
