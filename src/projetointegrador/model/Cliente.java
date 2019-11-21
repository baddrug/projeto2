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
public class Cliente {
    
    private static int qtdClientesCriados;
    private int IDC;
    private String nomeCliente;
    private String Data;
    private String CPF;
    private String Civil;
    private String Telefone;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String CEP;
    
    

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getCivil() {
        return Civil;
    }

    public void setCivil(String Civil) {
        this.Civil = Civil;
    }
    
    
    public Cliente(){
        qtdClientesCriados++;
        this.IDC = qtdClientesCriados;
        
    }

    public Cliente( String nomeCliente, String Data, String CPF, String Civil ,  String Telefone, String Endereco, String Bairro, String Cidade, String CEP){
//        qtdClientesCriados++;
//        this.IDC = qtdClientesCriados;
        
        this.nomeCliente = nomeCliente;
        this.Data = Data;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Civil = Civil;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.CEP = CEP;
        
        
        
    }
    public Cliente(int IDC, String nomeCliente, String Data, String CPF, String Civil ,  String Telefone, String Endereco, String Bairro, String Cidade, String CEP) {
        this.IDC = IDC;
        this.nomeCliente = nomeCliente;
        this.Data = Data;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Civil = Civil;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.CEP = CEP;
    }
    public String getCPFSomenteNumeros() {
        return CPF.replace(".", "").replace("-", "");
    }
    public String getCEPSomenteNumeros(){
        return CEP.replace("-", "");
    }
    public String getDataNasc(){
        return Data.replace("/", "/");
    }

    

    
    

    

    public int getIDC() {
        return IDC;
    }

    public void setIDC(int IDC) {
        this.IDC = IDC;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
    

    
}

