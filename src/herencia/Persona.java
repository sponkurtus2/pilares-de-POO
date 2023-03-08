package herencia;

public class Persona {
    protected int edad;
    private String nombre;
    private boolean genero;


    public Persona() {
        this.edad = 20;
        this.nombre = "modificarPorNombre";
        this.genero = true; //true es mujer, false es hombre.
    }
    

    public Persona(int edad, String nombre, boolean genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String hablar() {
        return "Hola me llamo " + this.nombre;
    }

    public void socializar() {
        System.out.println("Mi discord es sponkurtus2");   
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean isGenero() {
        return genero;
    }


    public void setGenero(boolean genero) {
        this.genero = genero;
    }

}
