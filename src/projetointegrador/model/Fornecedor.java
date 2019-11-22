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
public class Fornecedor {
    private static int qtdFornecedorCriados;
    private int IDF;
    private String nomeFornecedor;
    private String CNPJ;
    private String Telefone;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String CEP;
    private String UF;
    
    public String getCNPJSomenteNumeros() {
        return CNPJ.replace(".", "").replace("-", "");
    }
    public String getCEPSomenteNumeros(){
        return CEP.replace("-", "");
    }
    public Fornecedor(int Id){
        this.IDF = Id;
        
        
    }
    public Fornecedor(){
        
    }
    public Fornecedor(String nomeFornecedor, String CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String CEP, String UF){
        
        
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.CEP = CEP;
        this.UF = UF;
        
    }
    public Fornecedor(int IDF, String nomeFornecedor, String CNPJ, String Telefone, String Endereco, String Bairro, String Cidade, String CEP, String UF ){
        this.IDF = IDF;
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.CEP = CEP;
        this.UF = UF;
        
    }
    
    
    


    public static int getQtdFornecedorCriados() {
        return qtdFornecedorCriados;
    }

    public static void setQtdFornecedorCriados(int qtdFornecedorCriados) {
        Fornecedor.qtdFornecedorCriados = qtdFornecedorCriados;
    }

    public int getIDF() {
        return IDF;
    }

    public void setIDF(int IDF) {
        this.IDF = IDF;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
}
