import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String task1(List<String> names) {
        //Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...",
        // с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).

        String result = IntStream.range(0, names.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(index -> index+1 + ". " + names.get(index))
                .collect(Collectors.joining(", "));

        return result;
    }
}
