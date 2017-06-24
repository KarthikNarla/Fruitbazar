
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karthik-pc
 */
public class FruitBazarForm extends javax.swing.JFrame {

    ArrayList<ProductItem> cartItems;

    /**
     * Creates new form FruitBazarForm
     */
    public FruitBazarForm() {
        initComponents();
        cartItems = new ArrayList();
        lblApple.setText("");
        lblPine.setText("");
        lblPom.setText("");

        lblApple.setIcon(new ImageIcon("fruit-images/apple.png"));
        lblPine.setIcon(new ImageIcon("fruit-images/Pineapple.png"));
        lblPom.setIcon(new ImageIcon("fruit-images/Pom.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblApple = new javax.swing.JLabel();
        lblPine = new javax.swing.JLabel();
        lblPom = new javax.swing.JLabel();
        btnAddApple = new javax.swing.JButton();
        btnAddPine = new javax.swing.JButton();
        btnAddPom = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblApple.setText("jLabel1");

        lblPine.setText("jLabel2");

        lblPom.setText("jLabel3");

        btnAddApple.setText("+");
        btnAddApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppleActionPerformed(evt);
            }
        });

        btnAddPine.setText("+");
        btnAddPine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPineActionPerformed(evt);
            }
        });

        btnAddPom.setText("+");
        btnAddPom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPomActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResult.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApple, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPine, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAddApple)
                        .addGap(154, 154, 154)
                        .addComponent(btnAddPine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(btnAddPom)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApple, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPine, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPom, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddPom)
                                    .addComponent(btnAddPine)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(btnAddApple)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>                        

    private void btnAddAppleActionPerformed(java.awt.event.ActionEvent evt) {                                            
        AppleItem a = new AppleItem();
        cartItems.add(a);
        updateTotalPrice();

        // TODO add your handling code here:
    }                                           

    private void btnAddPineActionPerformed(java.awt.event.ActionEvent evt) {                                           
        PineItem p = new PineItem();
        cartItems.add(p);
        updateTotalPrice();

        // TODO add your handling code here:
    }                                          

    private void btnAddPomActionPerformed(java.awt.event.ActionEvent evt) {                                          
        PomItem po = new PomItem();
        cartItems.add(po);
        updateTotalPrice();

// TODO add your handling code here:
    }                                         

    public void updateTotalPrice() {
        int totalprice = 0;
        for (ProductItem p : cartItems) {
            totalprice = totalprice + p.getPrice();
        }
        // lblResult.setText("items("+cartItems.size()+"): Rs"+totalprice);
        lblResult.setText(String.format("Items (%d): Rs. %d", cartItems.size(), totalprice));
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
            java.util.logging.Logger.getLogger(FruitBazarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitBazarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitBazarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitBazarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitBazarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddApple;
    private javax.swing.JButton btnAddPine;
    private javax.swing.JButton btnAddPom;
    private javax.swing.JLabel lblApple;
    private javax.swing.JLabel lblPine;
    private javax.swing.JLabel lblPom;
    private javax.swing.JLabel lblResult;
    // End of variables declaration                   
}