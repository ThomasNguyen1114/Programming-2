public class Student {
    public static final int STUDENTID = 0;
    public static final int FIRSTNAME = 1;
    public static final int LASTNAME = 2;
    public static final int EMAIL = 3;
    private int studentID;
    private String firstName;
    private String lastName;
    private String email;

    public Student(){

    }

    public Student(int studentID, String firstName, String lastName, String email){
        this.setStudentID(studentID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    //Student ID
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public int getStudentID(){
        return this.studentID;
    }

    //First Name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    //Last Name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    //Email
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void show(){
        System.out.printf("%5d %-15s %-15s %-15s\n", this.studentID, this.firstName, this.lastName, this.email);
    }

    public String serialize(String delim){
        return this.studentID + delim + this.firstName + delim + this.lastName + delim + this.email;
    }

    public void deserialize(String str, String delim){
        String[] fields = str.split(delim);
        this.setStudentID(Integer.parseInt(fields[Student.STUDENTID]));
        this.setFirstName(fields[Student.FIRSTNAME]);
        this.setLastName(fields[Student.LASTNAME]);
        this.setEmail(fields[Student.EMAIL]);
    }
}
