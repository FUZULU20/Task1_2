import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Massivin ölçüsünü daxil edin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Təsadüfi ədədlərlə doldurulmuş massiv:");
        for (int i = 0; i < size; i++) {
            System.out.println( i + 1 + ": " + array[i]);
        }


        // Minimum, maksimum və 2-ci maksimum dəyərləri tapıb çap edirik
        int[] minMax = findMinMax(array);
        System.out.println("Massivdəki minimum dəyər: " + minMax[0]);
        System.out.println("Massivdəki maksimum dəyər: " + minMax[1]);
        System.out.println("Massivdəki 2-ci maksimum dəyər: " + minMax[2]);

        scanner.close();
    }

    public static int[] findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        int secondMax = array[1];

        if (array[1] < array[0]) {
            max = array[1];
            secondMax = array[0];
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return new int[]{min, max, secondMax};
    }
}
