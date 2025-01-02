public class Dog {
    public String name;
    public String breed;
    private int age;
    public static int numDogs;

    public Dog(){
        Dog.numDogs++;
        this.setAge(1);
    }

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.setAge(age);
        Dog.numDogs++;
    }

    //Get Method
    public int getAge(){
        return this.age;
    }

    //Set Method
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public void bark(){
        System.out.printf("%s says Woof\n", this.name);
    }

    public void eat(){
        System.out.printf("%s eats Steak\n", this.name);
    }

    public void showInfo(){
        System.out.printf("Reference:  %s\n", this.toString());
        System.out.printf("Name:  %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Age:   %d\n\n", this.age);
    }

    public static void showCount(){
        System.out.printf("No of Dogs: %d\n", Dog.numDogs);
    }
}
