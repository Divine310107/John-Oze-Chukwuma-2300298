import java.util.Arrays;

public class StatisticsCalculator {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        // Calculate mean
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);
        
        // Calculate median
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);
        
        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr); // Sort the array
        int n = arr.length;
        if (n % 2 == 0) {
            // If even, average the two middle numbers
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // If odd, return the middle number
            return arr[n / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] arr, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : arr) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / arr.length);
    }
}
