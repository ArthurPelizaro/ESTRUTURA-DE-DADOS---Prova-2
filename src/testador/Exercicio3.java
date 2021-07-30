package testador;
import java.util.Scanner;
import br.edu.iftm.prova2.Fibonacci;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o tamanho: ");

        int valorFibo = sc.nextInt();

        for (int i = 0; i < valorFibo; i++) {
            
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }
    }
}
