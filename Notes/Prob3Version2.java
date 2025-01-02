import java.util.Scanner;

public class Prob3Version2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int width;
        int row,col;
        int numSpaces;

        // *** Get Width
        do {
            System.out.print("Width: ");
            width = console.nextInt();
        } while(width % 2 == 0 && width < 1 || width > 15);

        displayPyrimid(width);
        
        console.close();
    }

    public static void displayPyrimid(int width){
        int row, col, numSpaces;

        // *** Display the pyrimid
        for(row = 1; row <= width; row = row + 2){
            //Print Spaces
            numSpaces = (width - row) / 2;
            for(col = 0; col<numSpaces; col++){
                System.out.printf("  ");
            }
            //Prints Astericks
            for(col = 0; col < row; col++){
                System.out.print("* ");
            }

            System.out.print(" ");

            for(col = 0; col<numSpaces; col++){
                System.out.printf("    ");
            }
            for(col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
