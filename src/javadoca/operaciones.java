
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {

    /**
     * Calcula el módulo de la división entre dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resto de la división entre a y b.
     * @throws IllegalArgumentException si el divisor es cero.
     */

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el cuadrado de un número entero.
     *
     * @param a El número entero para calcular su cuadrado.
     * @return El cuadrado del número entero a.
     */

    public int calcularCuadrado(int a) {
        return a * a;
    }

    /**
     * Calcula la raíz cuadrada de un número de punto flotante.
     *
     * @param a El número double del cual calcular la raíz cuadrada.
     * @return La raíz cuadrada del número double a.
     * @throws IllegalArgumentException si a es un número negativo.
     */

    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

