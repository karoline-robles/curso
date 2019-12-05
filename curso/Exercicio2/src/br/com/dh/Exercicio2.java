package br.com.dh;

import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        novoConjunto conjunto = new novoConjunto();
        listaVazia vazio = new listaVazia();
        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(1);
        conjunto2.add(5);
        conjunto2.add(5);
        conjunto2.add(6);
        conjunto2.add(7);
        conjunto2.add(8);
        conjunto2.add(8);
        conjunto2.add(8);
        conjunto.somar(conjunto2);
    }

}
