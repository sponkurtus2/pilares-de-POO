package herencia;

public class Alumno extends Persona {
    private static int contador;
    private String carrera;
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public Alumno() {
        this.carrera = "TICS";
        this.matricula = "A11221500" + (contador++); 
    }

    public Alumno(String nombre , String carrera) {
        setNombre(nombre);
        this.matricula = "1122150057" + (contador++);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return getNombre() + ", Carrera: " + getCarrera() + ", matricula: " + getMatricula();
    }


    


}