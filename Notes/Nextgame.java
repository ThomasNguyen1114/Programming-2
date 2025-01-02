import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Nextgame {
    public static void main(String[] args){
        System.out.println("Game: Who's Next ");
        System.out.println("Objective: Identify the Sequence of 5 numbers between 1 and 5 using the fewest turns. \n" + 
        "If you wish to quit guessing and give up, enter a ZERO for one of your \n" +
        "guesses and the game will display the solution and quit. ");
        System.out.println("GOOD LUCK!!! ");

        int[] sequence = new int[5];

        int[] userSequence = new int[5];

        loadRandomSequence(sequence, 1, 6, true);

        showResult(sequence, userSequence);
            
    }

    public static int loadRandomSequence(int[] theSequence, int start, int end, boolean unique){
        int index;
        int returnValue = 0;
        int randomNumber;
        if(start < end){
            Random rand = new Random();
            
            for(index = 0; index < theSequence.length; index++){
                if(unique){
                    randomNumber = rand.nextInt(1, 6);
                    while(searchSequence(theSequence, randomNumber) != -1){
                        randomNumber = rand.nextInt(1, 6);
                    }
                    theSequence[index] = randomNumber;
                }else{
                    theSequence[index] = rand.nextInt(1,6);
                }
            }
        }
        else{
            returnValue = 1;
        }
        return returnValue;
    }

    public static int searchSequence(int[] theSequence, int randomValue){
        int index;
        for(index = 0; index < theSequence.length; index++){
            if(theSequence[index] == randomValue){
                return index;
            }
        }
        return -1;
    }

    public static int getUserSequence(int[] userSequence){
        Scanner console = new Scanner(System.in);
        int index;
        int returnValue = 0;
        int userValue;
        for(index = 0; index < userSequence.length; index++){
            System.out.print("Enter Number From 1 - 5: ");
            try{
                userValue = console.nextInt();
                while(userValue < 0 || userValue > 5){
                    System.out.print("Invalid Input - Please Enter Number From 1 - 5: ");
                    userValue = console.nextInt();
                }
                userSequence[index] = userValue;
                if(userValue == 0){
                    returnValue = -1;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid Input - Please Enter an Integer.");
                console.next();
                index--;
            }
        }
        return returnValue;
    }

    public static int compareSequences(int[] theSequence, int[] theUserSequence){
        int index;
        int count = 0;
        for(index = 0; index < theUserSequence.length; index++){
            if(theSequence[index] == theUserSequence[index]){
                count++;
            }
        }
        return count;

    }

    public static void showRandomSequence(int[] theSequence){
        int index;
        System.out.println("Game Number Sequence");
        System.out.println("---------------------");
        System.out.print("| ");
        for(index = 0; index < theSequence.length; index++){
            System.out.printf("%d", theSequence[index]);
            if(index < theSequence.length){
                System.out.print(" | ");
            }
        }
        System.out.println("");
        System.out.println("---------------------");
    }

    public static void showUserSequence(int[] theUserSequence){
        int index;
        for(index = 0; index < theUserSequence.length; index++){
            System.out.print(theUserSequence[index] + " ");
        }
        System.out.println("");
    }

    public static void showResult(int[] theSequence, int[] theUserSequence){
        int turnNumber = 1;
        
        boolean gameRunning = true;
        
        while(gameRunning == true){
            int userValue = getUserSequence(theUserSequence);
            if(userValue < 0){
                int correctSequence = compareSequences(theSequence, theUserSequence);
                System.out.print("== Turn " + turnNumber + " == Number Sequence: ");
                System.out.println("You have " +  correctSequence + " numbers correct");
                turnNumber ++;  
                System.out.println("");
                showRandomSequence(theSequence);
                gameRunning = false;
                break;
            }
            int correctSequence = compareSequences(theSequence, theUserSequence);
            if(correctSequence == theSequence.length){
                System.out.println("");
                System.out.println("You guessed the sequence in " + turnNumber + " turns");
                System.out.println("");
                showRandomSequence(theSequence);
                break;
            }
            else{
                System.out.print("== Turn " + turnNumber + " == Number Sequence: ");
                showUserSequence(theUserSequence);
                System.out.println("You have " +  correctSequence + " numbers correct");
                turnNumber ++;      
            }
        }
    }
}

