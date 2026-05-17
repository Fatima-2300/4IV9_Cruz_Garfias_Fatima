import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

       int opcion = 0;
       boolean esValido;

       int idBuscar, id = 0, edad = 0;
       String nombre;
       double promedio = 0;

       do{
        System.out.println("CRUD estudiantes");
        System.out.println("1. registrar estudiante");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Editar estudiante");
        System.out.println("4. Eliminar estudiante");
        System.out.println("5. Mostrar lista");
        System.out.println("6. Salir");
        System.out.println("Selecciona una opción");

        if(entrada.hasNextInt()){
            opcion = entrada.nextInt();
            entrada.nextLine();
        } else {
            System.out.println("Ingresa un número del 1 al 6");
            entrada.nextLine();
            continue;
        }
        switch (opcion){
            case 1:
                System.out.println("Registrar nuevo estudiante");
                esValido=false;
                do{
                    System.out.print("Ingresa el ID del estudiante");
                    if(entrada.hasNextInt()){
                        id = entrada.nextInt();
                        if(id > 0){
                            boolean idRepetido = false;
                            for (Estudiante est : listaEstudiantes){
                                if (est.getId() == id){
                                    idRepetido = true;
                                    break;

                                }
                            }
                            if(!idRepetido){
                                esValido = true;
                            } else{
                                System.out.print("Ya existe un estudiante con ese ID");
                            }
                        } else {
                            System.out.print("Debe ser un numero positivo");
                        }
                    } else {
                        System.out.print("Ingresa numeros enteros");
                    }
                    entrada.nextLine();
                } while (!esValido);

                System.out.print("Nombre completo");
                nombre = entrada.nextLine();

                esValido=false;
                do{
                    System.out.print("Ingresa la edad");
                    if(entrada.hasNextInt()){
                        edad = entrada.nextInt();
                        if(edad >= 17 && edad <= 100){
                                esValido=true;
                            } else{
                                System.out.print("Edad no valida");
                            }
                    } else {
                        System.out.print("Ingresa numeros enteros");
                    }
                    entrada.nextLine();
                } while (!esValido);
                
                esValido=false;
                do{
                    System.out.println("Ingresa el promedio");
                    if(entrada.hasNextDouble()){
                        promedio = entrada.nextDouble();
                        if (promedio >= 0 && promedio <=10){
                            esValido=true;
                        } else{
                            System.out.println("El promedio debe estar entre 0.0 y 10");
                        }
                    } else{
                        System.out.println("Ingresa unicamente numeros");
                    } entrada.nextLine();
                } while (!esValido);
                Estudiante nuevo = new Estudiante(id, nombre, edad, promedio);
                listaEstudiantes.add(nuevo);
                System.out.println("Registro exitoso");
                break;
            case 2:
                System.out.println("Buscar estudiante");
                System.out.println("Ingresa el ID");
                if (entrada.hasNextInt()){
                    idBuscar = entrada.nextInt();
                    entrada.nextLine();

                    boolean encontrado = false;
                    for (Estudiante est : listaEstudiantes){
                        if (est.getId() == idBuscar) {
                            System.out.println("ID: " + est.getId());
                            System.out.println("Nombre: " + est.getNombre());
                            System.out.println("Edad: " + est.getEdad());
                            System.out.println("Promedio: " + est.getPromedio());
                            encontrado = true;
                            break;
                        }
                    } if(!encontrado){
                        System.out.println("No se encontro ningun estudiante");
                    }
                } else {
                    System.out.println("ID invalido");
                    entrada.nextLine();
                }
                break;
            case 3:
                System.out.println("Editar");
                System.out.println("Ingresa el ID  del estudiante amodificar");
                if (entrada.hasNextInt()) {
                idBuscar = entrada.nextInt();
                entrada.nextLine();

                boolean encontrado = false;
                    for (Estudiante est : listaEstudiantes){
                        if (est.getId() == idBuscar) {
                            encontrado = true;
                            System.out.println("Modificar al estudiante: " + est.getNombre());
                            System.out.println("Ingresa el nuevo nombre");
                            nombre = entrada.nextLine();
                            est.setNombre(nombre);

                            esValido=false;
                            do{
                                System.out.print("Ingresa la nueva edad");
                                if(entrada.hasNextInt()){
                                    edad = entrada.nextInt();
                                    if(edad >= 17 && edad <= 100){
                                        est.setEdad(edad);
                                    esValido=true;
                                    } else{
                                    System.out.print("Edad no valida");
                                    }
                                } else {
                                System.out.print("Ingresa numeros");
                                }
                                entrada.nextLine();
                            } while (!esValido);

                            esValido=false;
                            do{
                                System.out.println("Ingresa el nuevo promedio");
                                if(entrada.hasNextDouble()){
                                    promedio = entrada.nextDouble();
                                    if (promedio >= 0 && promedio <=10){
                                        est.setPromedio(promedio);
                                        esValido=true;
                                    } else{
                                        System.out.println("El promedio debe estar entre 0.0 y 10");
                                    }
                                } else{
                                    System.out.println("Ingresa unicamente numeros");
                                }
                                entrada.nextLine();
                                } while (!esValido);

                                System.out.println("Actualizacion exitoso");
                                break;
                        }
                    }

                        if(!encontrado) {
                            System.out.println("El ID no se encontó");
                        }
                    } else {
                        System.out.println("Id no valido");
                        entrada.nextLine();
                    }
                break;
            case 4:
                System.out.println("Eliminar estudiante");
                System.out.println("Ingresa el ID del estudiante que se va a eliminar");
                if (entrada.hasNextInt()){
                idBuscar = entrada.nextInt();
                entrada.nextLine();

                Estudiante estudianteAEliminar = null;

                for (Estudiante est : listaEstudiantes){
                    if (est.getId() == idBuscar){
                        estudianteAEliminar = est;
                        break;
                    }
                }
                if (estudianteAEliminar != null){
                    listaEstudiantes.remove(estudianteAEliminar);
                    System.out.println("Estudiante eliminado");
                } else {
                    System.out.println("No se encontro ningun estdudiante con ese ID");
                }
                } else {
                    System.out.println("ID no válido");
                    entrada.nextLine();
                }
                break;
            case 5:
                System.out.println("Lista completa de estudiantes");
                
                int totalEstudiantes = 0;
                for (Estudiante est : listaEstudiantes) {
                    System.out.println("ID: " + est.getId());
                    System.out.println("Nombre: " + est.getNombre());
                    System.out.println("Edad: " + est.getEdad());
                    System.out.println("Promedio: " + est.getPromedio());

                    totalEstudiantes++;
                }
                if (totalEstudiantes == 0){
                    System.out.println("No hay ningun estudiante registrado");
                }
                break;
            case 6:
                System.out.println("Gracias por usarme UwU");
                break;

            default:
                System.out.println("Opción no valida. Tiene que ser un número del 1 al 6");
                break;
        }
       } while (opcion !=6);
    }
}