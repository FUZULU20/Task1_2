import java.util.Random;
import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Massivin ölçüsünü daxil edin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }


        System.out.println("Təsadüfi ədədlərlə doldurulmuş massiv:");
        for (int i = 0; i < size; i++) {
            System.out.println( (i + 1) + ": " + array[i]);
        }


        // İndeksi tək olan ədədlərin cəmini və cüt olan ədədlərin hasilini hesaplayırıq

        int tekCemi = 0;
        int cutHasil = 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                tekCemi += array[i];
            } else {
                cutHasil *= array[i];
            }
        }

        System.out.println("İndeksi tək olan ədədlərin cəmi: " + tekCemi);
        System.out.println("İndeksi cüt olan ədədlərin hasil: " + cutHasil);
    }

}
