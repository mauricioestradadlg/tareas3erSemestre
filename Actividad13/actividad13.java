

import java.util.Scanner;

public class actividad13 {
    
    public static void main(String[] args) {

        algoritmo();
        
    }


    public static void algoritmo(){

        boolean ciclo = true;

        while(ciclo){

        Scanner scanner = new Scanner(System.in);
        long tiempoInicio, tiempoFin, duracion;
        int [] calificaciones = {50, 80, 60, 100, 90, 70, 20, 40, 10, 30};

        System.out.println("Algoritmos Divide y Venceras: ");
        System.out.print("-Merge Sort (Presiona 1) \n-Quick Sort (Presiona 2) \n\n-Elige una opcion: ");
        int opcion = scanner.nextInt();

        if(opcion == 1){

             // Tomar el tiempo de inicio
        tiempoInicio = System.currentTimeMillis();

        //ALGORITMO PRINCIPAL
        mergeSort(calificaciones);
        
        for(int i = 0; i < calificaciones.length; i++){
            System.out.print(calificaciones[i]+ " ");
        }

        // Tomar el tiempo de finalización
        tiempoFin = System.currentTimeMillis();

        // Calcular la duración de la ejecución
        duracion = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución: " + duracion + " milisegundos");
         

        }
        else if(opcion == 2){

        // Tomar el tiempo de inicio
        tiempoInicio = System.currentTimeMillis();

        //ALGORITMO PRINCIPAL
        quickSort(calificaciones, 0, calificaciones.length - 1);
        
        for(int i : calificaciones){
            System.out.print(i + " ");
        }

        // Tomar el tiempo de finalización
        tiempoFin = System.currentTimeMillis();

        // Calcular la duración de la ejecución
        duracion = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución: " + duracion + " milisegundos");

        }

        System.out.print("Quieres intentar otra opcion: \nPresiona 1 para continuar \nPresiona 2 para salir \nElige una opcion: ");
        int option = scanner.nextInt();

        if(option == 1){
            System.out.println("\n\n");
        }

        else if(option == 2){
            ciclo = false;
        }
        }
    }

    private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}

    private static void quickSort(int[] array, int start, int end) {
		
		if(end <= start) return; //base case
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);		
	}
	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
	}
}
