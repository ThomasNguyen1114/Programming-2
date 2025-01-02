import java.util.Scanner;

public class inClassOct30Version2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String[] names = new String[5];
        String name;
        int numNames = 0;
        int choice = 0; 

        while(choice != 3){
            System.out.println("*******************");
            System.out.println("1. Add Name");
            System.out.println("2. List Names");
            System.out.println("3. Quit");
            System.out.println("*******************");

            System.out.println();
            System.out.print("Enter Choice: ");
            choice = console.nextInt();
            console.nextLine(); // Needs this there to read the new line input when the user presses enter

            if(choice == 1){
                System.out.print("Enter Name: ");
                name = console.nextLine();
                addName(names, name, numNames);
                numNames++;
            }
            else if(choice == 2){
                listNames(names, numNames);
            }
        }
    }

    public static void addName(String[] names, String name, int numNames){
        names[numNames] = name;
    }

    public static void listNames(String[] names, int numNames){
        int index = 0;

        for(index = 0; index < numNames; index++){
            System.out.println("[" + index + "] " + names[index]);
        }
        System.out.println();
    }
}
