
import java.util.Scanner;




public class shopping {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); //new scanner called in 

        System.out.println("Give me five numbers to add");
        int sum = 0; int num; 
        for (int i = 0; i<5; i++){
            num = scan.nextInt(); sum += num; 
        }
        System.out.println(sum);
    }
}
