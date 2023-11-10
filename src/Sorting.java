import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
    public static List<Student> sortStudentsByName(Map<String, Student> studentDatabase) {
        return studentDatabase.values()
                .stream()
                .sorted(Comparator.comparing(Student::getStudentName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsById(Map<String, Student> studentDatabase) {
        return studentDatabase.values()
                .stream()
                .sorted(Comparator.comparingInt(Student::getId))
                .collect(Collectors.toList());
    }
    public static List<Course> sortCourseByName(Map<String, Course> courseDataBase) {
        return courseDataBase.values()
                .stream()
                .sorted(Comparator.comparing(Course::getCourseName))
                .collect(Collectors.toList());
    }

    public static List<Course> sortCoursesById(Map<String, Course> courseDatabase) {
        return courseDatabase.values()
                .stream()
                .sorted(Comparator.comparingInt(Course::getCourseId))
                .collect(Collectors.toList());
    }

}
