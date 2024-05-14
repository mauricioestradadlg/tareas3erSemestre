/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad6;

public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia de la clase Diccionario
        Diccionario<Integer,String> miDiccionario = new Diccionario<>();
        
        //Diccionario sin elementos
        System.out.println("Elementos dentro del Diccionario: " + miDiccionario.size());
        System.out.println("El Diccionario esta vacio: " +miDiccionario.isEmpty());
        
        //Se agregan los objetos al Diccionario
        miDiccionario.add(1000, "hola mundo 1");
        miDiccionario.add(1001, "hola mundo 2");
        miDiccionario.add(1002, "hola mundo 3");
        
        space();
        
        //Diccionario con elementos
        System.out.println("El Diccionario esta vacio: " +miDiccionario.isEmpty());
        System.out.println("Elementos dentro del Diccionario: " +miDiccionario.size());
        
        space();
         // Obtener un valor usando una clave
        System.out.println("Valor asociado a la clave 1001: " + miDiccionario.get(1001));
         space();
         
         
        // Actualizar un valor
        miDiccionario.setValue(1001, "nuevo valor");
         space();
         
         
        // Verificar si una clave está presente en el diccionario
        System.out.println("El diccionario contiene la clave 1001? " + miDiccionario.containsKey(1001));
         space();
         
         
        // Verificar si una clave que no está presente en el diccionario
        System.out.println("El diccionario contiene la clave 999? " + miDiccionario.containsKey(999));
         space();
         
         
    }
    public static void space(){
        System.out.println("\n");
    }
    
}