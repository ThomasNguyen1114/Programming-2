public class compareString1 {
    public static void main(String[] args) {
        String str1 = "cow";
        String str2 = "cat";

        int retval = compare(str1, str2);
        System.out.printf("%s | %s -> %d\n", str1, str2, retval);
    }

    public static int compare(String str1, String str2){
        int retval = 0;
        int index;
        int length;

        if(str1.length() > str2.length()){
            length = str2.length();
        }else{
            length = str1.length();
        }

        for(index = 0; index < length; index++){
            if(str1.charAt(index) != str2.charAt(index)){
                if(str1.charAt(index) > str2.charAt(index)){
                    retval = 1;                
                }else{
                    retval = 2;
                }
                break;
            }
        }
        if(str1.length() != str2.length()){
            if(str1.length() > str2.length()){
                retval = 1;
            }else{
                retval = 2;
            }
        }
        return retval;
    }
}
