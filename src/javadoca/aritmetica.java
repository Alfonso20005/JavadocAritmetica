
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número entero a sumar.
     * @param b El segundo número entero a sumar.
     * @return La suma de los dos números enteros.
     */

    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a El número entero del cual restar.
     * @param b El número entero a restar.
     * @return La diferencia entre los dos números enteros.
     */

    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a El primer número entero a multiplicar.
     * @param b El segundo número entero a multiplicar.
     * @return El producto de los dos números enteros.
     */

    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división como un double.
     * @throws IllegalArgumentException si el divisor es cero.
     */

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

