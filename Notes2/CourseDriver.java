public class CourseDriver {
    public static void main(String[] args) {
        CourseManager courseMan = new CourseManager();

        Course course1 = new Course(24, " CS 1093", "Computer Science Concept", "Bright");
        Course course2 = new Course(36, " CS 1014", "Foundations of Programming I", "McLaughlan");
        Course course3 = new Course(37, " CS 1024", "Foundations of Programming II", "Cuevas");
        Course course4 = new Course(105, "CS 2003", "Data Structures", "Mackey");

        courseMan.add(course1);
        courseMan.add(course2);
        courseMan.add(course3);
        courseMan.add(course4);

        courseMan.show();

    }
}
