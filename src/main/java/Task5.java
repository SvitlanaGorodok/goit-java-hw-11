import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static Stream<Integer> zip(Stream<Integer> first, Stream<Integer> second){
        Iterator<Integer> firstElements = first.iterator();
        Iterator<Integer> secondElements = second.iterator();
        Stream<Integer> result = Stream.empty();
        while (firstElements.hasNext() && secondElements.hasNext()){
            result = Stream.concat(result, Stream.of(firstElements.next()));
            result = Stream.concat(result, Stream.of(secondElements.next()));
        }
        return result;
    }
}
