public class Gato extends Animal {
    private int num_vidas;
    public Gato(){

    }
    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas=num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void serNum_vidas(int num_vidas){
        this.num_vidas=num_vidas;
    }
    public void mostrarGato(){
        System.out.println("El nombre del michi es: " + getNombre() + "\n"
        + "Su raza es: " + getRaza() + "\n"
        + "Su comida es: " + getTipo_alimento() + "\n"
        + "Su edad es: " + getEdad() + "\n"
        + "El num de vidas que le restan son: " + num_vidas + "\n");
    }
}