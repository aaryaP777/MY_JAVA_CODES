import java.util.List;
import java.util.ArrayList;
public class StatisticsCalculator {
    // Method to find the minimum value in a list of numbers
    public static Integer findMinimum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }

        Integer min = numbers.get(0);
        for (Integer num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the maximum value in a list of numbers
    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }

        Integer max = numbers.get(0);
        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to calculate the average of numbers in a list
    public static Double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }

        Double sum = 0.0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    // Method to calculate the standard deviation of numbers in a list
    public static Double calculateStandardDeviation(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }

        Double mean = calculateAverage(numbers);
        if (mean == null) {
            return null;
        }

        Double sumSquaredDiff = 0.0;
        for (Integer num : numbers) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / numbers.size());
    }
        public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calculate and display the minimum value
        Integer min = StatisticsCalculator.findMinimum(numbers);
        System.out.println("Minimum value: " + min);

        // Calculate and display the maximum value
        Integer max = StatisticsCalculator.findMaximum(numbers);
        System.out.println("Maximum value: " + max);

        // Calculate and display the average
        Double average = StatisticsCalculator.calculateAverage(numbers);
        System.out.println("Average: " + average);

        // Calculate and display the standard deviation
        Double stdDev = StatisticsCalculator.calculateStandardDeviation(numbers);
        System.out.println("Standard Deviation: " + stdDev);
        }

}

