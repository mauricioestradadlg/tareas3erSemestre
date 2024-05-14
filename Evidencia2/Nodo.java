class Nodo {
    int valor; //Valor del Nodo
    String carrera; // Valor de Carrera
    Nodo izquierda, derecha; //Nodos del Arbol Binario

    // Constructor
    public Nodo(int valor, String carrera) { 
        this.valor = valor;
        this.carrera = carrera;
        this.izquierda = this.derecha = null; //Los nodos seran nulos por default
    }
}