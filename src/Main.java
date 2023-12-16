import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        HashMap<Integer, String> values = new HashMap<>();
        values.put(3, "Fizz");
        values.put(5, "Buzz");
        for (int i = 1; i <= 100; i++) {
            for (Map.Entry<Integer, String> entry : values.entrySet()) {
                if (i % entry.getKey() == 0) {
                    output.append(entry.getValue());
                }
            }
            System.out.println(i + " " + output);
            output.delete(0, output.length());
        }
    }
}