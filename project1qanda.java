import java.util.Scanner; 

public class project1qanda {
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in); // new scanner object 
        System.out.println("What is your name");


        String Name = in.nextLine();
        System.out.println("Hello " + Name);
    }
}
