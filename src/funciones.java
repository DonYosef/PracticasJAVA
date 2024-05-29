public class funciones {
        /*Las varibles y metódos declarados Static
    pueden ser invocados desde cualquier parte del programa llamando
    directamente a su clase, sin necesidad de crear una instancia
    de la clase, ya que pertecen a la clase en si misma en lugar
    de instancias individuales de la clase*/

    public static int enteroUno = 1;
    public static int enteroDos = 2;

    public static int sumar (int valor1,int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }
    //System.out.println("El resultado es: " + sumar(enteroUno,enteroDos));
}
