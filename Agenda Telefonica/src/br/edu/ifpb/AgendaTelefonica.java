/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb;

import br.edu.ifpb.Domain.Agenda;
import br.edu.ifpb.Domain.Contato;

/**
 *
 * @author mandy
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.addContato(new Contato("Amanda","Mandy",83,999792415,"amanda@gmail.com","Contato pessoal"));
        agenda.addContato(new Contato("Fagne","",83,998568541,"fagne@gmail.com","Contato pessoal"));
        agenda.addContato(new Contato("Glaymar","Glay",83,985410023,"glaymar@gmail.com","Contato empresarial"));
//        agenda.listContato();
//        agenda.deleteContato(83, 998568541);;
//        agenda.updateContato("Amanda",999792415, new Contato("Mandy","",83,999792415,"amanda@gmail.com","Contato pessoal"));
//        agenda.listContato();

        /**
         * Realizando pesquisa de contato pelo nome
         */
        agenda.addContato(new Contato("Amanda","",11,999792415,"amanda@gmail.com","Contato empresarial"));
//        agenda.searchNome("Amanda");
        
        /**
         * Realizando pesquisa de contato pelo ddd + telefone
         */
        agenda.searchTelefone(11, 999792415);
    }
    
}
