import java.util.Scanner;

public class nameSearch {

    public static void main (String[] args){
        Scanner console = new Scanner(System.in);

        String[] names = new String[100];

        names[0] = "Joe";
        names[1] = "Jim";
        names[2] = "Mary";
        names[3] = "Jack";
        names[4] = "Linda";
        names[5] = "Jim";


        while(true){

            String name = "";
            System.out.print("Name: ");
            name = console.nextLine();

            if(name == ""){
                for(int i = 0; i < 6; i++){
                    System.out.println("[" + i + "]: " + names[i]);
                }
                break;
            }

            boolean found = false;
            for(int i = 0; i < 6; i++){
                if(names[i].equalsIgnoreCase(name)){
                    System.out.println("Found In List: [" + i + "]: " + names[i]);
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("Not Found In List: " + name);
            }
        }

        
        
    }
}




