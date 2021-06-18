package set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        // Dada um lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Criando uma TreeSet e adicionando as notas");
        Set<Double> notas = new TreeSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        // vai imprir seguindo a ordem natural
        System.out.println(notas);

        System.out.println("A nota 5.0 está no conjunto? \n");
        System.out.println(notas.contains(5d));

        System.out.println("Menor nota: "+ Collections.min(notas));

        System.out.println("Maior nota: "+ Collections.max(notas));

        System.out.println("Soma de todas e média das notas do conjunto:");
        notas.iterator();
        Iterator<Double> iterador = notas.iterator();
        Double soma=0d;

        while(iterador.hasNext()){
            Double next = iterador.next();
            soma += next;
        }
        System.out.println("Soma = "+ soma);
        System.out.println("Média = "+ soma/ notas.size());

        System.out.println("Removendo a nota 0.0 do conjunto");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo todas as notas menores que 7.0 do conjunto:");
        notas.iterator();
        Iterator<Double> novo_iterador = notas.iterator();
        while(novo_iterador.hasNext()){
            Double next = novo_iterador.next();
            if (next < 7) novo_iterador.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando todos os elementos do conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("O conjunto está vazio? \nResposta: "+ notas.isEmpty());
    }
}
