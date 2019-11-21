/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projetointegrador.model.Funcionario;

/**
 *
 * @author carlo
 */
public class FuncionarioDAO {
    public static boolean SalvarFuncionario(Funcionario pFuncionario){
        
        boolean retorno = SimulaBancoDAO.getInstance().SalvarFuncionario(pFuncionario);
        return retorno;
        
    }
    public static ArrayList<Funcionario> ConsultarFuncionario(){
    
        return SimulaBancoDAO.getInstance().ConsultarFuncionario();
    }
    public static boolean atualizarFuncionario(Funcionario p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaBancoDAO.getInstance().AtualizarFuncionario(p);
    }
    
    public static boolean excluirFuncionario(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaBancoDAO.getInstance().ExcluirFuncionario(pID);
    }
    
}
