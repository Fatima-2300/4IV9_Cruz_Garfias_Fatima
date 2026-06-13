/* vamos a crear una instancia y una salida de datos estandar y la salida de datos
*/

import java.util.Scanner;
class entradatexto{
    //metodo principal
    public static void main (String[] arg){
        //instanceamos el objetos
        Scanner entrada = new Scanner(System.in);
        //variables locales
        String nombre;
        int edad;
        //entrada
        System.out.println("Escribe tu nombre:");
        nombre=System.console().readLine();

        System.out.println("Hola "+ nombre +" bienvenido a este programa muy feo")

        System.out.println("Escribe tu edad: ")
        edad = entrada.nextInt();
    }
}