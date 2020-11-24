package GroupProjects.Project2.Task4;

public class Registration {
    private String userName;
    private String password;
    private String email;

    public Registration(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Please enter your UserName");
        } else {
            if (userName.length()>6) {
                this.userName = userName;
            } else {
                System.out.println("Error! Your UserName should be longer than 6 characters");
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Please enter your password");
        } else {
            if (password.length() > 6) {
                if (password.contains(userName)) {
                    System.out.println("Password cannot contain username");
                } else {
                    this.password = password;
                }
            } else {
                System.out.println("Error! Your password should be longer than 6 characters");
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (this.email.contains("@yahoo")) {
            System.out.println("Your email is correct");
        } else {
            System.out.println("Error! Your email is not yahoo");
        }
    }
}
