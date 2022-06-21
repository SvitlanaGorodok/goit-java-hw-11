import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstElements = first.iterator();
        Iterator<T> secondElements = second.iterator();
        Stream<T> result = Stream.empty();
        Random r = new Random();
        while (firstElements.hasNext() && secondElements.hasNext()){
            result = Stream.concat(result, Stream.of(firstElements.next(),secondElements.next()));
        }
        return result;
    }
}
