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
public class desenho {
    private String nomeDoDesenho;
    private String desenhista;
    private String codigoUrl;

    public desenho(String nomeDoDesenho, String desenhista, String codigoUrl) {
        this.nomeDoDesenho = nomeDoDesenho;
        this.desenhista = desenhista;
        this.codigoUrl = codigoUrl;
    }

    public desenho() {
        this.nomeDoDesenho = null;
        this.desenhista = null;
        this.codigoUrl = null;
    }

    public String getNomeDoDesenho() {
        return nomeDoDesenho;
    }

    public void setNomeDoDesenho(String nomeDoDesenho) {
        this.nomeDoDesenho = nomeDoDesenho;
    }

    public String getDesenhista() {
        return desenhista;
    }

    public void setDesenhista(String desenhista) {
        this.desenhista = desenhista;
    }

    public String getCodigoUrl() {
        return codigoUrl;
    }

    public void setCodigoUrl(String codigoUrl) {
        this.codigoUrl = codigoUrl;
    }
    
}
