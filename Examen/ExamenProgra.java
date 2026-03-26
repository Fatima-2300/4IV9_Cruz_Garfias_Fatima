import java.util.Scanner;

class Estructura{
    public static void main(String[] args){

        //variables
        int opcion;
        String nombre = "";
        String ApellidoPaterno = "";
        String ApellidoMaterno = "";
        String FechaNac = "";
        String direccion = "";
        double TotalCompra = 0;

        Scanner entrada = new Scanner(System.in);

        //menu
        do{
        System.out.println("Bienvenido a la calculadora de piso");
        System.out.println("Por favor ingrese la opción deseada");

        System.out.println("1.- Datos necesarios para comprar");
        System.out.println("2.- Pisos en venta");
        System.out.println("3.- Donde se desea instalar el piso?");
        System.out.println("Realizar compra");
        System.out.println("Salir");

        //entrada dato
        opcion = entrada.nextInt();

        //evaluar entrada
        
            switch(opcion){
                case 1:
                    System.out.println("Ingrese su nombre");
                    System.out.println("Nombre/s");
                    nombre = entrada.nextLine();

                    System.out.println("Apellido paterno");
                    ApellidoPaterno = entrada.nextLine();

                    System.out.println("Apellido materno");
                    ApellidoMaterno = entrada.nextLine();

                    System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa");
                    FechaNac = entrada.nextLine();

                    System.out.println("Ingrese su dirección residencial");
                    direccion = entrada.nextLine();
                    break;

                case 2:
                    System.out.println("PISOS DISPONIBLES");
                    System.out.println("1. Porcelanato: $22.35 el metro cuadrado");
                    System.out.println("2. Marmoleado:  $34.27 el metro cuadrado");
                    System.out.println("3. Acrílico:    $22.94 el metro cuadrado");
                    break;

                case 3:
                    int NumCuartos = 0;

                    //cantidad de cuartos
                    while (NumCuartos <= 1 || NumCuartos >=5){
                        System.out.println("¿En cuantos cuartos se desea instalar el piso?");
                        NumCuartos = entrada.nextInt();
                    if (NumCuartos <= 1 || NumCuartos >= 5){
                    System.out.println("El número de cuartos debe de ser de 1 a 5");
                    }
                }

                    //medidas del cuarto
                    double TotalCompra = 0;
                    String ResCuartos = "";

                    for (int i = 1; i <= NumCuartos; i++){
                        System.out.println("Ingrese las medidas del cuarto");
                        System.out.println("Ingrese el largo en metros");
                        double largo = entrada.nextDouble();
                        System.out.println("Ingrese el ancho en metros");
                        double ancho = entrada.nextDouble();

                        double area = largo * ancho;

                        double precioM2 = 0;
                        String NombrePiso = "";
                        int TipoPiso = 0;
                        double precioM2 = 0;
                        String NombrePiso = "";

                        while(TipoPiso < 1 || TipoPiso > 3){
                            System.out.println("Elija el tipo de piso:");
                            System.out.println("1. Porcelanato: $22.35 el metro cuadrado");
                            System.out.println("2. Marmoleado:  $34.27 el metro cuadrado");
                            System.out.println("3. Acrílico:    $22.94 el metro cuadrado");
                            int TipoPiso = entrada.nextInt();

                        switch (TipoPiso){
                            case 1:
                                precioM2 = 22.35;
                                NombrePiso = "Porcelanato";
                                break;
                            case 2:
                                precioM2 = 34.27;
                                NombrePiso = "Marmoleado";
                                break;
                            case 3:
                                precioM2 = 22.94;
                                NombrePiso = "Acrílico";
                                break;
                            default:
                                System.out.println("La opción no es válida. Elija una opción 1, 2 o 3");
                        }
                    }

                    double CostoCuarto = area * precioM2;
                    TotalCompra += CostoCuarto;

                    ResCuartos += "Cuarto " + i + NombrePiso "$" + CostoCuarto;
                    System.out.println("El costo de este cuarto es de: $") + CostoCuarto;
                }

                //Imprimir costos
                System.out.println("Cliente:" + nombre + " " ApellidoPaterno + " " + ApellidoMaterno);
                System.out.principal("Dirección:" + direccion);
                System.out.println(ResCuartos);
                System.out.println("TOTAL: $" + TotalCompra);
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}