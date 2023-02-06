public class UsuarioPoliza extends Usuario{
    private String tipoUsuario;
    public UsuarioPoliza(String nombre, String apellido, long cedula, String correoElectronico, String tipoUsuario) {
        super(nombre, apellido, cedula, correoElectronico);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String obtenerTipo() {
        return tipoUsuario;
    }
}
