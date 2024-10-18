import java.util.List;

public class Partido {
    private List<Equipo> equipos;
    private Entrada entrada;
    private Estadio estadio;

    public Partido(List<Equipo> equipos, Estadio estadio) {
        this.equipos = equipos;
        this.estadio = estadio;
    }

    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Entrada getEntrada() {
        return entrada;
    }
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public int getCapacidad(){
        return getEstadio().getCapacidadMax();
    }

    public double getPrecioEntrada(){
        return getEntrada().getPrecio();
    }
    // methods

    public void addPartidoConEntrada(Equipo equipo1, Equipo equipo2, Estadio estadio, double precio) {
        this.equipos.add(equipo1);
        this.equipos.add(equipo2);
        setEstadio(estadio);
        getEntrada().setPrecio(precio);
    }
}

