import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

//  Ejemplo en Java con implementacion

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        // Obtener la fecha y hora actuales
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + ahora);

        // Crear una fecha y hora específica
        LocalDateTime fechaEspecifica = LocalDateTime.of(2024, Month.OCTOBER, 10, 14, 30);
        System.out.println("Fecha específica: " + fechaEspecifica);

        // Agregar 1 semana a la fecha actual
        LocalDateTime unaSemanaDespues = ahora.plusWeeks(1);
        System.out.println("Una semana después: " + unaSemanaDespues);

        // Comparar dos fechas
        LocalDateTime fecha1 = LocalDateTime.of(2024, Month.OCTOBER, 10, 14, 30);
        LocalDateTime fecha2 = LocalDateTime.of(2024, Month.OCTOBER, 15, 10, 0);
        boolean esAntes = fecha1.isBefore(fecha2);
        System.out.println("¿Fecha1 es antes que Fecha2?: " + esAntes);

        // Formatear una fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fechaFormateada = ahora.format(formato);
        System.out.println("Fecha formateada: " + fechaFormateada);

        // Parsear una fecha a partir de un string
        LocalDateTime fechaParseada = LocalDateTime.parse("10-10-2024 14:30", formato);
        System.out.println("Fecha parseada: " + fechaParseada);
    }
}
