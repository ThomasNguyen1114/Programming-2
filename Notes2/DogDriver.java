public class DogDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Stormy", "Black Mouth Cur", 5);
        Dog dog3 = dog1;
        Dog dog4 = new Dog("Jamal", "Sabble", 5);

        dog1.name = "Gibbs";
        dog1.breed = "Dachshund";
        //dog1.age = 1;
        dog1.setAge(2);

        dog1.bark();
        dog2.bark();

        System.out.println("");

        dog1.eat();
        dog2.eat();
        dog3.eat();
        dog4.eat();

        System.out.println("");

        dog1.showInfo();
        dog2.showInfo();
        dog3.showInfo();
        dog4.showInfo();

        System.out.printf("Dog2 Age: %d\n", dog2.getAge());

        Dog.showCount();
    }
}
