import java.util.HashMap;
import java.util.Map;

public class Course {
    String courseName;
    int courseId;
    private Map<Student, Double> studentGrades;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.studentGrades = new HashMap<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", id=" + courseId +
                '}';
    }
    public void addStudentToCourse(Student student){
        studentGrades.put(student,0.0);
        System.out.println("Student "+ student.getStudentName()+"  added to course  " + courseName);
    }

    public void updateGrade(Student student, double newGrade){
        if(studentGrades.containsKey(student)){
            studentGrades.put(student,newGrade);
            System.out.println("Grade updated for "+ student.getStudentName() + " : "+ courseName +" : "+ newGrade );
        } else{
            System.out.println("Student doesn't attend this course");
        }
    }
    public void displayGrades(){
        System.out.println("Grades for student in "+ courseName + " : ");
        for (Map.Entry< Student, Double> entry : studentGrades.entrySet()) {
            Student student = entry.getKey();
            Double grade = entry.getValue();
            System.out.println(student.getStudentName() + ", Grade: " + grade);
        }
    }
}
