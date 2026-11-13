public class Tarea {

    // Atributos: datos de cada tarea
    private String nombre;
    private String asignatura;
    private boolean completada;

    // CONSTRUCTOR: inicializa un nuevo objeto
    public Tarea(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }

    // METODO: cambia el estado de la tarea
    public void completarTarea() {
        completada = true;
    }

    // MÉTODO: muestra información
    public void mostrarTarea() {
        System.out.println(nombre + " - " + asignatura);
    }
}
