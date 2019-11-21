/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.Controller;

import DAO.FuncionarioDAO;
import java.util.ArrayList;
import projetointegrador.model.Funcionario;

/**
 *
 * @author carlo
 */
public class FuncionarioController {
    public static boolean salvarFuncionario(String pNome, String pCPF, String pIdade, String pEndereco, String pBairro, String pTelefone, String pNumero){
    
            Funcionario objFuncionario = new Funcionario();
            
            boolean retorno = FuncionarioDAO.SalvarFuncionario(objFuncionario);
            
            return retorno;
    }
    public static ArrayList<String[]> consultarFuncionario(){
    
        ArrayList<Funcionario> listaUsuario = FuncionarioDAO.ConsultarFuncionario();
        ArrayList<String[]> listaFuncionarioString = new ArrayList<String[]>();
        
        //Transformo a lista de objetos funcionarios em uma lista de vetores de Strings
        for (Funcionario itemLista : listaUsuario) {
            
            listaFuncionarioString.add(new String[]{String.valueOf(itemLista.getIDF())
                                                    ,itemLista.getNome()
                                                    ,itemLista.getCPF(), itemLista.getIdade(), itemLista.getEndereco(), itemLista.getBairro(), itemLista.getBairro(), itemLista.getTelefone(), itemLista.getNumero()});
                                                    
            
        }
                
        return listaFuncionarioString;
    }
    public static boolean atualizarFuncionario(int Id,  String pNome, String pCPF, String pIdade, String pEndereco, String pBairro, String pNumero, String pTelefone)
    {
        Funcionario objFuncionarioAlterar =  new Funcionario(  pNome, pCPF, pIdade, pEndereco, pBairro, pNumero, pTelefone);
        
        return FuncionarioDAO.atualizarFuncionario(objFuncionarioAlterar);
        
    }
    public static boolean excluirFuncionario(int pID)
    {
        return FuncionarioDAO.excluirFuncionario(pID);
    }
    
}
