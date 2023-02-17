import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static int addTwo(int input){
        return input + 2;
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ben", "Delph", "Eden", "Brian");

        names.stream()
                .map(String::toUpperCase)
//                .forEach(result -> System.out.println(result));
                .collect(Collectors.toList()); // .collect to turn back into a collection

        Stream<String> fruits = Stream.of("Apple", "Pear", "Banana");

        fruits.map(String::toLowerCase)
                .forEach(fruit -> System.out.println(fruit));


        Stream<Integer> intStream = Stream.of(1,2,3,4);
//                .map(Streams::addTwo)
//                .forEach(number -> System.out.println(number));
        int total = intStream.reduce(0, (sum, nextNum) -> sum + nextNum);

        int otherTotal = intStream.reduce(0, Integer::sum);

        System.out.println(total);
    }
}
