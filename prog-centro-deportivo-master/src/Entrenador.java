/**
 * Representa a un entrenador dentro del sistema del centro deportivo.
 *
 * Cada entrenador está identificado de manera única mediante un {@code id}
 * y dispone de información básica como nombre, especialidad y años de experiencia.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
 * @author Alejandro Melero
 * @version 1.0
 */
public class Entrenador {
    private int id;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    /**
     * Constructor completo para crear un entrenador.
     * @param id Identificador único.
     * @param nombre Nombre completo.
     * @param especialidad Área de especialización (Yoga, Musculación, etc.).
     * @param aniosExperiencia Tiempo de experiencia en el sector.
     */
    public Entrenador(int id, String nombre, String especialidad, int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    /** @return El ID único del entrenador. */
    public int getId() { return id; }

    /** @return El nombre del entrenador. */
    public String getNombre() { return nombre; }

    /** @return La especialidad del entrenador. */
    public String getEspecialidad() { return especialidad; }

    /** @return Los años de experiencia. */
    public int getAñosExperiencia() { return aniosExperiencia; }

    @Override
    public String toString() {
        return String.format("[id: %d] %s - Especialidad: %s (%d años exp.)",
                id, nombre, especialidad, aniosExperiencia);
    }
}