import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Duration;

public class EjemploInstant {
    public static void main(String[] args) {
        // Obtener el instante actual
        Instant ahora = Instant.now();
        System.out.println("Momento actual (Instant): " + ahora);

        // Crear un instante desde una cantidad de segundos desde el Epoch
        Instant desdeEpoch = Instant.ofEpochSecond(10000);
        System.out.println("Desde Epoch (10000 segundos): " + desdeEpoch);

        // Agregar 10 segundos a un instante
        Instant diezSegundosDespues = ahora.plusSeconds(10);
        System.out.println("10 segundos después: " + diezSegundosDespues);

        // Restar 5 minutos
        Instant cincoMinutosAntes = ahora.minusSeconds(300); // 300 segundos = 5 minutos
        System.out.println("5 minutos antes: " + cincoMinutosAntes);

        // Comparar dos instantes
        boolean esAntes = ahora.isBefore(diezSegundosDespues);
        System.out.println("¿El momento actual es antes que 10 segundos después?: " + esAntes);

        // Convertir `Instant` a `LocalDateTime` (zona horaria por defecto)
        LocalDateTime fechaHora = LocalDateTime.ofInstant(ahora, ZoneId.systemDefault());
        System.out.println("Fecha y hora local: " + fechaHora);

        // Duración entre dos instantes
        Duration duracion = Duration.between(ahora, diezSegundosDespues);
        System.out.println("Duración entre ahora y 10 segundos después: " + duracion.toSeconds() + " segundos");
    }
}
