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
public abstract class Pessoa {
    private String nome;

    private String endereço;

    private String dataNascimento;

    private String telefone;

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getEndereço();

    public abstract void setEndereço(String endereço);

    public abstract String getDataNascimento();

    public abstract void setDataNascimento(String dataNascimento);

    public abstract String getTelefone();

    public abstract void setTelefone(String telefone);
    

    public abstract boolean Alterar();

    public abstract boolean Cadastrar();

    public abstract boolean Excluir();
}
