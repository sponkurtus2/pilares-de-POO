import herencia.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        /* System.out.println("Crea un profesor: ");
        System.out.println("Cual es su nombre y edad?");
        String nombre = read.readLine();
        int edad = Integer.parseInt(read.readLine());
        System.out.print("Que genero es, hombre o mujer? ");
        String genero = read.readLine();
        boolean checarGenero = (genero.equals("hombre")) ? false : true;
        System.out.print("Y que materia da? ");
        String materia = read.readLine();
        Maestro maestroNuevo = new Maestro(materia, nombre, edad, checarGenero);
        System.out.println(maestroNuevo); */

        Maestro lalo = new Maestro("Programacion", "Carlos Eduardo", 18, false);

        Estudiante yoyis = new Estudiante("Yolotzin", 18, 7, true);        

        Alumno Rene = new Alumno();
        Rene.setGenero(true);
        Rene.setNombre("Rene");


        //Herencia por asignacion upcasting (Este es el polimorfismo)
        /*Persona teacher = lalo;
        Ingresos salario = lalo; */

        Persona[] personas = {Rene, lalo, yoyis};
        /*
         * Creamos un arreglo donde guardaremos a todas las clases que son personas
         */
        
        /*
         * Con este ciclo podemos recorrer y ver cada una de las personas
         */
        for (Persona persona : personas) {
            imprimir(persona);
        }

    }


    /*
     * Este es un metodo para en caso de que la persona sea un maestro, imprima su salario
     */
    public static void imprimir(Persona alumn) {

        System.out.println(alumn.toString());

        if (alumn instanceof Maestro) {
            Maestro tmp = (Maestro)alumn; //Downcasting caso 1
            System.out.println(tmp.salario());
        }

    }

}
