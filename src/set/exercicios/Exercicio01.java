package set.exercicios;
/* Crie um conjunto contendo as cores do arco-íris e:
- Exiba todas as cores uma abaixo da outra
- A quantidade de cores que o arco-íris tem
- Exiba as cores em ordem alfabética
- Exiba as cores na ordem inversa da que foi informada
- Exiba todas as cores que começam com a letra ”v”
- Remova todas as cores que não começam com a letra “v”
- Limpe o conjunto
- Confira se o conjunto está vazio

     */

import java.util.*;

public class Exercicio01 {



    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        for(String cor : arcoIris) System.out.println(cor);

        int numeroCores = arcoIris.size();
        System.out.println("O arco-iris tem "+numeroCores+ " cores");

        System.out.println("As cores do Arco-Iris em Ordem Alfabetica são:");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        for (String cor : arcoIris2) System.out.println(cor);

        System.out.println();
        System.out.println("Cores do Arco-Iris em Ordem Reversa ");

        List<String> arcoIrisLista = new ArrayList<>(arcoIris2);
        Collections.reverse(arcoIrisLista);
        for (String cor : arcoIrisLista) System.out.println(cor);
        System.out.println();

        System.out.println("As cores do Arco-Iris que começam com a letra V são:");
        arcoIris.iterator();
        Iterator<String> iterador = arcoIris.iterator();
        while (iterador.hasNext()){
            String next = iterador.next();
            if(next.contains("V")) System.out.println(next);
        }
        System.out.println();


        System.out.println("Removendo todas as cores que não começam com a letra V");
        arcoIris.iterator();
        Iterator<String> novo_iterador = arcoIris.iterator();
        while(novo_iterador.hasNext()){
            String next = novo_iterador.next();
            if (!next.contains("V")) novo_iterador.remove();
        }
        System.out.println(arcoIris);
        System.out.println();

        System.out.println("Limpando o conjunto...");
        arcoIris.clear();
        System.out.println(arcoIris);
        System.out.println("O conjunto agora está vazio?\nResposta: "+ arcoIris.isEmpty());

    }

}


