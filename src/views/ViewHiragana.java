
package views;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import silabario.IViewEventListener;


public class ViewHiragana extends javax.swing.JFrame {
    
    private List<IViewEventListener> listaEvent2;
    private String imagen;
    private JLabel[] silabas;
    private JButton[] botones;
    
    public ViewHiragana() {
        initComponents();
         this.setLocationRelativeTo(null);
         
        listaEvent2 = new ArrayList<>();
        
        imagen = "ahiragana.png";
        
        silabas = new JLabel[]{aHira,iHira,uHira,eHira,oHira,kaHira,kiHira,kuHira,keHira,koHira,saHira,shiHira,suHira,seHira,soHira,taHira,chiHira,tsuHira,teHira,toHira,
        naHira,niHira,nuHira,neHira,noHira,haHira,hiHira,fuHira,heHira,hoHira,maHira,miHira,muHira,meHira,moHira,yaHira,yuHira,yoHira,raHira,riHira,ruHira,reHira,roHira,
        waHira,woHira,nHira,gaHira,giHira,guHira,geHira,goHira,zaHira,jiHira,zuHira,zeHira,zoHira,daHira,djiHira,dzuHira,deHira,doHira,baHira,biHira,buHira,beHira,boHira,paHira,piHira,puHira,peHira,poHira,
        kyaHira,kyuHira,kyoHira,shaHira,shuHira,shoHira,chaHira,chuHira,choHira,nyaHira,nyuHira,nyoHira,hyaHira,hyuHira,hyoHira,myaHira,myuHira,myoHira,
        ryaHira,ryuHira,ryoHira,gyaHira,gyuHira,gyoHira,jaHira,juHira,joHira,byaHira,byuHira,byoHira,pyaHira,pyuHira,pyoHira,};
        
        botones = new JButton[]{jButtonOp1,jButtonOp2,jButtonOp3,jButtonOp4,jButtonOp5,jButtonOp6};
            
        
    }

