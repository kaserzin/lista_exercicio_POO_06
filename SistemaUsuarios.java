package semana6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaUsuarios {
    void main(){

        Scanner sc = new Scanner(System.in);

        Map<String, String[]> usuarios = new HashMap<>();

        int opcao;

        do {
            IO.println("\n1 - Cadastrar usuario");
            IO.println("2 - Listar usuarios");
            IO.println("3 - Remover usuario");
            IO.println("0 - Sair");
            IO.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    if (usuarios.containsKey(email)) {
                        IO.println("Email ja cadastrado!");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    usuarios.put(email, new String[]{nome, senha});

                    IO.println("Usuario cadastrado!");
                    break;

                case 2:
                    for (String e : usuarios.keySet()) {
                        String[] dados = usuarios.get(e);

                        IO.println("Email: " + e);
                        IO.println("Nome: " + dados[0]);
                    }
                    break;

                case 3:
                    System.out.print("Email para remover: ");
                    String remover = sc.nextLine();

                    if (usuarios.remove(remover) != null) {
                        IO.println("Usuario removido!");
                    } else {
                        IO.println("Usuario nao encontrado!");
                    }
                    break;

                case 0:
                    IO.println("Encerrando...");
                    break;

                default:
                    IO.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

