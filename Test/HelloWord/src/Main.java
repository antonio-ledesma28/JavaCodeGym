
import java.util.Scanner;

/*
Lectura de números
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        float result = (float) v1/v2;

        System.out.println(result);
    }
}