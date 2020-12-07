import java.util.Scanner;

public class Repl063 {

	public static void main(String[] args) {
		
	Scanner userIn = new Scanner(System.in);
	
	int x, num;
		
	   System.out.println("pls enter number");
	   
	   x = userIn.nextInt();
	   
	   for (num=0; num<x; num++) {
		   System.out.print(num+" ");
	   }
	    
	  }
}