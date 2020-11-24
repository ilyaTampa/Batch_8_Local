package GroupProjects.Project2.Task4;

import Project2.Task4.Registration;

public class Main {
    public static void main(String[] args) {

        Registration regi = new Registration("ilya@yahoo.com", "1234567", "ilyaTampa");
        regi.setEmail("ilya@yahoo.com");
        System.out.println(regi.getEmail());
        regi.setPassword("1234567");
        System.out.println(regi.getPassword());
        regi.setUserName("ilyaTampa");
        System.out.println(regi.getUserName());


    }
}
