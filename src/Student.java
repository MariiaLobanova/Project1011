public class Student {
    String studentName;
    int id;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        studentName = studentName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + studentName + '\'' +
                ", id=" + id +
                '}';
    }


}
