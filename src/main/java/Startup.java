import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Startup {
    public static void main(String[] args) {

        List<String> estudantes = Arrays.asList("Gustavo", "Luciano", "Ana Luiza", "Izabella");

        System.out.println("\n****Utilizando o foreach****");

        for (String nome: estudantes) {
            System.out.println("\nEstudante: " + nome);
        }

        System.out.println("\n****Utilizando o Iterator****");

        Iterator<String> iterator = estudantes.iterator();
        while(iterator.hasNext()) {
            System.out.println("\nEstudante: " + iterator.next());
        }

        System.out.println("\n****Utilizando a Stream****");
        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);



    }
}
