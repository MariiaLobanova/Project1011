public class UserCRUD {
    private  UserManager userManager;

    public UserCRUD( UserManager userManager){
        this.userManager = userManager;
    }
    public  void createUser(String username, String password, Role role){
        userManager.registerUser(username, password, role);
    }
    public  void remove(String username){
        userManager.deliteUser(username);
    }
    public  void displayAllUsers(){
        userManager.displayAllUsers();
    }
    public User searchUser(String username){
        User[] userArray = userManager.convertMapTOArray();

        for (User user: userArray) {
            if(user.getUserName().equals(username)){
                System.out.println("User with name "+ user.getUserName() +" succesfully found! ");
                return user;
            }
        }
        System.out.println("The user with name  " + username + "  doesnt found");
        return null;
    }

}
