public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 5; // Height of the flag

        for (int i = 0; i < height; i++) {
            // Print the flag pattern
            if (i < height) {
                System.out.print("Green ");
            }
            if (i == height / 2) {
                System.out.print("White ");
            }
        }
        System.out.println(); // Move to the next line after printing the flag
    }
}


public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 5; // Height of the flag
        int width = 3;  // Width of the flag (3 sections)

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print the flag pattern
                if (j == 0 || j == 2) {
                    System.out.print("Green ");
                } else {
                    System.out.print("White ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
