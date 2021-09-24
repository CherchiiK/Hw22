import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Checking for requirements from task 1

        List<Integer> listWithDigits = ListBuilder.listBuilderForDigits();
        System.out.println("All Digits: " + listWithDigits);
        List<Integer> listWithSquareEvenDigits = StreamMethods.filterEvenDigits(listWithDigits);
        System.out.println("New list with Square of Even Digits: " + listWithSquareEvenDigits);

        //Checking for requirements from task 2 without Predicate

        System.out.println("This list has more then two strings starts with an Uppercase symbol? " + "\n" +
                StreamMethods.filterForUpperCaseWithoutPredicate(ListBuilder.listBuilderForMoreThenTwoUpperCaseLetter()));
        System.out.println("This list has more then two strings starts with an Uppercase symbol? " + "\n" +
                StreamMethods.filterForUpperCaseWithoutPredicate(ListBuilder.listBuilderForLessThenTwoUpperCaseLetter()));

        //Checking for requirements from task 2 with Predicate

        System.out.println("This list has more then two strings starts with an Uppercase symbol? " + "\n" +
                StreamMethods.filterForUpperCaseWithPredicate(ListBuilder.listBuilderForMoreThenTwoUpperCaseLetter()));
        System.out.println("This list has more then two strings starts with an Uppercase symbol? " + "\n" +
                StreamMethods.filterForUpperCaseWithPredicate(ListBuilder.listBuilderForLessThenTwoUpperCaseLetter()));

        //Checking for requirements from task 3
        Map<Operations, BiFunction<Integer, Integer, Integer>> myEnumMap = MathOperations.createMap();
        for (Map.Entry<Operations, BiFunction<Integer, Integer, Integer>> entry : myEnumMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().apply(10, 5));
        }
        //Checking for requirements from task 4
        Stream.generate(SupplierFunction.returnRandomNumbers)
                .map(number -> (int) Math.pow(number, 3))
                .limit(100)
                .filter(number -> number > 100)
                .forEach(System.out::println);
    }
}
