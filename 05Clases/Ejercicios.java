import java.util.Scanner;
public class Ejercicios {

    //vamos a hacer una calculadora rapida

    Scanner entrada = new Scanner(System.in);

    //la calculador a debe de tener un menu

    public void menu(){
        //las instrucciones

    System.out.println("Bienvenido a la calculadora. Ingresa la opción deseada");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Salir");

    int opcion = 0;
    opcion = entrada.nextInt();

    switch(opcion){
        case 1:
           public void sumar(){
            double num1 = 0.00, num2 = 0.00, resultado = 0.00;

            System.out.println("Ingresa el número que quieres sumar");
            num1= entrada.nextDouble();
            System.out.println("Ingresa el segundo numero que quieres sumar");
            num2= entrada.nextDouble();

            resultado = num1 + num2;
            System.out.println("La suma es igual a " + resultado);
           }
            break;
        case 2:
            resta();
        case 3:
        case 4:
            default:
                break;
    }
    }

}