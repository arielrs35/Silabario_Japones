
package views;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import silabario.IViewEventListener;


public class ViewKatakana extends javax.swing.JFrame {
    
    private List<IViewEventListener> listaEvent3;
    private String imagen;
    private JLabel[] silabas;
    private JButton[] botones;
    
    public ViewKatakana() {
        initComponents();
         this.setLocationRelativeTo(null);
         
        listaEvent3 = new ArrayList<>();
        
        imagen = "ahiragana.png";
        
        silabas = new JLabel[]{aKata,iKata,uKata,eKata,oKata,kaKata,kiKata,kuKata,keKata,koKata,saKata,shiKata,suKata,seKata,soKata,taKata,chiKata,tsuKata,teKata,toKata,
        naKata,niKata,nuKata,neKata,noKata,haKata,hiKata,fuKata,heKata,hoKata,maKata,miKata,muKata,meKata,moKata,yaKata,yuKata,yoKata,raKata,riKata,ruKata,reKata,roKata,
        waKata,woKata,nKata,gaKata,giKata,guKata,geKata,goKata,zaKata,jiKata,zuKata,zeKata,zoKata,daKata,djiKata,dzuKata,deKata,doKata,baKata,biKata,buKata,beKata,boKata,paKata,piKata,puKata,peKata,poKata,
        kyaKata,kyuKata,kyoKata,shaKata,shuKata,shoKata,chaKata,chuKata,choKata,nyaKata,nyuKata,nyoKata,hyaKata,hyuKata,hyoKata,myaKata,myuKata,myoKata,
        ryaKata,ryuKata,ryoKata,gyaKata,gyuKata,gyoKata,jaKata,juKata,joKata,byaKata,byuKata,byoKata,pyaKata,pyuKata,pyoKata,};
        
        botones = new JButton[]{jButtonOp1,jButtonOp2,jButtonOp3,jButtonOp4,jButtonOp5,jButtonOp6};
            
        
    }

