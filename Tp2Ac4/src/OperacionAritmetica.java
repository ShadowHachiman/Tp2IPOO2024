public abstract class OperacionAritmetica implements Operacion {
    private Operacion num1;
    private Operacion num2;


    public OperacionAritmetica() {}
    // Constructor que recibe dos operaciones
    public OperacionAritmetica(Operacion num1, Operacion num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters para obtener las operaciones
    public Operacion getNum1() {
        return num1;
    }

    public Operacion getNum2() {
        return num2;
    }

    // Método abstracto que implementarán las subclases
    @Override
    public abstract double calcular();
}
