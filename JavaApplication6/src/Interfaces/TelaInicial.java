/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author carlos.diniz
 */
public class TelaInicial extends javax.swing.JPanel implements ActionListener{

    

    
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }
    public static void main(String args[]){
        TelaInicial tela = new TelaInicial();
        tela.initComponents();
        tela.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAppointMe = new javax.swing.JLabel();
        buttonCadastrarConsulta = new javax.swing.JButton();
        buttonCadastrarMedico = new javax.swing.JButton();
        buttonCadastrarSecretaria = new javax.swing.JButton();
        buttonCadastrarPaciente = new javax.swing.JButton();
        buttonListarConsultasAgendadas = new javax.swing.JButton();
        buttonBuscarConsulta = new javax.swing.JButton();
        buttonListarMedicos = new javax.swing.JButton();
        buttonListarPacientes = new javax.swing.JButton();
        buttonListarSecretarias = new javax.swing.JButton();
        buttonRealizarConsulta = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 204));

        labelAppointMe.setBackground(new java.awt.Color(255, 0, 153));
        labelAppointMe.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        labelAppointMe.setForeground(new java.awt.Color(255, 255, 255));
        labelAppointMe.setText("AppointMe");

        buttonCadastrarConsulta.setBackground(new java.awt.Color(0, 0, 102));
        buttonCadastrarConsulta.setText("Cadastrar Consulta");
        buttonCadastrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarConsultaActionPerformed(evt);
            }
        });

        buttonCadastrarMedico.setBackground(new java.awt.Color(0, 0, 102));
        buttonCadastrarMedico.setText("Cadastrar Médico");
        buttonCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarMedicoActionPerformed(evt);
            }
        });

        buttonCadastrarSecretaria.setBackground(new java.awt.Color(0, 0, 102));
        buttonCadastrarSecretaria.setText("Cadastrar Secretária");
        buttonCadastrarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarSecretariaActionPerformed(evt);
            }
        });

        buttonCadastrarPaciente.setBackground(new java.awt.Color(0, 0, 102));
        buttonCadastrarPaciente.setText("CadastrarPaciente");
        buttonCadastrarPaciente.setActionCommand("");
        buttonCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarPacienteActionPerformed(evt);
            }
        });

        buttonListarConsultasAgendadas.setBackground(new java.awt.Color(0, 0, 102));
        buttonListarConsultasAgendadas.setText("Listar Consultas Agendads");
        buttonListarConsultasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarConsultasAgendadasActionPerformed(evt);
            }
        });

        buttonBuscarConsulta.setBackground(new java.awt.Color(0, 0, 102));
        buttonBuscarConsulta.setText("Buscar Consulta");
        buttonBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarConsultaActionPerformed(evt);
            }
        });

        buttonListarMedicos.setBackground(new java.awt.Color(0, 0, 102));
        buttonListarMedicos.setText("Listar Médicos");
        buttonListarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarMedicosActionPerformed(evt);
            }
        });

        buttonListarPacientes.setBackground(new java.awt.Color(0, 0, 102));
        buttonListarPacientes.setText("Listar Pacientes");
        buttonListarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarPacientesActionPerformed(evt);
            }
        });

        buttonListarSecretarias.setBackground(new java.awt.Color(0, 0, 102));
        buttonListarSecretarias.setText("Listar Secretárias");
        buttonListarSecretarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarSecretariasActionPerformed(evt);
            }
        });

        buttonRealizarConsulta.setBackground(new java.awt.Color(0, 0, 102));
        buttonRealizarConsulta.setText("Realizar Consulta");
        buttonRealizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRealizarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAppointMe, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonListarSecretarias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonListarMedicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonListarConsultasAgendadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCadastrarSecretaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCadastrarConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCadastrarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCadastrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBuscarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonListarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRealizarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAppointMe)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarConsulta)
                    .addComponent(buttonCadastrarMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarSecretaria)
                    .addComponent(buttonCadastrarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonListarConsultasAgendadas)
                    .addComponent(buttonBuscarConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonListarMedicos)
                    .addComponent(buttonListarPacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonListarSecretarias)
                    .addComponent(buttonRealizarConsulta))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarPacienteActionPerformed
        CadastroDePaciente cadastroDePaciente = new CadastroDePaciente();
        cadastroDePaciente.setVisible(true);
        
    }//GEN-LAST:event_buttonCadastrarPacienteActionPerformed

    private void buttonCadastrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarConsultaActionPerformed
        CadastroDeConsulta cadastroDeConsulta = new CadastroDeConsulta();
        cadastroDeConsulta.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarConsultaActionPerformed

    private void buttonCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarMedicoActionPerformed
        CadastroDeMedico cadastroDeMedico = new CadastroDeMedico();
        cadastroDeMedico.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarMedicoActionPerformed

    private void buttonCadastrarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarSecretariaActionPerformed
        CadastroDeSecretária cadastroDeSecretaria = new CadastroDeSecretária();
        cadastroDeSecretaria.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarSecretariaActionPerformed

    private void buttonListarConsultasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarConsultasAgendadasActionPerformed
        ListaDeConsultas listaDeConsultas = new ListaDeConsultas();
        listaDeConsultas.setVisible(true);
    }//GEN-LAST:event_buttonListarConsultasAgendadasActionPerformed

    private void buttonBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarConsultaActionPerformed

    private void buttonListarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonListarMedicosActionPerformed

    private void buttonListarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarPacientesActionPerformed
       ListaDePacientes listaDePacientes = new ListaDePacientes();
       listaDePacientes.setVisible(true);
    }//GEN-LAST:event_buttonListarPacientesActionPerformed

    private void buttonListarSecretariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarSecretariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonListarSecretariasActionPerformed

    private void buttonRealizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRealizarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRealizarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscarConsulta;
    private javax.swing.JButton buttonCadastrarConsulta;
    private javax.swing.JButton buttonCadastrarMedico;
    private javax.swing.JButton buttonCadastrarPaciente;
    private javax.swing.JButton buttonCadastrarSecretaria;
    private javax.swing.JButton buttonListarConsultasAgendadas;
    private javax.swing.JButton buttonListarMedicos;
    private javax.swing.JButton buttonListarPacientes;
    private javax.swing.JButton buttonListarSecretarias;
    private javax.swing.JButton buttonRealizarConsulta;
    private javax.swing.JLabel labelAppointMe;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


   
   
    
}


