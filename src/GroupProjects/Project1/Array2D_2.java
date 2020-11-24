package GroupProjects.Project1;

public class Array2D_2 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 4 columns.
				// Develop a program which will identify/print the even numbers only.

				int[][] arr = { { 4, 5, 9, -4568 }, { 78, 95, 45, 275 }, { -12, -64, 56824, 56 } };
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] % 2 == 0) {
							System.out.print(arr[i][j] + " ");
						}
					}
				}

			}

		}