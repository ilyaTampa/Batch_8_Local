package GroupProjects.Project1;

public class SecondLargestNum {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

				int[] array = { 2, 5, 7, 89, 452 };
				int max = array[0];
				for (int d = 1; d < array.length; d++) {
					if (array[d] > max) {
						max = array[d];
					}
				}
				System.out.println("the largest number is " + max);

				int max2 = array[0];

				for (int q = 0; q < array.length; q++) {
					if (array[q] == max) {
						continue;
					} else if (array[q] > max2) {
						max2 = array[q];

					}
				}
				System.out.println("second largest number is " + max2);

			}

		}
