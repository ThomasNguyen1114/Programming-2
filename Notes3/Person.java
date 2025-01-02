public class Person {

    public String name;

    @Override
    public String toString(){
        return this.name;
    }

    public void printName(){
        System.out.printf("Name: %s\n", this.name);
    }
}
