public class Operators {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1; // Prioridad más baja
            case '*':
            case '/':
                return 2; // Prioridad más alta
            default:
                return -1; // Indica que el carácter no es un operador
        }
    }
}
