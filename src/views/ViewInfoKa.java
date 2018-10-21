
package views;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import silabario.IViewEventListener;


public class ViewInfoKa extends javax.swing.JFrame {

    private List<IViewEventListener> listaEvent3;
 
    public ViewInfoKa() {
        initComponents();
          this.setLocationRelativeTo(null);
         
        listaEvent3 = new ArrayList<>();
    }

     public void addEventListener(IViewEventListener listener){
        listaEvent3.add(listener);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 70, -1));

        jButtonBack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 102, 102));
        jButtonBack.setText("Volver al Menú");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Katakana\n\nEl katakana (片仮名 o カタカナ?) es uno de los dos silabarios empleados \nen la escritura japonesa, junto con el hiragana. Su invención se atribuye \nal monje Kūkai, o Kobo Daishi. También se suele usar el vocablo\n katakana para referirse a cualquiera de los caracteres de dicho \nsilabario. Cuando se alude al conjunto de silabarios hiragana y katakana\n se le conoce como kana. De los dos silabarios es el más reciente.\n\nSus caracteres no tienen valor conceptual alguno, sino únicamente \nfonético. Gráficamente son de forma angulosa y geométrica.\n\nア a\tイ i\tウ u\tエ e\tオ o\nカ ka\tキ ki\tク ku\tケ ke\tコ ko\nサ sa\tシ shi\tス su\tセ se\tソ so\nタ ta\tチ chi\tツ tsu\tテ te\tト to\nナ na\tニ ni\tヌ nu\tネ ne\tノ no\nハ ha\tヒ hi\tフ fu\tヘ he\tホ ho\nマ ma\tミ mi\tム mu\tメ me\tモ mo\nヤ ya\t\tユ yu\t\tヨ yo\nラ ra\tリ ri\tル ru\tレ re\tロ ro\nワ wa\tヰ wi\t\tヱ we\tヲ wo\n\t\t\t\tン n\nガ ga\tギ gi\tグ gu\tゲ ge\tゴ go\nザ za\tジ ji\tズ zu\tゼ ze\tゾ zo\nダ da\tヂ dji\tヅ dzu\tデ de\tド do\nバ ba\tビ bi\tブ bu\tベ be\tボ bo\nパ pa\tピ pi\tプ pu\tペ pe\tポ po\n\nキャ kya\t\tキュ kyu\t\tキョ kyo\nシャ sha\t\tシュ shu\t\tショ sho\nチャ cha\t\tチュ chu\t\tチョ cho\nニャ nya\t\tニュ nyu\t\tニョ nyo\nヒャ hya\t\tヒュ hyu\t\tヒョ hyo\nミャ mya\t\tミュ myu\t\tミョ myo\nリャ rya\t\tリュ ryu\t\tリョ ryo\nギャ gya\t\tギュ gyu\t\tギョ gyo\nジャ ja\t\tジュ ju\t\tジョ jo\nビャ bya\t\tビュ byu\t\tビョ byo\nピャ pya\t\tピュ pyu\t\tピョ pyo\n\nUsos\n\n- Escritura de palabras tomadas de otros idiomas (principalmente del \n  inglés, en tiempos recientes) así como en onomatopeyas.\n\n- Resaltar una palabra concreta. En este sentido equivale a nuestras \n  comillas o a la escritura cursiva.\n\n-Nombres de animales en textos científicos. En otros textos esos \nmismos nombres se escriben en kanji o en hiragana.\n\nRealmente los dos silabarios son equivalentes, aunque los usos de cada \nuno son distintos. En el alfabeto latino hay algo semejante en el uso de \nmayúsculas y minúsculas, en el sentido de que difieren las grafías y los\nusos.\n\nRef. Wikipedia");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/5imgJapan.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        for (int i = 0; i < listaEvent3.size(); i++) {

            IViewEventListener unEventoListen = listaEvent3.get(i);
            // Creamos un objeto Event con la informacion de lo que le sucedde
            // a la vista, por ejemplo. Se presiono un boton
            Event evento = new Event(evt, 0, evt);
            // El objeto event viaja hacia los que estan escuchando a la vista
            unEventoListen.listen(evento);
        }
    }//GEN-LAST:event_jButtonBackActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
