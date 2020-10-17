package Recap;

public class NEstedIfConditions {
	public static void main(String[] args) {

		String name = "Ilya";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;

		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank " + name);
			if (transAllowed) {
				System.out.println("Initiating transfer");
				if(transferAmount>accountBalance) {
					System.out.println("Initiating transfer");
			}else {
				System.out.println("Transfer complete");
			}
					}else {
				System.out.println("You are not allowed to transfer");
			}
		} else {
			System.out.println("Your password is not valid");
		}
	}

}
