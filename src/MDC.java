package br.edu.iftm.prova2;

public class MDC {

    int cont = 0;
    
    public int mdc(int dividendo, int divisor) {
        cont++;
        if (dividendo % divisor == 0) {
            return divisor;
        }
        return mdc(divisor, dividendo % divisor);
    }
}