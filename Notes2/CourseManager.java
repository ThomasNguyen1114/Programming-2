public class CourseManager {
    private Course[] theArray;
    private int numCourses;
    public static final int SIZE = 4;

    public CourseManager(){
        this.theArray = new Course[SIZE];
        this.numCourses = 0;
    }

    public void add(Course course){
        this.theArray[this.numCourses] = course;
        this.numCourses++;
    }

    public void show(){
        int index;
        for(index = 0; index < this.numCourses; index++){
            this.theArray[index].show();
        }
    }

}
