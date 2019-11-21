/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.Controller;

import DAO.FornecedorDAO;
import java.util.ArrayList;
import projetointegrador.model.Fornecedor;

/**
 *
 * @author carlo
 */
public class FornecedorController {
     public static boolean salvarFornecedor(String pNome, String pCPF, String pTelefone, String pBairro, String pCidade, String pCEP, String pEndereco, String pUF){
    
            Fornecedor objFornecedor = new Fornecedor(pNome, pCPF, pTelefone, pBairro, pCEP, pCidade, pEndereco, pUF);
            
            boolean retorno = FornecedorDAO.SalvarFornecedor(objFornecedor);
            
            return retorno;
    }
    public static ArrayList<String[]> consultarFornecedor(){
    
        ArrayList<Fornecedor> listaFornecedor = FornecedorDAO.ConsultarFornecedor();
        ArrayList<String[]> listaFornecedorString = new ArrayList<String[]>();
        
        //Transformo a lista de objetos funcionarios em uma lista de vetores de Strings
        for (Fornecedor itemLista : listaFornecedor) {
            
            listaFornecedorString.add(new String[]{String.valueOf(itemLista.getIDF())
                                                    ,itemLista.getNomeFornecedor()
                                                    ,itemLista.getCNPJ(),itemLista.getCEP(),itemLista.getBairro(),itemLista.getCidade()
                    ,itemLista.getEndereco(), itemLista.getTelefone(), itemLista.getUF()});
                                                    
            
        }
                
        return listaFornecedorString;
    }
    public static boolean atualizarFornecedor(int Id, String pnomeFornecedor, String pCNPJ, String pTelefone, String pBairro, String pCidade, String pCEP, String pEndereco, String pUF)
    {
        Fornecedor objFornecedorAlterar =  new Fornecedor(  pnomeFornecedor, pCNPJ, pTelefone, pBairro, pCEP, pCidade, pEndereco, pUF);
        
        return FornecedorDAO.atualizarFornecedor(objFornecedorAlterar);
        
    }
    public static boolean excluirFornecedor(int pID)
    {
        return FornecedorDAO.excluirFornecedor(pID);
    }

    
}
