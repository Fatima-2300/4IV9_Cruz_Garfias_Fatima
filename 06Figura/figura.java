//librerias
import java.util.Scanner;
import java.lang.Math;

public class Figura{

    //vamos a colocar las variables globales
    double lado, lado2, lado3, altura, area, perimetro, base, radio, baseMayor, baseMenor;
    int opcion;
    char letra;
    boolean esValido = false;

    //la instancia del objeto para entrada de datos
    Scanner entrada = new Scanner(System.in);
    //metodos
    public void menu(){
        
        do{
            System.out.println("Este es un programa para calcular areas y perímetros de figuras geometricas");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Trapecio");
            System.out.println("5. Rombo");

            //leemos la opcion
            opcion = entrada.nextInt();

            //entrada de sw
            switch(opcion){
                case 1:
                    //tiangulos
                        System.out.println("Area y perímetro de un triángulo");
                        System.out.println("Qué tipo de triangulo desea calcular?");
                        System.out.println("1. Equilátero");
                        System.out.println("2. Isóseles");
                        System.out.println("3. Escaleno");
                        opcion = entrada.nextInt();
                        switch (opcion){
                            case 1:
                                //equilatero
                                esValido = false;
                                do{
                                    System.out.println("Ingresa la base del triángulo");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            base = entrada.nextDouble();
                                            if(base > 0){
                                                esValido = true;
                                            } else {
                                                System.out.println("La base debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingrese unicamente números");
                                            entrada.next();
                                        }
                                    }catch(Exception e){
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    }while(!esValido);
                                    esValido=false;

                                    do{
                                        System.out.println("Ingresa la altura del triángulo");
                                        try{
                                            if(entrada.hasNextDouble()){
                                                altura = entrada.nextDouble();
                                                if(altura > 0){
                                                    esValido = true;
                                                }else{
                                                System.out.println("La altura debe ser un número positivo");
                                                }
                                                }else{
                                                    System.out.println("Ingresa unicamente números");
                                                    entrada.next();
                                                }
                                            }catch (Exception e){
                                                System.out.println("Error: " + e.getMessage());
                                            }
                                        }while(!esValido);
                                        esValido = false;

                                    area=(base*altura)/2;
                                    perimetro = 3*base;

                                    System.out.println("El área es igual a " + area);
                                    System.out.println("El perímetro es igual a " + perimetro);
                            break;
                            case 2:
                                //isoseles
                                esValido=false;
                                do{
                                    System.out.println("Ingresa la base del triángulo");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            base = entrada.nextDouble();
                                            if(base > 0){
                                                esValido = true;
                                            }else{
                                                System.out.println("La base debe ser un número positivo");
                                            }
                                        }else{
                                            System.out.println("Ingrese unicamente números");
                                            entrada.next();
                                        }
                                    }catch(Exception e){
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    }while(!esValido);
                                    esValido = false;

                                do{
                                    System.out.println("Ingresa la altura del triángulo");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            altura = entrada.nextDouble();
                                            if(altura > 0){
                                                esValido = true;
                                            } else {
                                                System.out.println("La altura debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingrese unicamente números");
                                            entrada.next();
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    }while(!esValido);
                                    esValido = false;

                                do{
                                    System.out.println("Ingresa uno de los lados iguales del triángulo");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            lado = entrada.nextDouble();
                                            if(lado > 0){
                                                esValido = true;
                                                } else {
                                                System.out.println("El lado debe ser un número positivo");
                                                }
                                        } else {
                                            System.out.println("Ingresa unicamente números");
                                            entrada.next();
                                        }    
                                            } catch (Exception e) {
                                                System.out.println("Error: " + e.getMessage());
                                            }
                                        } while (!esValido);
                                        esValido = false;

                                    area=(base*altura)/2;
                                    perimetro = (2*lado) + base;

                                    System.out.println("El área es igual a " + area);
                                    System.out.println("El perímetro es igual a " + perimetro);
                            break;
                            case 3:
                                //escaleno
                                esValido = false;
                                do {
                                    System.out.println("Ingresa la base del triángulo");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            base = entrada.nextDouble();
                                            if(base > 0){
                                                esValido = true;
                                            } else {
                                                System.out.println("Debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingresa unicamente números");
                                            entrada.next();
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                } while (!esValido);
                                esValido = false;

                                do {
                                    System.out.println("Ingresa el lado 2");
                                    try{
                                        if(entrada.hasNextDouble()){
                                            lado2 = entrada.nextDouble();
                                            if(lado2 > 0){
                                                esValido = true;
                                            } else {
                                                System.out.println("Debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingresa unicamente números");
                                            entrada.next();
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    } while (!esValido);
                                    esValido = false;
                                do{
                                    System.out.println("Ingresa el lado 3");
                                    try {
                                        if(entrada.hasNextDouble()){
                                            lado3 = entrada.nextDouble();
                                            if(lado3 > 0) {
                                                esValido = true;
                                            } else {
                                                System.out.println("Debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingresa unicamente números");
                                            entrada.next();
                                        }
                                    } catch (Exception e){
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                } while(!esValido);
                                esValido = false;

                                do{
                                    System.out.println("Ingresa la altura del triángulo");
                                    try {
                                        if(entrada.hasNextDouble()){
                                            altura = entrada.nextDouble();
                                            if(altura > 0) {
                                                esValido = true;
                                            } else {
                                                System.out.println("La altura debe ser un número positivo");
                                            }
                                        } else {
                                            System.out.println("Ingresa unicamente números");
                                            entrada.next();
                                        }
                                    } catch (Exception e){
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                } while(!esValido);
                                esValido = false;

                                area = (base * altura)/2;
                                perimetro = base + lado2 + lado3;

                                System.out.println("El área del triángulo escaleno es: " + area);
                                System.out.println("El perímetro es: " + perimetro);

                                break;
                    }
                case 2:
                    //cuadrado
                    esValido = false;
                    do{
                        System.out.println("Ingresa el lado del cuadrado");
                        try {
                            if(entrada.hasNextDouble()){
                                lado = entrada.nextDouble();
                                if(lado > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);
                        esValido = false;

                        area = lado * lado;
                        perimetro = lado * 4;
                        
                        System.out.println("El área del cuadrado es: " + area);
                        System.out.println("El perímetro es: " + perimetro);
                
                    break;
                case 3:
                    //circulo
                    esValido = false;
                    do{
                        System.out.println("Ingresa le radio del círculo");
                        try {
                            if(entrada.hasNextDouble()){
                                radio = entrada.nextDouble();
                                if(radio > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("El radio debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);

                    area = 3.1416 * (radio * radio);
                    perimetro = 2 * 3.1416 * radio;

                    System.out.println("El área es igual a: " + area);
                    System.out.println("El perímetro es igual a: " + perimetro);
                    break;
                case 4:
                    //trapecio
                    esValido = false;
                    do{
                        System.out.println("Ingresa la base Mayor");
                        try {
                            if(entrada.hasNextDouble()){
                                baseMayor = entrada.nextDouble();
                                if(baseMayor > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("La base mayor debe ser número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);
                    esValido = false;

                    do{
                        System.out.println("Ingresa la base menor");
                        try {
                            if(entrada.hasNextDouble()){
                                baseMenor = entrada.nextDouble();
                                if(baseMenor > 0){
                                    esValido = true;
                                } else{
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else{
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch(Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while(!esValido);
                    esValido = false;

                    do {
                        System.out.println("Ingresa la altura");
                        try{
                            if(entrada.hasNextDouble()){
                                altura = entrada.nextDouble();
                                if(altura > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("La altura debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);
                    esValido = false;

                    do{
                        System.out.println("Ingresa la medida del lado lateral");
                        try {
                            if(entrada.hasNextDouble()){
                                lado =entrada.nextDouble();
                                if(lado > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);

                    area = ((baseMayor + baseMenor) * altura)/2;
                    perimetro = baseMayor + baseMenor + (2 * lado);

                    System.out.println("El área del trapecio es: " + area);
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                case 5:
                    //rombo
                    esValido = false;
                    do{
                        System.out.println("Ingresa la diagonal Mayor");
                        try {
                            if(entrada.hasNextDouble()){
                                baseMayor = entrada.nextDouble();
                                if(baseMayor > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        }
                    }while (!esValido);
                    esValido = false;

                    do{
                        System.out.println("Ingresa la diagonal menor");
                        try {
                            if(entrada.hasNextDouble()){
                                baseMenor = entrada.nextDouble();
                                if(baseMenor > 0){
                                    if(baseMenor < baseMayor){
                                        esValido = true;
                                    } else {
                                        System.out.println("La diagonal menor debe ser más pequeña que la diagonal mayor");
                                    }
                                } else {
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    } while (!esValido);
                    esValido = false;

                    do{
                        System.out.println("Ingresa la medida de uno de sus lados");
                        try{
                            if(entrada.hasNextDouble()){
                                lado = entrada.nextDouble();
                                if(lado > 0){
                                    esValido = true;
                                } else {
                                    System.out.println("Debe ser un número positivo");
                                }
                            } else {
                                System.out.println("Ingresa unicamente números");
                                entrada.next();
                            }
                        } catch(Exception e){
                            System.out.println("Error: " + e.getMessage);
                        }
                    } while (!esValido);

                        area = (baseMayor * baseMenor)/2;
                        perimetro = lado * 4

                        System.out.println("El area del rombo es: " + area);
                        System.out.println("El perimetro del rombo es: " + perimetro);
                    break;
                default:
                System.out.println("Gracias por ocuparme UwU");
                    break;
            }
            System.out.println("Si deseasrepetir el programa ingrese la letra S");
            letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S');
    }
}