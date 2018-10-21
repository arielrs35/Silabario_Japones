
package views;

import java.awt.Event;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import silabario.IViewEventListener;


public class View extends javax.swing.JFrame {

    private List<IViewEventListener> listaEvent;
  
    
    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaEvent = new ArrayList<>();
    }
    
    public void addEventListener(IViewEventListener listener){
        listaEvent.add(listener);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonHiragana = new javax.swing.JButton();
        jButtonPracticarH = new javax.swing.JButton();
        jButtonJugar = new javax.swing.JButton();
        jButtonKatakana = new javax.swing.JButton();
        jButtonPracticaK = new javax.swing.JButton();
        jButtonJugarK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Silabario Hiragana y Katakana");
        jLabelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, -1));

        jButtonSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 70, -1));

        jButtonHiragana.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonHiragana.setForeground(new java.awt.Color(51, 153, 255));
        jButtonHiragana.setText("Info Hiragana");
        jButtonHiragana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHiragana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 70));

        jButtonPracticarH.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonPracticarH.setForeground(new java.awt.Color(204, 0, 102));
        jButtonPracticarH.setText("Practicar Hiragana");
        jButtonPracticarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPracticarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 70));

        jButtonJugar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonJugar.setForeground(new java.awt.Color(255, 204, 0));
        jButtonJugar.setText("Jugar Hiragana");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 270, 70));

        jButtonKatakana.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonKatakana.setForeground(new java.awt.Color(51, 153, 255));
        jButtonKatakana.setText("Info Katakana");
        jButtonKatakana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKatakana, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 270, 70));

        jButtonPracticaK.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonPracticaK.setForeground(new java.awt.Color(204, 0, 102));
        jButtonPracticaK.setText("Practicar Katakana");
        jButtonPracticaK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPracticaK, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 270, 70));

        jButtonJugarK.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButtonJugarK.setForeground(new java.awt.Color(255, 204, 0));
        jButtonJugarK.setText("Jugar katakana");
        jButtonJugarK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHiraganaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugarK, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 270, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Versión v1.0.1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 110, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("decomprasenjapon.com");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/5imgJapan.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonHiraganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHiraganaActionPerformed
         for (int i = 0; i < listaEvent.size(); i++) {
            
            IViewEventListener unEventoListen = listaEvent.get(i);
             // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event evento = new Event(evt, 0, evt);
             // El objeto event viaja hacia los que estan escuchando a la vista
            unEventoListen.listen(evento);
           }
    }//GEN-LAST:event_jButtonHiraganaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String url="https://decomprasenjapon.com";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHiragana;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonJugarK;
    private javax.swing.JButton jButtonKatakana;
    private javax.swing.JButton jButtonPracticaK;
    private javax.swing.JButton jButtonPracticarH;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

 
}
