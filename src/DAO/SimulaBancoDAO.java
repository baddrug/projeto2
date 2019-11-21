/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projetointegrador.model.Cliente;
import projetointegrador.model.Fornecedor;
import projetointegrador.model.Funcionario;
import projetointegrador.model.Produto;
import projetointegrador.model.Usuario;

/**
 *
 * @author carlo
 */
public class SimulaBancoDAO {
    
    private static SimulaBancoDAO objBancoSimulado;
    

    public ArrayList<Cliente> linhasTabelaCliente;
    public ArrayList<Fornecedor> linhasTabelaFornecedor;
    public ArrayList<Produto> linhasTabelaProduto;
    public ArrayList<Usuario> linhasTabelaUsuario;
    public ArrayList<Funcionario> linhasTabelaFuncionario;
    
    public SimulaBancoDAO(){
    
        linhasTabelaFuncionario = new ArrayList<Funcionario>();
        linhasTabelaCliente = new ArrayList<Cliente>();
        linhasTabelaFornecedor = new ArrayList<Fornecedor>();
        linhasTabelaProduto = new ArrayList<Produto>();
        linhasTabelaUsuario = new ArrayList<Usuario>();
    }
    public static synchronized SimulaBancoDAO getInstance(){
        
        if(objBancoSimulado ==null)
            objBancoSimulado = new SimulaBancoDAO();
                
        return objBancoSimulado;
    }
    public boolean SalvarFuncionario(Funcionario pFuncionario){
        linhasTabelaFuncionario.add(pFuncionario);
        return true;
    }
    public boolean SalvarUsuario(Usuario pUsuario){
        linhasTabelaUsuario.add(pUsuario);
        return true;
    }
    public boolean SalvarProduto(Produto pProduto){
        linhasTabelaProduto.add(pProduto);
        return true;
    }
    public boolean SalvarCliente(Cliente pCliente)
    {
        linhasTabelaCliente.add(pCliente);
        return true;
    }
    public boolean SalvarFornecedor(Fornecedor pFornecedor){
        linhasTabelaFornecedor.add(pFornecedor);
        return true;
    }
    public ArrayList<Funcionario>ConsultarFuncionario(){
        return this.linhasTabelaFuncionario;
    }
    public ArrayList<Usuario> ConsultarUsuario(){
        return this.linhasTabelaUsuario;
    }
    public ArrayList<Produto> ConsultarProduto(){
        return this.linhasTabelaProduto;
    }
    public ArrayList<Cliente> ConsultarCliente(){
    
        return this.linhasTabelaCliente;
    }
    public ArrayList<Fornecedor> ConsultarFornecedor(){
        return this.linhasTabelaFornecedor;
    }
    public boolean AtualizarFuncionario(Funcionario p){
        for(Funcionario item: linhasTabelaFuncionario){
            if(item.getIDF() == p.getIDF()){
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
                item.setNumero(p.getNumero());
                item.setIdade(p.getIdade());
                item.setEndereco(p.getEndereco());
                item.setBairro(p.getBairro());
                item.setTelefone(p.getTelefone());
            }
        }
        return true;
    }
    public boolean AtualizarUsuario(Usuario p){
        for(Usuario item: linhasTabelaUsuario){
            if(item.getIDU() == p.getIDU()){
                item.setUsuario(p.getUsuario());
                item.setSenha(p.getSenha());
                item.setSenha(p.getSenha2());
            }
        }
        return true;
    }
    public boolean AtualizarProduto(Produto p){
        for(Produto item: linhasTabelaProduto){
            if(item.getIDP() == p.getIDP()){
                item.setNomeProduto(p.getNomeProduto());
                item.setValor(p.getValor());
                item.setQuantidade(p.getQuantidade());
                
            }
        }
        return true;
    }
    public boolean AtualizarFornecedor(Fornecedor p){
        for(Fornecedor item: linhasTabelaFornecedor){
            if(item.getIDF() == p.getIDF()){
                item.setNomeFornecedor(p.getNomeFornecedor());
                item.setCNPJ(p.getCNPJ());
                item.setEndereco(p.getEndereco());
                item.setBairro(p.getBairro());
                item.setCEP(p.getCEP());
                item.setCidade(p.getCidade());
                item.setUF(p.getUF());
                item.setTelefone(p.getTelefone());
            }
        }
        return true;
    }
    public boolean AtualizarCliente(Cliente p)
    {
        for(Cliente item: linhasTabelaCliente)
        {
            if(item.getIDC()== p.getIDC())
            {
                item.setNomeCliente(p.getNomeCliente());
                item.setCPF(p.getCPF());
                item.setEndereco(p.getEndereco());
                item.setBairro(p.getBairro());
                item.setCEP(p.getCEP());
                item.setCidade(p.getCidade());
                item.setTelefone(p.getTelefone());
                
            }
        }
            
        return true;
    }
    public boolean ExcluirFuncionario(int idExcluir){
        Funcionario funcionarioExcluir = null;
        boolean existeNaLista = false;
        for(Funcionario f: linhasTabelaFuncionario){
            if(f.getIDF() == idExcluir){
                funcionarioExcluir = f;
                existeNaLista = true;
            }
        }
        if(existeNaLista)
            linhasTabelaFuncionario.remove(funcionarioExcluir);
        return true;
    }
    public boolean ExcluirUsuario(int idExcluir){
        Usuario usuarioExcluir = null;
        boolean existeNaLista = false;
        for(Usuario u: linhasTabelaUsuario){
            if(u.getIDU() == idExcluir){
                usuarioExcluir = u;
                existeNaLista = true;
            }
        }
        if(existeNaLista)
            linhasTabelaUsuario.remove(usuarioExcluir);
        return true;
    }
        
    public boolean ExcluirProduto(int idExcluir){
        Produto produtoExcluir = null;
        boolean existeNaLista = false;
        for(Produto p: linhasTabelaProduto){
            if(p.getIDP() == idExcluir){
                produtoExcluir = p;
                existeNaLista = true;
            }
        }
        if(existeNaLista)
            linhasTabelaProduto.remove(produtoExcluir);
        return true;
    }
    public boolean ExcluirFornecedor(int idExcluir){
        Fornecedor fornecedorExcluir = null;
        boolean existeNaLista = false;
        for(Fornecedor f : linhasTabelaFornecedor){
            if(f.getIDF()== idExcluir){
                fornecedorExcluir = f;
                existeNaLista = true;
            }
        }
        if(existeNaLista)
            linhasTabelaFornecedor.remove(fornecedorExcluir);
        return true;
    }
    public boolean ExcluirCliente(int idExcluir)
    {
        Cliente clienteExcluir = null;
        
        boolean existeNaLista = false;
        for (Cliente c : linhasTabelaCliente) {
        
            if(c.getIDC()== idExcluir ){
                clienteExcluir = c;
                existeNaLista = true;
            }
        }
        
        if(existeNaLista)
            linhasTabelaCliente.remove(clienteExcluir);
        
        return true;
    }
        
    
}
