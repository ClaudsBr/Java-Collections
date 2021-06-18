package map.exercicios;

/* Dada a população estimada de alguns estados do NE brasileiro, faça:
- Estado = PE - População = 9.616.621
- Estado = AL - População = 3.351.543
- Estado = CE - População = 9.187.103
- Estado = RN - População = 3.534.265
Crie um dicionário e relacione os estados e suas populações;

- Substitua a população do estado do RN por 3.534.165;
- Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
- Exiba a população PE;
- Exiba todos os estados e suas populações na ordem que foi informado;
- Exiba os estados e suas populações em ordem alfabética;
- Exiba o estado com o menor população e sua quantidade;
- Exiba o estado com a maior população e sua quantidade;
- Exiba a soma da população desses estados;
- Exiba a média da população deste dicionário de estados;
- Remova os estados com a população menor que 4.000.000;
- Apague o dicionário de estados;
- Confira se o dicionário está vazio.
 */

import java.util.*;

public class Exercicios01 {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estados);
        System.out.println();

        System.out.println("Substituindo a populaçao do RN por 3.534.165:");
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println();

        System.out.println("O Estado PB está no dicionario?\nResposta: "+ estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println("Adicionando PB no dicionario...\n"+estados);
        System.out.println();

        System.out.println("Exibindo a população de PE:");
        System.out.println(estados.get("PE"));

        System.out.println();
        System.out.println("Exibindo os Estado na Ordem informada");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estados1);
        System.out.println();

        System.out.println("Exibindo os Estados em Ordem Alfabetica");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2);
        System.out.println();

        System.out.println("Exibindo o Estado com menor população");

        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenosPopuloso = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(menorPopulacao)) estadoMenosPopuloso = entry.getKey();
        }
        System.out.println("Estado menos populoso: "+estadoMenosPopuloso+"\nPopulação: "+menorPopulacao);
        System.out.println();

        System.out.println("Exibindo Estado mais Populoso...");
        Integer maisPopuloso = Collections.max(estados.values());
        Set<Map.Entry<String, Integer>> entries1  = estados.entrySet();
        String estadoMaisPopuloso = "";
        for(Map.Entry<String, Integer> entry: entries1){
            if(entry.getValue().equals(maisPopuloso)) estadoMaisPopuloso = entry.getKey();
        }
        System.out.println("Estado mais populosos: "+estadoMaisPopuloso+"\nPopulação: "+maisPopuloso);
        System.out.println();

        System.out.println("Soma da população de todos os Estados");
        Integer soma =0;
        for(Integer pop: estados.values()) {
            soma += pop;
        }
        System.out.println("Soma das populações: "+ soma);
        System.out.println();
        System.out.println("Exibindo a média das populações");
        Integer media = soma/estados.size();
        System.out.println("Média das populações: "+ media);
        System.out.println();

        System.out.println("Removendo os Estados com população inferior a 400000");

        Iterator<Integer> iterador = estados.values().iterator();
        while(iterador.hasNext()){
            Integer next = iterador.next();
            if(next < 4000000) iterador.remove();
        }
        System.out.println(estados);
        System.out.println();

        System.out.println("Apagando o dicionário...");
        estados.clear();
        System.out.println(estados);
        System.out.println();
        System.out.println("O dicionario está vazio? "+estados.isEmpty());

    }
}
