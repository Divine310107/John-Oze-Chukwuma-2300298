import java.util.Scanner;

public class TwoDArrayInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10]; // Declare a 2D array of size 10x10

        // Loop to assign values to the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt(); // Accept input from the user
            }
        }

        // Print out the input using a for-each loop
        System.out.println("You entered:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " "); // Print each element in a row
            }
            System.out.println(); // New line for each row
        }

        scanner.close();
    }
}
