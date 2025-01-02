
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class studentManager {
    private Student[] theArray;
    private int numStudents;
    private String fileName;
    public static final int SIZE = 10;

    public studentManager(){
        this.theArray = new Student[SIZE];
        this.numStudents = 0;
        this.fileName = "students.dat";
    }

    public void add(Student student){
        this.theArray[this.numStudents] = student;
        this.numStudents++;
    }

    public void delete(Student student) {
        int index = -1;

        for (int i = 0; i < this.numStudents; i++) {
            if (this.theArray[i] == student) {
                index = i;
                break;
            }
        }
    
        if (index != -1) {
            for (int i = index; i < this.numStudents - 1; i++) {
                this.theArray[i] = this.theArray[i + 1]; 
            }
            this.theArray[this.numStudents - 1] = null; 
            this.numStudents--; 
        }
    }
    

    public void show(){
        int index;
        for(index = 0; index < this.numStudents; index++){
            this.theArray[index].show();
        }
    }

    public void save(){
        int index;

        try{
            FileWriter outFile = new FileWriter(this.fileName);
            PrintWriter out = new PrintWriter(outFile);
            for(index = 0; index < this.numStudents; index++){
                out.println(this.theArray[index].serialize(","));
            }
            out.close();
            outFile.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        this.numStudents = 0;
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(this.fileName));
            String line;
            while ((line = inFile.readLine()) != null) {
                Student student = new Student();
                student.deserialize(line, ",");
                this.add(student);
            }
            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Too many students in the file.");
        }
    }
    
}
