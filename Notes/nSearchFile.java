import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class nSearchFile {
    public static void main (String[] args) throws IOException{
        String[] names = new String[100];
        int recordCount;

        recordCount = loadArray(names);


        displayArray(names, recordCount);
    }

    public static int loadArray(String[] names) throws IOException{
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

    public static void displayArray(String[] names, int size){
        int index;

        for(index = 0; index < size; index++){
            System.out.printf("[%d]: %s\n", index, names[index]);
        }
    }

}
