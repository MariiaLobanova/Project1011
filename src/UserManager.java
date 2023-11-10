import java.util.HashMap;
import java.util.Map;

public class UserManager {
        private Map<String, User> userDatabase;

        public UserManager() {
            this.userDatabase = new HashMap<>();
        }

    public void registerUser(String username, String password, Role role) {
        if (!userDatabase.containsKey(username)) {
            User newUser = new User(username, password,role);
            userDatabase.put(username, newUser);
            System.out.println("Registration was successful for User: " + username+ "as a " + role);
        } else {
            System.out.println("Username with this name already exist. Please choose another Username.");
        }
    }
public boolean loginUser(String username, String password) {
            if (userDatabase.containsKey(username)) {
        User user = userDatabase.get(username);
        if (user.getPassword().equals(password)) {
            System.out.println("Login successful for user: " + username);
        return true;
        } else {
            System.out.println("Incorrect password. Login failed.");
        }
            } else {
                System.out.println("User not found. Login failed.");
        }
        return false;
}
public Map<String,User> getUserDatabase(){
            return userDatabase;
}
public Map<String,User> setUserDatabase() {
        return userDatabase;
    }

    public  void displayAllUsers(){
        System.out.println("List of users: ");

        for (Map.Entry<String,User> entry: userDatabase.entrySet()){
            User user = entry.getValue();
            System.out.println("Username " + user.getUserName() + "Role" + user.getRole());

        }
    }
}
