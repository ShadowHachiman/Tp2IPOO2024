public class ProfesorEstado implements EstadoCliente{
    @Override
    public float aplicarDescuento(float valor) {
        return valor * 0.9f; // 20% de descuento
    }
}
