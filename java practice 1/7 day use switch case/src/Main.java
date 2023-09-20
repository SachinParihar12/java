// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();

        int n =1;
        switch(button) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Sunday");
        }



    }
    }