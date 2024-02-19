import java.util.Scanner;

public class textoInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//ingresar texto
        System.out.print("Ingresa una palabra o frase: ");
        String entradaUsuario = scanner.nextLine();

        //invertir texto
        String textoInvertido = invertirTexto(entradaUsuario);

        System.out.println("Texto invertido: " + textoInvertido);
        scanner.close();
    }

    //metodo para InvertirTexto
    private static String invertirTexto(String texto) {
        // Convertir la cadena a un arreglo de caracteres
        char[] caracteres = texto.toCharArray();

        // Invertir el arreglo de caracteres
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            // Intercambiar caracteres
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Crear una nueva cadena a partir del arreglo invertido
        return new String(caracteres);
    }
}