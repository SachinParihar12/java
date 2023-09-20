// Press Shift twice to open the Search Everywhee dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your co
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();

        if(button == 1) {
            System.out.println("hello");

        } else if(button == 2) {
            System.out.println("namste");

        } else  if(button == 3){
            System.out.println("hii");

        }else{
            System.out.println("invalid");
        }


    }
}
