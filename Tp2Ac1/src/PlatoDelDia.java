import java.util.Date;
import java.util.Calendar;

public class PlatoDelDia {
    private String nombre;
    private float precio;
    private Date diaDisponible; // Usamos Date para representar la fecha en la que está disponible

    // Constructor
    public PlatoDelDia(String nombre, float precio, Date diaDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.diaDisponible = diaDisponible;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public Date getDiaDisponible() {
        return diaDisponible;
    }

    // Método para obtener el día de la semana basado en la fecha
    public String getDiaSemana() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(diaDisponible);

        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK); // Obtiene el día de la semana

        switch (diaSemana) {
            case Calendar.MONDAY:
                return "Lunes";
            case Calendar.TUESDAY:
                return "Martes";
            case Calendar.WEDNESDAY:
                return "Miércoles";
            case Calendar.THURSDAY:
                return "Jueves";
            case Calendar.FRIDAY:
                return "Viernes";
            case Calendar.SATURDAY:
                return "Sábado";
            case Calendar.SUNDAY:
                return "Domingo";
            default:
                return "Día desconocido";
        }
    }

}