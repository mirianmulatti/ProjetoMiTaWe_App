package com.example.aluno.projetoandroid;

import android.widget.ImageView;

import com.orm.SugarRecord;

/**
 * Created by aluno on 16/09/19.
 */

public class Empresa extends SugarRecord{

    private String nome;
    private String localizacao;
    private String  cardapio;
    private String  telefone;
    private String  email;
    private String  senha1;
    private String  senha2;


    public Empresa() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }


    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {this.senha2 = senha2;}



}

