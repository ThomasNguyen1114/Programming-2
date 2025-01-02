public class studentContactManagementSystem{
    public static void main(String[] args) {
        studentManager studentMan = new studentManager();

        Student student1 = new Student(111, "Smith", "Joe", "jsmith@gmail.com");
        Student student2 = new Student();
        student2.setStudentID(222);
        student2.setFirstName("Amy");
        student2.setLastName("Wilson");
        student2.setEmail("amy@uafs.edu");
        Student student3 = new Student(1114, "Thomas", "Nguyen", "tnguyen@gmail.com");
        Student student4 = new Student(02, "Kason", "K", "kkason@gmail.com");

        studentMan.add(student1);
        studentMan.add(student2);
        studentMan.add(student3);
        studentMan.add(student4);

        studentMan.delete(student4);

        studentMan.save();

        studentMan.load();

        studentMan.show();

    }
}
