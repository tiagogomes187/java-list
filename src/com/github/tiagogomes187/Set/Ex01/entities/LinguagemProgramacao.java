package com.github.tiagogomes187.Set.Ex01.entities;

import java.util.Objects;

public class LinguagemProgramacao implements Comparable<LinguagemProgramacao> {
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public LinguagemProgramacao(){}

    public LinguagemProgramacao(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemProgramacao that)) return false;
        return getNome().equals(that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "LinguagemProgramacao:\n" +
                "Nome: '" + nome + '\''  +
                "\nAno de Criação: " + anoCriacao +
                "\nIDE: '" + ide + '\'' + "\n" +
                "-------\n";
    }


    @Override
    public int compareTo(LinguagemProgramacao linguagemProgramacao) {
        return this.nome.compareTo(linguagemProgramacao.nome);
    }
}
