/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projetointegrador.model.Produto;

/**
 *
 * @author carlo
 */
public class ProdutoDAO {
    public static boolean SalvarProduto(Produto pProduto){
        
        boolean retorno = SimulaBancoDAO.getInstance().SalvarProduto(pProduto);
        return retorno;
        
    }
    public static ArrayList<Produto> ConsultarProduto(){
    
        return SimulaBancoDAO.getInstance().ConsultarProduto();
    }
    public static boolean atualizarProduto(Produto p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaBancoDAO.getInstance().AtualizarProduto(p);
    }
    
    public static boolean excluirProduto(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaBancoDAO.getInstance().ExcluirProduto(pID);
    }
    
}
