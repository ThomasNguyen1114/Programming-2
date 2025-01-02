public class Strings {
    public static void main(String[] args) {
        String str = "Hello World123";
        String strUp = "";
        String strLow = "";

        strUp = toUpperCase(str);
        System.out.println(strUp);

        strLow = toLowerCase(str);
        System.out.println(strLow);
        
    }

    //97 - 122 (-32) or 'a' and 'z'
    public static String toUpperCase(String str){
        String str2 = "";
        char ch;
        for(int index = 0; index < str.length(); index++){
            ch = str.charAt(index);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char) (ch-32);
            }
            str2 += ch;
        }
        return str2;
    }

    //65 - 90 (+32) or 'A' and 'Z'
    public static String toLowerCase(String str){
        String str2 = "";
        char ch;
        for(int index = 0; index < str.length(); index++){
            ch = str.charAt(index);

            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch+32);
            }
            str2 += ch;
        }
        return str2;
    }
}
