import java.util.Scanner;

public class LoginUser {
    UserManager userManager;
    Scanner scanner;

    public LoginUser(UserManager userManager, Scanner scanner) {
        this.userManager = userManager;
        this.scanner = scanner;
    }
   public void loginUser(){
       System.out.println("Enter User name for login: ");
       String username = scanner.nextLine();
       System.out.println("Enter password: ");
       String password = scanner.nextLine();

       userManager.loginUser(username,password);
    }
}

