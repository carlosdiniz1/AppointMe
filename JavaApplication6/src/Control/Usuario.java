/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author carlos.diniz
 */
public abstract class Usuario extends Pessoa{

    private int nivelUsuario;
    private String login;
    private String senha;
    private boolean ativo;

    public Usuario(String nome, String dataNascimento, String telefone, String cpf) {
        super(nome, dataNascimento, telefone, cpf);
    }

    public int getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(int nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    public abstract boolean Login() ;

    public abstract boolean Logoff();

    public abstract Usuario ListarUsuario();
}
