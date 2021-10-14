
import java.util.Scanner;

public class madlibs {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("adjective"); String adj1 = scan.next();
        System.out.println("adjective"); String adj2 = scan.next(); 
        System.out.println("verb"); String verb1 = scan.next();
        System.out.println("noun"); String noun = scan.next();

        System.out.println("The " + adj1 +" "+noun+" "+verb1+ " "+"with " + adj2 +" "+ "joemama" );

    }
}

