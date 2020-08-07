import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberOccurrenceStream {
    public static void getMaxNumberOccurrence(Integer[] numbers){
        Stream<Integer> stream = Arrays.stream(numbers);

        Optional<Map.Entry<Integer, Long>> result = stream.collect(
                Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(result);

    }
}
