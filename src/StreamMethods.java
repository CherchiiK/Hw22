import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethods {


    public static List<Integer> filterEvenDigits(List<Integer> list) {
        return list.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * a)
                .collect(Collectors.toList());
    }


    public static boolean filterForUpperCaseWithPredicate(List<String> list) {
        Predicate<String> tested = strings -> list.stream()
                .filter(string -> Character.isUpperCase(string.charAt(0)))
                .count() > 2;

        long count = list.stream()
                .filter(tested)
                .count();
        return count > 2;
    }

    public static boolean filterForUpperCaseWithoutPredicate(List<String> list) {

        long count = list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .count();
        return count > 2;
    }
}
