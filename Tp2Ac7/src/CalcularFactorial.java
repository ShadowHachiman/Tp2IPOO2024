import java.math.BigInteger; // Se importa la clase BigInteger para manejar números muy grandes

public class CalcularFactorial {

    // Función principal donde se ejecuta el programa
    public static void main(String[] args) {
        // Se calcula el factorial de 50 usando BigInteger y se imprime el resultado
        System.out.println(factorial(BigInteger.valueOf(50)));

        // Se calcula el factorial de 200 usando BigInteger y se imprime el resultado
        System.out.println(factorial(BigInteger.valueOf(200)));
    }

    // Función recursiva para calcular el factorial de un número grande usando BigInteger
    static BigInteger factorial(BigInteger n) {
        // Condición base: si n es 1, se devuelve 1 (ya que 1! es 1)
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            // Se multiplica n por el factorial de (n - 1), llamando a la función recursivamente
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
