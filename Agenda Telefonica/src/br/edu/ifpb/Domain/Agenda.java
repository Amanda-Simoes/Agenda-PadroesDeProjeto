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
                System.out.println("\n");
            }
            return true;
        } catch(Exception e){
            System.out.println("\nOcorreu um erro ao tentar listar seus contatos, tente novamente!");
            return false;
        }
        
    }
    
    public boolean deleteContato(int ddd, int telefone){
        
        try{
            for(int i = 0; i < contatosSalvos.size(); i++){
                if(contatosSalvos.get(i).getDDD() == ddd && contatosSalvos.get(i).getNumeroTelefone() == telefone){
                    contatosSalvos.remove(i);
                    System.out.println("\nContato removido com Sucesso!");
                }
            }
            return true;
        } catch (Exception e){
            System.out.println("\nOcorreu um erro durante a remocão de um contato, tente novamente");
            return false;
        }
    }
    
        public boolean updateContato(String nome, int telefone, Contato contato){
        
        try{
            for(int i = 0; i < contatosSalvos.size(); i++){
                if(contatosSalvos.get(i).getNomeContato().equals(nome) && contatosSalvos.get(i).getNumeroTelefone() == telefone){
                    contatosSalvos.get(i).setNomeContato(contato.getNomeContato());
                    contatosSalvos.get(i).setApelido(contato.getApelido());
                    contatosSalvos.get(i).setDDD(contato.getDDD());
                    contatosSalvos.get(i).setNumeroTelefone(contato.getNumeroTelefone());
                    contatosSalvos.get(i).setEmail(contato.getEmail());
                    contatosSalvos.get(i).setAnotacao(contato.getAnotacao());
                }
            }
            System.out.println("\nContato atualizado!");
            return true;
        } catch (Exception e){
            System.out.println("\nOcorreu um erro ao tentar atualizado o contato de " + contato.getNomeContato());
            return false;
        }
        
    }
    
}
