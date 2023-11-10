import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager= new UserManager();
     //   Scanner scanner = new Scanner(System.in);
        UserCRUD userCRUD= new UserCRUD(userManager);

     /*   while(true) {
            System.out.println("for register : '1");
            System.out.println("for log in  : '2");
            System.out.println("for exit type '3");
            int choice = scanner.nextInt();

            RegisterUser registerUser = new RegisterUser(userManager, scanner);
            LoginUser loginUser = new LoginUser(userManager, scanner);

            switch (choice) {
                case 1:
                    registerUser.registerUser();
                    break;
                case 2:
                    loginUser.loginUser();
                    break;
                case 3:
                    System.out.println("exit");
                    scanner.close();
                    break;
            }
            userManager.displayAllUsers();
            userManager.convertMapTOArray(); */

            userCRUD.createUser("Elsa", "1234", Role.valueOf("STUDENT"));
            userCRUD.createUser("Anna", "2345", Role.valueOf("STUDENT"));
            userCRUD.createUser("Olaf", "3456", Role.valueOf("STUDENT"));
            userCRUD.createUser("Kristoff", "3478", Role.valueOf("ADMIN"));
            userCRUD.createUser("Sebastian", "4789", Role.valueOf("TEACHER"));

            userCRUD.displayAllUsers();

            userCRUD.remove("Anna");

            userCRUD.displayAllUsers();

            userManager.convertMapTOArray();

            userCRUD.searchUser("Elsa");
            userCRUD.searchUser("balala");

            User[] usersArray = userManager.convertMapTOArray();
            UserFileWriter.writeUsersToFile(usersArray, "Users Data.txt");


        }
    }
//}