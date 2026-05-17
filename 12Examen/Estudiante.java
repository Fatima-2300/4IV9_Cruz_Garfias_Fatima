package _12Examen;

public class Estudiante extends Persona{
    private int idEstudiante;
    private double promedio;
    
    public Estudiante(){
        super();
    }

    public Estudiante(String nombre, String apellidoP, String apellidoM, String correo, int idEstudiante, double promedio){
        super(nombre, apellidoP, apellidoM, correo);
        this.idEstudiante=idEstudiante;
        this.promedio=promedio;
    }

    public int getIdEstudiante(){
        return idEstudiante;
    }
    public void setIdEstudiante(int idEstudiante){
        this.idEstudiante=idEstudiante;
    }

    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio=promedio;
    }
}