import java.time.LocalDate;
import java.util.Date;

public class Hospital {
    private int valorBase;

    public void agendarCita(String especialidad, String usuario, Date fechaCita){
        if(usuario == "EPS"){
            this.valorBase = 30000;
            System.out.println("El tipo de usuario es: " + usuario + " ,la especialidad es: " + especialidad + " ,la fecha de la cita es: " + fechaCita + " ,el precio de la cita es: " + valorBase);
        }

        if(usuario == "POLIZA"){
            this.valorBase = 40000;
            System.out.println("El tipo de usuario es: " + usuario + " ,la especialidad es: " + especialidad + " ,la fecha de la cita es: " + fechaCita + " ,el precio de la cita es: " + valorBase);
        }

        if(usuario == "PARTICULAR"){
            this.valorBase = 70000;
            System.out.println("El tipo de usuario es: " + usuario + " ,la especialidad es: " + especialidad + " ,la fecha de la cita es: " + fechaCita + " ,el precio de la cita es: " + valorBase);
        }
    }
}
