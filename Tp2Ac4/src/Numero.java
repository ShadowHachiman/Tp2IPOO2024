public class Numero implements Operacion {
    private double num;

    public Numero(double numero) {
        this.num = numero;
    }

    public double getNumero() {
        return num;
    }

    @Override
    public double calcular() {
        return getNumero();
    }
}
