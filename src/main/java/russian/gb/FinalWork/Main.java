package russian.gb.FinalWork;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] originalArray = new String[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextLine();
        }
        scanner.close();
    }

}