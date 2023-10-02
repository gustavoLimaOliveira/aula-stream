import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConstrucaoStream {
    public static void main(String[] args) {

        Stream<Number> numeros = Stream.of(10, 10, 9.6, 8.2, 9.7, 10);
        numeros.forEach(System.out::println);

        System.out.println("\n****<hr/>****\n");

        Number[] maisNotas = {7, 6.5, 7.2, 9};
        Stream.of(maisNotas).forEach(System.out::println);

        System.out.println("\n****<hr/>****\n");

        List<Number> outrasNotas = Arrays.asList(5, 4, 4.3, 9, 10);
        outrasNotas.stream().forEach(System.out::println);

        System.out.println("\n****<hr/>****\n");
        outrasNotas.parallelStream().forEach(System.out::println);

        //Stream.generate(() -> "Notas").forEach(System.out::println);
        //Stream.iterate(0, n -> n+1).forEach(System.out::println);


    }
}
