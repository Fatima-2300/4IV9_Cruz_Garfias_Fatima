package _12Examen;

public class Profesor extends Persona {
    private int idProfesor;
    private String materia;

    public Profesor(){
        super();
    }

    public Profesor(String nombre, String apellidoP, String apellidoM, String correo, int idProfesor, String materia){
        super(nombre, apellidoP, apellidoM, correo);
        this.idProfesor=idProfesor;
        this.materia=materia;
    }

    public int getIdProfesor(){
        return idProfesor;
    }
    public void setIdProfesor(int idProfesor){
        this.idProfesor=idProfesor;
    }
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
}