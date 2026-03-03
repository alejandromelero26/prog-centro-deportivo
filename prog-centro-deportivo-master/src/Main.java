import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Main {
    public static void main(String[] args) {
        CentroDeportivo centroDeportivo = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Julian", "Fisiatra", 2);
        Entrenador entrenador2 = new Entrenador(2, "Luis", "Piernas", 3);
        Entrenador entrenador3 = new Entrenador(1, "Carlos", "Brazos", 1);

        System.out.println(centroDeportivo.buscarEntrenador(1) ) ;  // null

        System.out.println(centroDeportivo.registrarEntrenador(entrenador1)); // true
        System.out.println(centroDeportivo.registrarEntrenador(entrenador2));
        System.out.println(centroDeportivo.registrarEntrenador(entrenador3));// true

        System.out.println(centroDeportivo.mostrarEntrenadores());




    }
}