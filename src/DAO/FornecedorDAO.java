/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projetointegrador.model.Fornecedor;

/**
 *
 * @author carlo
 */
public class FornecedorDAO {
    public static boolean SalvarFornecedor(Fornecedor pFornecedor){
        
        boolean retorno = SimulaBancoDAO.getInstance().SalvarFornecedor(pFornecedor);
        return retorno;
        
    }
    public static ArrayList<Fornecedor> ConsultarFornecedor(){
    
        return SimulaBancoDAO.getInstance().ConsultarFornecedor();
    }
    public static boolean atualizarFornecedor(Fornecedor p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaBancoDAO.getInstance().AtualizarFornecedor(p);
    }
    
    public static boolean excluirFornecedor(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaBancoDAO.getInstance().ExcluirFornecedor(pID);
    }
    
}
