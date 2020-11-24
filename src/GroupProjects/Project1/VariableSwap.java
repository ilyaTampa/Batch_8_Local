package GroupProjects.Project1;

public class VariableSwap {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
				// Swap 2 strings without a temporary variable?

				System.out.println("------integer swap-----");

				int a = 10;
				int b = 20;
				System.out.println(a + " " + b);
				a = a + b; // a = 30
				b = a - b; // b = 10
				a = a - b; // a = 20
				System.out.println(a + " " + b);

				System.out.println("------string swap-----");

				String x = "Group";
				String y = "Zero";
				System.out.println("Before the swap\n" + x + " " + y);

				x = x + y;
				y = x.substring(0, (x.length() - y.length()));
				x = x.substring(y.length());
				
				System.out.println("After the swap\n"  + x + " "+ y);

			}

		}
