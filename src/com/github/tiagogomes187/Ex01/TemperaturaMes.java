package com.github.tiagogomes187.Ex01;

import java.util.*;


/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/


public class TemperaturaMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista
        int count = 0;
        while (true){
            if (count == 6) break;

            System.out.println("Digite a temperatura: ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-------------------");

        //Exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.format(t + " "));

        //Calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                        .mapToDouble(Double::doubleValue)
                                .average()
                                        .orElse(0d);
        System.out.format("\nMédia das teperaturas: %.1f\n", media);

        //Exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                        .filter(t -> t > media)
                                .forEach(t -> System.out.format("%.1f ",t));

        //Exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()){
            Double temp = iterator.next();
            if (temp > media){
                switch (count){
                    case (0):
                        System.out.format("1 - Janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.format("2 - Fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.format("3 - Março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.format("4 - Abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.format("5 - Maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.format("6 - Junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }



        sc.close();
    }
}