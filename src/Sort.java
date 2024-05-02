import java.util.Scanner;
import java.util.Random;

public class Sort {

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

        // Massivi kiçikten böyüye doğru sıralayırıq və çap edirik
        bubbleSort(array);
        System.out.println("Azdan çoxa sıralanmış massiv:");
        for (int i = 0; i < size; i++) {
            System.out.println( (i + 1) + ": " + array[i]);
        }

        // Massivi böyüktən kiçiye doğru sıralayırıq və çap edirik
        bubbleSortReverse(array);
        System.out.println("Çoxdan azə sıralanmış massiv:");
        for (int i = 0; i < size; i++) {
            System.out.println( (i + 1) + ": " + array[i]);
        }

        scanner.close();
    }

    // BubbleSort algoritması
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void bubbleSortReverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] < array[j+1]) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
