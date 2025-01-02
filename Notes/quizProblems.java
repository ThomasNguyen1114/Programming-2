public class quizProblems {
    public static void main(String[] args) {

        int[] numbers = {10, 22, 33, 55, 88};
        String str = "Hello";

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        //Prints only when i is even
        for(int i = numbers.length - 1; i >= 0; i = i - 2){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        //Prints only when i is odd
        for(int i = numbers.length - 2; i >= 0; i = i - 2){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");



        System.out.println(" ");

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
