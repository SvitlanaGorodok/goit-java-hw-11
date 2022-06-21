import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> task2(List<String> names){
//        Метод принимает на вход список из строк (можно список из Задания 1).
//        Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).

        List<String > result = names.stream()
                .map(name -> name.toUpperCase(Locale.ROOT))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        return result;
    }
}
