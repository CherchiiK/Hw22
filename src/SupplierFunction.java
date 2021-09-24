import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunction {

    public static Supplier<Integer> returnRandomNumbers = () -> {
        Supplier<Integer> randomNumbers = () -> new Random().nextInt(10);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomNumbers.get();
    };

}