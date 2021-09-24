import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


public class MathOperations {

    public static Map<Operations, BiFunction<Integer, Integer, Integer>> createMap() {

        Map<Operations, BiFunction<Integer, Integer, Integer>> myEnumMap = new HashMap<>();
        myEnumMap.put(Operations.DIVIDE, BiFunctionOperation.divide);
        myEnumMap.put(Operations.MINUS, BiFunctionOperation.minus);
        myEnumMap.put(Operations.MULTIPLY, BiFunctionOperation.multiply);
        myEnumMap.put(Operations.PLUS, BiFunctionOperation.plus);
        return myEnumMap;
    }
}
