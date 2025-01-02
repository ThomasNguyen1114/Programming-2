import java.util.Random;

public class sortArray {
    public static void main(String[] args) {
        int [] numbers = new int[10];


        loadArray(numbers, 20);
        showArray(numbers);
        sortingArray(numbers);
        System.out.println("");
        showArray(numbers);
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
    
    public static void showArray(int[] theArray){
        for(int index = 0; index < theArray.length; index++){
            System.out.println("[" + index + "]: " + theArray[index]);
        }
    }

    public static int binSearch(int[] theArray, int value){
        int start = 0;
        int mid;
        int retval = -1;
        int end = theArray.length - 1;

        while(start <= end){
            mid = (end - start)/2 + start;
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
