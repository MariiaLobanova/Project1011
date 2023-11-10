import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager= new UserManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("for register : '1");
        System.out.println("for log in  : '2");
        System.out.println("for exit type '3");
        int choice = scanner.nextInt();

        RegisterUser registerUser = new RegisterUser(userManager, scanner);
        LoginUser loginUser = new LoginUser(userManager, scanner);

        switch (choice){
            case 1:
                registerUser.registerUser();
                break;
            case 2:
                loginUser.loginUser();
                break;
            case 3:
                break;

            default:
                System.out.println("Invalid choice. Please enter 1,2 or 3.");
        } scanner.close();

        userManager.displayAllUsers();

    }

}