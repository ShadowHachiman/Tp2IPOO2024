public class Multiplicacion extends OperacionAritmetica{
    public Multiplicacion(){}
    public Multiplicacion(Operacion a, Operacion b){
        super(a,b);
    }

    @Override
    public double calcular() {
        return getNum2().calcular() * getNum1().calcular();
    }
}
