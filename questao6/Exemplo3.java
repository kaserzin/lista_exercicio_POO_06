package semana6.questao6;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplo3 {
   void main() {

        String texto = "Tudo começou quando eu fui me apresentar";

        Set<String> palavras = Arrays.stream(texto.split("\\s+"))
                .collect(Collectors.toSet());

        palavras.forEach(System.out::println);
    }
}
