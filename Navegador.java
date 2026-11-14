package semana6;

import java.util.Stack;

public class Navegador {

    void main(){

        Stack<String> paginas = new Stack<>();

        paginas.push("Google.html");
        paginas.push("Suap.html");
        paginas.push("Chatgpt.html");

        IO.println("Pagina atual: " + paginas.peek());
        paginas.pop();
        IO.println("Voltando uma pagina...");
        IO.println("Pagina atual: " + paginas.peek());

        paginas.push("Claude.html");
        IO.println("Nova pagina: " + paginas.peek());
    }
}
