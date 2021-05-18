package com.example.tabs;

public class User_Parturiente {
    private int imagem1;
    private String texto_nome;
    private String idade;
    private String texto_hora;
    private String texto_Divisao_do_traco; // nao eh necessario
    private String dilatacao;

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public User_Parturiente(int imagem1, String texto_nome, String idade, String texto_hora, String texto_Divisao_do_traco, String dilatacao) {
        this.imagem1 = imagem1;
        this.texto_nome = texto_nome;
        this.idade = idade;
        this.texto_hora = texto_hora;
        this.texto_Divisao_do_traco = texto_Divisao_do_traco;
        this.dilatacao = dilatacao;
    }

    public String getDilatacao() {
        return dilatacao;
    }

    public void setDilatacao(String dilatacao) {
        this.dilatacao = dilatacao;
    }

    public int getImagem1() {
        return imagem1;
    }

    public void setImagem1(int imagem1) {
        this.imagem1 = imagem1;
    }

    public String getTexto_nome() {
        return texto_nome;
    }

    public void setTexto_nome(String texto_nome) {
        this.texto_nome = texto_nome;
    }


    public String getTexto_hora() {
        return texto_hora;
    }

    public void setTexto_hora(String texto_hora) {
        this.texto_hora = texto_hora;
    }

    public String getTexto_Divisao_do_traco() {
        return texto_Divisao_do_traco;
    }

    public void setTexto_Divisao_do_traco(String texto_Divisao_do_traco) {
        this.texto_Divisao_do_traco = texto_Divisao_do_traco;
    }
}
