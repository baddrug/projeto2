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
public class Funcionario {
    private static int qtdFuncionariosCriados;

    public static int getQtdFuncionariosCriados() {
        return qtdFuncionariosCriados;
    }

    public static void setQtdFuncionariosCriados(int qtdFuncionariosCriados) {
        Funcionario.qtdFuncionariosCriados = qtdFuncionariosCriados;
    }

    public int getIDF() {
        return IDF;
    }

    public void setIDF(int IDF) {
        this.IDF = IDF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
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

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    private int IDF;
    private String Nome;
    private String CPF;
    private String Idade;
    private String Endereco;
    private String Bairro;
    private String Numero;
    private String Telefone;
    
    public Funcionario(){
        qtdFuncionariosCriados++;
        this.IDF = qtdFuncionariosCriados;
    }
    
    public Funcionario(int Id){
        this.IDF = Id;
    }
    public Funcionario(String Nome, String CPF, String Idade, String Endereco, String Bairro, String Numero, String Telefone){
        qtdFuncionariosCriados++;
        this.IDF = qtdFuncionariosCriados;
        
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Numero = Numero;
        this.Telefone = Telefone;
    }
    public Funcionario(int IDF, String Nome, String CPF, String Idade, String Endereco, String Bairro, String Numero, String Telefone){
        this.IDF = IDF;
        
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Numero = Numero;
        this.Telefone = Telefone;
    }
    
    
}
