public class Palindromo {

    // Método iterativo
    public static boolean esPalindromoIt(String cadena) {
        boolean esPalindromo = false;
        String subCadena1;
        if (cadena.length() % 2 == 0) {
            subCadena1 = cadena.substring(0, cadena.length() / 2);
        } else {
            subCadena1 = cadena.substring(0, 1 + cadena.length() / 2);
        }
        String subCadena2 = cadena.substring(cadena.length() / 2);
        String subCadena2Invert = "";
        for (int i = subCadena2.length() - 1; i >= 0; i--) {
            subCadena2Invert = subCadena2Invert + subCadena2.charAt(i);
        }
        if (subCadena1.equals(subCadena2Invert)) {
            esPalindromo = true;
        }
        return esPalindromo;
    }

    // Método recursivo
    public static boolean esPalindromoRe(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else {
            if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
                return esPalindromoRe(cadena.substring(1, cadena.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(esPalindromoRe("abbw"));
    }
}