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
public class Prontuario {

    private char historico;

    private Paciente paciente;

    public char getHistorico() {
        return historico;
    }

    public void setHistorico(char historico) {
        this.historico = historico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean RegPront() {
        return false;
    }

    public Prontuario ListarPront() {
        return null;
    }

    public Prontuario ConsultarPront() {
        return null;
    }
}
