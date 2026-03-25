/* 
Vamos arealizar 14 programas dentro de un menu gigante
para poner a prueba sus conocimientos 
de algoritmia
1.- Desarrollar un programa para calcular el bono de un descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperatura a entre los 3 principales grados C -> F y K
4.- Realizar un programa para contar numero de positivos y negativos en una serie de números
5.- Desarrollar una tiendita para agrgar productos y precios
6.- Desarrollar un programa para calcular el area y perimetro de 5 diferentes figuras
7.- Desarrollar una tabla
8.- Desarrollar un programa para calcular el factorial con recursividad
9.- Vamos a hacer dibujitos
10.- Desarrollo de una figura hueca
11.- Realizar unos patrones
12.- Realizar un diamante
13.- Desarrollar una calculadora basica suma, resta, multiplicacion y division
*/

import java.until.Scanner;

class EstructuraDatos(){

}
    public static void main(String[] args){
    
        //aqui van las variables
        int opcion;
        char LetraParaRepetir;

        //aqui van los objetos
        Scanner entrada = new
        Scanner(System.in);

        //aqui va el menú

        System.out.println("Bienvenido a este programa para ver que tanto saben programar a partir de algoritmos basicos");

        System.out.println("Por favor elija la opción deseada");
        
        System.out.println ("1.- Descuento por edad");
        System.out.println ("2.- Convertir a binario");
        System.out.println ("3.- Convertidor a grados (C, F, K)");
        System.out.println ("4.- Contar números");
        System.out.println ("5.- Tiendita kawaii");
        System.out.println ("6.- Área y perimetro");
        System.out.println ("7.- Tabla");
        System.out.println ("8.- Calcular factorial");
        System.out.println ("9.- Dibujitos");
        System.out.println ("10.- Figura hueca");
        System.out.println ("11.- Patrones");
        System.out.println ("12.- Daimante");
        System.out.println ("13.- Calculadora");
        System.out.println ("14.- Salir");

        //entrada de dato
        opcion = entrada.nextInt();

        //ahora evitamos la entrada
        do{
            switch (opcion){
                case 1:
                    System.out.println("Ingresa tu edad (no puede ser mayor o igual a 99)");
                    int edad = entrada.nextInt();
                    double descuento = 0;
                    if (edad > 0 && edad < 99){
                        if (edad > 0 && edad < 7){
                            descuento = 0.10;
                        }

                        else if (edad >=7 && edad <18){
                            descuento = 0.90;
                        }

                        else if (edad >=23 && edad<23){
                            descuento = 0.05;
                        }

                        else if (edad >=23 && edad<46){
                            descuento = 0.30;
                        }

                        else if (edad >=46 && edad <70){
                            descuento = 0.70;
                        }

                        else if (edad <=70 && edad 85){
                            descuento = 0.60;
                        }

                        else if (edad >=85 && edad <99){
                            descuento = 0.99;
                        }
                        System.out.println("El descuento que se le da es:" + (descuento*100) + "%");
                    }
                    else{
                        System.out.println("Edad invalida");
                    }

                break;
                case 2:
                        //convertir un número decimal a binario
                        System.out.println("Ingresa un número positivo entero que se desee convertir a binario");
                        int numbinario;
                        String GuardarBinario ="";
                        numbinario = entrada.nextInt();

                        if(numbinario > 0){
                            //realizamos el modulo 2
                            while(numbinario > 0){
                                int residuo = numbinario % 2;
                                GuardarBinario = residuo + GuardarBinario;
                                numbinario /=2;
                            }
                        }
                        else if(numbinario ==0){
                            GuardarBinario = "0";
                        }
                        else {
                            //aqui no se puede 
                            GuardarBinario = "No se puede convertir ese número, solo se aceptan positivos";
                        }

                        System.out.println("El número convertido a binario es: " + GuardarBinario);
                break;
                case 3:
                        System.out.println("Selecciona una temperatura para convertir")
                        System.out.println("1.- K -> F");
                        System.out.println("2.- K -> C");
                        System.out.println("3.- F -> K");
                        System.out.println("4.- F -> C");
                        System.out.println("5.- C -> K");
                        System.out.println("6.- C -> F");

                        int ConvercionTem = entrada.nextInt();
                        System.out.println("Ingresa la temperatura");
                        double tem = entrada.nextDouble();
                        double resultado;
                        switch(ConvercionTem){
                            case 1:
                                resultado = (tem - 273.15)*1.8 + 32;
                                System.out.println("La temperatura es: " + resultado);
                            break;
                            case 2:
                                resultado = (tem - 273.15);
                                System.out.println("La temperatura es: " + resultado);
                            break;
                            case 3:
                                resultado = (tem - 32)*5/9 +273.15;
                                System.out.println("La temperatura es: " + resultado);
                            break;
                            case 4:
                                resultado = (tem - 32)*5/9;
                                System.out.println("La temperatura es: " + resultado);
                            break;
                            case 5:
                                resultado = (tem + 273.15);
                                System.out.println("La temperatura es: " + resultado);
                            break;
                            case 6:
                                resultado = (tem + 1.8) + 32;
                                System.out.println("La temperatura es: " + resultado);
                            break;

                        }

                case 4:
                    System.out.println("Intruduce un número");
                    int cantidad = entrada.nextInt();
                    int NumeroNegativo = 0;
                    int c = 0;
                    int NumeroPositivo = 0;

                    if (cantidad > 0){
                        for(int F = 1; F <= cantidad; F ++){
                            System.out.println("Ingrese el número" + F);
                            double numero = entrada.nextDouble();

                            if(numero > 0){
                                NumeroPositivo = NumeroPositivo + 1;
                            }
                        else if(numero < 0){
                            NumeroNegativo = NumeroNegativo + 1;
                        }
                        else{
                            c = c + 1;
                        }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Bienvenido a esta hermosa tiendita linda y kawaii");
                    System.out.println("Por favor ingresa la cantidad de elementos a comprar");
                    int elementos;
                    elemento = entrada.nextInt();
                    double compra = 0;

                    if (elemento > 0){
                        for(int i=1; i <= elemeto; i++){
                            System.out.println("Ingresa el nombre del producto");
                            entrada.next();
                            //Consumir el nombre pero no almacenar
                            System.out.println("Ingresa el precio");
                            double precio = entrada.nextDouble();
                            System.out.println("Ingresa la cantidad de producto");
                            int CantidadProducto = entrada.nextInt();
                            double total = precio * CantidadProducto;
                            compra = total;
                        }
                        System.out.println("El total de la compra es: " + compra);

                    }
                    else{
                        System.out.println("Solo se aceptan cantidades positivas");
                    }

                    break;

                    case 6:
                        System.out.println("Elija una figura para calcular su área y perímetro")
                        System.out.println("1.- Cuadrado");
                        System.out.println("2.- Triángulo");
                        System.out.println("3.- Círculo");
                        System.out.println("4.- Rombo");
                        System.out.println("5.- Trapecio");

                        int figura = entrada.nextInt();
                        double Area;
                        double Perimetro;
                        switch(figura){

                        case 1:
                            System.out.println("Ingresa la medida del cuadrado");
                            double l = entrada.nextDouble();
                            Area = l * l;
                            Perimetro = l * 4;

                            System.out.println("El área del cuadrado es igual a: " + Area);
                            System.out.println("El perímetro del cuadrado es igual a: " + Perimetro);

                            else{
                                System.out.println("El número no es válido");
                            }
                        break;

                        case 2:
                            System.out.println("Ingresa la base del triángulo");
                            double base = entrada.nextDouble();

                            System.out.println("Ingresa la altura del trángulo");
                            double h = entrada.nextDouble();

                            System.out.println("Ingresa el lado 1 del triángulo");
                            double l1 = entrada.nextDouble();

                            System.out.println("Ingresa el lado 2");
                            double l2 = entrada.nextDouble();

                            System.out.println("Ingresa el lado 3");
                            double l3 = entrada.nextDouble();

                            Area = (base * h) / 2;
                            Perimetro = l1 + l2 + l3;

                            System.out.println("El área del triángulo es igual a: " + Area);
                            System.out.println("El perímetro es igual a: " + Perimetro);
                        break;

                        case 3:
                            System.out.println("Ingresa el radio del círculo")-,
                            double r = entrada.nextDouble();

                            Area = 3.141592 * r * r;
                            Perimetro = 2 * 3.141592 * r;

                            System.out.println("El aréa del círculo es igual a: " + Area);
                            System.out.println("El perímetro es igual a: " + Perimetro);
                        break;

                        case 4:
                            System.out.println("Ingresa la diagonal menor");
                            double DiagMenor = entrada.nextDouble();

                            System.out.println("Ingresa la diagonal mayor");
                            double DiagMayor = entrada.nextDouble();

                            System.out.println("Ingresa la medida de su lado");
                            double l = entrada.nextDouble();

                            Area = (DiagMayor * DiagMenor) / 2;
                            Perimetro = 4 * l;

                            System.out.println("El área del rombo es igual a: " + Area);
                            System.out.println("Perímetro igual a:" + Perimetro);
                        break;

                        case 5:
                            System.out.println("Ingresa la base mayor");
                            double BaseMayor = entrada.nextDouble();

                            System.out.println("Ingresa la base menor");
                            double BaseMenor = entrada.nextDouble();

                            System.out.println("Ingresa la altura");
                            double h = entrada.nextDouble();

                            System.out.println("Ingresa la medida de el lado lateral");
                            double l = entrada.nextDouble();

                            Area = ((BaseMayor + BaseMenor) * h)/2;
                            Perimetro = BaseMayor + BaseMenor + (l * 2);

                            System.out.println("El área del trapecio es igual a: " + Area);
                            System.out.println("El perímetro es igual a: ") + Perimetro;
                        break;
                        }
                    
                    case 7:
                        // Tabla de multiplicar

                        double n;
                        System.out.println("Ingrese el número que se desea multiplicar")
                        double n = entrada.nextDouble();

                        for (int n = 1; n <=10; n++){
                            System.out.println(n + "    |   " + (n*10 + "   |   " + (n*100) + " |   " + (n*1000)));
                        }
                        break;

                    case 8:
                        break;
                    case 9:
                        //vamos a hacer un cuadro magico
                        System.out.println("Vamos a realizar el dibujo de un cuadrado mágico");
                        System.out.println("Ingrese el tamaño del cuadrado");
                        int n1 = entrada.nextInt();

                        if (n1 >= && n1 <=20){
                            for (int i = 1; i <= n1; i++){
                                System.out.println(" 1 ");
                                for (int j = 1; j <= n1; j++){
                                    System.out.println();
                                }
                            }
                            //se imprime
                        }else{
                            System.out.println("Por favor solo ingrese números entre el 1 y el 20");
                        }
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    }
                    System.out.println("Si desea repetir el programa, escriba s o S");
                    LetraParaRepetir = entrada.next().charAt ( 0 );

                 }while (LetraParaRepetir == 's' || LetraParaRepetir == 'S');
            }