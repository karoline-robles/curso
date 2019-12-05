package br.com.dh;

import java.util.ArrayList;
import java.util.List;

public class listaVazia {
    public static void main(String[] args) {
        List<Integer> vazio = new ArrayList<>();
        vazio.add(1);
        vazio.add(5);
        vazio.add(5);
        vazio.add(5);
        vazio.add(6);
        vazio.add(7);
        vazio.add(8);
        vazio.add(8);
        vazio.add(8);
        for (Integer valor :vazio) {
            System.out.println(valor);
            
        }
    }
}