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
public class apreciador {
    private String nick;
    private String telefone;
    private String cpf;
    private String email;

    public apreciador(String nick, String telefone, String cpf, String email) {
        this.nick = nick;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public apreciador() {
        this.nick = null;
        this.telefone = null;
        this.cpf = null;
        this.email = null;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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
