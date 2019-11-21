/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.model;

/**
 *
 * @author carlo
 */
public class Produto {
    

    
    private int IDP;
    private String nomeProduto;
    private String Valor;
    private String Quantidade;
    
    private String Fornecedor;
    
   
    public Produto( String nomeProduto, String Valor, String Quantidade,  String Fornecedor){
        qtdProdutosCriados++;
        this.IDP = qtdProdutosCriados;
        
        
        
        this.nomeProduto = nomeProduto;
        this.Valor = Valor;
        this.Quantidade = Quantidade;
        
        this.Fornecedor = Fornecedor;
        
        
        
    }
    public Produto(int Id){
        this.IDP = Id;
    }
    public Produto(int IDP, String nomeProduto, String Valor, String Quantidade, String Fornecedor ){
        this.IDP = IDP;
        this.nomeProduto = nomeProduto;
        this.Valor = Valor;
        this.Quantidade = Quantidade;
        
        this.Fornecedor = Fornecedor;
    }
    private static int qtdProdutosCriados;

    public static int getQtdProdutosCriados() {
        return qtdProdutosCriados;
    }

    public static void setQtdProdutosCriados(int qtdProdutosCriados) {
        Produto.qtdProdutosCriados = qtdProdutosCriados;
    }

    public int getIDP() {
        return IDP;
    }

    public void setIDP(int IDP) {
        this.IDP = IDP;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    
    

    
    public Produto(){
        qtdProdutosCriados++;
        this.IDP = qtdProdutosCriados;
        
    }
  
    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }
    
}
