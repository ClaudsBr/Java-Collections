package set;

import java.util.*;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Dada um lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Criando um conjunto e adicionando as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Conferindo se a nota 5.0 faz parte do conjunto");
        System.out.println(notas.contains(5.0));

        System.out.println("Mostrando a menor nota:");
        System.out.println(Collections.min(notas));

        System.out.println("Mostrando a maior nota:");
        System.out.println(Collections.max(notas));

        System.out.println("Somando todos os elementos do conjunto:");
        notas.iterator();
        Iterator<Double> iterador = notas.iterator();
        Double soma = 0d;
        while(iterador.hasNext()){
            Double next = iterador.next();
            soma+= next;
        }
        System.out.println(soma);

        System.out.println("Mostrando a média das notas:");
        System.out.println(soma/ notas.size());

        System.out.println("Removendo a nota 0.0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7.0 do conjunto:");
        notas.iterator();
        Iterator<Double> novo_iterador = notas.iterator();
        while(novo_iterador.hasNext()) {
            Double next = novo_iterador.next();
            if (next < 7.0) novo_iterador.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando todos os elementos do conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("Conferindo se o conjunto de notas esta vazio:");
        System.out.println(notas.isEmpty());






    }
}
