import java.util.ArrayList;
import java.util.Date;

public class Comedor {
    private ArrayList<Reserva> reservas;

    public Comedor() {
        this.reservas = new ArrayList<>();
    }

    // para reservar de a uno
    public void agregarReserva(Cliente cliente, PlatoDelDia platoDelDia) {
        ArrayList<PlatoDelDia> platoDelDias = new ArrayList<>();
        platoDelDias.add(platoDelDia);
        Reserva reserva = new Reserva(cliente, platoDelDias, new Date());
        reservas.add(reserva);
    }
    // para poder reservar mas de un plato
    publc void agregarReserva(Cliente cliente, ArrayList<PlatoDelDia> platosDelDia) {
        Reserva reserva = new Reserva(cliente, platosDelDia, new Date());
    }

    public float valorReserva(Reserva reserva) {
        return reserva.calcularValorReserva();
    }

    public int totalPlatosReservados() {
        int totalPlatos = 0;
        for (Reserva reserva : reservas) {
            totalPlatos += reserva.getPlatos().size();
        }
        return totalPlatos;
    }
    public float totalValorReservas() {
        float total = 0;
        for (Reserva reserva : reservas) {
            total += valorReserva(reserva);
        }
        return total;
    }

    // Retorna la reserva con más platos reservados
    public Reserva reservaMasPlatos() {
        Reserva mayorReserva = null;
        int maxPlatos = 0;

        for (Reserva reserva : reservas) {
            int cantidadPlatos = reserva.getPlatos().size();
            if (cantidadPlatos > maxPlatos) {
                maxPlatos = cantidadPlatos;
                mayorReserva = reserva;
            }
        }

        return mayorReserva;
    }

    // Método para obtener todas las reservas
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
