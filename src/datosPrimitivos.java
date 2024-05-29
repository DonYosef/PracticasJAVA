public class datosPrimitivos {

    public void cargarPrimitivos(){

         /*
            Sitio web oficial de JAVA:
            https://www.java.com/es/
          */



        //COMENTARIOS EN JAVA

        //Esto es un comentario de una sola linea
        /*  En cambio este
            es un comentario
            de variar lineas    */

        var lenguaje = "JAVA"; //Aqui el compilador define el tipo de dato en función del valor de la variable
        final double DESCUENTO = 0.15; //El valor de está varible no puede cambiar!

        //DATOS PRIMITVOS EN JAVA

        //numericos:
        byte myByte = 77; //Enteros de 8bits (rango = -128 a 127)
        short myShort = 7777; //Enteros de 16 bits (rango = -32,768 a 32,767)
        int myInteger = 777777777; //Enteros de 32 bits (rango = 2^31 a 2^31 - 1)
        long myLong = 777777777;//Enteros de 64 bits (rango = -2^63 a 2^63 - 1)

        //flotantes:
        float estatura = 180.20f; //32 bits
/*
          Una variable double al ser creada ocupa un mayor espacio
          en memoria por lo que se puede lograr una mayor precición que float
          también declaramos como final esta variable, ya que nunca cambiará
*/
        final double PI = 3.141592; // 64 bits

        //caracteres
        char letra = 'a';

        //booleanos:
        boolean real = true;
        boolean falso = false;

        System.out.println("Hola " + lenguaje);

    }

}
