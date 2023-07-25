package folder;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSlider;


public class QuartaInterface extends javax.swing.JFrame {

    
    public QuartaInterface() {
        initComponents();
    }
    
    private final int FOCUS_TIME = 25;
    private final int FAST_BREAK_TIME;
    private final int LONG_BREAK_TIME;
    private final int ROUNDS = 4;
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        playPause = new javax.swing.JLabel();
        config = new javax.swing.JLabel();
        tempoFoco = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        settigns = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        breakSliderCurto = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        breakLabelCurto = new javax.swing.JLabel();
        BreakCurto = new javax.swing.JLabel();
        tempFocus = new javax.swing.JLabel();
        tempFocoSlider = new javax.swing.JSlider();
        breakLong = new javax.swing.JLabel();
        breakLabelLong = new javax.swing.JLabel();
        breakSliderLong = new javax.swing.JSlider();
        rounds = new javax.swing.JLabel();
        roundsLabel = new javax.swing.JLabel();
        breakSliderRounds = new javax.swing.JSlider();
        resetDefault = new javax.swing.JButton();
        buttonAplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        playPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        playPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configMouseClicked(evt);
            }
        });

        tempoFoco.setBackground(new java.awt.Color(0, 0, 0));
        tempoFoco.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        tempoFoco.setForeground(new java.awt.Color(51, 51, 255));
        tempoFoco.setText("TEMPO DE FOCO");

        time.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        time.setForeground(new java.awt.Color(255, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("25:00");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tempoFoco)
                            .addComponent(playPause))))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playPause)
                .addGap(49, 49, 49)
                .addComponent(tempoFoco)
                .addGap(184, 184, 184))
        );

        main.add(timer, "timer");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        breakSliderCurto.setMaximum(5);
        breakSliderCurto.setMinimum(1);
        breakSliderCurto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakSliderCurtoStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Tempo de Foco");

        breakLabelCurto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        breakLabelCurto.setText("5:00");

        BreakCurto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BreakCurto.setText("Break Curto");

        tempFocus.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tempFocus.setText("25:00");

        tempFocoSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tempFocoSliderStateChanged(evt);
            }
        });

        breakLong.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        breakLong.setText("Break Longo");

        breakLabelLong.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        breakLabelLong.setText("15:00");

        breakSliderLong.setMaximum(15);
        breakSliderLong.setMinimum(7);
        breakSliderLong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakSliderLongStateChanged(evt);
            }
        });

        rounds.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        rounds.setText("Rounds");

        roundsLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        roundsLabel.setText("25:00");

        breakSliderRounds.setMaximum(25);
        breakSliderRounds.setMinimum(20);
        breakSliderRounds.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakSliderRoundsStateChanged(evt);
            }
        });

        resetDefault.setText("Reset Button");
        resetDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDefaultActionPerformed(evt);
            }
        });

        buttonAplicar.setText("Aplicar");
        buttonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settignsLayout = new javax.swing.GroupLayout(settigns);
        settigns.setLayout(settignsLayout);
        settignsLayout.setHorizontalGroup(
            settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settignsLayout.createSequentialGroup()
                .addGroup(settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breakSliderCurto, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempFocoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(breakSliderLong, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(breakSliderRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(breakLong))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(breakLabelLong))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rounds)
                            .addComponent(roundsLabel)))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(tempFocus))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(BreakCurto))
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(breakLabelCurto)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settignsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(settignsLayout.createSequentialGroup()
                        .addComponent(resetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        settignsLayout.setVerticalGroup(
            settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settignsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tempFocus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempFocoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BreakCurto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(breakLabelCurto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(breakSliderCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(breakLong)
                .addGap(18, 18, 18)
                .addComponent(breakLabelLong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(breakSliderLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rounds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(breakSliderRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(settignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        main.add(settigns, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseClicked
        changePanel("settings");
    }//GEN-LAST:event_configMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        changePanel("timer");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tempFocoSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tempFocoSliderStateChanged
       changeValueSlider(this.tempFocoSlider, this.tempFocus);  
    }//GEN-LAST:event_tempFocoSliderStateChanged

    private void breakSliderCurtoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakSliderCurtoStateChanged
        changeValueSlider(this.breakSliderCurto, this.breakLabelCurto);
    }//GEN-LAST:event_breakSliderCurtoStateChanged

    private void breakSliderLongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakSliderLongStateChanged
        changeValueSlider(this.breakSliderLong, this.breakLabelLong);
    }//GEN-LAST:event_breakSliderLongStateChanged

    private void breakSliderRoundsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakSliderRoundsStateChanged
        changeValueSlider(this.breakSliderRounds, this.roundsLabel);
    }//GEN-LAST:event_breakSliderRoundsStateChanged

    private void resetDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDefaultActionPerformed
        this.tempFocoSlider.setValue(this.FOCUS_TIME);
        this.breakSliderCurto.setValue(this.FAST_BREAK_TIME);
        this.breakSliderLong.setValue(this.LONG_BREAK_TIME);
        this.breakSliderRounds.setValue(this.ROUNDS);
        
    }//GEN-LAST:event_resetDefaultActionPerformed

    private void buttonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAplicarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BreakCurto;
    private javax.swing.JLabel breakLabelCurto;
    private javax.swing.JLabel breakLabelLong;
    private javax.swing.JLabel breakLong;
    private javax.swing.JSlider breakSliderCurto;
    private javax.swing.JSlider breakSliderLong;
    private javax.swing.JSlider breakSliderRounds;
    private javax.swing.JButton buttonAplicar;
    private javax.swing.JLabel config;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel main;
    private javax.swing.JLabel playPause;
    private javax.swing.JButton resetDefault;
    private javax.swing.JLabel rounds;
    private javax.swing.JLabel roundsLabel;
    private javax.swing.JPanel settigns;
    private javax.swing.JSlider tempFocoSlider;
    private javax.swing.JLabel tempFocus;
    private javax.swing.JLabel tempoFoco;
    private javax.swing.JLabel time;
    private javax.swing.JPanel timer;
    // End of variables declaration//GEN-END:variables

    private void changePanel(String cardName){
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName);
    }
    
    private void changeValueSlider(JSlider slider, JLabel label){
        int value = slider.getValue();
        String valueFormat = String.format("%02d:%02d", value, 00);
        label.setText(valueFormat);
    }
    

}

//CLICAR NO BOTAO PLAY E MUDAR IMAGEM
//RODAR TEMPO NO PLAY