import java.util.stream.Stream;

public class AprendendoSobreReduce {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2, 10.0};

        var aprovado_aprovada = Stream.of(notas).reduce((acumulador, nota) -> acumulador + nota).map(total -> total/5).filter(nota -> nota > 7).isPresent();
        System.out.println("você foi aprovado : " + (aprovado_aprovada  ? "Sim" : "Não"));
    }
}
