// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] arra = new String[5];

        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| o o |]";
        arra[2] = " |  ^  |";
        arra[3] = " | '-' |";
        arra[4] = " +-----+";

        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }
    }
}