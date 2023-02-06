public class Especialidad {
    private String nombre;
    private long codigo;
    private String tipoDeEspecialidad;

    public Especialidad(String nombre, long codigo, String tipoDeEspecialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoDeEspecialidad = tipoDeEspecialidad;
    }

    public String obtenerEspecialidad() {
        return this.tipoDeEspecialidad;
    }
}
