public class Division extends OperacionAritmetica {
    public Division() {}
    public Division(Operacion a, Operacion b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return getNum1().calcular() / getNum2().calcular();
    }
}
