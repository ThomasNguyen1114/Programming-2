public class Program {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,4,5,5};
        String str = "apples, oranges, bananas";
        char delim = ',';
        String[] tokens = null;

        System.out.println(countPairs(numbers));
        System.out.println("");
        tokens = parseString(str, delim);
        showArray(tokens);
    }
    public static int countPairs(int[] theArray){
        int pairs = 0;
        int index = 0;
        for(index = 0; index < theArray.length - 1; index++){
            if(theArray[index] == theArray[index + 1]){
                pairs++;
            }
        }
        return pairs;
    }

    public static void showArray(String[] theArray){
        int index;

        for(index = 0; index < theArray.length; index++){
            System.out.printf("[%d] - %s\n", index, theArray[index]);
        }
    }

    public static String[] parseString(String str, char delim){
        int index;
        char ch;
        String[] tokens = null;
        int size = 0;
        int tokenIndex = 0;
        for(index = 0; index < str.length(); index++){
            ch = str.charAt(index);
            if(ch == delim){
                size++;
            }
        }
        size++;
        tokens = new String[size];

        for(index = 0; index < str.length(); index++){
            ch = str.charAt(index);
            if(index == 0){
                tokens[tokenIndex] = " ";
            }
            if(ch == delim){
                tokenIndex++;
                tokens[tokenIndex] = "";
            }else{
                tokens[tokenIndex] += ch;
            }
        }

        return tokens;
    }
        
}

