import java.util.Scanner;

public class flujoMasOperadores {
    public void cargar(){
       /*
        Operadores de comparación -> ==, !=, <, >=
        Operadores lógicos en JAVA -> &&, ||, !
                    Y
          Control de flujo condicional
        */

/*      Ciclo IF
        El if es una estructura de control de flujo en Java
        que se utiliza para tomar decisiones basadas en una condición booleana. */

        System.out.println("<--- Control de flujo condicional --->");

        if(true){
            System.out.println("Verdadero");
        }else{
            System.out.println("falso");
        }

        /*Ciclo IF + Operadores de comparación
             == : Igualdad
             != : Desigualdad
             > : mayor que
             < : menor que*/

        /* Flujo IF + Operadores lógicos
             && : AND
             || : OR
             !  : NOT
        */

        int uno = 1;
        int dos = 2;
        int comodin = 1;

        if(uno == dos && uno == comodin){ //Ambas condiciones deben cumplirse
            System.out.println("SI");
        }else if(uno != dos || dos == comodin){ // Basta con que se cumpla una condición
            System.out.println("Tal vez");
        }else{
            System.out.println("NO");
        }

/*        Operadores de asignacion,
           Operadores aritmeticos
                    Y
         Control de flujo en bucle     */

/*        for(inicializción;condición;actualización){
        }
*/
        System.out.println("<--- Control de flujo [bucle] --->");
        System.out.println(" *bucle FOR* ");
        for(int i = 0; i <= 10 ; i = i+1){
            System.out.println("Vuelta: "+ i);
        }

        int[] numero = {1,2,3,4,5,6,7};
        System.out.println("*bucle FOREACH*");
        for(int x : numero){
            System.out.println(x);
        }


        Scanner teclado = new Scanner(System.in);
        String menu = """
                    ¿Desea ejecutar el programa?
                    1 - SI
                    2 - NO
                """;

        System.out.println(" *Bucle While* ");

        int opcion = 0;
        while(opcion == 0){
            System.out.println(menu);
            var eleccion = teclado.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("Ejecutando programa!!");
                    break;
                case 2:
                    opcion = 1;
                    System.out.println("Programa finalizado con éxito");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida!");
            }
            teclado.close();

        }

/*
        do {
            System.out.println("Hola mundo");
        } while (opcion == 0);
*/

    }
}
