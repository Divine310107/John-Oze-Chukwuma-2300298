import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}
