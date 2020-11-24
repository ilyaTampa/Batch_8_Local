package ReplTasks;
/*
Create a method with the following specs:

Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
 */

public class Repl120 {

   public int sumEvenToX(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++){
            if (i%2==0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       Repl120 x = new Repl120();
        System.out.println(x.sumEvenToX(5));
        System.out.println(x.sumEvenToX(8));
    }
}
