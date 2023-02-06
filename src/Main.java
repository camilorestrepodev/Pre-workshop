import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario miUsuarioEps = new UsuarioEps("Andres","Perez",6845244L,"andresperez@gmail.com", "EPS");
        Usuario miUsuarioPoliza = new UsuarioPoliza("Mariana", "Jerez",4578945L,"marianaj@gmail.com","POLIZA");
        Usuario miUsuarioParticular = new UsuarioParticular("Maria","Paez",8754698L,"mariapa@gmail.com","PARTICULAR");
        Especialidad miMedicinaGeneral =  new MedicinaGeneral("Dr.Jose",123456L,"Medicina General");
        Especialidad miMedicinaInterna = new MedicinaInterna("Dra.Lucia",1234567L,"Medicina Interna");
        Especialidad miMedicinaDelDeporte = new MedicinaDelDeporte("Dr.Santiago", 7894561L,"Medicina Del Deporte");
        Hospital miHospital = new Hospital();
        Date fecha = new Date(122,5,3);
        Date fecha1 = new Date(123,8,5);
        Date fecha2 = new Date(124,10,8);
        miHospital.agendarCita(miMedicinaGeneral.obtenerEspecialidad(),miUsuarioEps.obtenerTipo(),fecha);
        miHospital.agendarCita(miMedicinaInterna.obtenerEspecialidad(),miUsuarioPoliza.obtenerTipo(),fecha1);
        miHospital.agendarCita(miMedicinaDelDeporte.obtenerEspecialidad(),miUsuarioParticular.obtenerTipo(),fecha2);
    }
}