package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {


    public static void main(String[] args) {
        // Dada um lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        List<Double> notas = new LinkedList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Mostrando a posição da nota 5.0: "+ notas.indexOf(5.0));

        System.out.println("Adicionando a nota 8.0 na posição 4 da lista de notas");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Corrigindo a nota 5.0 pra 6.0:");
        notas.set(notas.indexOf(5.0),6.0 );
        System.out.println(notas);

        System.out.println("A nota 5.0 está na Lista? \nResposta: "+notas.contains(5d));

        System.out.println("Qual foi a terceira nota adicionada? \nResposta: "+ notas.get(2));

        System.out.println("Qual foi a menor nota?\nResposta: "+ Collections.min(notas));

        System.out.println("Qual foi a maior nota?\nResposta: "+Collections.max(notas));

        Iterator<Double> iterador = notas.iterator();
        Double soma= 0d;
        while(iterador.hasNext()) {
            Double next = iterador.next();
            soma += next;
        }
        System.out.println("Soma das notas: "+soma);

        System.out.println("Média das notas: "+ soma/notas.size());

        System.out.println("Removendo a nota 0.0 da Lista:");
        notas.remove(0.0);
        System.out.println(notas);

        Iterator<Double> novo_iterador = notas.iterator();
        while(novo_iterador.hasNext()){
            Double next = novo_iterador.next();
            if (next < 7) novo_iterador.remove();
        }
        System.out.println("Lista das notas maiores ou iguais a 7.0: \n"+notas);

        System.out.println("Apagando a Lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("A Lista está vazia?\nResposta: "+ notas.isEmpty());

    }
}
