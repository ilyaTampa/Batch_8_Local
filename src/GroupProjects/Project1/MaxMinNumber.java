package GroupProjects.Project1;

public class MaxMinNumber {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		
				int[] arr = { 4, 5, 9, -4568, 78, 95, 45, 275, -12, -64, 56824, 56 };
				
				int max = 0;
				int min = 0;
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i]>max) {
						max = arr[i];
					}
				} System.out.println("The largest number in the array is " + max);
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i]<min) {
						min = arr[i];
					}
				} System.out.println("The smallest number in the array is " + min);
				
				

			}

		}
