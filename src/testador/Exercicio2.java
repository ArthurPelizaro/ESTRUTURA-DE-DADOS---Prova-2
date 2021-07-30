package testador;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner palindromo = new Scanner(System.in);

        String valorPalindromo = "";

        while (!valorPalindromo.equalsIgnoreCase("encerrar")) {

            System.out.print("Digite a palavra desejada ou 'encerrar' para finalizar: ");

            valorPalindromo = palindromo.next();

            String invertida = new StringBuffer(valorPalindromo).reverse().toString();

            if (valorPalindromo.equalsIgnoreCase(invertida)) {

                System.out.printf("A palavra %s é palíndromo.\n", valorPalindromo);

            } else {
                System.out.printf("A palavra %s não é palíndromo.\n", valorPalindromo);
                
            }
        }
    }
}
