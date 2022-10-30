package com.github.tiagogomes187.Set.Ex01.entities;

import java.util.Comparator;

public class IdeComparator implements Comparator<LinguagemProgramacao> {

    @Override
    public int compare(LinguagemProgramacao lp1, LinguagemProgramacao lp2) {
        return lp1.getIde().compareTo(lp2.getIde());
    }
}
