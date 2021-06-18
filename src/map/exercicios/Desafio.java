package map.exercicios;

import java.util.*;

/* Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.

 */
public class Desafio {
    public static void main(String[] args) {

        Random gerador = new Random(); // criando um gerador de numeros aleatórios
        List<Integer> valoresDoDado = new ArrayList<>();

       for (int i=0 ;i < 100;i++){
           Integer numeroDoDado = gerador.nextInt(6)+1;
           valoresDoDado.add(numeroDoDado);
       }

        Map<Integer, Integer> MapaDoDado = new HashMap<>();
        for(Integer valor: valoresDoDado){
            if(MapaDoDado.containsKey(valor)) {
                MapaDoDado.put(valor, MapaDoDado.get(valor)+1);
            }else {
                MapaDoDado.put(valor, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = MapaDoDado.entrySet();
        for(Map.Entry<Integer, Integer> entry: entries) System.out.println(entry.getKey()+ " = "
                + entry.getValue()+" vezes");
    }
}
