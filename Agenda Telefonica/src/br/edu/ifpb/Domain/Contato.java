/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.Domain;

/**
 *
 * @author mandy
 */
public class Contato {
    
    private String nomeContato;
    private String apelido;
    private int DDD;
    private int numeroTelefone;
    private String email;
    private String anotacao;

    public Contato() {}

    public Contato(String nomeContato, String apelido, int DDD, int numeroTelefone, String email, String anotacao) {
        this.nomeContato = nomeContato;
        this.apelido = apelido;
        this.DDD = DDD;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        this.anotacao = anotacao;
    }
    
    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    @Override
    public String toString() {
        return "Contato{" + "nomeContato=" + nomeContato + ", apelido=" + apelido + ", DDD=" + DDD + ", numeroTelefone=" + numeroTelefone + ", email=" + email + ", anotacao=" + anotacao + '}';
    }

    
    
    
    
}
