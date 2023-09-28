import java.util.List;
import java.util.Collections;

class StatisticsCalculator {

    public static double calculateMean(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.size();
    }

    public static double calculateMedian(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        List<Integer> sortedNumbers = numbers;
        Collections.sort(sortedNumbers);

        int middleIndex = sortedNumbers.size() / 2;
        if (sortedNumbers.size() % 2 == 0) {
            // even size
            return (sortedNumbers.get(middleIndex - 1) + sortedNumbers.get(middleIndex)) / 2.0;
        } else {
            // odd size
            return sortedNumbers.get(middleIndex);
        }
    }
}
