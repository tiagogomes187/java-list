package com.github.tiagogomes187.Set.Ex02.entities;

import java.util.Comparator;

public class CriacaoComparator implements Comparator<LinguagemProgramacao> {

    @Override
    public int compare(LinguagemProgramacao lp1, LinguagemProgramacao lp2) {
        int anoCriacao = Integer.compare(lp1.getAnoCriacao(), lp2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;
        return lp1.getNome().compareToIgnoreCase(lp2.getNome());
    }
}
