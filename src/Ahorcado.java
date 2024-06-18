import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabrasecreta = "mondongo";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabrasecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            // System.out.println(letrasAdivinadas[i]);
        }

        while (!palabraAdivinada && intentos < intentosMax) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra porfavor ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabrasecreta.length(); i++) {
                if (palabrasecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra Incorrecta! Te quedan " + (intentosMax - intentos) + "Intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabrasecreta)) {
                palabraAdivinada = true;
                System.out.println("Genial Adivinaste la palabra, la palabra era: " + palabrasecreta);

            }
        }
        if (!palabraAdivinada) {
            System.out.println("Opps no adivinaste Juego Terminado");

        }

        scanner.close();
    }
}
