public class Practice {
    public static void main(String[] args) {
        String sentence = "jhkfjAurfaO";

        int[] numbers = {10,5,5,5,5};
        
        System.out.println(countVowels(sentence));
        System.out.println("");
        System.out.println(canBalance(numbers));
    }

    public static int countVowels(String str){
        int index;
        int vowels = 0;
        for(index = 0; index < str.length(); index++ ){
            char ch = str.charAt(index);
            if(ch == 'a' || ch == 'A'){
                vowels++;
            }else if(ch == 'e' || ch == 'E'){
                vowels++;
            }else if(ch == 'i' || ch == 'I'){
                vowels++;
            }else if(ch == 'o' || ch == 'O'){
                vowels++;
            }
            else if(ch == 'u' || ch == 'U'){
                vowels++;
            }    
        }
        return vowels;
    }

    public static int canBalance(int[] theArray){
        int index;
        int total = 0;
        int split = 1;
        for(index = 0; index < theArray.length; index++){
            total += theArray[index];
        }
        int half = total/2;

        int temp = 0;
        for(index = 0; index < theArray.length; index++){
            temp += theArray[index];
            if(temp == half){
                break;
            }
            if(temp > half){
                split = -1;
                break;
            }
            split++;
        }

        return split;
    }
}
