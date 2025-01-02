public class NewStudent extends Person {

    @Override
    public void printName(){
        System.out.printf("Student: %s\n", this.name);
    }
}
