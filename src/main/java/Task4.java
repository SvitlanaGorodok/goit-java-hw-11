import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> random(long seed, long a, long c, long m) {
        if ((a>=0 && a<=m) &&
            (c>=0 && c<=m) &&
            (seed>=0 && seed<=m) &&
            m >= 2) {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }
        return null;
    }
}
