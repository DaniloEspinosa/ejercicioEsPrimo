import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un número y te dire si es primo o no");
        int numero = input.nextInt();

        if (numero < 2) {
            System.out.println(STR. "El número \{ numero } no es primo" );
        } else if (numero == 2) {
            System.out.println(STR. "El numero \{ numero } es primo" );
        } else {
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    System.out.println(STR. "El número \{ numero } no es primo" );
                    break;
                } else {
                    System.out.println(STR. "El numero \{ numero } es primo" );
                    break;
                }
            }
        }
        input.close();
    }
}