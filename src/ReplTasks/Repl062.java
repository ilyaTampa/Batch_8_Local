
public class Repl062 {

	public static void main(String[] args) {
		
		// Using for loop Print 1 to 10 Numbers except 5 and 6
		
		for (int num = 1; num<=10; num++) {
			if (num!=5 && num!=6) {
			System.out.println(num);
		}
	}
		// ----------other way with using CONTINUE and OR-------------
		
		for (int num1 = 1; num1<=10; num1++) {
			if (num1==5 || num1==6) {
				continue;
			}
			System.out.println(num1);
		}
		
	}
}
