package herencia;

public class Estudiante extends Persona {
    private int materias;

    public Estudiante() {
        this.materias = 0;
    }

    public Estudiante(int materias) {
        this.materias = materias;
    }

    public Estudiante(String nombre, int edad, int materias, boolean genero) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        this.materias = materias;
    }

    @Override
    public String toString() {
        if (isGenero() == false) {
            return "El estudiante se llama " + this.getNombre() + ", tiene " + this.getEdad() + " años, y cuenta con " + this.materias + " materias.";

        }
        else {
            return "La estudiante se llama " + this.getNombre() + ", tiene " + this.getEdad() + " años, y cuenta con " + this.materias + " materias.";
        }
    }

}
