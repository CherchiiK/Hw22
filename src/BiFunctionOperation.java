import java.util.function.BiFunction;

public class BiFunctionOperation {

    static BiFunction<Integer, Integer, Integer> divide = (x, y) -> x / y;
    static BiFunction<Integer, Integer, Integer> minus = (x, y) -> x - y;
    static BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
    static BiFunction<Integer, Integer, Integer> plus = Integer::sum;

}
