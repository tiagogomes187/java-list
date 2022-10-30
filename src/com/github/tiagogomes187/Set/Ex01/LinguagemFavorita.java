package com.github.tiagogomes187.Set.Ex01;

import com.github.tiagogomes187.Set.Ex01.entities.AnoCriacaoNomeComparator;
import com.github.tiagogomes187.Set.Ex01.entities.IdeComparator;
import com.github.tiagogomes187.Set.Ex01.entities.LinguagemProgramacao;
import com.github.tiagogomes187.Set.Ex01.entities.NomeAnoIdeComparator;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavorita {
    public static void main(String[] args) {
        Set<LinguagemProgramacao> myFavoritesLenguages = new HashSet<>();
        myFavoritesLenguages.add(new LinguagemProgramacao("Python", 1991, "Pycharm"));
        myFavoritesLenguages.add(new LinguagemProgramacao("JavaScript", 1995, "Intellij"));
        myFavoritesLenguages.add(new LinguagemProgramacao("Java", 1991, "Visual Studio Code"));


        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemProgramacao> myFirstFavoriteLenguage = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemProgramacao("Python", 1991, "Pycharm"),
                        new LinguagemProgramacao("JavaScript", 1995, "IntelliJ"),
                        new LinguagemProgramacao("Java", 1991, "Visual Studio Code")
                )
        );
        for (LinguagemProgramacao linguagem : myFirstFavoriteLenguage) System.out.format(linguagem.toString());

        System.out.println("--------\tOrdem Natural: Nome:\t--------");
        Set<LinguagemProgramacao> mySecondFavoriteLenguage = new TreeSet<>(myFavoritesLenguages);
        for (LinguagemProgramacao linguagem : mySecondFavoriteLenguage) System.out.println(linguagem.toString());

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemProgramacao> myThirdFavoriteLenguage = new TreeSet<LinguagemProgramacao>(new IdeComparator());
        myThirdFavoriteLenguage.addAll(myFavoritesLenguages);
        for (LinguagemProgramacao linguagem : myThirdFavoriteLenguage) System.out.println(linguagem.toString());

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemProgramacao> myFourthFavoriteLenguage = new TreeSet<LinguagemProgramacao>(new AnoCriacaoNomeComparator());
        myFourthFavoriteLenguage.addAll(myFavoritesLenguages);
        for (LinguagemProgramacao linguagem : myFourthFavoriteLenguage) System.out.println(linguagem.toString());

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemProgramacao> myFifthFavoriteLenguage = new TreeSet<LinguagemProgramacao>(new NomeAnoIdeComparator());
        myFifthFavoriteLenguage.addAll(myFavoritesLenguages);
        for (LinguagemProgramacao linguagem : myFifthFavoriteLenguage) System.out.println(linguagem.toString());

    }
}
