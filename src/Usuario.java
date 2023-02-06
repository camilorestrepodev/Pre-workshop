public abstract class Usuario {
    private String nombre;
    private String apellido;
    private long cedula;
    private String correoElectronico;

    public Usuario(String nombre, String apellido, long cedula, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
    }

    public abstract String obtenerTipo();
}
