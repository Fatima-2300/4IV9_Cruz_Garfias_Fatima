package _12Examen;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Principal {
    public static void guardar(String texto, String archivo){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))){
        writer.write(texto);
        System.out.println("Guardado en: " + archivo);
    } catch (IOException e){
        System.out.println("Error: " + e.getMessage());
        }
    }
    public static void leer(String archivo){
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            System.out.println("\n=== Contenido de " + archivo + "===");
            while ((linea = reader.readLine()) !=null) {
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Estudiante alumno = new Estudiante("Fatima", "Cruz", "Garfias", "fgar23@mail.com", 2026, 6.5);
        Profesor maestro = new Profesor("Ricardo", "Rojas", "Parra", "rick00@mail.com", 101, "Programación");
        
        guardar("id" + alumno.getIdEstudiante() + "nombre" + alumno.getNombre() + "Promedio" + alumno.getPromedio());
        guardar("id" + maestro.getIdProfesor() + "nombre" + maestro.getNombre() + "Materia" + maestro.getMateria());

        System.out.println("Ingresa una opción");
        System.out.println("1. CRUD Estudiantes");
        System.out.println("2. CRUD Profesores");
        int opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("CRUD Estudiante");
                guardar("id" + alumno.getIdEstudiante() + "nombre" + alumno.getNombre() + "Promedio" + alumno.getPromedio(), "estudiante.txt");
                leer("estudiante.txt");
                break;

            case 2:
                System.out.println("CRUD Profesores");
                guardar("id" + maestro.getIdProfesor() + "nombre" + maestro.getNombre() + "Materia" + maestro.getMateria(), "profesor.txt");
                leer("profesor.txt");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}