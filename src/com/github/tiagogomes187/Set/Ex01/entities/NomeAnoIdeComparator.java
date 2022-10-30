package com.github.tiagogomes187.Set.Ex01.entities;

import java.util.Comparator;

public class NomeAnoIdeComparator implements Comparator<LinguagemProgramacao> {

    @Override
    public int compare(LinguagemProgramacao lp1, LinguagemProgramacao lp2) {
        int nome = lp1.getNome().compareToIgnoreCase(lp2.getNome());
        int anoCriacao = Integer.compare(lp1.getAnoCriacao(), lp2.getAnoCriacao());
        if (nome != 0) return nome;
        if (anoCriacao != 0 ) return anoCriacao;
        return lp1.getIde().compareToIgnoreCase(lp2.getIde());
    }
}
