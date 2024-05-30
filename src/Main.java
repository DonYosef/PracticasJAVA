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

        /* HashSet utiliza un mecanismo de tabla hash para almacenar sus elementos, lo que proporciona tiempos de acceso, inserción
            y eliminación constantes. No permite duplicados y no tiene un orden establecido, también acepta nulos.
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
            con prioridad (no acepta nulos.
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
            System.out.println(colaPrioridad.poll()); // Los elementos se imprimen en orden de edad: Ana (25), Marta (28), Juan (30), Luis (35)
        }

    }

}
