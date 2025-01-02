
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nSearch {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);

        String[] names = new String[100];
        int numNames;
        numNames = loadArray(names);
        String name = " ";

        while(!name.equals("")){

            System.out.print("Name: ");
            name = console.nextLine();

            printNames(names, numNames);

            searchName(name, names, numNames);

        }


        console.close();
        
    }
    public static int loadArray(String[] names) throws FileNotFoundException{
        int index = 0;
        File file = new File("names.txt");
        Scanner nameFile = new Scanner(file);

        while(nameFile.hasNextLine()){
            names[index] = nameFile.nextLine();
            index++;
        }
        nameFile.close();
        return index;
    }
    
    public static void searchName(String name, String[] names, int size){
        boolean found = false;
            for(int i = 0; i < size; i++){
                if(names[i].equalsIgnoreCase(name)){
                    System.out.println("Found In List: [" + i + "]: " + names[i]);
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("Not Found In List: " + name);
            }
    }

    public static void printNames(String[] names, int size){
            for(int i = 0; i < size; i++){
                System.out.println("[" + i + "]: " + names[i]);
            }
    }
}