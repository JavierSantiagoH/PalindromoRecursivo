
public class Palindromo {

    // Método público wrapper
    public static boolean esPalindromo(String palabra) {

        palabra = palabra.toLowerCase();

        return verificarRecursivo(palabra, 0, palabra.length() - 1);
    }

    // Método privado recursivo
    private static boolean verificarRecursivo(
            String palabra, int inicio, int fin) {

        // Caso base
        if (inicio >= fin) {
            return true;
        }

        // Comprobar caracteres diferentes
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // Paso recursivo
        return verificarRecursivo(palabra, inicio + 1, fin - 1);
    }
}
