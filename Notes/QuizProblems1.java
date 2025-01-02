public class QuizProblems1 {
    public static void main(String[] args) {
        int[]numbers = {10,20,30,40,50};
        int total = 0;

        problem1();
        System.out.println("");
        problem2();
        System.out.println("");
        probelm3(numbers, total);
        System.out.printf("Total: %d\n", total);
        System.out.println("");
        problem4();
        System.out.println("");
        System.out.println("");
        problem5();
    }

    public static void problem1(){
        int[] array1 = {25,12,87,59,43};
        int[] array2 = {100,200,300,400,500};
        int index;

        array2 = array1;
        array1[2] = 22;

        System.out.printf("%3s  %3s %3s\n", "IDX", "AR1", "AR2");
        System.out.printf("%3s  %3s %3s\n", "---", "---", "---");
        for(index = 0; index < array1.length; index++){
            System.out.printf("[%d]: %3d %3d\n", index, array1[index], array1[index]);
        }
    }

    public static void problem2(){
        int[] numbers = {12,54,7,81,32};
        int index = 1;

        for(index = 0; index < numbers.length; index++){
            System.out.printf("%d ", numbers[index]);
        }
        System.out.printf("\n");
    }

    public static void probelm3(int[] theArray, int total){
        int index;

        for(index = 0; index < theArray.length - 1; index++){
            total = total + theArray[index];
        }
    }

    public static void problem4(){
        int[] numbers = {10, 22, 33, 55, 88};

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void problem5(){
        String str = "Hello";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }


}
