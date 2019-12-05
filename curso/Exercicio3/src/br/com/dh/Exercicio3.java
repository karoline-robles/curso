package br.com.dh;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(4);
        conjunto.add(20);
        conjunto.add(31);
        conjunto.add(10);

        Prova prova = new Prova();
        prova.somaTotal(conjunto);
    }
}
