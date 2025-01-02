import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int length = 0;

        System.out.print("Length: ");
        length = console.nextInt();

        int row = (length/2) + 1;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

        System.out.println();
        }
    }
}



