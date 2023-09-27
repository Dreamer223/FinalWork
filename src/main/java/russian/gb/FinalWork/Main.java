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
    public static String[] filterArray(String[] array) {
        int count = 0;
        for (String str : array) {
            if (str.length() <= 3) {
                count++;
            }
        }

        String[] resultArray = new String[count];
        int index = 0;

        for (String str : array) {
            if (str.length() <= 3) {
                resultArray[index] = str;
                index++;
            }
        }

        return resultArray;
    }


}