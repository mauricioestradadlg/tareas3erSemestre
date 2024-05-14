//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        List personas = new List();

        Persona persona1 = new Persona("Paco", 50);
        Node newNodo = new Node(persona1);
        Node newNodo2 = new Node(2);
        Node newNodo3 = new Node("hola mundo!!");

        personas.insert(persona1);
        personas.insert(newNodo2);
        personas.insert("AAA");
        personas.insert(true);
        personas.insert(" Hola mundo ");
        personas.insert(" a ");
        personas.insert(234.88);
        personas.insertToEnd(" END ");
        personas.insertToStart(" START");
        personas.insertByPosition(2," POSITION");
        personas.removeFirstPosition();
        personas.removeLastPosition();
        personas.removeByPosition(4);
        personas.removeByData(" Hola mundo ");
        Node nodoEncontrado = (Node) personas.find(" hola");


        if (nodoEncontrado != null) {
            System.out.println("Nodo encontrado: " + nodoEncontrado.data);
        } else {
            System.out.println("El valor  no se encuentra en la lista.");
        }

        Node nodoFindByposition = (Node) personas.findByPosition(0);
        if (nodoFindByposition != null) {
            System.out.println("Nodo encontrado: " + nodoFindByposition.data);
        } else {
            System.out.println("El valor  no se encuentra en la lista.");
        }
        if(personas.isExist("AA"))
            System.out.println("sTrue");
        else{
            System.out.println("False");
        }
        System.out.println(personas.getDataByPosition(3));



        System.out.println(personas.getPositionByData(" a "));







        System.out.println("La lista mide: "+personas.getSize());
        for (int i = 0; i < personas.getSize(); i++) {

        }


        System.out.println("Los valores de la lista son: ->"+personas);

    }

}
