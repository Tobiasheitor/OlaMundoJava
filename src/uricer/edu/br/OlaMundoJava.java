/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uricer.edu.br;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class OlaMundoJava extends javax.swing.JFrame {

    /**
     * Creates new form OlaMundoJava
     */
    public OlaMundoJava() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jTextEntrada = new javax.swing.JTextField();
        jBotao = new javax.swing.JButton();
        textArea = new java.awt.TextArea();
        jFormattedText = new javax.swing.JFormattedTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSlider1 = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        senhaText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setName(""); // NOI18N
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(153, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblTitulo.setText("VERIFICA MEMBROS DA TURMA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 322, 53));

        jTextEntrada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 59, 250, 30));

        jBotao.setBackground(new java.awt.Color(222, 19, 110));
        jBotao.setText("Clique-me para Verificar");
        jBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(jBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 30));
        jPanel1.add(textArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 720, -1));

        jFormattedText.setText("jFormatted");
        jFormattedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 560, 10));

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 170, 60));
        jPanel1.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Digite a Senha para conseguir os Previlégios");

        senhaText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senhaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 270, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "GAY");
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTextEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEntradaActionPerformed

    private void jBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoActionPerformed
        // TODO add your handling code here:
        String entrada = new String();
        ArrayList<String> nomes = new ArrayList<String>();
        
        
        nomes.add("tobias");
        nomes.add("tiago");
        nomes.add("cassi");
        nomes.add("jonathan");
        nomes.add("daniel");
        nomes.add("gabriel");
        nomes.add("lucas");
        nomes.add("elias");
        nomes.add("jessica");
        nomes.add("fernando");
        nomes.add("matheus");
        
        
        entrada = jTextEntrada.getText();
        entrada = entrada.toLowerCase();
        jTextEntrada.setText(null);
        textArea.setText(null);
        
        
        if(nomes.contains(entrada)){
            textArea.setText("CONTEM ESTE ALUNO");
        }else{
            textArea.setText("NÃO ENCONTRADO");
        }
    }//GEN-LAST:event_jBotaoActionPerformed
    
    public boolean chekLogin(String senha){
        
        if (senha.equals("564"))
            return true;
        else
        return false;
    }
    
    private void senhaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaTextKeyPressed
        // Ao pressionar a tecla enter0
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(chekLogin(senhaText.getText())){
                textArea.setText(null);
                textArea.setText("*********** WWWOOOWWWWW********\n *********PARABENS FODAO**********\n UEUEUEUEUUEUEUUUEUEUEUEUUEUEUEUUEUE");
            }else{
                textArea.setText(null);
                textArea.setText("VALEU A TENTATIVA!!");
            }
        }
        
    }//GEN-LAST:event_senhaTextKeyPressed

    private void jFormattedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextActionPerformed

    
    private void jBotaoMouseClicked(java.awt.event.MouseEvent evt){
   
        JOptionPane.showMessageDialog(null, "GAY");
    }
    
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
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotao;
    private javax.swing.JFormattedTextField jFormattedText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextEntrada;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField senhaText;
    private java.awt.TextArea textArea;
    // End of variables declaration//GEN-END:variables
}
