import java.util.Random;
import java.util.Scanner;

public class showArray {
    public static void main(String[] args){
        int[] array = new int[10];
        Scanner console = new Scanner(System.in);
        int value;

        loadArray(array, 10);
        array[array.length -1] = 99;
        System.out.println("");
        sortingArray(array);
        showArray(array);
        System.out.println("");

        System.out.print("Enter Value: ");
        value = console.nextInt();
        System.out.println("");

        if(binSearch(array, value) != -1){
            System.out.println(value + " Found At Index: " + search(array, value));
        }
        else{
            System.out.println("Not In Array ");
        }
    }

    public static void showArray(int[] theArray){
        for(int index = 0; index < theArray.length; index++){
            System.out.println("[" + index + "]: " + theArray[index]);
        }
    }

    public static void loadArray(int[] theArray, int max){
        Random rand = new Random();
        for(int index = 0; index < theArray.length; index++){
            theArray[index] = rand.nextInt(max);
        }
    }

    public static void sortingArray(int [] theArray){
        int index;
        int temp;
        int pass;

        for(pass = 0; pass < theArray.length - 1; pass++){
            for(index = 0; index < theArray.length - 1; index++){
                if(theArray[index] > theArray[index + 1]){
                    temp = theArray[index];
                    theArray[index] = theArray[index+1];
                    theArray[index + 1] = temp;
                }
            }
        }
    }

    public static int search(int[] theArray, int value){
        int retval = 0;

        for(int index = 0; index < theArray.length; index++){
            if(theArray[index]== value){
                retval = index;
                break;
            }
            else{
                retval = -1;
            }
        }
        return retval;
    }

    public static int binSearch(int[] theArray, int value){
        int start = 0;
        int mid;
        int retval = -1;
        int end = theArray.length - 1;

        while(start <= end){
            mid = (end - start)/2 + start;
            System.out.printf("Start : %d Mid: %d End: %d\n", start, mid, end);
            if(theArray[mid] == value){
                retval = mid;
                break;
            }
            
            if(theArray[mid] < value){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return retval;
    }
}
