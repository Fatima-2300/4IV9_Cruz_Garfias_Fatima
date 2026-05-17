public class Estudiante extends Persona {
    //atributos
    private int id;
    private double promedio;

    public Estudiante(){

    }

    public Estudiante(int id, String nombre, int edad, double promedio){
        super(nombre, edad);
        this.id = id;
        this.promedio = promedio;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
}