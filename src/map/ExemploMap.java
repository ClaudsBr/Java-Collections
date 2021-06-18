package map;
/* Dado os modelos dos carros e seus respctivos consumos de combustível, faça:
modelo = Gol - consumo = 14,4 km/l
modelo = Uno - consumo = 15,6 km/l
modelo = Mobi - consumo = 16,1 km/l
modelo = HB20 - consumo = 14,5 km/l
modelo = Kwid - consumo = 15,6 km/l
 */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Criando um dicionario relacionando os modelos");
        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("HB20", 14.5);
        carros.put("Kwid", 15.6);

        System.out.println(carros);

        System.out.println("Substituindo o consumo do Gol por 15.2 km/l");
        carros.replace("Gol",15.2);
        System.out.println(carros);

        System.out.println("Conferindo se o modelo Tucson está no dicionario:");
        System.out.println(carros.containsKey("Tucson"));

        System.out.println("Exibindo o consumo do Uno: ");
        System.out.println(carros.get("Uno"));
        System.out.println();




        System.out.println("Exibindo todos os modelos");
        for(String modelo: carros.keySet()) System.out.println(modelo);
        System.out.println();

        System.out.println("Exibindo os consumos dos carros: ");
        for(Double consumo: carros.values()) System.out.println(consumo);
        System.out.println();

        System.out.println("Exibindo modelo mais economico e seus consumo:");
        System.out.println(Collections.max(carros.values()));


        System.out.println("Exibindo o modelo menos economico e seu consumo:");
        Double maisEconomico = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEconomico = ""; // variavel de controle

        for(Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(maisEconomico)) {
                modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo mais economico: "+modeloMaisEconomico+"\nconsumo: "+maisEconomico+" Km/L");

            }
        }

        System.out.println();
        System.out.println("Exibindo o modelo menos economico");
        Double menosEconomico = Collections.min(carros.values());
        Set<Map.Entry<String, Double>> entries1 = carros.entrySet();
        String modeloMenosEconomico = " ";
        for(Map.Entry<String, Double> entry: entries1){
            if(entry.getValue().equals(menosEconomico)){
                modeloMenosEconomico = entry.getKey();

                System.out.println("Modelo menos economico: "+modeloMenosEconomico
                        +"\nConsumo: "+menosEconomico+" Km/L");
            }
        }
        System.out.println();
        System.out.println("Mostrando a soma e a média de consumo dos carros");

        Double soma =0d;
        for(Double consumo: carros.values()){
            soma += consumo;
        }
        System.out.println("Soma de consumo dos carros: "+soma+" Km/L");
        Double media = soma/carros.size();
        System.out.println("Media de consumo dos carros: "+media+" Km/L");

        System.out.println();
        System.out.println("Removendo os modelos com consumo igual a 15.6 km/l");
        Iterator<Double> iterator = carros.values().iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next.equals(15.6)) iterator.remove();
        }
        System.out.println(carros);
        System.out.println();
        System.out.println("Exibindo os carros na ordem que foram informados");
        Map<String, Double> carros1 = new LinkedHashMap<>();
        carros1.put("Gol", 14.4);
        carros1.put("Uno", 15.6);
        carros1.put("Mobi", 16.1);
        carros1.put("HB20", 14.5);
        carros1.put("Kwid", 15.6);

        System.out.println(carros1);
        System.out.println();
        System.out.println("Exibindo os carros por ordem de modelo");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);
        System.out.println();

        System.out.println("Apagando o dicionario de carros");
        carros.clear();
        System.out.println(carros);
        System.out.println("O dicionario carros esta vazio?\nResposta: "+carros.isEmpty());
    }
}
