public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 5; // Height of the flag
        for (int i = 0; i < height; i++) {
            if (i < height / 2) {
                System.out.print("Green ");
            } else {
                System.out.print("White ");
            }
        }
    }
}



public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 5; // Height of the flag
        int width = 3;  // Width of the flag (3 sections)

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
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
