package ReplTasks;

public class Repl088 {
    String breed;
    String name;
    String color;
 public static void main(String[] args) {

       Repl088 dog1 = new Repl088();
       Repl088 dog2 = new Repl088();
       Repl088 dog3 = new Repl088();

       dog1.breed = "Husky";
       dog1.name = "Hatico";
       dog1.color = "Gray";

       dog2.breed = "Bulldog";
       dog2.name = "Rex";
       dog2.color = "Brown";

       dog3.breed = "Labrador";
       dog3.name = "Lessi";
       dog3.color = "Tan";

       dog1.bark();
       dog1.run();
       dog1.play();

       dog2.bark();
       dog2.run();
       dog2.play();

       dog3.bark();
       dog3.run();
       dog3.play();
   }
       void bark(){
           System.out.println(breed + " can bark");
       }
       void run(){
           System.out.println(breed + " can run");
       }
       void play(){
           System.out.println(breed + " can play");
       }



        }

