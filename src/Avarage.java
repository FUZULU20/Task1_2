import java.util.Random;
import java.util.Scanner;

public class Avarage {

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
            System.out.println( i + 1 + ": " + array[i]);
        }


        // Massivin Ədədi ortalamasını tapırıq və çap edirik
        double average = calculateAverage(array);
        System.out.println("Massivin riyazi ortalaması: " + average);

        scanner.close();
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;

    }
}

