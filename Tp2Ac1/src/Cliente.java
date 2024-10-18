public class Cliente {
    private String nombre;
    private EstadoCliente estado;

    public Cliente(String nombre, EstadoCliente estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public EstadoCliente getEstado() {
        return estado;
    }
    public void setEstado(EstadoCliente estado) {
        this.estado = estado;
    }

    public float aplicarDescuento(float valor) {
        return estado.aplicarDescuento(valor);
    }
}
