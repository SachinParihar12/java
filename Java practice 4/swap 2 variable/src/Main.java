// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // int, double, float
        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}