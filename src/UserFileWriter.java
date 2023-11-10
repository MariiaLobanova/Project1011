import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileWriter {

    public static void writeUsersToFile(User[] users, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                writer.write("Name = " + user.getUserName() + " : with role " + user.getRole() + "\n");
            }
            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing data to file: " + e.getMessage());
        }
    }
}
