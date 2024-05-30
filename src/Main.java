import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    /*
     * EJERCICIO:
     * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en JAVA.
     * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
     *
     *Estructuras de datos JAVA:
     * Listas: ArrayList°, LinkedList°
     * Conjuntos(Sets): HashSet°, LinkedHashSet, TreeSet
     * Colas(Queues):PriorityQueue°, ArrayQueue
     * Mapas: HashMap°, LinkedHashMap, TreeMap, HashTable
     * Otros: Stack°, Vector, EnumSet
     * */

    public static void main(String[] args) {
        //ARRRAYLIST
        /* La diferencia entre un Array normal (estructura de almacenamiento simple) y un ArrayList es que
            está estructura de datos (ArrayList) puede ser dinámica, es decir cambia su tamaño
            y se accede a los elementos en ella por medio de los índices
        */
        /* Ejemplo de ArrayList con uso de Generics<String> para especificar el tipo de elemento (Java5)
            y sin redundancia en<>(Java7) + programación contra implementaciones
        */
        ArrayList<String> listaPalabras =  new ArrayList<>();
        listaPalabras.add("Carámbanos");
        /*
          Agregando la Interfaz LIST.
          List es una interfaz en Java que define una colección ordenada de elementos donde pueden existir duplicados. Permite
            acceder a los elementos mediante índices y proporciona métodos para agregar, eliminar y modificar elementos en la lista.
            Cuando usas List<String> listaEjemplo = new ArrayList<>(); estás siguiendo el principio de "programación contra interfaces"
            en lugar de "programación contra implementaciones". Lo que otorga Flexibilidad, Desacoplamiento, Interoperabilidad, etc.
         */
        //Nota: ArrayList implementa List, que asu vez implementa de Collection que a su vez extiende de Iterator

        List<String> listaInmutable = List.of("Uno","Dos","Tres","Cuatro");
        List<String> listaMutable = new ArrayList<>(listaInmutable);
        listaMutable.add("Cinco");
        listaMutable.set(0,"Primero");
        listaMutable.remove(1); //Elimina "Dos"
        System.out.println(listaMutable);

        //LinkedList
        /*  LinkedList está respaldada por una estructura de datos de lista doblemente enlazada. Esto significa que cada elemento
            en una LinkedList está vinculado a su elemento anterior y siguiente en la lista.
            (Es menos eficiente para iterar en ella, pero es mejor en Inserción y eliminación
         */
        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.addFirst("Random");
        System.out.println(listaEnlazada);
        System.out.println("La lista en lazada está vacía?: "+listaEnlazada.isEmpty());

        /* HashSet utiliza un mecanismo de tabla hash para almacenar sus elementos,
            lo que proporciona tiempos de acceso, inserción
            y eliminación constantes. No permite duplicados
            y no tiene un orden establecido, también acepta nulos.
         */
        Set<String> conjunto = new HashSet<>();
        // Agregar elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        String[] array = conjunto.toArray(new String[0]);
        for (String lenguaje : array) {
            System.out.println(lenguaje);
        }

        /*PriorityQueue es una excelente opción cuando necesitas una estructura de datos que mantenga los elementos
            ordenados de acuerdo con una prioridad. Ofrece operaciones eficientes de inserción y extracción de elementos
            con prioridad (no acepta nulos).
        */

        class Persona implements Comparable<Persona> {
            String nombre;
            int edad;

            Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public int compareTo(Persona otra) {
                return Integer.compare(this.edad, otra.edad);
            }

            @Override
            public String toString() {
                return nombre + " (" + edad + ")";
            }
        }

        Queue<Persona> colaPrioridad = new PriorityQueue<>();

        colaPrioridad.add(new Persona("Juan", 30));
        colaPrioridad.add(new Persona("Ana", 25));
        colaPrioridad.add(new Persona("Luis", 35));
        colaPrioridad.add(new Persona("Marta", 28));

        while (!colaPrioridad.isEmpty()) {
            System.out.println(colaPrioridad.poll());
        }

        /* HashMap: HashMap es una clase en Java que implementa la interfaz Map y utiliza
            una tabla hash para almacenar pares: clave-valor.
            Es parte del paquete java.util. HashMap es muy eficiente para operaciones de
            inserción, búsqueda y eliminación. Las claves no se pueden repetir y no tiene un
            orden definido.
         */
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Uno",1);
        hashMap.put("Dos",2);
        hashMap.put("Tres",3);
        System.out.println(hashMap.get("Uno"));
        System.out.println("Contiene 2?: "+hashMap.containsKey("Dos"));
        hashMap.remove("Tres");
        System.out.println(hashMap);

        /*Stack es una clase en Java que representa una pila (stack) de elementos,
        donde los elementos se insertan y se eliminan siguiendo el principio
        LIFO (Last In, First Out), es decir, el último elemento en entrar es el
        primero en salir. La clase Stack está incluida en el paquete java.util
        y es una subclase de Vector
        (Es sincronizada por lo es segura para el acceso de multiples hilos)
         */
        Stack<String> pila = new Stack<>();
                pila.push("Primero");
                pila.push("Segundo");
                pila.push("Tercero");
                System.out.println(pila);
        //Ordenamiento de elemento //FIFO
        System.out.println(pila.search("Tercero"));

        //Ejecución del ejercicio Agenda

        int opcion = -1;
        System.out.println("Bienvenido a la agenda dígital!");
        while(opcion != 0){

            System.out.println("Ingrese una opción para continuar: ");
            System.out.println("1 - Ver agenda");
            System.out.println("2 - Agregar contacto");
            System.out.println("3 - Actualizar contacto");
            System.out.println("4 - Eliminar contacto");
            System.out.println("5 - SALIR");
            opcion = Integer.parseInt(teclado.next());
            switch (opcion){
                case 1: verAgenda();
                    break;
                case 2: ingresarContacto();
                    break;
                case 3: actualizarContacto();
                    break;
                case 4: eliminarContacto();
                    break;
                case 5:
                    opcion = 0;
                    break;
            }
        }
    }

    public static class Contacto{

        String nombre;
        Integer telefono;

        public Contacto(String nombre, Integer telefono){
            this.nombre = nombre;
            this.telefono = telefono;
        }


    }

    static Scanner teclado = new Scanner(System.in);
    static Map<String, Integer> contactos = new HashMap<>();

    private static void verAgenda() {
        System.out.println("<----- Contactos ------>");
        for(Map.Entry<String,Integer> contacto : contactos.entrySet()){
            System.out.println(contacto);
        }
    }

    private static void ingresarContacto() {
        System.out.println("Ingre nombre del nuevo contacto:");
        String nombre = teclado.next();
        System.out.println("Ingre telefono del nuevo contacto:");
        Integer telefono = Integer.parseInt(teclado.next());
        Contacto contacto = new Contacto(nombre, telefono);
        contactos.put(nombre,telefono);


    }

    private static void actualizarContacto() {
    }

    private static void eliminarContacto() {
    }

    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea una agenda de contactos por terminal.
     * - Debes implementar funcionalidades de búsqueda, inserción, actualización y eliminación de contactos.
     * - Cada contacto debe tener un nombre y un número de teléfono.
     * - El programa solicita en primer lugar cuál es la operación que se quiere realizar, y a continuación
     *   los datos necesarios para llevarla a cabo.
     * - El programa no puede dejar introducir números de teléfono no númericos y con más de 11 dígitos.
     *   (o el número de dígitos que quieras)
     * - También se debe proponer una operación de finalización del programa.
     */


}
