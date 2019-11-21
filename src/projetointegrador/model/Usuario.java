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
public class Usuario {

    public static int getQtdUsuariosCriados() {
        return qtdUsuariosCriados;
    }

   
    

   
    private static int qtdUsuariosCriados; 

    public int getIDU() {
        return IDU;
    }

    public void setIDU(int IDU) {
        this.IDU = IDU;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getSenha2() {
        return Senha2;
    }

    public void setSenha2(String Senha2) {
        this.Senha2 = Senha2;
    }
    private int IDU;
    private String Usuario;
    private String Senha;
    private String Senha2;
    
    public Usuario(){
        qtdUsuariosCriados++;
        this.IDU = qtdUsuariosCriados;
        
    }
    public Usuario(String usuario, String senha, String senha2){
        qtdUsuariosCriados++;
        this.IDU = qtdUsuariosCriados;
        this.Usuario = usuario;
        this.Senha = senha;
        this.Senha2 = senha2;
    }
    public Usuario(int IDU, String usuario, String senha, String senha2){
        this.IDU = IDU;
        this.Usuario = usuario;
        this.Senha = senha;
        this.Senha2 = senha2;
    }
    
    
}