     public void addEventListener(IViewEventListener listener){
        listaEvent2.add(listener);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jLabelPracticaTitulo = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jButtonOp1 = new javax.swing.JButton();
        jButtonOp2 = new javax.swing.JButton();
        jButtonOp3 = new javax.swing.JButton();
        jButtonOp4 = new javax.swing.JButton();
        jButtonOp5 = new javax.swing.JButton();
        jButtonOp6 = new javax.swing.JButton();
        jComboBoxNivel = new javax.swing.JComboBox<>();
        jComboBoxCantidad = new javax.swing.JComboBox<>();
        jLabelPreguntas = new javax.swing.JLabel();
        jLabelNivelTex = new javax.swing.JLabel();
        jButtonPlay = new javax.swing.JButton();
        jLabelPuntaje = new javax.swing.JLabel();
        jLabelBien = new javax.swing.JLabel();
        jLabelMal = new javax.swing.JLabel();
        jLabelBienMal = new javax.swing.JLabel();
        aHira = new javax.swing.JLabel();
        iHira = new javax.swing.JLabel();
        uHira = new javax.swing.JLabel();
        eHira = new javax.swing.JLabel();
        oHira = new javax.swing.JLabel();
        kaHira = new javax.swing.JLabel();
        kiHira = new javax.swing.JLabel();
        kuHira = new javax.swing.JLabel();
        keHira = new javax.swing.JLabel();
        koHira = new javax.swing.JLabel();
        saHira = new javax.swing.JLabel();
        shiHira = new javax.swing.JLabel();
        suHira = new javax.swing.JLabel();
        seHira = new javax.swing.JLabel();
        soHira = new javax.swing.JLabel();
        taHira = new javax.swing.JLabel();
        chiHira = new javax.swing.JLabel();
        tsuHira = new javax.swing.JLabel();
        teHira = new javax.swing.JLabel();
        toHira = new javax.swing.JLabel();
        naHira = new javax.swing.JLabel();
        niHira = new javax.swing.JLabel();
        nuHira = new javax.swing.JLabel();
        neHira = new javax.swing.JLabel();
        noHira = new javax.swing.JLabel();
        haHira = new javax.swing.JLabel();
        hiHira = new javax.swing.JLabel();
        fuHira = new javax.swing.JLabel();
        heHira = new javax.swing.JLabel();
        hoHira = new javax.swing.JLabel();
        maHira = new javax.swing.JLabel();
        miHira = new javax.swing.JLabel();
        muHira = new javax.swing.JLabel();
        meHira = new javax.swing.JLabel();
        moHira = new javax.swing.JLabel();
        yaHira = new javax.swing.JLabel();
        yuHira = new javax.swing.JLabel();
        yoHira = new javax.swing.JLabel();
        raHira = new javax.swing.JLabel();
        riHira = new javax.swing.JLabel();
        ruHira = new javax.swing.JLabel();
        reHira = new javax.swing.JLabel();
        roHira = new javax.swing.JLabel();
        waHira = new javax.swing.JLabel();
        woHira = new javax.swing.JLabel();
        nHira = new javax.swing.JLabel();
        gaHira = new javax.swing.JLabel();
        giHira = new javax.swing.JLabel();
        guHira = new javax.swing.JLabel();
        geHira = new javax.swing.JLabel();
        goHira = new javax.swing.JLabel();
        zaHira = new javax.swing.JLabel();
        jiHira = new javax.swing.JLabel();
        zuHira = new javax.swing.JLabel();
        zeHira = new javax.swing.JLabel();
        zoHira = new javax.swing.JLabel();
        daHira = new javax.swing.JLabel();
        djiHira = new javax.swing.JLabel();
        dzuHira = new javax.swing.JLabel();
        deHira = new javax.swing.JLabel();
        doHira = new javax.swing.JLabel();
        baHira = new javax.swing.JLabel();
        biHira = new javax.swing.JLabel();
        buHira = new javax.swing.JLabel();
        beHira = new javax.swing.JLabel();
        boHira = new javax.swing.JLabel();
        paHira = new javax.swing.JLabel();
        piHira = new javax.swing.JLabel();
        puHira = new javax.swing.JLabel();
        peHira = new javax.swing.JLabel();
        poHira = new javax.swing.JLabel();
        kyaHira = new javax.swing.JLabel();
        kyuHira = new javax.swing.JLabel();
        kyoHira = new javax.swing.JLabel();
        shaHira = new javax.swing.JLabel();
        shuHira = new javax.swing.JLabel();
        shoHira = new javax.swing.JLabel();
        chaHira = new javax.swing.JLabel();
        chuHira = new javax.swing.JLabel();
        choHira = new javax.swing.JLabel();
        nyaHira = new javax.swing.JLabel();
        nyuHira = new javax.swing.JLabel();
        nyoHira = new javax.swing.JLabel();
        hyaHira = new javax.swing.JLabel();
        hyuHira = new javax.swing.JLabel();
        hyoHira = new javax.swing.JLabel();
        myaHira = new javax.swing.JLabel();
        myuHira = new javax.swing.JLabel();
        myoHira = new javax.swing.JLabel();
        ryaHira = new javax.swing.JLabel();
        ryuHira = new javax.swing.JLabel();
        ryoHira = new javax.swing.JLabel();
        gyaHira = new javax.swing.JLabel();
        gyuHira = new javax.swing.JLabel();
        gyoHira = new javax.swing.JLabel();
        jaHira = new javax.swing.JLabel();
        juHira = new javax.swing.JLabel();
        joHira = new javax.swing.JLabel();
        djaHira = new javax.swing.JLabel();
        djuHira = new javax.swing.JLabel();
        djoHira = new javax.swing.JLabel();
        byaHira = new javax.swing.JLabel();
        byuHira = new javax.swing.JLabel();
        byoHira = new javax.swing.JLabel();
        pyaHira = new javax.swing.JLabel();
        pyuHira = new javax.swing.JLabel();
        pyoHira = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 102, 102));
        jButtonBack.setText("Volver al Menú");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabelPracticaTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabelPracticaTitulo.setForeground(new java.awt.Color(0, 51, 153));
        jLabelPracticaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPracticaTitulo.setText("PRÁCTICA");
        getContentPane().add(jLabelPracticaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, -1));

        jButtonSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 70, -1));

        jLabelNombre.setFont(new java.awt.Font("Carlito", 1, 36)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 40));

        jButtonOp1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp1.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 80, 35));
        jButtonOp1.setVisible(false);

        jButtonOp2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp2.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, 35));
        jButtonOp2.setVisible(false);

        jButtonOp3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp3.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 80, 35));
        jButtonOp3.setVisible(false);

        jButtonOp4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp4.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 80, 35));
        jButtonOp4.setVisible(false);

        jButtonOp5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp5.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 80, 35));
        jButtonOp5.setVisible(false);

        jButtonOp6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOp6.setForeground(new java.awt.Color(102, 0, 102));
        jButtonOp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 80, 35));
        jButtonOp6.setVisible(false);

        jComboBoxNivel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jComboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 Símbolos", "25 Símbolos", "35 Simbolos", "46 Símbolos", "71 Símbolos", "104 Simbolos" }));
        getContentPane().add(jComboBoxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 20));
        jComboBoxNivel.setVisible(false);

        jComboBoxCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jComboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "30", "50", "80", "100" }));
        jComboBoxCantidad.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jComboBoxCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 20));
        jComboBoxCantidad.setVisible(false);

        jLabelPreguntas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelPreguntas.setText("Preguntas");
        getContentPane().add(jLabelPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jLabelPreguntas.setVisible(false);

        jLabelNivelTex.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelNivelTex.setText("Nivel");
        getContentPane().add(jLabelNivelTex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jLabelNivelTex.setVisible(false);

        jButtonPlay.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(204, 0, 0));
        jButtonPlay.setText("JUGAR");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, 50));
        jButtonPlay.setVisible(false);

        jLabelPuntaje.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPuntaje.setText("hola");
        getContentPane().add(jLabelPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 130, 30));
        jLabelPuntaje.setVisible(false);

        jLabelBien.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelBien.setForeground(new java.awt.Color(0, 153, 51));
        jLabelBien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelBien.setText("bien");
        getContentPane().add(jLabelBien, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, 35));
        jLabelBien.setVisible(false);

        jLabelMal.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelMal.setForeground(new java.awt.Color(153, 0, 0));
        jLabelMal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMal.setText("mal");
        getContentPane().add(jLabelMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 70, 35));
        jLabelMal.setVisible(false);

        jLabelBienMal.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelBienMal.setForeground(new java.awt.Color(0, 102, 153));
        jLabelBienMal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelBienMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, 30));

        aHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ahiragana.png"))); // NOI18N
        aHira.setText(" ");
        aHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(aHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        iHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ihiragana.png"))); // NOI18N
        iHira.setText(" ");
        iHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(iHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        uHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/uhiragana.png"))); // NOI18N
        uHira.setText(" ");
        uHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(uHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        eHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ehiragana.png"))); // NOI18N
        eHira.setText(" ");
        eHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(eHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        oHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ohiragana.png"))); // NOI18N
        oHira.setText(" ");
        oHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(oHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ka hiragana.png"))); // NOI18N
        kaHira.setText(" ");
        kaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kihiragana.png"))); // NOI18N
        kiHira.setText(" ");
        kiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kuhiragana.png"))); // NOI18N
        kuHira.setText(" ");
        kuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        keHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kehiragana.png"))); // NOI18N
        keHira.setText(" ");
        keHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(keHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        koHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        koHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kohiragana.png"))); // NOI18N
        koHira.setText(" ");
        koHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(koHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        saHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/sahiragana.png"))); // NOI18N
        saHira.setText(" ");
        saHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(saHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/shihiragana.png"))); // NOI18N
        shiHira.setText(" ");
        shiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        suHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/suhiragana.png"))); // NOI18N
        suHira.setText(" ");
        suHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(suHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        seHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/sehiragana.png"))); // NOI18N
        seHira.setText(" ");
        seHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(seHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        soHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/sohiragana.png"))); // NOI18N
        soHira.setText(" ");
        soHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(soHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        taHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/tahiragana.png"))); // NOI18N
        taHira.setText(" ");
        taHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(taHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/chihiragana.png"))); // NOI18N
        chiHira.setText(" ");
        chiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        tsuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tsuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/tsuhiragana.png"))); // NOI18N
        tsuHira.setText(" ");
        tsuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(tsuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        teHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/tehiragana.png"))); // NOI18N
        teHira.setText(" ");
        teHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(teHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        toHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/tohiragana.png"))); // NOI18N
        toHira.setText(" ");
        toHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(toHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        naHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nahiragana.png"))); // NOI18N
        naHira.setText(" ");
        naHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(naHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        niHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        niHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nihiragna.png"))); // NOI18N
        niHira.setText(" ");
        niHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(niHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nuhiragana.png"))); // NOI18N
        nuHira.setText(" ");
        nuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        neHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nehiragana.png"))); // NOI18N
        neHira.setText(" ");
        neHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(neHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        noHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nohiragana.png"))); // NOI18N
        noHira.setText(" ");
        noHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(noHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        noHira.setVisible(false);

        haHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        haHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hahiragana.png"))); // NOI18N
        haHira.setText(" ");
        haHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(haHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        haHira.setVisible(false);

        hiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hihiragana.png"))); // NOI18N
        hiHira.setText(" ");
        hiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        hiHira.setVisible(false);

        fuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/fuhiragana.png"))); // NOI18N
        fuHira.setText(" ");
        fuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(fuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        fuHira.setVisible(false);

        heHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hehiragana.png"))); // NOI18N
        heHira.setText(" ");
        heHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(heHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hohiragana.png"))); // NOI18N
        hoHira.setText(" ");
        hoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        maHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/mahiragana.png"))); // NOI18N
        maHira.setText(" ");
        maHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(maHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        miHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/mihiragana.png"))); // NOI18N
        miHira.setText(" ");
        miHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(miHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        muHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/muhiragana.png"))); // NOI18N
        muHira.setText(" ");
        muHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(muHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        meHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/mehiragana.png"))); // NOI18N
        meHira.setText(" ");
        meHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(meHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        moHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/mohiragana.png"))); // NOI18N
        moHira.setText(" ");
        moHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(moHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/yahiragana.png"))); // NOI18N
        yaHira.setText(" ");
        yaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/yuhiragana.png"))); // NOI18N
        yuHira.setText(" ");
        yuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/yohiragana.png"))); // NOI18N
        yoHira.setText(" ");
        yoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        raHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/rahiragana.png"))); // NOI18N
        raHira.setText(" ");
        raHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(raHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        riHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/rihiragana.png"))); // NOI18N
        riHira.setText(" ");
        riHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(riHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ruHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ruHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ruhiragana.png"))); // NOI18N
        ruHira.setText(" ");
        ruHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ruHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        reHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/rehiragana.png"))); // NOI18N
        reHira.setText(" ");
        reHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(reHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        roHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/rohiragana.png"))); // NOI18N
        roHira.setText(" ");
        roHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(roHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        waHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/wahiragana.png"))); // NOI18N
        waHira.setText(" ");
        waHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(waHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        woHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        woHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/wohiragana.png"))); // NOI18N
        woHira.setText(" ");
        woHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(woHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nhiragana.png"))); // NOI18N
        nHira.setText(" ");
        nHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gahiragana.png"))); // NOI18N
        gaHira.setText(" ");
        gaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        giHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gihiragana.png"))); // NOI18N
        giHira.setText(" ");
        giHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(giHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        guHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/guhiragana.png"))); // NOI18N
        guHira.setText(" ");
        guHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(guHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        geHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gehiragana.png"))); // NOI18N
        geHira.setText(" ");
        geHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(geHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        goHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gohiragana.png"))); // NOI18N
        goHira.setText(" ");
        goHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(goHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/zahiragana.png"))); // NOI18N
        zaHira.setText(" ");
        zaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/jihiragana.png"))); // NOI18N
        jiHira.setText(" ");
        jiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/zuhiragana.png"))); // NOI18N
        zuHira.setText(" ");
        zuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zeHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zeHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/zehiragana.png"))); // NOI18N
        zeHira.setText(" ");
        zeHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zeHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/zohiragana.png"))); // NOI18N
        zoHira.setText(" ");
        zoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        daHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/dahiragana.png"))); // NOI18N
        daHira.setText(" ");
        daHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(daHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        djiHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djiHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/djihiragana.png"))); // NOI18N
        djiHira.setText(" ");
        djiHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djiHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        dzuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dzuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/dzuhiragana.png"))); // NOI18N
        dzuHira.setText(" ");
        dzuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(dzuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        deHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/dehiragana.png"))); // NOI18N
        deHira.setText(" ");
        deHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(deHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        doHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/dohiragana.png"))); // NOI18N
        doHira.setText(" ");
        doHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(doHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        baHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/bahiragana.png"))); // NOI18N
        baHira.setText(" ");
        baHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(baHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        biHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/bihiragana.png"))); // NOI18N
        biHira.setText(" ");
        biHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(biHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        buHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/buhiragana.png"))); // NOI18N
        buHira.setText(" ");
        buHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(buHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        beHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/behiragana.png"))); // NOI18N
        beHira.setText(" ");
        beHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(beHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        boHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/bohiragana.png"))); // NOI18N
        boHira.setText(" ");
        boHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(boHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        paHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pahiragana.png"))); // NOI18N
        paHira.setText(" ");
        paHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(paHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        piHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        piHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pihiragana.png"))); // NOI18N
        piHira.setText(" ");
        piHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(piHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        puHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/puhiragana.png"))); // NOI18N
        puHira.setText(" ");
        puHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(puHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        peHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pehiragana.png"))); // NOI18N
        peHira.setText(" ");
        peHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(peHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        poHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pohiragana.png"))); // NOI18N
        poHira.setText(" ");
        poHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(poHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kyahiragana.png"))); // NOI18N
        kyaHira.setText(" ");
        kyaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kyuhiragana.png"))); // NOI18N
        kyuHira.setText(" ");
        kyuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/kyohiragana.png"))); // NOI18N
        kyoHira.setText(" ");
        kyoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/shahiragana.png"))); // NOI18N
        shaHira.setText(" ");
        shaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/shuhiragana.png"))); // NOI18N
        shuHira.setText(" ");
        shuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/shohiragana.png"))); // NOI18N
        shoHira.setText(" ");
        shoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/chahiragana.png"))); // NOI18N
        chaHira.setText(" ");
        chaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/chuhiragana.png"))); // NOI18N
        chuHira.setText(" ");
        chuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        choHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/chohiragana.png"))); // NOI18N
        choHira.setText(" ");
        choHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(choHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nyahiragana.png"))); // NOI18N
        nyaHira.setText(" ");
        nyaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nyuhiragana.png"))); // NOI18N
        nyuHira.setText(" ");
        nyuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/nyohiragana.png"))); // NOI18N
        nyoHira.setText(" ");
        nyoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hyahiragana.png"))); // NOI18N
        hyaHira.setText(" ");
        hyaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hyuhiragana.png"))); // NOI18N
        hyuHira.setText(" ");
        hyuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/hyohiragana.png"))); // NOI18N
        hyoHira.setText(" ");
        hyoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/myahiragana.png"))); // NOI18N
        myaHira.setText(" ");
        myaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/myuhiragana.png"))); // NOI18N
        myuHira.setText(" ");
        myuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/myohiragana.png"))); // NOI18N
        myoHira.setText(" ");
        myoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ryahiragana.png"))); // NOI18N
        ryaHira.setText(" ");
        ryaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ryuhiragana.png"))); // NOI18N
        ryuHira.setText(" ");
        ryuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/ryohiragana.png"))); // NOI18N
        ryoHira.setText(" ");
        ryoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gyahiragana.png"))); // NOI18N
        gyaHira.setText(" ");
        gyaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gyuhiragana.png"))); // NOI18N
        gyuHira.setText(" ");
        gyuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/gyohiragana.png"))); // NOI18N
        gyoHira.setText(" ");
        gyoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/jahiragana.png"))); // NOI18N
        jaHira.setText(" ");
        jaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        juHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/juhiragana.png"))); // NOI18N
        juHira.setText(" ");
        juHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(juHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        joHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        joHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/johiragana.png"))); // NOI18N
        joHira.setText(" ");
        joHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(joHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        djaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/djahiragana.png"))); // NOI18N
        djaHira.setText(" ");
        djaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djaHira.setVisible(false);

        djuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/djuhiragana.png"))); // NOI18N
        djuHira.setText(" ");
        djuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djuHira.setVisible(false);

        djoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/djohiragana.png"))); // NOI18N
        djoHira.setText(" ");
        djoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djoHira.setVisible(false);

        byaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/byahiragana.png"))); // NOI18N
        byaHira.setText(" ");
        byaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        byuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/byuhiragana.png"))); // NOI18N
        byuHira.setText(" ");
        byuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        byoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/byohiragana.png"))); // NOI18N
        byoHira.setText(" ");
        byoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyaHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyaHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pyahiragana.png"))); // NOI18N
        pyaHira.setText(" ");
        pyaHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyaHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyuHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyuHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pyuhiragana.png"))); // NOI18N
        pyuHira.setText(" ");
        pyuHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyuHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyoHira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyoHira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/pyohiragana.png"))); // NOI18N
        pyoHira.setText(" ");
        pyoHira.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyoHira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/1templo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
         for (int i = 0; i < listaEvent2.size(); i++) {
            
            IViewEventListener unEventoListen = listaEvent2.get(i);
             // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event evento = new Event(evt, 0, evt);
             // El objeto event viaja hacia los que estan escuchando a la vista
            unEventoListen.listen(evento);
           }
    }//GEN-LAST:event_jButtonBackActionPerformed

    public JButton[] getBotones() {
        return botones;
    }

    public void setBotones(JButton[] botones) {
        this.botones = botones;
    }
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public JLabel getaHira() {
        return aHira;
    }

    public void setaHira(JLabel aHira) {
        this.aHira = aHira;
    }

    public JLabel getBaHira() {
        return baHira;
    }

    public void setBaHira(JLabel baHira) {
        this.baHira = baHira;
    }

    public JLabel getBeHIra() {
        return beHira;
    }

    public void setBeHIra(JLabel beHIra) {
        this.beHira = beHIra;
    }

    public JLabel getBiHira() {
        return biHira;
    }

    public void setBiHira(JLabel biHira) {
        this.biHira = biHira;
    }

    public JLabel getBoHira() {
        return boHira;
    }

    public void setBoHira(JLabel boHira) {
        this.boHira = boHira;
    }

    public JLabel getBuHira() {
        return buHira;
    }

    public void setBuHira(JLabel buHira) {
        this.buHira = buHira;
    }

    public JLabel getByaHira() {
        return byaHira;
    }

    public void setByaHira(JLabel byaHira) {
        this.byaHira = byaHira;
    }

    public JLabel getByoHira() {
        return byoHira;
    }

    public void setByoHira(JLabel byoHira) {
        this.byoHira = byoHira;
    }

    public JLabel getByuHira() {
        return byuHira;
    }

    public void setByuHira(JLabel byuHira) {
        this.byuHira = byuHira;
    }

    public JLabel getChaHira() {
        return chaHira;
    }

    public void setChaHira(JLabel chaHira) {
        this.chaHira = chaHira;
    }

    public JLabel getChiHira() {
        return chiHira;
    }

    public void setChiHira(JLabel chiHira) {
        this.chiHira = chiHira;
    }

    public JLabel getChoHira() {
        return choHira;
    }

    public void setChoHira(JLabel choHira) {
        this.choHira = choHira;
    }

    public JLabel getChuHira() {
        return chuHira;
    }

    public void setChuHira(JLabel chuHira) {
        this.chuHira = chuHira;
    }

    public JLabel getDaHira() {
        return daHira;
    }

    public void setDaHira(JLabel daHira) {
        this.daHira = daHira;
    }

    public JLabel getDeHira() {
        return deHira;
    }

    public void setDeHira(JLabel deHira) {
        this.deHira = deHira;
    }

    public JLabel getDjaHira() {
        return djaHira;
    }

    public void setDjaHira(JLabel djaHira) {
        this.djaHira = djaHira;
    }

    public JLabel getDjiHira() {
        return djiHira;
    }

    public void setDjiHira(JLabel djiHira) {
        this.djiHira = djiHira;
    }

    public JLabel getDjoHira() {
        return djoHira;
    }

    public void setDjoHira(JLabel djoHira) {
        this.djoHira = djoHira;
    }

    public JLabel getDjuHira() {
        return djuHira;
    }

    public void setDjuHira(JLabel djuHira) {
        this.djuHira = djuHira;
    }

    public JLabel getDoHira() {
        return doHira;
    }

    public void setDoHira(JLabel doHira) {
        this.doHira = doHira;
    }

    public JLabel getDzuHira() {
        return dzuHira;
    }

    public void setDzuHira(JLabel dzuHira) {
        this.dzuHira = dzuHira;
    }

    public JLabel geteHira() {
        return eHira;
    }

    public void seteHira(JLabel eHira) {
        this.eHira = eHira;
    }

    public JLabel getFuHira() {
        return fuHira;
    }

    public void setFuHira(JLabel fuHira) {
        this.fuHira = fuHira;
    }

    public JLabel getGaHira() {
        return gaHira;
    }

    public void setGaHira(JLabel gaHira) {
        this.gaHira = gaHira;
    }

    public JLabel getGeHira() {
        return geHira;
    }

    public void setGeHira(JLabel geHira) {
        this.geHira = geHira;
    }

    public JLabel getGiHira() {
        return giHira;
    }

    public void setGiHira(JLabel giHira) {
        this.giHira = giHira;
    }

    public JLabel getGoHira() {
        return goHira;
    }

    public void setGoHira(JLabel goHira) {
        this.goHira = goHira;
    }

    public JLabel getGuHira() {
        return guHira;
    }

    public void setGuHira(JLabel guHira) {
        this.guHira = guHira;
    }

    public JLabel getGyaHira() {
        return gyaHira;
    }

    public void setGyaHira(JLabel gyaHira) {
        this.gyaHira = gyaHira;
    }

    public JLabel getGyoHira() {
        return gyoHira;
    }

    public void setGyoHira(JLabel gyoHira) {
        this.gyoHira = gyoHira;
    }

    public JLabel getGyuHira() {
        return gyuHira;
    }

    public void setGyuHira(JLabel gyuHira) {
        this.gyuHira = gyuHira;
    }

    public JLabel getHaHira() {
        return haHira;
    }

    public void setHaHira(JLabel haHira) {
        this.haHira = haHira;
    }

    public JLabel getHeHira() {
        return heHira;
    }

    public void setHeHira(JLabel heHira) {
        this.heHira = heHira;
    }

    public JLabel getHiHira() {
        return hiHira;
    }

    public void setHiHira(JLabel hiHira) {
        this.hiHira = hiHira;
    }

    public JLabel getHoHira() {
        return hoHira;
    }

    public void setHoHira(JLabel hoHira) {
        this.hoHira = hoHira;
    }

    public JLabel getHyaHira() {
        return hyaHira;
    }

    public void setHyaHira(JLabel hyaHira) {
        this.hyaHira = hyaHira;
    }

    public JLabel getHyoHira() {
        return hyoHira;
    }

    public void setHyoHira(JLabel hyoHira) {
        this.hyoHira = hyoHira;
    }

    public JLabel getHyuHira() {
        return hyuHira;
    }

    public void setHyuHira(JLabel hyuHira) {
        this.hyuHira = hyuHira;
    }

    public JLabel getiHira() {
        return iHira;
    }

    public void setiHira(JLabel iHira) {
        this.iHira = iHira;
    }

    public JButton getjButtonBack() {
        return jButtonBack;
    }

    public void setjButtonBack(JButton jButtonBack) {
        this.jButtonBack = jButtonBack;
    }

    public JButton getjButtonOp1() {
        return jButtonOp1;
    }

    public void setjButtonOp1(JButton jButtonOp1) {
        this.jButtonOp1 = jButtonOp1;
    }

    public JButton getjButtonOp2() {
        return jButtonOp2;
    }

    public void setjButtonOp2(JButton jButtonOp2) {
        this.jButtonOp2 = jButtonOp2;
    }

    public JButton getjButtonOp3() {
        return jButtonOp3;
    }

    public void setjButtonOp3(JButton jButtonOp3) {
        this.jButtonOp3 = jButtonOp3;
    }

    public JButton getjButtonOp4() {
        return jButtonOp4;
    }

    public void setjButtonOp4(JButton jButtonOp4) {
        this.jButtonOp4 = jButtonOp4;
    }

    public JButton getjButtonOp5() {
        return jButtonOp5;
    }

    public void setjButtonOp5(JButton jButtonOp5) {
        this.jButtonOp5 = jButtonOp5;
    }

    public JButton getjButtonOp6() {
        return jButtonOp6;
    }

    public void setjButtonOp6(JButton jButtonOp6) {
        this.jButtonOp6 = jButtonOp6;
    }

    public JButton getjButtonPlay() {
        return jButtonPlay;
    }

    public void setjButtonPlay(JButton jButtonPlay) {
        this.jButtonPlay = jButtonPlay;
    }

    public JButton getjButtonSalir() {
        return jButtonSalir;
    }

    public void setjButtonSalir(JButton jButtonSalir) {
        this.jButtonSalir = jButtonSalir;
    }

    public JComboBox<String> getjComboBoxCantidad() {
        return jComboBoxCantidad;
    }

    public void setjComboBoxCantidad(JComboBox<String> jComboBoxCantidad) {
        this.jComboBoxCantidad = jComboBoxCantidad;
    }

    public JComboBox<String> getjComboBoxNivel() {
        return jComboBoxNivel;
    }

    public void setjComboBoxNivel(JComboBox<String> jComboBoxNivel) {
        this.jComboBoxNivel = jComboBoxNivel;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabelBien() {
        return jLabelBien;
    }

    public void setjLabelBien(JLabel jLabelBien) {
        this.jLabelBien = jLabelBien;
    }

    public JLabel getjLabelBienMal() {
        return jLabelBienMal;
    }

    public void setjLabelBienMal(JLabel jLabelBienMal) {
        this.jLabelBienMal = jLabelBienMal;
    }

    public JLabel getjLabelMal() {
        return jLabelMal;
    }

    public void setjLabelMal(JLabel jLabelMal) {
        this.jLabelMal = jLabelMal;
    }

    public JLabel getjLabelNivelTex() {
        return jLabelNivelTex;
    }

    public void setjLabelNivelTex(JLabel jLabelNivelTex) {
        this.jLabelNivelTex = jLabelNivelTex;
    }

    public JLabel getjLabelNombre() {
        return jLabelNombre;
    }

    public void setjLabelNombre(JLabel jLabelNombre) {
        this.jLabelNombre = jLabelNombre;
    }

    public JLabel getjLabelPracticaTitulo() {
        return jLabelPracticaTitulo;
    }

    public void setjLabelPracticaTitulo(JLabel jLabelPracticaTitulo) {
        this.jLabelPracticaTitulo = jLabelPracticaTitulo;
    }

    public JLabel getjLabelPreguntas() {
        return jLabelPreguntas;
    }

    public void setjLabelPreguntas(JLabel jLabelPreguntas) {
        this.jLabelPreguntas = jLabelPreguntas;
    }

    public JLabel getjLabelPuntaje() {
        return jLabelPuntaje;
    }

    public void setjLabelPuntaje(JLabel jLabelPuntaje) {
        this.jLabelPuntaje = jLabelPuntaje;
    }

    public JLabel getJaHira() {
        return jaHira;
    }

    public void setJaHira(JLabel jaHira) {
        this.jaHira = jaHira;
    }

    public JLabel getJiHira() {
        return jiHira;
    }

    public void setJiHira(JLabel jiHira) {
        this.jiHira = jiHira;
    }

    public JLabel getJoHira() {
        return joHira;
    }

    public void setJoHira(JLabel joHira) {
        this.joHira = joHira;
    }

    public JLabel getJuHira() {
        return juHira;
    }

    public void setJuHira(JLabel juHira) {
        this.juHira = juHira;
    }

    public JLabel getKahira() {
        return kaHira;
    }

    public void setKahira(JLabel kahira) {
        this.kaHira = kahira;
    }

    public JLabel getKeHira() {
        return keHira;
    }

    public void setKeHira(JLabel keHira) {
        this.keHira = keHira;
    }

    public JLabel getKiHira() {
        return kiHira;
    }

    public void setKiHira(JLabel kiHira) {
        this.kiHira = kiHira;
    }

    public JLabel getKoHira() {
        return koHira;
    }

    public void setKoHira(JLabel koHira) {
        this.koHira = koHira;
    }

    public JLabel getKuHira() {
        return kuHira;
    }

    public void setKuHira(JLabel kuHira) {
        this.kuHira = kuHira;
    }

    public JLabel getKyaHira() {
        return kyaHira;
    }

    public void setKyaHira(JLabel kyaHira) {
        this.kyaHira = kyaHira;
    }

    public JLabel getKyoHira() {
        return kyoHira;
    }

    public void setKyoHira(JLabel kyoHira) {
        this.kyoHira = kyoHira;
    }

    public JLabel getKyuHira() {
        return kyuHira;
    }

    public void setKyuHira(JLabel kyuHira) {
        this.kyuHira = kyuHira;
    }

    public JLabel getMaHira() {
        return maHira;
    }

    public void setMaHira(JLabel maHira) {
        this.maHira = maHira;
    }

    public JLabel getMeHira() {
        return meHira;
    }

    public void setMeHira(JLabel meHira) {
        this.meHira = meHira;
    }

    public JLabel getMiHira() {
        return miHira;
    }

    public void setMiHira(JLabel miHira) {
        this.miHira = miHira;
    }

    public JLabel getMoHira() {
        return moHira;
    }

    public void setMoHira(JLabel moHira) {
        this.moHira = moHira;
    }

    public JLabel getMuHira() {
        return muHira;
    }

    public void setMuHira(JLabel muHira) {
        this.muHira = muHira;
    }

    public JLabel getMyaHira() {
        return myaHira;
    }

    public void setMyaHira(JLabel myaHira) {
        this.myaHira = myaHira;
    }

    public JLabel getMyoHira() {
        return myoHira;
    }

    public void setMyoHira(JLabel myoHira) {
        this.myoHira = myoHira;
    }

    public JLabel getMyuHira() {
        return myuHira;
    }

    public void setMyuHira(JLabel myuHira) {
        this.myuHira = myuHira;
    }

    public JLabel getnHira() {
        return nHira;
    }

    public void setnHira(JLabel nHira) {
        this.nHira = nHira;
    }

    public JLabel getNaHira() {
        return naHira;
    }

    public void setNaHira(JLabel naHira) {
        this.naHira = naHira;
    }

    public JLabel getNeHira() {
        return neHira;
    }

    public void setNeHira(JLabel neHira) {
        this.neHira = neHira;
    }

    public JLabel getNiHira() {
        return niHira;
    }

    public void setNiHira(JLabel niHira) {
        this.niHira = niHira;
    }

    public JLabel getNoHira() {
        return noHira;
    }

    public void setNoHira(JLabel noHira) {
        this.noHira = noHira;
    }

    public JLabel getNuHira() {
        return nuHira;
    }

    public void setNuHira(JLabel nuHira) {
        this.nuHira = nuHira;
    }

    public JLabel getNyaHira() {
        return nyaHira;
    }

    public void setNyaHira(JLabel nyaHira) {
        this.nyaHira = nyaHira;
    }

    public JLabel getNyoHira() {
        return nyoHira;
    }

    public void setNyoHira(JLabel nyoHira) {
        this.nyoHira = nyoHira;
    }

    public JLabel getNyuHira() {
        return nyuHira;
    }

    public void setNyuHira(JLabel nyuHira) {
        this.nyuHira = nyuHira;
    }

    public JLabel getoHira() {
        return oHira;
    }

    public void setoHira(JLabel oHira) {
        this.oHira = oHira;
    }

    public JLabel getPaHira() {
        return paHira;
    }

    public void setPaHira(JLabel paHira) {
        this.paHira = paHira;
    }

    public JLabel getPeHira() {
        return peHira;
    }

    public void setPeHira(JLabel peHira) {
        this.peHira = peHira;
    }

    public JLabel getPiHira() {
        return piHira;
    }

    public void setPiHira(JLabel piHira) {
        this.piHira = piHira;
    }

    public JLabel getPoHira() {
        return poHira;
    }

    public void setPoHira(JLabel poHira) {
        this.poHira = poHira;
    }

    public JLabel getPuHira() {
        return puHira;
    }

    public void setPuHira(JLabel puHira) {
        this.puHira = puHira;
    }

    public JLabel getPyaHira() {
        return pyaHira;
    }

    public void setPyaHira(JLabel pyaHira) {
        this.pyaHira = pyaHira;
    }

    public JLabel getPyoHira() {
        return pyoHira;
    }

    public void setPyoHira(JLabel pyoHira) {
        this.pyoHira = pyoHira;
    }

    public JLabel getPyuHira() {
        return pyuHira;
    }

    public void setPyuHira(JLabel pyuHira) {
        this.pyuHira = pyuHira;
    }

    public JLabel getRaHira() {
        return raHira;
    }

    public void setRaHira(JLabel raHira) {
        this.raHira = raHira;
    }

    public JLabel getReHira() {
        return reHira;
    }

    public void setReHira(JLabel reHira) {
        this.reHira = reHira;
    }

    public JLabel getRiHira() {
        return riHira;
    }

    public void setRiHira(JLabel riHira) {
        this.riHira = riHira;
    }

    public JLabel getRoHira() {
        return roHira;
    }

    public void setRoHira(JLabel roHira) {
        this.roHira = roHira;
    }

    public JLabel getRuHira() {
        return ruHira;
    }

    public void setRuHira(JLabel ruHira) {
        this.ruHira = ruHira;
    }

    public JLabel getRyaHira() {
        return ryaHira;
    }

    public void setRyaHira(JLabel ryaHira) {
        this.ryaHira = ryaHira;
    }

    public JLabel getRyohira() {
        return ryoHira;
    }

    public void setRyohira(JLabel ryohira) {
        this.ryoHira = ryohira;
    }

    public JLabel getRyuHira() {
        return ryuHira;
    }

    public void setRyuHira(JLabel ryuHira) {
        this.ryuHira = ryuHira;
    }

    public JLabel getSaHira() {
        return saHira;
    }

    public void setSaHira(JLabel saHira) {
        this.saHira = saHira;
    }

    public JLabel getSeHira() {
        return seHira;
    }

    public void setSeHira(JLabel seHira) {
        this.seHira = seHira;
    }

    public JLabel getShaHira() {
        return shaHira;
    }

    public void setShaHira(JLabel shaHira) {
        this.shaHira = shaHira;
    }

    public JLabel getShiHira() {
        return shiHira;
    }

    public void setShiHira(JLabel shiHira) {
        this.shiHira = shiHira;
    }

    public JLabel getShoHira() {
        return shoHira;
    }

    public void setShoHira(JLabel shoHira) {
        this.shoHira = shoHira;
    }

    public JLabel getShuHira() {
        return shuHira;
    }

    public void setShuHira(JLabel shuHira) {
        this.shuHira = shuHira;
    }

    public JLabel getSoHira() {
        return soHira;
    }

    public void setSoHira(JLabel soHira) {
        this.soHira = soHira;
    }

    public JLabel getSuHira() {
        return suHira;
    }

    public void setSuHira(JLabel suHira) {
        this.suHira = suHira;
    }

    public JLabel getTaHira() {
        return taHira;
    }

    public void setTaHira(JLabel taHira) {
        this.taHira = taHira;
    }

    public JLabel getTeHira() {
        return teHira;
    }

    public void setTeHira(JLabel teHira) {
        this.teHira = teHira;
    }

    public JLabel getToHira() {
        return toHira;
    }

    public void setToHira(JLabel toHira) {
        this.toHira = toHira;
    }

    public JLabel getTsuHira() {
        return tsuHira;
    }

    public void setTsuHira(JLabel tsuHira) {
        this.tsuHira = tsuHira;
    }

    public JLabel getuHira() {
        return uHira;
    }

    public void setuHira(JLabel uHira) {
        this.uHira = uHira;
    }

    public JLabel getWaHira() {
        return waHira;
    }

    public void setWaHira(JLabel waHira) {
        this.waHira = waHira;
    }

    public JLabel getWoHira() {
        return woHira;
    }

    public void setWoHira(JLabel woHira) {
        this.woHira = woHira;
    }

    public JLabel getYaHira() {
        return yaHira;
    }

    public void setYaHira(JLabel yaHira) {
        this.yaHira = yaHira;
    }

    public JLabel getYoHira() {
        return yoHira;
    }

    public void setYoHira(JLabel yoHira) {
        this.yoHira = yoHira;
    }

    public JLabel getYuHira() {
        return yuHira;
    }

    public void setYuHira(JLabel yuHira) {
        this.yuHira = yuHira;
    }

    public JLabel getZaHira() {
        return zaHira;
    }

    public void setZaHira(JLabel zaHira) {
        this.zaHira = zaHira;
    }

    public JLabel getZeHira() {
        return zeHira;
    }

    public void setZeHira(JLabel zeHira) {
        this.zeHira = zeHira;
    }

    public JLabel getZoHira() {
        return zoHira;
    }

    public void setZoHira(JLabel zoHira) {
        this.zoHira = zoHira;
    }

    public JLabel getZuHira() {
        return zuHira;
    }

    public void setZuHira(JLabel zuHira) {
        this.zuHira = zuHira;
    }
    
    public void OcultarSilabas(){
        for (int i = 0; i < silabas.length; i++) {
            silabas[i].setVisible(false);
            //System.out.println("poniendo falce: "+i+silabas.length);
        }
        //Ponemos tambien en false otros elementos de la vista
        jButtonOp1.setVisible(false);
        jButtonOp2.setVisible(false);
        jButtonOp3.setVisible(false);
        jButtonOp4.setVisible(false);
        jButtonOp5.setVisible(false);
        jButtonOp6.setVisible(false);
        jLabelNombre.setVisible(false);
        jLabelBienMal.setVisible(false);
        jLabelBien.setVisible(false);
        jLabelMal.setVisible(false);
        jComboBoxCantidad.setVisible(false);
        jComboBoxNivel.setVisible(false);
        jLabelPuntaje.setVisible(false);
        jLabelPreguntas.setVisible(false);
        jLabelNivelTex.setVisible(false);
        
    }
    
    public void MostrarSimboloSilaba(int silaba){
        silabas[silaba].setVisible(true);
    }
    
    public void BorrarSilaba(int aborrar){
        silabas[aborrar].setVisible(false);
    }
    
    public void MostrarBoton(int numBoton, String elValorAPoner){
        botones[numBoton].setVisible(true);
        botones[numBoton].setText(elValorAPoner);
    }
                 
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aHira;
    private javax.swing.JLabel baHira;
    private javax.swing.JLabel beHira;
    private javax.swing.JLabel biHira;
    private javax.swing.JLabel boHira;
    private javax.swing.JLabel buHira;
    private javax.swing.JLabel byaHira;
    private javax.swing.JLabel byoHira;
    private javax.swing.JLabel byuHira;
    private javax.swing.JLabel chaHira;
    private javax.swing.JLabel chiHira;
    private javax.swing.JLabel choHira;
    private javax.swing.JLabel chuHira;
    private javax.swing.JLabel daHira;
    private javax.swing.JLabel deHira;
    private javax.swing.JLabel djaHira;
    private javax.swing.JLabel djiHira;
    private javax.swing.JLabel djoHira;
    private javax.swing.JLabel djuHira;
    private javax.swing.JLabel doHira;
    private javax.swing.JLabel dzuHira;
    private javax.swing.JLabel eHira;
    private javax.swing.JLabel fuHira;
    private javax.swing.JLabel gaHira;
    private javax.swing.JLabel geHira;
    private javax.swing.JLabel giHira;
    private javax.swing.JLabel goHira;
    private javax.swing.JLabel guHira;
    private javax.swing.JLabel gyaHira;
    private javax.swing.JLabel gyoHira;
    private javax.swing.JLabel gyuHira;
    private javax.swing.JLabel haHira;
    private javax.swing.JLabel heHira;
    private javax.swing.JLabel hiHira;
    private javax.swing.JLabel hoHira;
    private javax.swing.JLabel hyaHira;
    private javax.swing.JLabel hyoHira;
    private javax.swing.JLabel hyuHira;
    private javax.swing.JLabel iHira;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonOp1;
    private javax.swing.JButton jButtonOp2;
    private javax.swing.JButton jButtonOp3;
    private javax.swing.JButton jButtonOp4;
    private javax.swing.JButton jButtonOp5;
    private javax.swing.JButton jButtonOp6;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxCantidad;
    private javax.swing.JComboBox<String> jComboBoxNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBien;
    private javax.swing.JLabel jLabelBienMal;
    private javax.swing.JLabel jLabelMal;
    private javax.swing.JLabel jLabelNivelTex;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPracticaTitulo;
    private javax.swing.JLabel jLabelPreguntas;
    private javax.swing.JLabel jLabelPuntaje;
    private javax.swing.JLabel jaHira;
    private javax.swing.JLabel jiHira;
    private javax.swing.JLabel joHira;
    private javax.swing.JLabel juHira;
    private javax.swing.JLabel kaHira;
    private javax.swing.JLabel keHira;
    private javax.swing.JLabel kiHira;
    private javax.swing.JLabel koHira;
    private javax.swing.JLabel kuHira;
    private javax.swing.JLabel kyaHira;
    private javax.swing.JLabel kyoHira;
    private javax.swing.JLabel kyuHira;
    private javax.swing.JLabel maHira;
    private javax.swing.JLabel meHira;
    private javax.swing.JLabel miHira;
    private javax.swing.JLabel moHira;
    private javax.swing.JLabel muHira;
    private javax.swing.JLabel myaHira;
    private javax.swing.JLabel myoHira;
    private javax.swing.JLabel myuHira;
    private javax.swing.JLabel nHira;
    private javax.swing.JLabel naHira;
    private javax.swing.JLabel neHira;
    private javax.swing.JLabel niHira;
    private javax.swing.JLabel noHira;
    private javax.swing.JLabel nuHira;
    private javax.swing.JLabel nyaHira;
    private javax.swing.JLabel nyoHira;
    private javax.swing.JLabel nyuHira;
    private javax.swing.JLabel oHira;
    private javax.swing.JLabel paHira;
    private javax.swing.JLabel peHira;
    private javax.swing.JLabel piHira;
    private javax.swing.JLabel poHira;
    private javax.swing.JLabel puHira;
    private javax.swing.JLabel pyaHira;
    private javax.swing.JLabel pyoHira;
    private javax.swing.JLabel pyuHira;
    private javax.swing.JLabel raHira;
    private javax.swing.JLabel reHira;
    private javax.swing.JLabel riHira;
    private javax.swing.JLabel roHira;
    private javax.swing.JLabel ruHira;
    private javax.swing.JLabel ryaHira;
    private javax.swing.JLabel ryoHira;
    private javax.swing.JLabel ryuHira;
    private javax.swing.JLabel saHira;
    private javax.swing.JLabel seHira;
    private javax.swing.JLabel shaHira;
    private javax.swing.JLabel shiHira;
    private javax.swing.JLabel shoHira;
    private javax.swing.JLabel shuHira;
    private javax.swing.JLabel soHira;
    private javax.swing.JLabel suHira;
    private javax.swing.JLabel taHira;
    private javax.swing.JLabel teHira;
    private javax.swing.JLabel toHira;
    private javax.swing.JLabel tsuHira;
    private javax.swing.JLabel uHira;
    private javax.swing.JLabel waHira;
    private javax.swing.JLabel woHira;
    private javax.swing.JLabel yaHira;
    private javax.swing.JLabel yoHira;
    private javax.swing.JLabel yuHira;
    private javax.swing.JLabel zaHira;
    private javax.swing.JLabel zeHira;
    private javax.swing.JLabel zoHira;
    private javax.swing.JLabel zuHira;
    // End of variables declaration//GEN-END:variables
}
