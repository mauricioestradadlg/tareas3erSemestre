//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Dame la expresion infija :");
        String enter = n.nextLine();
        StringBuilder exit = new StringBuilder();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < enter.length(); i++) {
            char c = enter.charAt(i);

            // Si es un número (incluido el manejo de números de múltiples dígitos)
            if (Character.isDigit(c)) {
                exit.append(c);
                // Verificar si el siguiente caracter aún es parte del número
                while (i + 1 < enter.length() && Character.isDigit(enter.charAt(i + 1))) {
                    exit.append(enter.charAt(++i));
                }
                exit.append(" "); // Agregar espacio para separar números
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    exit.append(s.pop());
                }
                s.pop(); // Eliminar el '(' de la pila
            } else if (Operators.isOperator(c)) {
                while (!s.isEmpty() && Operators.precedence(s.peek()) >= Operators.precedence(c)) {
                    exit.append(s.pop());
                }
                s.push(c);
            }
        }

        while (!s.isEmpty()) {
            if (s.peek() == '(')
                return; // Expresión errónea si aún hay un '(' en la pila
            exit.append(s.pop());
        }

        System.out.print(exit.toString());
    }
}