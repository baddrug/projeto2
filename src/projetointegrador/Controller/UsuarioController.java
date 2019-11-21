/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.Controller;

import DAO.UsuarioDAO;
import java.util.ArrayList;
import projetointegrador.model.Usuario;

/**
 *
 * @author carlo
 */
public class UsuarioController {
    public static boolean salvarUsuario(String pUsuario, String pSenha, String pSenha2){
    
            Usuario objUsuario = new Usuario(pUsuario, pSenha, pSenha2);
            
            boolean retorno = UsuarioDAO.SalvarUsuario(objUsuario);
            
            return retorno;
    }
    public static ArrayList<String[]> consultarUsuario(){
    
        ArrayList<Usuario> listaUsuario = UsuarioDAO.ConsultarUsuario();
        ArrayList<String[]> listaUsuarioString = new ArrayList<String[]>();
        
        //Transformo a lista de objetos funcionarios em uma lista de vetores de Strings
        for (Usuario itemLista : listaUsuario) {
            
            listaUsuarioString.add(new String[]{String.valueOf(itemLista.getIDU())
                                                    ,itemLista.getUsuario()
                                                    ,itemLista.getSenha(), itemLista.getSenha2()});
                                                    
            
        }
                
        return listaUsuarioString;
    }
    public static boolean atualizarUsuario(int Id,  String pUsuario, String pSenha, String pSenha2)
    {
        Usuario objUsuarioAlterar =  new Usuario(  pUsuario,  pSenha, pSenha2);
        
        return UsuarioDAO.atualizarUsuario(objUsuarioAlterar);
        
    }
    public static boolean excluirUsuario(int pID)
    {
        return UsuarioDAO.excluirUsuario(pID);
    }
    
}
