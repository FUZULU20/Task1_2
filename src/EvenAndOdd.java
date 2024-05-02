import java.util.Random;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("İlk massivin ölçüsünü daxil edin: ");
        int size1 = scanner.nextInt();

        System.out.print("İkinci massivin ölçüsünü daxil edin: ");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];


        System.out.println("İlk massiv:");
        for (int i = 0; i < size1; i++) {
            array1[i] = random.nextInt(100);
            System.out.println( (i + 1) + ": " + array1[i]);
        }

        System.out.println("İkinci massiv:");
        for (int i = 0; i < size2; i++) {
            array2[i] = random.nextInt(100);
            System.out.println( (i + 1) + ": " + array2[i]);
        }

        // Cüt ədədləri seçib ekrana çap edirik
        System.out.println("Cüt ədədlər:");
        for (int num : array1) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // Tək ədədləri seçib ekrana çap edirik
        System.out.println("Tək ədədlər:");
        for (int num : array2) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
