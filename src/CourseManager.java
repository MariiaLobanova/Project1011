import java.util.HashMap;
import java.util.Map;

public class CourseManager {
    private Map<String, Course> courseDatabase;

    public CourseManager() {
        this.courseDatabase = new HashMap<>();
    }
    public void createCourse(String courseName,int courseId){
        if (!courseDatabase.containsKey(courseName)) {
            Course newCourse = new Course(courseName, courseId);
            courseDatabase.put(courseName, newCourse);
            System.out.println("Course: " + courseName+ "  with id  " + courseId+" created");
        } else {
            System.out.println("Course is already exist.");
        }
    }
    public boolean removeCourse(String courseName) {
        if (courseDatabase.containsKey(courseName)) {
            Course course = courseDatabase.remove(courseName);
            System.out.println("Course  " + courseName+ " delited succesfully.");
        } else {
            System.out.println("Course not found.");
        }
        return false;
    }
    public void displayAllCourses() {
        System.out.println("List of Courses: ");

        for (Map.Entry<String, Course> entry : courseDatabase.entrySet()) {
            Course course = entry.getValue();
            System.out.println("Course " + course.getCourseName() + " : id   " + course.getCourseId());

        }
    }
    public boolean updateCourse(String courseName, int newCourseId) {
        if (courseDatabase.containsKey(courseName)) {
            Course course = courseDatabase.get(courseName);
            course.setCourseId(newCourseId);
            System.out.println("Course " + courseName + " updated with new id: " + newCourseId);
            return true;
        } else {
            System.out.println("Course not found. Update failed.");
            return false;
        }
    }
    public Course getCourseByName(String courseName) {
        return courseDatabase.get(courseName);
    }
    public Course getCourseById(int courseId) {
        for (Course course : courseDatabase.values()) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    public Course[] convertCoursesMapTOArray(){
        Course[] coursesArray = courseDatabase.values().toArray(new Course[0]);

        System.out.println("Courses in array");
        for(Course course: coursesArray){
            System.out.println("Course = " + course.getCourseName() + " : id "+ course.getCourseId() );
        }
        return courseDatabase.values().toArray(new Course[0]);
    }



}
