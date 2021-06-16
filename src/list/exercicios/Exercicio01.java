package list.exercicios;
/* Faça um programa que receba a temperatura média dos 6 primeiros
meses do ano e armazene-as em uma lista.
Apos isso, calcule a média semestral das temperaturas e mostre todas
as temperaturas acima desta média e em qual mês elas ocorreram
(mostrar o mês elas ocorreram por extenso - exemplo: 1 - Janeiro,
2 - Fevereiro, etc).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Double somaTemp = 0.0;
        List<Double> temperaturas = new ArrayList<>();
        for (int i = 1; i <= 6;i++){
            System.out.println("Digite a temperatura média do "+i+"º mês:");
            Double temp = entrada.nextDouble();
            temperaturas.add(temp);
            somaTemp+=temp;
        }
        Double mediaSemestral = somaTemp/ temperaturas.size();

        System.out.println("Temperaturas No Semestre: \n"+ temperaturas );
        System.out.println("Média das Temperaturas Semestrais: \n"+mediaSemestral);
        System.out.println("Meses com Temperaturas Acima da média: ");
        for (Double temp : temperaturas){

            if(temp > mediaSemestral) {
                int indice = temperaturas.indexOf(temp);
                switch(indice){
                    case 0:
                        System.out.println("1 - Janeiro "+temp+"ºC");
                        break;
                    case 1:
                        System.out.println("2 - Fevereiro "+temp+"ºC");
                        break;
                    case 2:
                        System.out.println("3 - Março "+temp+"ºC");
                        break;
                    case 3:
                        System.out.println("4 - Abril "+temp+"ºC");
                        break;
                    case 4:
                        System.out.println("5 - Maio "+temp+"ºC");
                        break;
                    case 5:
                        System.out.println("6 - Junho "+temp+"ºC");
                        break;
                    default:
                        break;
                }
            }

        }

    }
}
