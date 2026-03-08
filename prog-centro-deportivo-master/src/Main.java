import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Main {
    public static void main(String[] args) {
        CentroDeportivo centroDeportivo = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Julian", "Fisiatra", 2);
        Entrenador entrenador2 = new Entrenador(2, "Luis", "Piernas", 3);
        Entrenador entrenador3 = new Entrenador(1, "Carlos", "Brazos", 1);


        System.out.println("Registro: " + centroDeportivo.registrarEntrenador(entrenador1));
        System.out.println("Registro: " + centroDeportivo.registrarEntrenador(entrenador2));
        System.out.println("Registro: " + centroDeportivo.registrarEntrenador(entrenador3));

        System.out.println(centroDeportivo.mostrarEntrenadores());

        System.out.println("Numero de entrenadores: " + centroDeportivo.contarEntrenadores());


        System.out.println("Buscamos entrenador existente: " + centroDeportivo.buscarEntrenador(1) ) ;
        System.out.println("Buscamos entrenador inexistente: " + centroDeportivo.buscarEntrenador(4) ) ;

    }
}