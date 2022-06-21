import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Alex", "Katia", "Anna");
        String test1 = Task1.task1(names);
        System.out.println(test1);
        List<String> test2 = Task2.task2(names);
        System.out.println(test2);
        List<Long> test4 = Task4.random(7L,25214903917L,11L, (long) Math.pow(2.0,48.0))
                                .limit(20)
                                .collect(Collectors.toList());
        System.out.println(test4);
        List<Integer> result = Task5.zip(Stream.of(1,2,3,4,5,6,7),Stream.of(1,2,3,4,5,6,7,8,9,10))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
