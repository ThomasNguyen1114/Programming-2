public class Professor extends Person{

    @Override
    public void printName(){
        System.out.printf("Professor: %s\n", this.name);
    }
}
