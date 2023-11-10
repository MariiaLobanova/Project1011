public class StudentSearching {
    private StudentManager studentManager;

    public StudentSearching(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    public void searchStudentByName(String studentName){
        Student studentForSearching = studentManager.getStudentByName(studentName);
        if(studentForSearching!=null){
            System.out.println("Student found by name : " + studentForSearching.getStudentName() +": " + studentForSearching.getId());
        }else{
            System.out.println("Student not found");
        }
    }
    public void searchStudentById(int id){
        Student studentForSearchingByID = studentManager.getStudentById(id);
        if(studentForSearchingByID!=null){
            System.out.println("Student found by id : " + studentForSearchingByID.getId()+" : " + studentForSearchingByID.getStudentName());
        }else{
            System.out.println("Course not found");
        }
    }
}
