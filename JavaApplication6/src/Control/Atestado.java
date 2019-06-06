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
public class Atestado {
    private String horaAtend;
    private String dataAtend;
    private String CRMAtestado;
    private String CPFAtestado;

    public String getHoraAtend() {
        return horaAtend;
    }

    public void setHoraAtend(String horaAtend) {
        this.horaAtend = horaAtend;
    }

    public String getDataAtend() {
        return dataAtend;
    }

    public void setDataAtend(String dataAtend) {
        this.dataAtend = dataAtend;
    }

    public String getCRMAtestado() {
        return CRMAtestado;
    }

    public void setCRMAtestado(String CRMAtestado) {
        this.CRMAtestado = CRMAtestado;
    }

    public String getCPFAtestado() {
        return CPFAtestado;
    }

    public void setCPFAtestado(String CPFAtestado) {
        this.CPFAtestado = CPFAtestado;
    }
    
    public boolean ImprimirAtestado(){
        return true;
    }
}
