import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Partido> partidos;

    public Sistema() {
        partidos = new ArrayList<Partido>();
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    // methods

    public Estadio estadioConMayorCapacidad() {
        if (partidos.isEmpty()) return null;

        Estadio mayorEstadio = partidos.get(0).getEstadio();

        for (Partido partido : partidos) {
            if (partido.getCapacidad() >= mayorEstadio.getCapacidadMax()) {
                mayorEstadio = partido.getEstadio();
            }
        }

        return mayorEstadio;
    }

    public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, int valorEntrada) {
        Partido newPartido = null;
        newPartido.addPartidoConEntrada(local, visita, estadio, valorEntrada);

        getPartidos().add(newPartido);
    }

    public int cantidadTotalEspectadores() {
        int totalEspectadores = 0;
        for (Partido partido : partidos) {
            totalEspectadores += partido.getCapacidad();
        }
        return totalEspectadores;
    }

    public double montoRecaudado(Partido partido){
        return  partido.getPrecioEntrada();
    }

    public double montoTotalRecaudado(){
        double totalRecaudado = 0;
        for (Partido partido : partidos) {
            totalRecaudado += montoRecaudado(partido);
        }
        return totalRecaudado;
    }
}
