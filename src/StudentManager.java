import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<String, Student> studentDatabase;

    public StudentManager() {
        this.studentDatabase = new HashMap<>();
    }
    public void createStudent(String studentName,int id){
        if (!studentDatabase.containsKey(studentName)) {
            Student newStudent = new Student(studentName, id);
            studentDatabase.put(studentName, newStudent);
            System.out.println("Student: " + studentName+ "  with id  " + id+" created");
        } else {
            System.out.println("Student is already exist.");
        }
    }
    public boolean removeStudent(String studentName) {
        if (studentDatabase.containsKey(studentName)) {
            Student student = studentDatabase.remove(studentName);
            System.out.println("Student  " + studentName+ " delited succesfully.");
        } else {
            System.out.println("Student not found.");
        }
        return false;
    }
    public void displayAllStudents() {
        System.out.println("List of Students: ");

        for (Map.Entry<String, Student> entry : studentDatabase.entrySet()) {
            Student student = entry.getValue();
            System.out.println("Student " + student.getStudentName() + " : id   " + student.getId());

        }
    }
    public boolean updateStudent(String studentName, int newId) {
        if (studentDatabase.containsKey(studentName)) {
            Student student = studentDatabase.get(studentName);
            student.setId(newId);
            System.out.println("Student " + studentName + " updated with new id: " + newId);
            return true;
        } else {
            System.out.println("Student not found. Update failed.");
            return false;
        }
    }

    public Student getStudentByName(String studentName) {  // added methods for searching by name
        return studentDatabase.get(studentName);
    }
    public Student getStudentById(int id) {
        for (Student student : studentDatabase.values()) { // added methods for searching by id
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public Student[] convertStudentsMapTOArray(){
        Student[] studentsArray = studentDatabase.values().toArray(new Student[0]);

        System.out.println("Students in array");
        for(Student student: studentsArray){
            System.out.println("Name of students = " + student.getStudentName() + " : id "+ student.getId() );
        }
        return studentDatabase.values().toArray(new Student[0]);
    }


}
