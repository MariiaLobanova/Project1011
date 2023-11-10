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
            DataFileWriter.writeUsersToFile(usersArray, "Users Data.txt");

            StudentManager studentManager= new StudentManager();
            studentManager.createStudent("Moana", 123);
            studentManager.createStudent("Victor", 345);
            studentManager.createStudent("Elena", 128);
            studentManager.createStudent("Elisa", 335);

            studentManager.displayAllStudents();

            studentManager.removeStudent("Victor");

            studentManager.displayAllStudents();

            studentManager.updateStudent("Elisa", 987);
            studentManager.displayAllStudents();

        Student[] studentsArray = studentManager.convertStudentsMapTOArray();
        DataFileWriter.writeStudentsToFile(studentsArray, "Students Data.txt");

        CourseManager courseManager = new CourseManager();
        courseManager.createCourse("Biology", 1);
        courseManager.createCourse("Math", 2);
        courseManager.createCourse("English", 3);
        courseManager.createCourse("Sport", 4);
        courseManager.createCourse("German", 5);

        Student moana = new Student("Moana", 123);
        Student elena = new Student("Elena", 128);

        Course biology = new Course(moana.studentName, moana.id);

        biology.addStudentToCourse(moana);
        biology.addStudentToCourse(elena);

        biology.updateGrade(moana, 70.00);
        biology.updateGrade(elena, 90.00);

        biology.displayGrades();


        StudentSearching  search = new StudentSearching(studentManager);
        search.searchStudentByName(moana.studentName);
        search.searchStudentById(987);

        Sorting sort = new Sorting();
        sort.





        }
    }
//}