public class Course {
    private int crn;
    private String courseNumber;
    private String title;
    private String instructor;

    public Course(){

    }

    public Course(int crn, String courseNumber, String title, String instructor){
        this.setCrn(crn);
        this.setCourseNumber(courseNumber);
        this.setTitle(title);
        this.setInstuctor(instructor);
    }

    public void setCrn(int crn){
        this.crn = crn;
    }
    public int getCrn(){
        return this.crn;
    }

    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }
    public String getCourseNumber(){
        return this.courseNumber;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setInstuctor(String instructor){
        this.instructor = instructor;
    }
    public String getInstructor(){
        return this.instructor;
    }

    public void show() {
        System.out.printf("CRN: %d | Course Number: %s | Title: %s | Instructor: %s\n", this.crn, this.courseNumber, this.title, this.instructor);
    }


    
    
}
