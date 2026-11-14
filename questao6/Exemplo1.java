package semana6.questao6;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1 {
    void main() {
        List<Integer> numeros = Arrays.asList(-5, 11777, -22, 1111, 400, 155, -134, 11, 13);

        List<Integer> positivos = numeros.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());

        System.out.println(positivos);
    }
}