import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String strOne = console.next();

        System.out.print("Enter String 2: ");
        String strTwo = console.next();

        System.out.print(compare(strOne, strTwo));
    }

    public static int length(String str1, String str2){
        int length = 0;
        if(str1.length() > str2.length()){
            length = str2.length();
        }

        if(str1.length() < str2.length()){
            length = str1.length();
        }
        return length;
    }

    public static int compare(String str1, String str2){
        int index;
        int compare = 0;
        int val1 = 0;
        int val2 = 0;
        char ch1;
        char ch2;
        int length = 0;

        if(str1.length() > str2.length()){
            compare = 1;
        }

        if(str1.length() < str2.length()){
            compare = 2;
        }

        else{
            for(index = 0; index < length(str1, str2); index++){
                ch1 = str1.charAt(index);
                ch2 = str2.charAt(index);                
                val1 += (int)ch1;
                val2 += (int)ch2;
    
                if(val1 == val2){
                    compare = 0;
                }
                else if(val1 > val2){
                   compare = 1;
                }
                else if(val1 < val2){
                        compare = 2;
                }
            }
        }  
    return compare;
    }
}
