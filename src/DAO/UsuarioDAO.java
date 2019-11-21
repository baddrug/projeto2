/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projetointegrador.model.Usuario;

/**
 *
 * @author carlo
 */
public class UsuarioDAO {
    public static boolean SalvarUsuario(Usuario pUsuario){
        
        boolean retorno = SimulaBancoDAO.getInstance().SalvarUsuario(pUsuario);
        return retorno;
        
    }
    public static ArrayList<Usuario> ConsultarUsuario(){
    
        return SimulaBancoDAO.getInstance().ConsultarUsuario();
    }
    public static boolean atualizarUsuario(Usuario p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaBancoDAO.getInstance().AtualizarUsuario(p);
    }
    
    public static boolean excluirUsuario(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaBancoDAO.getInstance().ExcluirUsuario(pID);
    }
    
}
