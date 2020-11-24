package GroupProjects.Project1;

public class PrimeNumber {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

				int v = 61;
				boolean prime = true;

				for (int i = 2; i <= v / 2; i++) {
					if (v % i == 0) {
						prime = false;
						break;
					}
				}

				if (!prime) {
					System.out.println("The number " + v + " is not a prime number");

				} else {
					System.out.println("The number " + v + " is a prime number");
				}

			}

		}