import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str;
        int index;
        char ch;
        int sum = 0;

        System.out.print("String: ");
        str = console.nextLine();

        for(index = 0; index < str.length(); index++){
            ch = str.charAt(index);
            if(ch >= 48 && ch <= 57){
                sum = sum + (ch - '0');
                System.out.printf("%c", ch);
            }
        }

        System.out.println();
        System.out.printf("Total: %d", sum);
        System.out.println();

        console.close();
        
    }
}
