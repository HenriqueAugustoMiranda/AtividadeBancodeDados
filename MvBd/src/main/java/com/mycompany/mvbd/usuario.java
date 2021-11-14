/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvbd;

/**
 *
 * @author iplay
 */
public class usuario {
    private String nome;
    private int codigo;
    private String telefone;
    private String cpf;
    private String email; 

    public usuario(String nome, int codigo, String telefone, String cpf, String email) {
        this.nome = nome;
        this.codigo = codigo;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public usuario() {
        this.nome = null;
        this.codigo = 0;
        this.telefone = null;
        this.cpf = null;
        this.email = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
