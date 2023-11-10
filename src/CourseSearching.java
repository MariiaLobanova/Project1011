public class CourseSearching {
    private CourseManager courseManager;

    public CourseSearching(CourseManager courseManager) {
        this.courseManager = courseManager;
    }

    public void searchCourseByName(String courseName){
        Course courseForSearching = courseManager.getCourseByName(courseName);
        if(courseForSearching!=null){
            System.out.println("Course found by name : " + courseForSearching.getCourseName());
        }else{
            System.out.println("Course not found");
        }
    }
    public void searchCourseById(int courseId){
        Course courseForSearchingByID = courseManager.getCourseById(courseId);
        if(courseForSearchingByID!=null){
            System.out.println("Course found by name : " + courseForSearchingByID.getCourseName());
        }else{
            System.out.println("Course not found");
        }
    }
}
