/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.Controller;

import DAO.ClienteDAO;
import java.util.ArrayList;
import projetointegrador.model.Cliente;


/**
 *
 * @author carlo
 */
public class ClienteController {
    public static boolean salvar(String pNome,String pData, String pCPF, String pCivil, String pTelefone, String pEndereco, 
            String pBairro, String pCidade, String pCEP )
    {
        //Salvo na memória
        Cliente p =  new Cliente(pNome, pData, pCPF, pCivil,pTelefone,pEndereco,pBairro,pCidade,pCEP);
        return ClienteDAO.salvar(p);
    }
    
    public static boolean excluir(int pIDC)
    {
        return ClienteDAO.excluir(pIDC);
    }
    
    public static boolean atualizar(int pId, String pNome, String pData, String pCPF , String pCivil, String pTelefone, String pEndereco, 
            String pBairro, String pCidade, String pCEP)
    {
        Cliente p =  new Cliente(pId,pNome,pData,pCPF,pCivil,pTelefone,pEndereco,pBairro,pCidade,pCEP);
        return ClienteDAO.atualizar(p);
        
    }
    
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     * @return lista de string
     */
    public static ArrayList<String[]> consultarClientes()
    {
        ArrayList<Cliente> clientes = ClienteDAO.consultarClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for(int i=0;i<clientes.size();i++)
        {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getIDC())
                                                            ,clientes.get(i).getNomeCliente()
                                                            ,String.valueOf(clientes.get(i).getData())
                                                            
                                                            ,String.valueOf(clientes.get(i).getCPF())
                                                            ,clientes.get(i).getCivil()
                                                            ,clientes.get(i).getTelefone()
                                                            ,clientes.get(i).getEndereco()
                                                            ,clientes.get(i).getBairro()
                                                            ,clientes.get(i).getCidade()
                                                            ,String.valueOf(clientes.get(i).getCEP())});
                                                   
        }
        
        return listaClientes;
        
    }
    
    

    

    

}
