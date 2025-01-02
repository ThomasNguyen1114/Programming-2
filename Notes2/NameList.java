import java.util.Scanner;
public class NameList {
    public static final int SIZE = 5;
    String[] names = new String[SIZE];
    int numNames = 0;

    private void add(String name){
        this.names[this.numNames] = name;
        this.numNames++;
    }

    private void listNames(){
        int index;

        System.out.print("Names\n");
        System.out.print("-----\n");
        for(index = 0; index < this.numNames; index++){
            System.out.println("[" + index + "] " + this.names[index]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        NameList nameList = new NameList();
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
                nameList.add(name);
            }
            if(choice == 2){
                nameList.listNames();
            }
        }
    }
}
