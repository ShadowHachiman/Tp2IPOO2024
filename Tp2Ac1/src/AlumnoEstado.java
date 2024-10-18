public class AlumnoEstado implements EstadoCliente{
    @Override
    public float aplicarDescuento(float valor) {
        return precioBase * 0.8f; // 20% de descuento
    }
}
