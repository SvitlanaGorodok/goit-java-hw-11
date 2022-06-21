import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        //Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой
        List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");

        String result = Arrays.stream(numbers.stream()
                .collect(Collectors.joining(", "))
                .split(", "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
