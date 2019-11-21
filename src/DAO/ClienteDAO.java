/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import projetointegrador.utils.GerenciadorConexao;
import projetointegrador.model.Cliente;

/**
 *
 * @author carlo
 */
public class ClienteDAO {
    
    public static boolean salvar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO clientes (nome,Data,CPF,Civil, Telefone, endereço, bairro, cidade, CEP) VALUES(?, ?,?,?,?,?,?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNomeCliente());
            
            Date dataOriginal = new Date(p.getData());

            
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(df.format(dataOriginal)));
            instrucaoSQL.setString(3, p.getCPFSomenteNumeros());
            instrucaoSQL.setString(4, p.getCivil());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setString(6, p.getEndereco());
            instrucaoSQL.setString(7, p.getBairro());
            instrucaoSQL.setString(8, p.getCidade());
            instrucaoSQL.setString(9, p.getCEPSomenteNumeros());
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIDC(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do cliente.");
                    }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean atualizar(Cliente p)
    { boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            instrucaoSQL = conexao.prepareStatement("UPDATE clientes SET nome = ?,Data = ?, CPF = ? , Civil = ?, Telefone = ?, endereço = ?, bairro = ?, cidade = ?, CEP = ?"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNomeCliente());
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(df.format(p.getData())));
            instrucaoSQL.setString(3, p.getCPFSomenteNumeros());
            instrucaoSQL.setString(4, p.getCivil());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setString(6, p.getEndereco());
            instrucaoSQL.setString(7, p.getBairro());
            instrucaoSQL.setString(8, p.getCidade());
            instrucaoSQL.setString(9, p.getCEPSomenteNumeros());
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIDC(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do cliente.");
                    }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean excluir(int pIdcliente)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM clientes WHERE = ?"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pIdcliente);
            
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static ArrayList<Cliente> consultarClientes()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setIDC(rs.getInt("idclientes"));
                c.setNomeCliente(rs.getString("nome"));
                c.setData(rs.getString("Data"));
                c.setCPF(rs.getString("CPF"));
                c.setCivil(rs.getString("Civil"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEndereco(rs.getString("Endereço"));
                c.setBairro(rs.getString("Bairro"));
                c.setCidade(rs.getString("Cidade"));
                c.setCEP(rs.getString("CEP"));
                
                
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }    

    
}
