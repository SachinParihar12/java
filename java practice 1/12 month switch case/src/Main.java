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
                System.out.println("january");
                break;
            case 2 :
                System.out.println("febuary");
                break;
            case 3 :
                System.out.println("march");
                break;
            case 4 :
                System.out.println("aprail");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6 :
                System.out.println("june");
                break;
            case 7 :
                System.out.println("july");
                break;
            case 8 :
                System.out.println("august");
                break;
            case 9 :
                System.out.println("september");
                break;
            case 10 :
                System.out.println("octuber");
                break;
            case 11:
                System.out.println("novmber");
                break;
            case 12 :
                System.out.println("decmber");
                break;
            default :
                System.out.println("defult");
        }



    }

}