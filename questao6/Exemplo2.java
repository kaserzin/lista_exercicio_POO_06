package semana6.questao6;
import java.util.Arrays;
import java.util.List;

public class Exemplo2 {
   void main(){

        List<String> palavras = Arrays.asList(
                "Pedro", "Rafael", "Paulo",
                "Gabriel", "Patrick", "Bob"
        );

        palavras.stream()
                .filter(p -> p.startsWith("P"))
                .forEach(System.out::println);
    }
}

