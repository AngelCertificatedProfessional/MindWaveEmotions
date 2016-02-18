/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.EegControl;
import Entidad.EegSignals;
import java.awt.List;
import java.awt.TrayIcon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Conexion.ClienteTCP;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author LiutsCertificatedProfessional Utilizando el parte del codigo de
 * ericblue
 */
public class Interfaz_Diadema extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Interfaz_Diadema
     */
    private ClienteTCP clienteTCP;
    private String personaAEvaluar;

    public Interfaz_Diadema() {
        personaAEvaluar = JOptionPane.showInputDialog("Escriba su nombre");
        initComponents();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deltaLbl = new javax.swing.JLabel();
        thetaLbl = new javax.swing.JLabel();
        lowAlphaLbl = new javax.swing.JLabel();
        highAlphaLbl = new javax.swing.JLabel();
        lowBetaLbl = new javax.swing.JLabel();
        highBetaLbl = new javax.swing.JLabel();
        lowGammaLbl = new javax.swing.JLabel();
        highGammaLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        concentracionLbl = new javax.swing.JLabel();
        relajacionLbl = new javax.swing.JLabel();
        ladoLbl = new javax.swing.JLabel();
        puntoEsperaLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deltaLbl.setText("Delta: ");

        thetaLbl.setText("Theta:");

        lowAlphaLbl.setText("LowAlpha:");

        highAlphaLbl.setText("High Alpha: ");

        lowBetaLbl.setText("Low Beta:");

        highBetaLbl.setText("High Beta:");

        lowGammaLbl.setText("Low Gamma:");

        highGammaLbl.setText("High Gamma:");

        jLabel1.setText("Datos Enviados por la MindWave: ");

        concentracionLbl.setText("Concentracion: ");

        relajacionLbl.setText("Relajacion:");

        ladoLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ladoLbl.setText("Piensa en el lado:");

        puntoEsperaLbl.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        puntoEsperaLbl.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(highGammaLbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lowBetaLbl)
                                        .addComponent(highBetaLbl))
                                    .addComponent(lowGammaLbl))
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(highAlphaLbl)
                                    .addComponent(lowAlphaLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(deltaLbl)
                                            .addComponent(thetaLbl)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ladoLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(relajacionLbl)
                                            .addComponent(concentracionLbl))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(puntoEsperaLbl)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(puntoEsperaLbl)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lowBetaLbl)
                            .addComponent(deltaLbl))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highBetaLbl)
                            .addComponent(thetaLbl))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lowGammaLbl)
                            .addComponent(lowAlphaLbl))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highGammaLbl)
                            .addComponent(highAlphaLbl)
                            .addComponent(relajacionLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ladoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(concentracionLbl)
                        .addGap(106, 106, 106)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Diadema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Diadema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Diadema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Diadema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Diadema interfaz = new Interfaz_Diadema();
                boolean condicion = false;
                while (!condicion) {
                    condicion = interfaz.crearConexion();
                }
                interfaz.setVisible(true);
                if (condicion == true) {
                    (new Thread(interfaz)).start();
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel concentracionLbl;
    private javax.swing.JLabel deltaLbl;
    private javax.swing.JLabel highAlphaLbl;
    private javax.swing.JLabel highBetaLbl;
    private javax.swing.JLabel highGammaLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ladoLbl;
    private javax.swing.JLabel lowAlphaLbl;
    private javax.swing.JLabel lowBetaLbl;
    private javax.swing.JLabel lowGammaLbl;
    private javax.swing.JLabel puntoEsperaLbl;
    private javax.swing.JLabel relajacionLbl;
    private javax.swing.JLabel thetaLbl;
    // End of variables declaration//GEN-END:variables

    public boolean crearConexion() {
        clienteTCP = new ClienteTCP();
        clienteTCP.connect();
        if (clienteTCP.isConnected() == true) {
            return true;
        } else {
            return false;
        }
    }

    public void recibirDatos() throws InterruptedException {
        ArrayList<EegSignals> listaEeg = new ArrayList<EegSignals>();
        EegControl eegControl = new EegControl();
        int contador = 0;
        int contadorFinal = 0;
        String lado = "derecho";
        for (int k = 10; k > 0; k--) {
            if (k > 4) {
                puntoEsperaLbl.setText("Espera!!!!");
            } else {
                puntoEsperaLbl.setText(".");
            }
            ladoLbl.setText("Piensa en mover el punto al lado: "
                    + lado + " en " + k);
            Thread.sleep(1500);
        }
        try {
            while (clienteTCP.isDataAvailable()) {

                ladoLbl.setText("Piensa en mover la laptop al lado: " + lado + " Ya:");
                EegSignals eeg = new EegSignals();
                String clientData = clienteTCP.getData();
                JSONObject json = new JSONObject(clientData);
                if (!json.isNull("eegPower")) {
                    if (!json.isNull("eSense")) {
                        JSONObject esense = json.getJSONObject("eSense");
                        concentracionLbl.setText("Concentracion: " + Integer.toString(esense.getInt("attention")));
                        relajacionLbl.setText("Meditacion: " + Integer.toString(esense.getInt("meditation")));
                    } else {
                        System.out.println("No entro");
                    }
                    if (!json.isNull("eegPower")) {
                        JSONObject eegPower = json.getJSONObject("eegPower");

                        deltaLbl.setText("Delta: " + Integer.toString(eegPower.getInt("delta")));
                        thetaLbl.setText("Theta: " + Integer.toString(eegPower.getInt("theta")));
                        lowAlphaLbl.setText("LowAlpha: " + Integer.toString(eegPower.getInt("lowAlpha")));
                        highAlphaLbl.setText("High Alpha: " + Integer.toString(eegPower.getInt("highAlpha")));
                        lowBetaLbl.setText("Low Beta: " + Integer.toString(eegPower.getInt("lowBeta")));
                        highBetaLbl.setText("High Beta: " + Integer.toString(eegPower.getInt("highBeta")));
                        lowGammaLbl.setText("Low Gamma: " + Integer.toString(eegPower.getInt("lowGamma")));
                        highGammaLbl.setText("High Gamma: " + Integer.toString(eegPower.getInt("highGamma")));

                        eeg.setNombrePersona(personaAEvaluar);
                        eeg.setDelta(eegPower.getInt("delta"));
                        eeg.setTheta(eegPower.getInt("theta"));
                        eeg.setLowAlpha(eegPower.getInt("lowAlpha"));
                        eeg.setHighAlpha(eegPower.getInt("highAlpha"));
                        eeg.setLowBeta(eegPower.getInt("lowBeta"));
                        eeg.setHighBeta(eegPower.getInt("highBeta"));
                        eeg.setLowGamma(eegPower.getInt("lowGamma"));
                        eeg.setHighGamma(eegPower.getInt("highGamma"));
                        eeg.setLado(lado);
                        listaEeg.add(eeg);
                        contador++;
                        if (contador == 15) {
                            eegControl.Registrar(listaEeg);
                            contador = 0;
                            contadorFinal++;
                            listaEeg = null;
                            listaEeg = new ArrayList<EegSignals>();
                            if (lado.equals("derecho")) {
                                lado = "izquierdo";
                            } else {
                                lado = "derecho";
                            }
                            if (contadorFinal < 10) {
                                for (int k = 10; k > 0; k--) {
                                    if (k > 4) {
                                        puntoEsperaLbl.setText("Espera!!!!");
                                    } else {
                                        puntoEsperaLbl.setText(".");
                                    }
                                    ladoLbl.setText("Piensa en mover el punto al lado: "
                                            + lado + " en " + k);
                                    Thread.sleep(1500);
                                }
                            }
                        }
                        if (contadorFinal == 10) {
                            JOptionPane.showMessageDialog(this, "Gracias por tu ayuda, contigo haremos un futuro mejor");
                            this.dispose();
                            System.exit(0);
                        }
                    } else {
                        ladoLbl.setText("Espera unos minutos :)");
                    }
                } else {
                    ladoLbl.setText("Espera unos minutos :)");
                    System.out.println("No entro");
                }
            }
        } catch (JSONException e1) {
            System.out.println(e1);
        }
    }

    public void run() {
        try {
            recibirDatos();
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz_Diadema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
