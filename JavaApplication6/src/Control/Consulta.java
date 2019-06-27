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
public class Consulta {

    private String horaInicio;

    private String dataConsulta;

    private String horaFim;

    private String CPFConsulta;

    private String CRMConsulta;
    
    private String Relatório;

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getCPFConsulta() {
        return CPFConsulta;
    }

    public void setCPFConsulta(String CPFConsulta) {
        this.CPFConsulta = CPFConsulta;
    }

    public String getCRMConsulta() {
        return CRMConsulta;
    }

    public void setCRMConsulta(String CRMConsulta) {
        this.CRMConsulta = CRMConsulta;
    }
    
    

    public boolean Agendar() {
        return false;
    }

    public boolean AlterarConsulta() {
        return false;
    }

    public Consulta Consultar() {
        return null;
    }

    public Consulta ListarConsulta() {
        return null;
    }

    public boolean ExcluirConsulta() {
        return false;
    }
}
