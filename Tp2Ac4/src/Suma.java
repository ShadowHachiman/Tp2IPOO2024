public class Suma extends OperacionAritmetica {
    public Suma() {}

    public Suma(Operacion num1, Operacion num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        return getNum1().calcular() + getNum2().calcular();
    }
}
