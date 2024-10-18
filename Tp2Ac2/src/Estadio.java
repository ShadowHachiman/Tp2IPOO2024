public class Estadio {
    private String nombre;
    private int capacidadMax;
    private int capacidadActual;

    public Estadio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidadMax = capacidad;
        this.capacidadActual = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    // methods

    public int capacidadDisponible() {
        return capacidadMax - capacidadActual;
    }

    public void cargaPersona(int n) {
        if (n <= capacidadMax) {
            setCapacidadActual(getCapacidadActual() + n);
        } else {
            System.out.println("Capaciadad no disponible");
        }
    }
}
