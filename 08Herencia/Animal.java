public class Animal {
    private String nombre, raza, tipo_alimento;
    private int edad;

    public Animal() {

    }
    public Animal(String nombre, String raz, String tipo_alime, int edad){
        this.nombre=nombre;
        this.raza=raza;
        this.tipo_alimento=tipo_alime;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raz){
        this.raza=raz;
    }
    public String getTipo_alimento(){
        return tipo_alimento;
    }
    public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento=tipo_alimento;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}