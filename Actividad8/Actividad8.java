
package actividad8;


public class Actividad8 {

    public static void main(String[] args) {
        resolverNReinas();
    }
    
    private static final int n = 8; // Tamaño del tablero

    // Método para imprimir la solución
    private static void imprimirSolucion(int[][] tablero) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para verificar si una reina puede ser colocada en la posición board[row][col]
    private static boolean posicion(int[][] tablero, int fila, int columna) {
        int i, j;

        // Verifica la fila hacia la izquierda
        for (i = 0; i < columna; i++) {
            if (tablero[fila][i] == 1) {
                return false;
            }
        }

        // Verifica la diagonal superior izquierda
        for (i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        // Verifica la diagonal inferior izquierda
        for (i = fila, j = columna; j >= 0 && i < n; i++, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Método para resolver el problema de las 8 reinas utilizando backtracking
    private static boolean resolverNReinasUtil(int[][] tablero, int columna) {
        // Si todas las reinas han sido colocadas, retorna true
        if (columna >= n) {
            return true;
        }

        // Prueba colocar esta reina en todas las filas de esta columna
        for (int i = 0; i < n; i++) {
            if (posicion(tablero, i, columna)) {
                // Coloca la reina en la posición board[i][col]
                tablero[i][columna] = 1;

                // Recursivamente coloca las reinas restantes
                if (resolverNReinasUtil(tablero, columna + 1)) {
                    return true;
                }

                // Si colocar la reina en board[i][col] no lleva a una solución, retírala
                tablero[i][columna] = 0;
            }
        }

        // Si no se puede colocar la reina en ninguna fila en esta columna, retorna false
        return false;
    }

    // Método principal para resolver el problema de las 8 reinas
    public static void resolverNReinas() {
        int[][] tablero = new int[n][n];

        if (!resolverNReinasUtil(tablero, 0)) {
            System.out.println("No hay solución posible");
            return;
        }

        imprimirSolucion(tablero);
    }

    
}
