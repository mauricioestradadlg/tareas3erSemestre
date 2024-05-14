class Arbol {
    Nodo raiz; //Nodo Padre

    public Arbol() {
        this.raiz = null; //El nodo padre sera nulo por default
    }

    //Metodo para insertar valores al nodo
    public void insertar(int valor, String carrera) //Parametros -> Valor y Carrera
    {
        raiz = insertarRecursivo(raiz, valor, carrera);
    }


    private Nodo insertarRecursivo(Nodo raiz, int valor, String carrera) {

        /* Si la raiz esta vacia se creara un nuevo nodo */
        if (raiz == null) {
            return new Nodo(valor, carrera);
        }

        /* Si el valor de un nodo es menor al valor
          de la raiz, el nodo se ubicara en la izquierda
         */
        if (valor < raiz.valor) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, valor, carrera);
        } 
        /* Si el valor de un nodo es mayor al valor
          de la raiz, el nodo se ubicara en la derecha
         */
        else if (valor > raiz.valor) {
            raiz.derecha = insertarRecursivo(raiz.derecha, valor, carrera);
        }

        //Si el valor es igual a la raiz, te regresa la raiz como tal
        return raiz;
    }


    public String recomendarCarrera(int[] respuestas) {
        // Condicionales del Quiz

        //Respuestas que elige el usuario
        if (respuestas[0] == 1 && respuestas[1] == 1 && respuestas[14] == 1) {
            
            //Se busca la carrera mediante el valor int del nodo
            return buscarCarreraPorValor(1);
        } else if (respuestas[0] == 1 && respuestas[2] == 1 && respuestas[3] == 1) {
            return buscarCarreraPorValor(2);
        } else if (respuestas[0] == 1 && respuestas[13] == 1 && respuestas[14] == 1) {
            return buscarCarreraPorValor(3);
        } else if (respuestas[3] == 1 && respuestas[4] == 1) {
            return buscarCarreraPorValor(4);
        } else if (respuestas[4] == 1 && respuestas[7] == 1) {
            return buscarCarreraPorValor(5);
        } else if (respuestas[3] == 1 && respuestas[7] == 1) {
            return buscarCarreraPorValor(6);
        } else if (respuestas[5] == 1 && respuestas[7] == 1) {
            return buscarCarreraPorValor(7);
        } else if (respuestas[6] == 1 && respuestas[7] == 1) {
            return buscarCarreraPorValor(8);
        } else if (respuestas[11] == 1 && respuestas[14] == 1) {
            return buscarCarreraPorValor(9);
        } else if (respuestas[8] == 1 && respuestas[12] == 1) {
            return buscarCarreraPorValor(10);
        } else if (respuestas[9] == 1 && respuestas[14] == 1) {
            return buscarCarreraPorValor(11);
        } else if (respuestas[10] == 1 && respuestas[14] == 1) {
            return buscarCarreraPorValor(12);
        }
    
        return "Carrera no encontrada";
    }
    
    private String buscarCarreraPorValor(int valor) {
        Nodo nodo = buscarNodoPorValor(raiz, valor);
        if (nodo != null) {
            return nodo.carrera;
        } else {
            return "Carrera no encontrada";
        }
    }
    
    private Nodo buscarNodoPorValor(Nodo raiz, int valor) {
        if (raiz == null || raiz.valor == valor) {
            return raiz;
        }
    
        if (valor < raiz.valor) {
            return buscarNodoPorValor(raiz.izquierda, valor);
        } else {
            return buscarNodoPorValor(raiz.derecha, valor);
        }
    }
    

    
}