     public void addEventListener(IViewEventListener listener){
        listaEvent3.add(listener);
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
        aKata = new javax.swing.JLabel();
        iKata = new javax.swing.JLabel();
        uKata = new javax.swing.JLabel();
        eKata = new javax.swing.JLabel();
        oKata = new javax.swing.JLabel();
        kaKata = new javax.swing.JLabel();
        kiKata = new javax.swing.JLabel();
        kuKata = new javax.swing.JLabel();
        keKata = new javax.swing.JLabel();
        koKata = new javax.swing.JLabel();
        saKata = new javax.swing.JLabel();
        shiKata = new javax.swing.JLabel();
        suKata = new javax.swing.JLabel();
        seKata = new javax.swing.JLabel();
        soKata = new javax.swing.JLabel();
        taKata = new javax.swing.JLabel();
        chiKata = new javax.swing.JLabel();
        tsuKata = new javax.swing.JLabel();
        teKata = new javax.swing.JLabel();
        toKata = new javax.swing.JLabel();
        naKata = new javax.swing.JLabel();
        niKata = new javax.swing.JLabel();
        nuKata = new javax.swing.JLabel();
        neKata = new javax.swing.JLabel();
        noKata = new javax.swing.JLabel();
        haKata = new javax.swing.JLabel();
        hiKata = new javax.swing.JLabel();
        fuKata = new javax.swing.JLabel();
        heKata = new javax.swing.JLabel();
        hoKata = new javax.swing.JLabel();
        maKata = new javax.swing.JLabel();
        miKata = new javax.swing.JLabel();
        muKata = new javax.swing.JLabel();
        meKata = new javax.swing.JLabel();
        moKata = new javax.swing.JLabel();
        yaKata = new javax.swing.JLabel();
        yuKata = new javax.swing.JLabel();
        yoKata = new javax.swing.JLabel();
        raKata = new javax.swing.JLabel();
        riKata = new javax.swing.JLabel();
        ruKata = new javax.swing.JLabel();
        reKata = new javax.swing.JLabel();
        roKata = new javax.swing.JLabel();
        waKata = new javax.swing.JLabel();
        woKata = new javax.swing.JLabel();
        nKata = new javax.swing.JLabel();
        gaKata = new javax.swing.JLabel();
        giKata = new javax.swing.JLabel();
        guKata = new javax.swing.JLabel();
        geKata = new javax.swing.JLabel();
        goKata = new javax.swing.JLabel();
        zaKata = new javax.swing.JLabel();
        jiKata = new javax.swing.JLabel();
        zuKata = new javax.swing.JLabel();
        zeKata = new javax.swing.JLabel();
        zoKata = new javax.swing.JLabel();
        daKata = new javax.swing.JLabel();
        djiKata = new javax.swing.JLabel();
        dzuKata = new javax.swing.JLabel();
        deKata = new javax.swing.JLabel();
        doKata = new javax.swing.JLabel();
        baKata = new javax.swing.JLabel();
        biKata = new javax.swing.JLabel();
        buKata = new javax.swing.JLabel();
        beKata = new javax.swing.JLabel();
        boKata = new javax.swing.JLabel();
        paKata = new javax.swing.JLabel();
        piKata = new javax.swing.JLabel();
        puKata = new javax.swing.JLabel();
        peKata = new javax.swing.JLabel();
        poKata = new javax.swing.JLabel();
        kyaKata = new javax.swing.JLabel();
        kyuKata = new javax.swing.JLabel();
        kyoKata = new javax.swing.JLabel();
        shaKata = new javax.swing.JLabel();
        shuKata = new javax.swing.JLabel();
        shoKata = new javax.swing.JLabel();
        chaKata = new javax.swing.JLabel();
        chuKata = new javax.swing.JLabel();
        choKata = new javax.swing.JLabel();
        nyaKata = new javax.swing.JLabel();
        nyuKata = new javax.swing.JLabel();
        nyoKata = new javax.swing.JLabel();
        hyaKata = new javax.swing.JLabel();
        hyuKata = new javax.swing.JLabel();
        hyoKata = new javax.swing.JLabel();
        myaKata = new javax.swing.JLabel();
        myuKata = new javax.swing.JLabel();
        myoKata = new javax.swing.JLabel();
        ryaKata = new javax.swing.JLabel();
        ryuKata = new javax.swing.JLabel();
        ryoKata = new javax.swing.JLabel();
        gyaKata = new javax.swing.JLabel();
        gyuKata = new javax.swing.JLabel();
        gyoKata = new javax.swing.JLabel();
        jaKata = new javax.swing.JLabel();
        juKata = new javax.swing.JLabel();
        joKata = new javax.swing.JLabel();
        djaKata = new javax.swing.JLabel();
        djuKata = new javax.swing.JLabel();
        djoKata = new javax.swing.JLabel();
        byaKata = new javax.swing.JLabel();
        byuKata = new javax.swing.JLabel();
        byoKata = new javax.swing.JLabel();
        pyaKata = new javax.swing.JLabel();
        pyuKata = new javax.swing.JLabel();
        pyoKata = new javax.swing.JLabel();
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

        aKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/akatakana.png"))); // NOI18N
        aKata.setText(" ");
        aKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(aKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        iKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ikatakana.png"))); // NOI18N
        iKata.setText(" ");
        iKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(iKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        uKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ukatakana.png"))); // NOI18N
        uKata.setText(" ");
        uKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(uKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        eKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ekatakana.png"))); // NOI18N
        eKata.setText(" ");
        eKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(eKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        oKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/okatakana.png"))); // NOI18N
        oKata.setText(" ");
        oKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(oKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kakatakana.png"))); // NOI18N
        kaKata.setText(" ");
        kaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kikatakana.png"))); // NOI18N
        kiKata.setText(" ");
        kiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kukatakana.png"))); // NOI18N
        kuKata.setText(" ");
        kuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        keKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kekatakana.png"))); // NOI18N
        keKata.setText(" ");
        keKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(keKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        koKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        koKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kokatakana.png"))); // NOI18N
        koKata.setText(" ");
        koKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(koKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        saKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/sakatakana.png"))); // NOI18N
        saKata.setText(" ");
        saKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(saKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/shikatakana.png"))); // NOI18N
        shiKata.setText(" ");
        shiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        suKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/sukatakana.png"))); // NOI18N
        suKata.setText(" ");
        suKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(suKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        seKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/sekatakana.png"))); // NOI18N
        seKata.setText(" ");
        seKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(seKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        soKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/sokatakana.png"))); // NOI18N
        soKata.setText(" ");
        soKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(soKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        taKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/takatakana.png"))); // NOI18N
        taKata.setText(" ");
        taKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(taKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/chikatakana.png"))); // NOI18N
        chiKata.setText(" ");
        chiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        tsuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tsuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/tsukatakana.png"))); // NOI18N
        tsuKata.setText(" ");
        tsuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(tsuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        teKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/tekatakana.png"))); // NOI18N
        teKata.setText(" ");
        teKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(teKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        toKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/tokatakana.png"))); // NOI18N
        toKata.setText(" ");
        toKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(toKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        naKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nakatakana.png"))); // NOI18N
        naKata.setText(" ");
        naKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(naKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        niKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        niKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nikatakana.png"))); // NOI18N
        niKata.setText(" ");
        niKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(niKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nukatakana.png"))); // NOI18N
        nuKata.setText(" ");
        nuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        neKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nekatakana.png"))); // NOI18N
        neKata.setText(" ");
        neKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(neKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        noKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nokatakana.png"))); // NOI18N
        noKata.setText(" ");
        noKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(noKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        noKata.setVisible(false);

        haKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        haKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hakatakana.png"))); // NOI18N
        haKata.setText(" ");
        haKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(haKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        haKata.setVisible(false);

        hiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hikatakana.png"))); // NOI18N
        hiKata.setText(" ");
        hiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        hiKata.setVisible(false);

        fuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/fukatakana.png"))); // NOI18N
        fuKata.setText(" ");
        fuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(fuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        fuKata.setVisible(false);

        heKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hekatakana.png"))); // NOI18N
        heKata.setText(" ");
        heKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(heKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hokatakana.png"))); // NOI18N
        hoKata.setText(" ");
        hoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        maKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/makatakana.png"))); // NOI18N
        maKata.setText(" ");
        maKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(maKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        miKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/mikatakana.png"))); // NOI18N
        miKata.setText(" ");
        miKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(miKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        muKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/mukatakana.png"))); // NOI18N
        muKata.setText(" ");
        muKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(muKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        meKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/mekatakana.png"))); // NOI18N
        meKata.setText(" ");
        meKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(meKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        moKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/mokatakana.png"))); // NOI18N
        moKata.setText(" ");
        moKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(moKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/yakatakana.png"))); // NOI18N
        yaKata.setText(" ");
        yaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/yukatakana.png"))); // NOI18N
        yuKata.setText(" ");
        yuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        yoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/yokatakana.png"))); // NOI18N
        yoKata.setText(" ");
        yoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(yoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        raKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/rakatakana.png"))); // NOI18N
        raKata.setText(" ");
        raKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(raKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        riKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/rikatakana.png"))); // NOI18N
        riKata.setText(" ");
        riKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(riKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ruKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ruKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/rukatakana.png"))); // NOI18N
        ruKata.setText(" ");
        ruKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ruKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        reKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/rekatakana.png"))); // NOI18N
        reKata.setText(" ");
        reKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(reKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        roKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/rokatakana.png"))); // NOI18N
        roKata.setText(" ");
        roKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(roKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        waKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/wakatakana.png"))); // NOI18N
        waKata.setText(" ");
        waKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(waKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        woKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        woKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/wokatakana.png"))); // NOI18N
        woKata.setText(" ");
        woKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(woKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nkatakana.png"))); // NOI18N
        nKata.setText(" ");
        nKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gakatakana.png"))); // NOI18N
        gaKata.setText(" ");
        gaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        giKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gikatakana.png"))); // NOI18N
        giKata.setText(" ");
        giKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(giKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        guKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gukatakana.png"))); // NOI18N
        guKata.setText(" ");
        guKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(guKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        geKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gekatakana.png"))); // NOI18N
        geKata.setText(" ");
        geKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(geKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        goKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gokatakana.png"))); // NOI18N
        goKata.setText(" ");
        goKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(goKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/zakatakana.png"))); // NOI18N
        zaKata.setText(" ");
        zaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/jikatakana.png"))); // NOI18N
        jiKata.setText(" ");
        jiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/zukatakana.png"))); // NOI18N
        zuKata.setText(" ");
        zuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zeKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zeKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/zekatakana.png"))); // NOI18N
        zeKata.setText(" ");
        zeKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zeKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        zoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/zokatakana.png"))); // NOI18N
        zoKata.setText(" ");
        zoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(zoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        daKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/dakatakana.png"))); // NOI18N
        daKata.setText(" ");
        daKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(daKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        djiKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djiKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/djikatakana.png"))); // NOI18N
        djiKata.setText(" ");
        djiKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djiKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        dzuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dzuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/dzukatakana.png"))); // NOI18N
        dzuKata.setText(" ");
        dzuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(dzuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        deKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/dekatakana.png"))); // NOI18N
        deKata.setText(" ");
        deKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(deKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        doKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/dokatakana.png"))); // NOI18N
        doKata.setText(" ");
        doKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(doKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        baKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/bakatakana.png"))); // NOI18N
        baKata.setText(" ");
        baKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(baKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        biKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/bikatakana.png"))); // NOI18N
        biKata.setText(" ");
        biKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(biKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        buKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/bukatakana.png"))); // NOI18N
        buKata.setText(" ");
        buKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(buKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        beKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/bekatakana.png"))); // NOI18N
        beKata.setText(" ");
        beKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(beKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        boKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/bokatakana.png"))); // NOI18N
        boKata.setText(" ");
        boKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(boKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        paKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pakatakana.png"))); // NOI18N
        paKata.setText(" ");
        paKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(paKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        piKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        piKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pikatakana.png"))); // NOI18N
        piKata.setText(" ");
        piKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(piKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        puKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pukatakana.png"))); // NOI18N
        puKata.setText(" ");
        puKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(puKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        peKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pekatakana.png"))); // NOI18N
        peKata.setText(" ");
        peKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(peKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        poKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pokatakana.png"))); // NOI18N
        poKata.setText(" ");
        poKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(poKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kyakatakana.png"))); // NOI18N
        kyaKata.setText(" ");
        kyaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kyukatakana.png"))); // NOI18N
        kyuKata.setText(" ");
        kyuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        kyoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kyoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/kyokatakana.png"))); // NOI18N
        kyoKata.setText(" ");
        kyoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(kyoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/shakatakana.png"))); // NOI18N
        shaKata.setText(" ");
        shaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/shukatakana.png"))); // NOI18N
        shuKata.setText(" ");
        shuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        shoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/shokatakana.png"))); // NOI18N
        shoKata.setText(" ");
        shoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(shoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/chakatakana.png"))); // NOI18N
        chaKata.setText(" ");
        chaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        chuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/chukatakana.png"))); // NOI18N
        chuKata.setText(" ");
        chuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(chuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        choKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/chokatakana.png"))); // NOI18N
        choKata.setText(" ");
        choKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(choKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nyakatakana.png"))); // NOI18N
        nyaKata.setText(" ");
        nyaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nyukatakana.png"))); // NOI18N
        nyuKata.setText(" ");
        nyuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        nyoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nyoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/nyokatakana.png"))); // NOI18N
        nyoKata.setText(" ");
        nyoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(nyoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hyakatakana.png"))); // NOI18N
        hyaKata.setText(" ");
        hyaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hyukatakana.png"))); // NOI18N
        hyuKata.setText(" ");
        hyuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        hyoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hyoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/hyokatakana.png"))); // NOI18N
        hyoKata.setText(" ");
        hyoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(hyoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/myakatakana.png"))); // NOI18N
        myaKata.setText(" ");
        myaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/myukatakana.png"))); // NOI18N
        myuKata.setText(" ");
        myuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        myoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/myokatakana.png"))); // NOI18N
        myoKata.setText(" ");
        myoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(myoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ryakatakana.png"))); // NOI18N
        ryaKata.setText(" ");
        ryaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ryukatakana.png"))); // NOI18N
        ryuKata.setText(" ");
        ryuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        ryoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ryoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/ryokatakana.png"))); // NOI18N
        ryoKata.setText(" ");
        ryoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(ryoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gyakatakana.png"))); // NOI18N
        gyaKata.setText(" ");
        gyaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gyukatakana.png"))); // NOI18N
        gyuKata.setText(" ");
        gyuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        gyoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/gyokatakana.png"))); // NOI18N
        gyoKata.setText(" ");
        gyoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(gyoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/jakatakana.png"))); // NOI18N
        jaKata.setText(" ");
        jaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        juKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/jukatakana.png"))); // NOI18N
        juKata.setText(" ");
        juKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(juKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        joKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        joKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/jokatakana.png"))); // NOI18N
        joKata.setText(" ");
        joKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(joKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        djaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/djakatakana.png"))); // NOI18N
        djaKata.setText(" ");
        djaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djaKata.setVisible(false);

        djuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/djukatakana.png"))); // NOI18N
        djuKata.setText(" ");
        djuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djuKata.setVisible(false);

        djoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        djoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/djokatakana.png"))); // NOI18N
        djoKata.setText(" ");
        djoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(djoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));
        djoKata.setVisible(false);

        byaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/byakatakana.png"))); // NOI18N
        byaKata.setText(" ");
        byaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        byuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/byukatakana.png"))); // NOI18N
        byuKata.setText(" ");
        byuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        byoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        byoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/byokatakana.png"))); // NOI18N
        byoKata.setText(" ");
        byoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(byoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyaKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyaKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pyakatakana.png"))); // NOI18N
        pyaKata.setText(" ");
        pyaKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyaKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyuKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyuKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pyukatakana.png"))); // NOI18N
        pyuKata.setText(" ");
        pyuKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyuKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        pyoKata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pyoKata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgKatakana/pyokatakana.png"))); // NOI18N
        pyoKata.setText(" ");
        pyoKata.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(pyoKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgHiragana/1shibuya.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

   
    
    public void OcultarSilabas(){
        for (int i = 0; i < silabas.length; i++) {
            silabas[i].setVisible(false);
            System.out.println("poniendo falce: "+i+silabas.length);
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

    public JLabel getaKata() {
        return aKata;
    }

    public void setaKata(JLabel aKata) {
        this.aKata = aKata;
    }
                 
          

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aKata;
    private javax.swing.JLabel baKata;
    private javax.swing.JLabel beKata;
    private javax.swing.JLabel biKata;
    private javax.swing.JLabel boKata;
    private javax.swing.JLabel buKata;
    private javax.swing.JLabel byaKata;
    private javax.swing.JLabel byoKata;
    private javax.swing.JLabel byuKata;
    private javax.swing.JLabel chaKata;
    private javax.swing.JLabel chiKata;
    private javax.swing.JLabel choKata;
    private javax.swing.JLabel chuKata;
    private javax.swing.JLabel daKata;
    private javax.swing.JLabel deKata;
    private javax.swing.JLabel djaKata;
    private javax.swing.JLabel djiKata;
    private javax.swing.JLabel djoKata;
    private javax.swing.JLabel djuKata;
    private javax.swing.JLabel doKata;
    private javax.swing.JLabel dzuKata;
    private javax.swing.JLabel eKata;
    private javax.swing.JLabel fuKata;
    private javax.swing.JLabel gaKata;
    private javax.swing.JLabel geKata;
    private javax.swing.JLabel giKata;
    private javax.swing.JLabel goKata;
    private javax.swing.JLabel guKata;
    private javax.swing.JLabel gyaKata;
    private javax.swing.JLabel gyoKata;
    private javax.swing.JLabel gyuKata;
    private javax.swing.JLabel haKata;
    private javax.swing.JLabel heKata;
    private javax.swing.JLabel hiKata;
    private javax.swing.JLabel hoKata;
    private javax.swing.JLabel hyaKata;
    private javax.swing.JLabel hyoKata;
    private javax.swing.JLabel hyuKata;
    private javax.swing.JLabel iKata;
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
    private javax.swing.JLabel jaKata;
    private javax.swing.JLabel jiKata;
    private javax.swing.JLabel joKata;
    private javax.swing.JLabel juKata;
    private javax.swing.JLabel kaKata;
    private javax.swing.JLabel keKata;
    private javax.swing.JLabel kiKata;
    private javax.swing.JLabel koKata;
    private javax.swing.JLabel kuKata;
    private javax.swing.JLabel kyaKata;
    private javax.swing.JLabel kyoKata;
    private javax.swing.JLabel kyuKata;
    private javax.swing.JLabel maKata;
    private javax.swing.JLabel meKata;
    private javax.swing.JLabel miKata;
    private javax.swing.JLabel moKata;
    private javax.swing.JLabel muKata;
    private javax.swing.JLabel myaKata;
    private javax.swing.JLabel myoKata;
    private javax.swing.JLabel myuKata;
    private javax.swing.JLabel nKata;
    private javax.swing.JLabel naKata;
    private javax.swing.JLabel neKata;
    private javax.swing.JLabel niKata;
    private javax.swing.JLabel noKata;
    private javax.swing.JLabel nuKata;
    private javax.swing.JLabel nyaKata;
    private javax.swing.JLabel nyoKata;
    private javax.swing.JLabel nyuKata;
    private javax.swing.JLabel oKata;
    private javax.swing.JLabel paKata;
    private javax.swing.JLabel peKata;
    private javax.swing.JLabel piKata;
    private javax.swing.JLabel poKata;
    private javax.swing.JLabel puKata;
    private javax.swing.JLabel pyaKata;
    private javax.swing.JLabel pyoKata;
    private javax.swing.JLabel pyuKata;
    private javax.swing.JLabel raKata;
    private javax.swing.JLabel reKata;
    private javax.swing.JLabel riKata;
    private javax.swing.JLabel roKata;
    private javax.swing.JLabel ruKata;
    private javax.swing.JLabel ryaKata;
    private javax.swing.JLabel ryoKata;
    private javax.swing.JLabel ryuKata;
    private javax.swing.JLabel saKata;
    private javax.swing.JLabel seKata;
    private javax.swing.JLabel shaKata;
    private javax.swing.JLabel shiKata;
    private javax.swing.JLabel shoKata;
    private javax.swing.JLabel shuKata;
    private javax.swing.JLabel soKata;
    private javax.swing.JLabel suKata;
    private javax.swing.JLabel taKata;
    private javax.swing.JLabel teKata;
    private javax.swing.JLabel toKata;
    private javax.swing.JLabel tsuKata;
    private javax.swing.JLabel uKata;
    private javax.swing.JLabel waKata;
    private javax.swing.JLabel woKata;
    private javax.swing.JLabel yaKata;
    private javax.swing.JLabel yoKata;
    private javax.swing.JLabel yuKata;
    private javax.swing.JLabel zaKata;
    private javax.swing.JLabel zeKata;
    private javax.swing.JLabel zoKata;
    private javax.swing.JLabel zuKata;
    // End of variables declaration//GEN-END:variables
}
