import java.util.Scanner;

public class Evidencia2 {
    public static void main(String[] args) {
        quiz();
    }

    public static void space() {
        System.out.println("\n\n");
    }

    public static void quiz() {
        Scanner scanner = new Scanner(System.in);

        boolean ciclo = true;

        while (ciclo) {
            space();
            System.out.println("TEST CARRERA UNIVERSITARIA: ");
            System.out.print("-Presiona 1 para comenzar \n-Presiona 2 para salir \nElige una opcion: ");
            int option = scanner.nextInt();
            space();

            if (option == 1) {
                space();
                System.out.println("COMIENZA EL QUIZ: ");
                realizarQuiz();
                space();
            } else if (option == 2) {
                ciclo = false;
            }
        }
    }

    public static void realizarQuiz() {
        Arbol arbolCarreras = construirArbolCarreras();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Responde las siguientes preguntas con '1' para Sí y '2' para No:");

        // Realizar el quiz
        int[] respuestas = new int[15];
        String[] preguntas = {

            "¿Te sientes atraído por la resolución de problemas y la creación de soluciones innovadoras?",
            "¿Disfrutas trabajar con tecnología y software para crear aplicaciones y programas?",
            "¿Te interesa el funcionamiento y la optimización de procesos industriales? ",
            "¿Tienes habilidades para organizar y dirigir equipos de trabajo?",
            "¿Te gustaría trabajar en la planificación y ejecución de estrategias de marketing?",
            "¿Te atrae el mundo de las finanzas y la gestión económica?",
            "¿Te interesan los aspectos legales y la resolución de conflictos?",
            "¿Tienes habilidades para la comunicación y la negociación?",
            "¿Te gusta trabajar en entornos relacionados con la salud y el bienestar emocional?",
            "¿Te interesa la relación entre la alimentación y la salud?",
            "¿Tienes habilidades para la creatividad y el diseño visual?",
            "¿Te gusta cocinar y experimentar con diferentes ingredientes?",
            "¿Te atrae la idea de trabajar en la investigación y el análisis psicológico?",
            "¿Te gustaría trabajar en el diseño y desarrollo de robots y sistemas automatizados?",
            "¿Disfrutas trabajar en proyectos donde puedas combinar aspectos técnicos con creatividad?"
        };

        for (int i = 0; i < 15; i++) {
            System.out.println((i+1) +"- " + preguntas[i]);
            System.out.print("Elige una opción (1 para Sí, 2 para No): ");
            int respuesta = scanner.nextInt();
            respuestas[i] = respuesta == 1 ? 1 : 0;
        }

        // Obtener la carrera recomendada
        String carreraRecomendada = arbolCarreras.recomendarCarrera(respuestas);
        space();
        System.out.println("¡Tu carrera recomendada es: " + carreraRecomendada + "!");
    }

    public static Arbol construirArbolCarreras() {

        //Instanciamos el objeto de la clase arbol
        Arbol arbolCarreras = new Arbol();
       
        //Insertamos las carreras en el arbol
        arbolCarreras.insertar(1, "Ingenieria en Desarrollo de Software");
        arbolCarreras.insertar(2, "Ingenieria Industrial");
        arbolCarreras.insertar(3, "Ingenieria Mecatronica");
        arbolCarreras.insertar(4, "Administracion");
        arbolCarreras.insertar(5, "Marketing");
        arbolCarreras.insertar(6, "Comercio");
        arbolCarreras.insertar(7, "Finanzas");
        arbolCarreras.insertar(8, "Derecho");
        arbolCarreras.insertar(9, "Gastronomia");
        arbolCarreras.insertar(10, "Psicologia");
        arbolCarreras.insertar(11, "Nutricion");
        arbolCarreras.insertar(12, "Diseño");
        

        return arbolCarreras;
    }
}