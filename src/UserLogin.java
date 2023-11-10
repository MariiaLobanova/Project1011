import java.util.Scanner;

public class UserLogin {
    UserManager userManager;
    Scanner scanner;

    public UserLogin(UserManager userManager, Scanner scanner) {
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

