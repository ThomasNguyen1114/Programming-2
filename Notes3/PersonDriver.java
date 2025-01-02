public class PersonDriver {
    public static void main(String[] args) {
        Person person1 = new Person();
        NewStudent student1 = new NewStudent();
        Professor professor1 = new Professor();
        
        person1.name = "Joe";
        student1.name = "Bill";
        professor1.name = "John";
        String str;

        person1.printName();
        student1.printName();
        professor1.printName();
    }
}
