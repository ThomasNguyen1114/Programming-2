import java.util.Scanner;
public class inClassOct30 {
    public static final int SIZE = 5;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] names = new String[SIZE];
        int numNames = 0;
        String buffer;
        String name;
        int choice = 0;

        while(choice != 3){
            System.out.println("*******************");
            System.out.println("1. Add Name ");
            System.out.println("2. List Names ");
            System.out.println("3. Quit ");
            System.out.println("*******************");

            System.out.print("Enter Choice: ");
            buffer = console.nextLine();
            if(buffer.length() > 0){
                choice = (int) buffer.charAt(0) - '0';
            }

            if(choice == 1){
                System.out.print("Name: ");
                name = console.nextLine();
                numNames = add(names, name, numNames);
            }

            if(choice == 2){
                listNames(names, numNames);
            }
        }
    }

    private static int add(String[]names, String name, int numNames){
        names[numNames] = name;
        numNames++;
        return numNames;
    }

    private static void listNames(String[] names, int numNames){
        int index;

        System.out.print("Names\n");
        System.out.print("-----\n");
        for(index = 0; index < numNames; index++){
            System.out.println("[" + index + "] " + names[index]);
        }
    }
}