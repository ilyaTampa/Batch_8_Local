package GroupProjects.Project1;

public class Array2D_4 {

	public static void main(String[] args) {
		// Create an array of countries: north America countries, south America
				// countries, Europe countries, Asian countries, African countries.
				// Then print all values from that array using 2 different loops
				// and calculate how many total countries been stored.

				int counter = 0;

				String[][] co = { { "USA", "Canada" }, { "Brazil", "Argentina", "Chile" },
						{ "Italy", "Serbia", "Ukraine", "Poland" }, { "China", "India" }, { "Moroco", "Nigeria" } };

				for (int i = 0; i < co.length; i++) {
					for (int j = 0; j < co[i].length; j++) {
						System.out.print(co[i][j] + " ");
						counter++;
					}
				}
				System.out.println("\ntotal " + counter + " countries in the array");

				System.out.println("--------another way--------");

				for (String[] cou : co) {
					for (String countr : cou) {
						System.out.print(countr + " ");
					}
				}
				System.out.println("\ntotal " + counter + " countries in the array");

			}

		}
