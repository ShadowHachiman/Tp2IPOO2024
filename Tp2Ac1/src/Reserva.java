import java.util.Date;
import java.util.ArrayList;

public class Reserva {
    private Cliente cliente;
    private ArrayList<PlatoDelDia> platos;
    private Date fecha;

    // Constructor
    public Reserva(Cliente cliente, ArrayList<PlatoDelDia> platos, Date fecha) {
        this.cliente = cliente;
        this.platos = platos;
        this.fecha = fecha;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<PlatoDelDia> getPlatos() {
        return platos;
    }

    public Date getFecha() {
        return fecha;
    }

    public float calcularValorReserva() {
        float total = 0;
        for (PlatoDelDia plato : platos) {
            float precioConDescuento = cliente.aplicarDescuento(plato.getPrecio());
            total += precioConDescuento;
        }

        // Aplica el descuento del 5% si hay más de un plato
        if (platos.size() > 1) {
            total *= 0.95;
        }

        return total;
    }
}
