public class UsuarioEps extends Usuario {
    private String tipoUsuario;
    public UsuarioEps(String nombre, String apellido, long cedula, String correoElectronico, String tipoUsuario) {
        super(nombre, apellido, cedula, correoElectronico);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String obtenerTipo() {
        return tipoUsuario;
    }
}
