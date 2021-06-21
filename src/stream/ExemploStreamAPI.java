package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0", "1", "2", "4","3", "9","9","6","5","8");

        System.out.println("Iterando cada objeto do Array usando stream");
        System.out.println();
        numerosAleatorios.stream().forEach(System.out::println); // Metodo de referencia
        //Usando classe Anonima
        /*
        numerosAleatorios.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // Usando Lambda
        // numerosAleatorios.forEach(s -> System.out.println(s));

        System.out.println("Pegando os 5 primeiros numeros do Array e colocando dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println); // um Set não admite elementos repetidos
        System.out.println();

        System.out.println("Pegando esta lista e transformando numa lista de numeros inteiros");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);
        System.out.println();

        System.out.println("Pegando os numeros pares maiores que 2");

        /*List<Integer> paresMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n%2 == 0 && n > 2)
                .collect(Collectors.toList());
        System.out.println(paresMaioresQue2);*/

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n%2 == 0 && n > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostrando a média dos numeros do Array");
        numerosAleatorios.stream().mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Removendo os valores ímpares");
        // Não se usa Stream pq um stream não modifica a estrutura de dados da aplicação
        numerosAleatoriosInteger.removeIf(n -> n%2 != 0); // removeIf é um metodo de List
        System.out.println(numerosAleatoriosInteger);
        System.out.println();

        System.out.println("Ingorando os 3 primeiros elementos da Lista");
        List<Integer> numerosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosInteiros.stream()
                .skip(3)
                .forEach(System.out::println);



        System.out.println();
        System.out.println("Retirando os numeros repetidos da lista");
        Set<Integer> numerosSemRepeticao = numerosInteiros.stream()
                .collect(Collectors.toSet());
        System.out.println(numerosSemRepeticao);

        System.out.println();
        System.out.println("Mostrando o menor valor da lista");
        numerosSemRepeticao.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);
        System.out.println();
        System.out.println("Mostrando o maior valor da lista ");
        numerosSemRepeticao.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);
        System.out.println();
        System.out.println("Somando somente os valores impares");
        int somaImpares = numerosInteiros.stream().filter(n -> n%2 !=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaImpares);

        System.out.println();
        System.out.println("Soma dos valores pares");
        int somaPares = numerosInteiros.stream().filter(n -> n%2 ==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaPares);
        System.out.println();
        System.out.println("Imprimindo a lista em ordem crescente");
        numerosInteiros.stream()
        .sorted()
        .forEach(System.out::println);
        System.out.println();
        System.out.println("Agrupando valores impares multiplos de 3 e de 5");
        Map<Boolean, List<Integer>> multiplosDe3e5 = numerosInteiros.stream()
                .collect(Collectors.groupingBy(n -> (n%3 == 0 || n%5 ==0)));
        System.out.println(multiplosDe3e5);
    }
}
