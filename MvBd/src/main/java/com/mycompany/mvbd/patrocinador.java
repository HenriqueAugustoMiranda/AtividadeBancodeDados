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
public class patrocinador {
    private String nome;
    private int codigo;
    private String telefone;

    public patrocinador(String nome, int codigo, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.telefone = telefone;
    }

    public patrocinador() {
        this.nome = null;
        this.codigo = 0;
        this.telefone = null;
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
    
}
