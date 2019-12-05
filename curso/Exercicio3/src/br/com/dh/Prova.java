package br.com.dh;

import java.util.Set;

public class Prova {
    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer valor :conjuntoDeInteiros) {
            System.out.println("Item " + valor);
        soma += valor;
        }
        System.out.println("---------------------------");
        System.out.println(" Valor total " + soma);
    }
}
