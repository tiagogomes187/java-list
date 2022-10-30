package com.github.tiagogomes187.Set.Ex01;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-iris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");
        System.out.println(coresArcoIris);

        System.out.println("+---------+--------+");

        System.out.println("Exiba todas as cores do arco-íris, uma abaixo da outra: ");
        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("+---------+--------+");

        System.out.println("A quantidade de cores que o arco-íris tem é: " + coresArcoIris.size());

        System.out.println("+---------+--------+");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        for (String cores : coresArcoIris2){
            System.out.println(cores);
        }

        System.out.println("+---------+--------+");

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("+---------+--------+");

        System.out.println("Exiba todas as cores que começa com a letra ”V”: " );
        for (String cor : coresArcoIris){
            if (cor.startsWith("v") || cor.startsWith("V")){
                System.out.println(cor);
            }
        }

        System.out.println("+---------+--------+");

        System.out.println("Remova todas as cores que não começao com a letra ”V”: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().startsWith("V")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("+---------+--------+");

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        //coresArcoIris.add("Branco"); PARA TESTAR O ELSE

        System.out.println("Cofira se o conjunto está vazio: ");
        if (coresArcoIris.isEmpty() == true){
            System.out.println("O CONJUTO SET ESTÁ VAZIO.");
        }else {
            System.out.println("O CONJUNTO AINDA POSSUI ELEMENTO!");
        }
    }
}
