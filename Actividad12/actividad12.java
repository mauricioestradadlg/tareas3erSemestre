package actividad12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class actividad12 {
    
    public static void main(String[] args) {
        
        //algoritmo();

        Scanner scanner = new Scanner(System.in);
        boolean ciclo = true;
        int conjunto;

       while(ciclo){
        System.out.println("ALGORITMOS DE ORDENAMIENTO: \n");

        System.out.print("-Bubble Sort (Presiona 1) \n-Selection Sort (Presiona 2) \n-Insertion Sort (Presiona 3) \n-Shell Sort (Presiona 4) \n-Salir del programa (Presiona 5)\n\n-Elige una opcion: ");
        int opcion = scanner.nextInt();

        switch(opcion){

            //Bubble Sort
            case 1:
                System.out.println("\n");
                burbuja();
                System.out.println("\n");
                break;
            //Selection Sort
            case 2:
                System.out.println("\n");
                seleccion();
                System.out.println("\n");
                break;
            //Insertion Sort
            case 3:
                System.out.println("\n");
                insercion();
                System.out.println("\n");
                break;
            //Shell Sort
            case 4:
                System.out.println("\n");
                shell();
                System.out.println("\n");
                break;



            case 5:
                ciclo = false;
                break;        
        }
       }

    }


    public static int conjuntos(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Elige un tamaño de conjuntos para testear: ");

        System.out.print("-10 elementos (Presiona 1) \n-100 elementos (Presiona 2) \n-1000 elementos(Presiona 3) \n\n-Elige una opcion: ");
        int option = scanner.nextInt();

        return option;
    }


    public static void shell(){

        
        int conjunto = conjuntos();
    
        int[] arr;
        int[] arrShellSort;
        long startTime, endTime, duration;

        
    
        switch (conjunto) {
    
            case 1:
                arr = generarArreglo(10);
                arrShellSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                shellSort(arrShellSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nShell Sort:");
                shellSort(arrShellSort);
                imprimirArreglo(arrShellSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 2:
                arr = generarArreglo(100);
                arrShellSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                shellSort(arrShellSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nShell Sort:");
                shellSort(arrShellSort);
                imprimirArreglo(arrShellSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 3:
                arr = generarArreglo(1000);
                arrShellSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                shellSort(arrShellSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nShell Sort:");
                shellSort(arrShellSort);
                imprimirArreglo(arrShellSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
        }

    }


    public static void insercion() {

        int conjunto = conjuntos();
    
        int[] arr;
        int[] arrInsertionSort;
        long startTime, endTime, duration;

        
    
        switch (conjunto) {
    
            case 1:
                arr = generarArreglo(10);
                arrInsertionSort = arr.clone();
                
                 // Mostrar el arreglo original
                 System.out.println("Arreglo original:");
                 imprimirArreglo(arr);
    
                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();
    
                // Aplicar el algoritmo de ordenamiento
                insertionSort(arrInsertionSort);
    
                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();
    
                // Calcular la duración de la ejecución
                duration = endTime - startTime;

               
        
                System.out.println("\nInsertion Sort:");
                insertionSort(arrInsertionSort);
                imprimirArreglo(arrInsertionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 2:
                arr = generarArreglo(100);
                arrInsertionSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                insertionSort(arrInsertionSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nInsertion Sort:");
                insertionSort(arrInsertionSort);
                imprimirArreglo(arrInsertionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 3:
                arr = generarArreglo(1000);
                arrInsertionSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                insertionSort(arrInsertionSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nInsertion Sort:");
                insertionSort(arrInsertionSort);
                imprimirArreglo(arrInsertionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
        }
    }


    
    public static void seleccion() {

        int conjunto = conjuntos();
    
        int[] arr;
        int[] arrSelectionSort;
        long startTime, endTime, duration;

        
    
        switch (conjunto) {
    
            case 1:
                arr = generarArreglo(10);
                arrSelectionSort = arr.clone();
                
                 // Mostrar el arreglo original
                 System.out.println("Arreglo original:");
                 imprimirArreglo(arr);
    
                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();
    
                // Aplicar el algoritmo de ordenamiento
                selectionSort(arrSelectionSort);
    
                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();
    
                // Calcular la duración de la ejecución
                duration = endTime - startTime;

               
        
                System.out.println("\nSelection Sort:");
                selectionSort(arrSelectionSort);
                imprimirArreglo(arrSelectionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 2:
                arr = generarArreglo(100);
                arrSelectionSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                selectionSort(arrSelectionSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nSelection Sort:");
                selectionSort(arrSelectionSort);
                imprimirArreglo(arrSelectionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 3:
                arr = generarArreglo(1000);
                arrSelectionSort = arr.clone();
                
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);

                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();

                // Aplicar el algoritmo de ordenamiento
                selectionSort(arrSelectionSort);

                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();

                // Calcular la duración de la ejecución
                duration = endTime - startTime;

            
        
                System.out.println("\nSelection Sort:");
                selectionSort(arrSelectionSort);
                imprimirArreglo(arrSelectionSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
        }
    }

    public static void burbuja() {

        int conjunto = conjuntos();
    
        int[] arr;
        int[] arrBubbleSort;
    
        long startTime, endTime, duration;
    
        switch (conjunto) {
    
            case 1:
                arr = generarArreglo(10);
                arrBubbleSort = arr.clone();
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);
    
                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();
    
                // Aplicar el algoritmo de ordenamiento
                bubbleSort(arrBubbleSort);
    
                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();
    
                // Calcular la duración de la ejecución
                duration = endTime - startTime;
    
                // Mostrar el resultado y el tiempo de ejecución
                System.out.println("\nBubble Sort:");
                imprimirArreglo(arrBubbleSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 2:
                arr = generarArreglo(100);
                arrBubbleSort = arr.clone();
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);
    
                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();
    
                // Aplicar el algoritmo de ordenamiento
                bubbleSort(arrBubbleSort);
    
                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();
    
                // Calcular la duración de la ejecución
                duration = endTime - startTime;
    
                // Mostrar el resultado y el tiempo de ejecución
                System.out.println("\nBubble Sort:");
                imprimirArreglo(arrBubbleSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
            case 3:
                arr = generarArreglo(1000);
                arrBubbleSort = arr.clone();
                // Mostrar el arreglo original
                System.out.println("Arreglo original:");
                imprimirArreglo(arr);
    
                // Tomar el tiempo de inicio
                startTime = System.currentTimeMillis();
    
                // Aplicar el algoritmo de ordenamiento
                bubbleSort(arrBubbleSort);
    
                // Tomar el tiempo de finalización
                endTime = System.currentTimeMillis();
    
                // Calcular la duración de la ejecución
                duration = endTime - startTime;
    
                // Mostrar el resultado y el tiempo de ejecución
                System.out.println("\nBubble Sort:");
                imprimirArreglo(arrBubbleSort);
                System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
                break;
        }
    }
    




    public static int[] generarArreglo(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // Números aleatorios del 0 al 999
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j -= intervalo) {
                    arr[j] = arr[j - intervalo];
                }
                arr[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
