package com.example.aluno.projetoandroid;

import com.orm.SugarRecord;

/**
 * Created by aluno on 16/09/19.
 */

public class Pessoa extends SugarRecord{

    private String nome;
    private String email;


    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
