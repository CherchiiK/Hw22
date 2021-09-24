import java.util.Arrays;
import java.util.List;

public class ListBuilder {

    public static List<String> listBuilderForMoreThenTwoUpperCaseLetter() {
        return Arrays.asList("Sia", "Ciao", "Hello", "Goodbye");
    }

    public static List<String> listBuilderForLessThenTwoUpperCaseLetter() {
        return Arrays.asList("sia", "ciao", "hello", "Goodbye");
    }

    public static List<Integer> listBuilderForDigits() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
