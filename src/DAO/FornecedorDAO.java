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
import projetointegrador.model.Fornecedor;
import projetointegrador.utils.GerenciadorConexao;

/**
 *
 * @author carlo
 */
public class FornecedorDAO {
    public static boolean SalvarFornecedor(Fornecedor p){
        
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO fornecedor (nome,CNPJ, Telefone, endereço, bairro, cidade, UF, CEP) VALUES(?, ?,?,?,?,?,?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNomeFornecedor());
            
            

            
            
            instrucaoSQL.setString(3, p.getCNPJSomenteNumeros());
            instrucaoSQL.setString(4, p.getTelefone());
            instrucaoSQL.setString(5, p.getEndereco());
            instrucaoSQL.setString(6, p.getBairro());
            instrucaoSQL.setString(7, p.getCidade());
            instrucaoSQL.setString(8, p.getUF());
            instrucaoSQL.setString(9, p.getCEP());
            
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIDF(generatedKeys.getInt(1));
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
    public static ArrayList<Fornecedor> ConsultarFornecedor(){
    
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM fornecedor;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Fornecedor f = new Fornecedor();
                
                f.setIDF(rs.getInt("idfornecedor"));
                f.setNomeFornecedor(rs.getString("nome"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setTelefone(rs.getString("telefone"));
                f.setEndereco(rs.getString("endereco"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setUF(rs.getString("UF"));
                f.setCEP(rs.getString("CEP"));
                
                
                
                
                listaFornecedor.add(f);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaFornecedor = null;
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
        
        return listaFornecedor;
    }
    public static boolean atualizarFornecedor(Fornecedor p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
           
            
            instrucaoSQL = conexao.prepareStatement("UPDATE clientes SET nome = ?, CNPJ = ?, Telefone = ?, endereço = ?, bairro = ?, cidade = ?, UF = ?, CEP = ?"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getNomeFornecedor());
            instrucaoSQL.setString(3, p.getCNPJSomenteNumeros());
            instrucaoSQL.setString(4, p.getTelefone());
            instrucaoSQL.setString(5, p.getEndereco());
            instrucaoSQL.setString(6, p.getBairro());
            instrucaoSQL.setString(7, p.getCidade());
            instrucaoSQL.setString(8, p.getUF());
            instrucaoSQL.setString(9, p.getCEP());
           
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIDF(generatedKeys.getInt(1));
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
    
    public static boolean excluirFornecedor(int pIdfornecedor)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM fornecedor WHERE = ?"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pIdfornecedor);
            
            
            
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
    
}
