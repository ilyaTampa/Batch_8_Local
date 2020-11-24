package GroupProjects.Project1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

				int m = 1;
				int n = 1;
				int sum = 0;
				System.out.print(m + " " + n + " ");
				for (int f = 1; f < 9; f++) {
					sum = n + m;
					m = n; // m=1 m = 2 m = 3
					n = sum; // n=2 n = 3 n = 5
					System.out.print(sum + " ");
				}

			}

		}