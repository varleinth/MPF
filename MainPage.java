/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BluejackMarket;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kris
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    Image img, img1, img2, img3;
    boolean isDragged = false, isDragged2 = false, isDragged3 = false, isDragged4 = false;
    int x = 30;
    int y = 30;
    int counter = 1;
    int qty1 = 0 , qty2 = 0, qty3 = 0, qty4 = 0;
    DefaultTableModel model;
    public MainPage() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        System.out.println(""+model);
        try {
            img = ImageIO.read(getClass().getResource("/BluejackMarket/case.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            img1 = ImageIO.read(getClass().getResource("/BluejackMarket/mouse.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            img2 = ImageIO.read(getClass().getResource("/BluejackMarket/shoes.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            img3 = ImageIO.read(getClass().getResource("/BluejackMarket/t-shirt.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel2.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        jLabel3.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        jLabel4.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        jLabel5.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        if(isDragged == true){
            g2d.drawImage(img.getScaledInstance(125, 125, Image.SCALE_FAST), x, y, null);
        }
        else if(isDragged2 == true){
            g2d.drawImage(img1.getScaledInstance(125, 125, Image.SCALE_FAST), x, y, null);
        }else if(isDragged3 == true){
            g2d.drawImage(img2.getScaledInstance(125, 125, Image.SCALE_FAST), x, y, null);
        }else if(isDragged4 == true){
            g2d.drawImage(img3.getScaledInstance(125, 125, Image.SCALE_FAST), x, y, null);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 30));

        jLabel1.setText("BlueJack Market");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 270));
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel2);

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel3);

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel4);

        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 270));
        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 116));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane1);

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.add(jPanel6);

        getContentPane().add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(new java.awt.GridLayout(4, 4));
        jPanel4.add(jLabel6);
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel8);
        jPanel4.add(jLabel9);
        jPanel4.add(jLabel10);
        jPanel4.add(jLabel11);
        jPanel4.add(jLabel12);
        jPanel4.add(jLabel13);
        jPanel4.add(jLabel14);
        jPanel4.add(jLabel15);
        jPanel4.add(jLabel16);
        jPanel4.add(jLabel17);
        jPanel4.add(jLabel18);
        jPanel4.add(jLabel19);
        jPanel4.add(jLabel20);
        jPanel4.add(jLabel21);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        // TODO add your handling code here:
        isDragged = true;
        
        x = (int) getMousePosition().getX() - 25;
        y = (int) getMousePosition().getY() - 25;
        repaint();
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        isDragged = false;
        x=0;
        y=0;
        System.out.println(""+getMousePosition().getX());
        if(getMousePosition().getX() >= 107 && getMousePosition().getX() <= 600){
            if(counter == 1){
                jLabel6.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 2){
                jLabel7.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 3){
                jLabel8.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 4){
                jLabel9.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 5){
                jLabel10.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 6){
                jLabel11.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 7){
                jLabel12.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 8){
                jLabel13.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 9){
                jLabel14.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 10){
                jLabel15.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 11){
                jLabel16.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 12){
                jLabel17.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 13){
                jLabel18.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 14){
                jLabel19.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 15){
                jLabel20.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 16){
                jLabel21.setIcon(new ImageIcon(img.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else{
                JOptionPane.showMessageDialog(this,"the cart is full");
            }
            String title = "Notebook Case";
            int price = 25000;
            
            if(qty1 == 0){
                qty1++;
                Object[] row = {title, qty1, price};
                model.addRow(row);
            }else{
                qty1++;
                for(int i = 0 ; i < model.getRowCount() ; i++){
                    if(model.getValueAt(i,0) == "Notebook Case"){
                        model.setValueAt(qty1, i, 1);
                        model.setValueAt(qty1*price, i, 2);
                    }
                }
            }
            
            counter++;
        }
        repaint();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        isDragged2 = true;
        
        x = (int) getMousePosition().getX() - 25;
        y = (int) getMousePosition().getY() - 25;
        repaint();
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        // TODO add your handling code here:
        isDragged2 = false;
        x=0;
        y=0;
        if(getMousePosition().getX() >= 110 && getMousePosition().getX() <= 600){
           if(counter == 1){
                jLabel6.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 2){
                jLabel7.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 3){
                jLabel8.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 4){
                jLabel9.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 5){
                jLabel10.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 6){
                jLabel11.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 7){
                jLabel12.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 8){
                jLabel13.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 9){
                jLabel14.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 10){
                jLabel15.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 11){
                jLabel16.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 12){
                jLabel17.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 13){
                jLabel18.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 14){
                jLabel19.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 15){
                jLabel20.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 16){
                jLabel21.setIcon(new ImageIcon(img1.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else{
                JOptionPane.showMessageDialog(this,"the cart is full");
            }
           String title = "Mouse";
            int price = 125000;
            
            if(qty2 == 0){
                qty2++;
                Object[] row = {title, qty2, price};
                model.addRow(row);
            }else{
                qty2++;
                for(int i = 0 ; i < model.getRowCount() ; i++){
                    if(model.getValueAt(i,0) == "Mouse"){
                        model.setValueAt(qty2, i, 1);
                        model.setValueAt(qty2*price, i, 2);
                    }
                }
            }
            counter++;
        }
        repaint();
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        // TODO add your handling code here:
        isDragged3 = true;
        
        x = (int) getMousePosition().getX() - 25;
        y = (int) getMousePosition().getY() - 25;
        repaint();
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:
        isDragged3 = false;
        x=0;
        y=0;
        if(getMousePosition().getX() >= 110 && getMousePosition().getX() <= 600){
           if(counter == 1){
                jLabel6.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 2){
                jLabel7.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 3){
                jLabel8.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 4){
                jLabel9.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 5){
                jLabel10.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 6){
                jLabel11.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 7){
                jLabel12.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 8){
                jLabel13.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 9){
                jLabel14.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 10){
                jLabel15.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 11){
                jLabel16.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 12){
                jLabel17.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 13){
                jLabel18.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 14){
                jLabel19.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 15){
                jLabel20.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 16){
                jLabel21.setIcon(new ImageIcon(img2.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else{
                JOptionPane.showMessageDialog(this,"the cart is full");
            }
            counter++;
        }
        repaint();
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
        isDragged4 = true;
        
        x = (int) getMousePosition().getX() - 25;
        y = (int) getMousePosition().getY() - 25;
        repaint();
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
        isDragged4 = false;
        x=0;
        y=0;
        if(getMousePosition().getX() >= 110 && getMousePosition().getX() <= 600){
            if(counter == 1){
                jLabel6.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 2){
                jLabel7.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 3){
                jLabel8.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 4){
                jLabel9.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 5){
                jLabel10.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 6){
                jLabel11.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 7){
                jLabel12.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 8){
                jLabel13.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 9){
                jLabel14.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 10){
                jLabel15.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 11){
                jLabel16.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 12){
                jLabel17.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 13){
                jLabel18.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 14){
                jLabel19.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 15){
                jLabel20.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else if(counter == 16){
                jLabel21.setIcon(new ImageIcon(img3.getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
            }else{
                JOptionPane.showMessageDialog(this,"the cart is full");
            }
            counter++;
        }
        repaint();
    }//GEN-LAST:event_jLabel5MouseReleased

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}