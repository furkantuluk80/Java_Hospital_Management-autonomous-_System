
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Furkan
 */
public class RandevuYonetimi extends javax.swing.JFrame {

    static ArrayList<Randevu> list = new ArrayList();

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultComboBoxModel dcm = new DefaultComboBoxModel();
    DefaultComboBoxModel dcm2 = new DefaultComboBoxModel();
    DefaultComboBoxModel gun = new DefaultComboBoxModel();
    DefaultComboBoxModel ay = new DefaultComboBoxModel();
    DefaultComboBoxModel yıl = new DefaultComboBoxModel();

    public RandevuYonetimi() {

        initComponents();

        gunbox.setModel(gun);
        aybox.setModel(ay);
        yılbox.setModel(yıl);
        ;
        dtm.setColumnIdentifiers(new String[]{"Id", "TC", "DoktorAdı", "HastaAdı", "Tarih", "Saat"});
        for (int i = 1; i < 32; i++) {
            gun.addElement(i);
        }
        for (int i = 1; i < 13; i++) {
            ay.addElement(i);
        }
        for (int i = 2021; i < 2026; i++) {
            yıl.addElement(i);

        }

        table.setModel(dtm);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saat = new javax.swing.JTextField();
        kaydet = new javax.swing.JButton();
        ara = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        guncelle = new javax.swing.JButton();
        kaldir = new javax.swing.JButton();
        gunbox = new javax.swing.JComboBox<>();
        aybox = new javax.swing.JComboBox<>();
        yılbox = new javax.swing.JComboBox<>();
        Jtarih = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tc = new javax.swing.JTextField();
        gir = new javax.swing.JButton();
        doktorismi = new javax.swing.JTextField();
        hastaismi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Doktor Adı");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel2.setText("Tarih Seçimi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 80, -1));

        jLabel3.setText("Hasta Adı");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel4.setText("Saat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 46, -1));
        jPanel1.add(saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 98, -1));

        kaydet.setBackground(new java.awt.Color(153, 255, 153));
        kaydet.setText("Kaydet");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });
        jPanel1.add(kaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 226, 119, -1));

        ara.setBackground(new java.awt.Color(153, 255, 153));
        ara.setText("Ara");
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });
        jPanel1.add(ara, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 226, 111, -1));

        temizle.setBackground(new java.awt.Color(153, 255, 153));
        temizle.setText("Temiz");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });
        jPanel1.add(temizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 109, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 267, 391, 112));

        guncelle.setBackground(new java.awt.Color(153, 255, 153));
        guncelle.setText("Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        jPanel1.add(guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 94, -1));

        kaldir.setBackground(new java.awt.Color(153, 255, 153));
        kaldir.setText("Kaldır");
        kaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaldirActionPerformed(evt);
            }
        });
        jPanel1.add(kaldir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 96, -1));

        gunbox.setBackground(new java.awt.Color(153, 255, 153));
        gunbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(gunbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 138, 56, -1));

        aybox.setBackground(new java.awt.Color(153, 255, 153));
        aybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(aybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 138, 52, -1));

        yılbox.setBackground(new java.awt.Color(153, 255, 153));
        yılbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        jPanel1.add(yılbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, -1));
        jPanel1.add(Jtarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 10));

        jLabel6.setText("TC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 24, -1));
        jPanel1.add(tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 41, 118, -1));

        gir.setBackground(new java.awt.Color(153, 255, 153));
        gir.setText("Gir");
        gir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girActionPerformed(evt);
            }
        });
        jPanel1.add(gir, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 40, -1, -1));
        jPanel1.add(doktorismi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 75, -1));
        jPanel1.add(hastaismi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 98, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaldirActionPerformed

        try {
            if (table.getSelectedRow() == -1) {
                return;
            }
            String[] seçimler = {"Evet", "Hayır"};
            int seçim = JOptionPane.showOptionDialog(this, "Bu Randeuyu silmek istediğinize emin misiniz!", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, seçimler, seçimler[0]);

            if (seçim == 0) {
                dtm.removeRow(table.getSelectedRow());
                  
                for (int i = 0; i < table.getRowCount(); i++) {
                    String tcno= (String)table.getModel().getValueAt(i, 1);
                    for(Randevu r : list){
                        if(tcno.equals(r.getTc())){
                            list.remove(r);
                        }
                        
                        
                    }
                    
                }

                JOptionPane.showMessageDialog(this, "Randeu silinmiştir!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Silmek istediğiniz Randevuyu seçiniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);

            }
        } catch (RuntimeException e) {

        }
    }//GEN-LAST:event_kaldirActionPerformed

    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed

         // Comboxdaki tarihi textfielda aktarma
        String mesaj = "Bu tarih ve saatler doludur .\nLütfen başka bir tarih veya saat seçiniz!";
        try {
            for (int i = 0; i < table.getRowCount(); i++) {  // saati ve tarihi kontrol etme aynıysa uyarı mesajı yollama
                if (Jtarih.getText().equals(table.getModel().getValueAt(i, 4)) && saat.getText().toString().equals(table.getModel().getValueAt(i, 5))) {
                    JOptionPane.showMessageDialog(this, mesaj, "Uyarı!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            // arrayliste ve tableye ekleme
            Randevu r = new Randevu(tc.getText(), hastaismi.getText(), doktorismi.getText(), Jtarih.getText(), saat.getText());
            list.add(r);
            dtm.addRow(new Object[]{table.getRowCount() + 1, tc.getText(), doktorismi.getText(), hastaismi.getText(), Jtarih.getText(), saat.getText()});
        } catch (RuntimeException e) {

        }

    }//GEN-LAST:event_kaydetActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        // Tableyi temizleme
        for (int i = table.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }//GEN-LAST:event_temizleActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed

        try {
            //Arraylistteki değerlerin hepsini tableye yazdırma
            for (int i = table.getRowCount() - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }

            Object rowData[] = new Object[5];
            for (int i = 0; i < list.size(); i++) {

                rowData[0] = table.getRowCount() + 1;
                rowData[1] = list.get(i).getTc();
                rowData[2] = list.get(i).getDoktoradi();
                rowData[3] = list.get(i).getHastaadi();
                rowData[4] = list.get(i).getTarih();
                rowData[5] = list.get(i).getSaat();

                dtm.addRow(rowData);

            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_araActionPerformed

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        int secilisatir = table.getSelectedRow();

        //Tabledeki verileri güncelleme
        try {
            String tc1 = tc.getText();
            String doktorad1 = doktorismi.getText();
            String hastaad1 = hastaismi.getText();
            String tarih1 = gunbox.getSelectedItem() + "/" + aybox.getSelectedItem() + "/" + yılbox.getSelectedItem();
            String saat1 = saat.getText();

         
            dtm.setValueAt(tc1, secilisatir, 0);
            dtm.setValueAt(doktorad1, secilisatir, 1);
            dtm.setValueAt(hastaad1, secilisatir, 2);
            dtm.setValueAt(tarih1, secilisatir, 3);
            dtm.setValueAt(saat1, secilisatir, 4);

            JOptionPane.showMessageDialog(this, "Başarıyla Güncellendi");

            tc.setText("");
            doktorismi.setText("");
            hastaismi.setText("");
            saat.setText("");

            if (table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table boş");
            }
        } catch (NullPointerException e) {

        }


    }//GEN-LAST:event_guncelleActionPerformed

    private void girActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girActionPerformed

        for (Hastalar h : HastaYonetimi.list) {
            if (tc.getText().equals(h.getTc())) {
                hastaismi.setText(h.getHastaad());
                doktorismi.setText(h.getDoktorad());

            }

        }
    }//GEN-LAST:event_girActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        GöstergePaneli go = new GöstergePaneli();
        go.setVisible(true);
        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RandevuYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandevuYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandevuYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandevuYonetimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuYonetimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtarih;
    private javax.swing.JButton ara;
    private javax.swing.JComboBox<String> aybox;
    private javax.swing.JTextField doktorismi;
    private javax.swing.JButton gir;
    private javax.swing.JComboBox<String> gunbox;
    private javax.swing.JButton guncelle;
    private javax.swing.JTextField hastaismi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kaldir;
    private javax.swing.JButton kaydet;
    private javax.swing.JTextField saat;
    private javax.swing.JTable table;
    private javax.swing.JTextField tc;
    private javax.swing.JButton temizle;
    private javax.swing.JComboBox<String> yılbox;
    // End of variables declaration//GEN-END:variables
}
