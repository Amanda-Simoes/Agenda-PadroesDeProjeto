package br.edu.ifpb.Domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mandy
 */
public class Agenda {
    
    private List<Contato> contatosSalvos = new ArrayList<>();
    
    public boolean addContato(Contato contato){
        try{
            contatosSalvos.add(contato);
            System.out.println("\nContato salvo com sucesso!");
            return true;
        } catch(Exception e){
            System.out.println("\nOcorreu um erro ao tentar inserir contato, tente novamente!");
            return false;
        }
    }
    
    public boolean listContato(){
        
        try{
            for(int i = 0; i < contatosSalvos.size(); i++){
                System.out.println("Nome: " + contatosSalvos.get(i).getNomeContato());
                System.out.println("Apelido: " + contatosSalvos.get(i).getApelido());
                System.out.println("DDD: " + contatosSalvos.get(i).getDDD());
                System.out.println("Telefone: " + contatosSalvos.get(i).getNumeroTelefone());
                System.out.println("E-mail: " + contatosSalvos.get(i).getEmail());
                System.out.println("Anotação: " + contatosSalvos.get(i).getAnotacao());
            }
            return true;
        } catch(Exception e){
            System.out.println("\nOcorreu um erro ao tentar listar seus contatos, tente novamente!");
            return false;
        }
    }
    
}
