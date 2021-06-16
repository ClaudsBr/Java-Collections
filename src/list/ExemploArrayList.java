package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Dada um lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione 7 notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("A posição da nota 9.3: "+ notas.indexOf(9.3));

        System.out.println("Adicionando a nota 8.0 na posição 4 da lista: ");
        notas.add(4, 8.0);
        System.out.println("Nova Lista com a nota 8 adicionada na lista: \n"+ notas);

        System.out.println("Substituindo a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6d);
        System.out.println("Nova Lista com a nota 6.0 substituindo a nota 5.0: \n"+ notas);

        System.out.println("Conferindo se a nota 5.0 está na lista: "+ notas.contains(5d));

        System.out.println("Exibindo todas as notas na ordem em que foram inseridas:");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exibindo a terceira nota adicionada usando o metodo GET: " + notas.get(2));

        System.out.println("Exibindo a menor nota da Lista: "+ Collections.min(notas));
        // A classe Double implementa a interface Comparable por isso é possivel fazer comparações dentro desta lista
        System.out.println("Exibindo a maior nota da Lista: "+ Collections.max(notas));

        System.out.println("Exibindo a soma das notas da Lista: ");
        Iterator<Double>  iterador = notas.iterator();
        Double soma=0d;
        while(iterador.hasNext()){
            Double next = iterador.next();
            soma += next;
        }
        System.out.println("A soma das notas é: "+ soma);

        System.out.println("Exibindo a média das notas desta Lista");
        Double media = soma / notas.size();
        System.out.println("A mpedia das notas é: "+ media);

        System.out.println("Removendo a nota 0.0:");
        notas.remove(0d);
        System.out.println("Nova Lista com a remoção da nota 0.0: \n"+notas);

        System.out.println("Removendo a nota da posição 0:");
        notas.remove(0);
        System.out.println("Nova Lista com a remoção da nota da posição 0: \n"+notas);

        System.out.println("Removendo as notas menores que 7.0");
        Iterator<Double> novo_iterador = notas.iterator();
        while (novo_iterador.hasNext()){
            Double next = novo_iterador.next();
            if (next < 7.0) novo_iterador.remove();
        }
        System.out.println("Lista das notas maiores ou iguais a 7.0: \n"+notas);

        System.out.println("Apagando a Lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Conferindo se a Lista está vazia: "+ notas.isEmpty());

    }
}
