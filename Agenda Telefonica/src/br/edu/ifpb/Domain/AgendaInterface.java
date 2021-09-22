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
public interface AgendaInterface {
    
    public boolean addContato(Contato contato);
    
    public boolean listContato();
    
    public boolean deleteContato(int ddd, int telefone);
    
    public boolean updateContato(Contato contato);
    
}
