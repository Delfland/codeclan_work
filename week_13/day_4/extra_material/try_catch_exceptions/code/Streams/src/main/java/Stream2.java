import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7)
                .filter(num -> num%2 == 0)
                .forEach(System.out::println);

        Stream.of(1,6,3,4,9,5,7)
                .sorted()
                .forEach(System.out::println);

        Stream.of("apple", "pear", "juice", "banana")
                .limit(2)
                .forEach(System.out::println);

        Stream.of(1,6,3,4,9,5,7)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        double avg = Stream.of(10,67,35,47)
                .mapToInt(n -> n)
                .limit(3)
                .average()
                .getAsDouble();
        System.out.println(avg);

        Stream.of(1,6,3,4,9,5,7)
                .sorted()
                .anyMatch(4)
    }
}
