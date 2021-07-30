package testador;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exercicio1 {

    public static void main(String[] args) throws Exception {


        Queue<String> fila = new LinkedList<>();

        fila.add("João");

        fila.add("Pedro");

        fila.add("Karla");

        fila.add("Dori"); 
        
        Random foraFila = new Random();
        int num = 0;
        while (num == 0){
            num = foraFila.nextInt(5);
        }
        System.out.println("Batata quente, quente, quente, queimou... na posição: " + num);
        while (fila.size() > 1){

            for (int i = 0; i < num; i++) {
                fila.add(fila.remove()); 
            }
            System.out.println("Perdeu: " + fila.remove());

        }

        System.out.println("Ganhou: " + fila);
    }
}