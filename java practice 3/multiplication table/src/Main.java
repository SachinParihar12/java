// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("input a number");
       int num1 = in.nextInt();

       for(int i =1; i<10; i++){
           System.out.println(num1 * (i+1));
       }

    }
}