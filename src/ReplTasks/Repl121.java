package ReplTasks;
/* Write a method header on line two with the following specs:

        Returns: a String
        Name: spaceOut
        Parameters: a String

        Then complete the method by programming the following behavior
        Insert spaces after every character in the String s, then return the new string.
        See below examples (note the space at the end as well).

 */

public class Repl121 {
    static void censorLetter(String str, char s){

        static String censorLetter(String str, char s){

            return str.replace(s,  '*');
        }
        public static void main(String[]args){
            System.out.println(censorLetter("computer science",'e'));
            System.out.println(censorLetter("trick or treat",'t'));
        }

    }
