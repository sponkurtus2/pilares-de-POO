package herencia;

public class Maestro extends Persona implements Ingresos{

    private String asignatura;

    public Maestro() {
        this.asignatura = "cambiarPorAsignatura";
    }

    public Maestro(String asignatura) {
        this.asignatura = asignatura;
    }

    public Maestro(String asignatura, String nombre, int edad, boolean genero) {
        setNombre(nombre);
        setEdad(edad);
        this.asignatura = asignatura;
        setGenero(genero);
    }

    @Override
    public String toString() {
        if (isGenero() == false) {
            return "Demosle la bienvenida al nuevo profesor " + this.getNombre() + ", quien tiene: " + this.getEdad() + " años"
             + ", el les va a impartir la asignatura de: " + this.asignatura + ".";
        }
        else {
            return "Demosle la bienvenida a la nueva profesora " + this.getNombre() + ", quien tiene: " + this.getEdad() + " años" + ", ella les va a impartir la asignatura de: " + this.asignatura + ".";
        }
    }

    @Override
    public double salario() {
        return 1500;
    }

}
