/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.Controller;

import DAO.ProdutoDAO;
import java.util.ArrayList;
import projetointegrador.model.Produto;

/**
 *
 * @author carlo
 */
public class ProdutoController {
        public static boolean salvarProduto(String pNome, String pValor, String pQuantidade, String pFornecedor){
    
            Produto objProduto = new Produto(pNome, pValor, pQuantidade, pFornecedor);
            
            boolean retorno = ProdutoDAO.SalvarProduto(objProduto);
            
            return retorno;
    }
    public static ArrayList<String[]> consultarProduto(){
    
        ArrayList<Produto> listaProduto = ProdutoDAO.ConsultarProduto();
        ArrayList<String[]> listaProdutoString = new ArrayList<String[]>();
        
        //Transformo a lista de objetos funcionarios em uma lista de vetores de Strings
        for (Produto itemLista : listaProduto) {
            
            listaProdutoString.add(new String[]{String.valueOf(itemLista.getIDP())
                                                    ,itemLista.getNomeProduto()
                                                    ,itemLista.getValor(), itemLista.getQuantidade(), itemLista.getFornecedor()});
                                                    
            
        }
                
        return listaProdutoString;
    }
    public static boolean atualizarProduto(int Id, String pNome, String pValor, String pQuantidade, String pFornecedor )
    {
        Produto objProdutoAlterar =  new Produto(  pNome, pValor, pQuantidade, pFornecedor);
        
        return ProdutoDAO.atualizarProduto(objProdutoAlterar);
        
    }
    public static boolean excluirProduto(int pID)
    {
        return ProdutoDAO.excluirProduto(pID);
    }

    
}