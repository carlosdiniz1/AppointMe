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

    public abstract int getNivelUsuario();

    public abstract void setNivelUsuario(int nivelUsuario);

    public abstract String getLogin();

    public abstract void setLogin(String login);

    public abstract String getSenha();

    public abstract void setSenha(String senha);

    public abstract boolean isAtivo();

    public abstract void setAtivo(boolean ativo);
    
    
    
    
    public abstract boolean Login() ;

    public abstract boolean Logoff();

    public abstract Usuario ListarUsuario();
}
