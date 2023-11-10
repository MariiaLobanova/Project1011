import java.util.Scanner;

public class UserRegister {
    private UserManager userManager;
    Scanner scanner;

    public UserRegister(UserManager userManager, Scanner scanner) {
        this.userManager = userManager;
        this.scanner = scanner;
    }
    public void  registerUser(){
        System.out.println("Enter User name for register: ");
        scanner.nextLine();
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Choose your role ");
        System.out.println("'1'-ADMIN; 'n\''2'-TEACHER; 'n\''3'-STUDENT");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();

        Role role;
        switch (roleChoice){
            case 1:
                role = Role.ADMIN;
                break;
            case 2:
                role = Role.TEACHER;
                break;
            case 3:
                role = Role.STUDENT;
                break;
            default:
                System.out.println("Invalid option. Log in as a student by default ");
                role = Role.STUDENT;
        }
        userManager.registerUser(username,password,role);


    }
}

