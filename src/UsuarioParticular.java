public class UsuarioParticular extends Usuario{
    private String tipoUsuario;
    public UsuarioParticular(String nombre, String apellido, long cedula, String correoElectronico, String tipoUsuario) {
        super(nombre, apellido, cedula, correoElectronico);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String obtenerTipo() {
        return tipoUsuario;
    }
}
