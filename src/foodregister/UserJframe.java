/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodregister;

/**
 *
 * @author jahneugene
 */
public class UserJframe extends javax.swing.JFrame{
	
	
	public UserJframe(){
		
		initComponents();
	}
	
    private void initComponents(){
    	
        allPannel = new javax.swing.JPanel();
        signinPannel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nameUserText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        labelShowId1 = new javax.swing.JLabel();
        userPassword = new javax.swing.JPasswordField();
        changeToSign1 = new javax.swing.JButton();
        buttpnRegister1 = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        registerPannel = new javax.swing.JPanel();
        confirmText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        passwordWrong = new javax.swing.JLabel();
        confirmField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        changeToSign = new javax.swing.JButton();
        buttpnRegister = new javax.swing.JButton();
        userPannel = new javax.swing.JPanel();
        signOut = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
    	
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        allPannel.setPreferredSize(new java.awt.Dimension(556, 342));
        allPannel.setLayout(new java.awt.CardLayout());
        
        
        userPannel.setPreferredSize(new java.awt.Dimension(596, 344));

        signOut.setText("Sign Out");
 

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));


        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This is  aj fjfjfekfdlkfjkfj jdjf\nfjsfjdof\nff\nffkfkkfks\nf\nsfkdfpdfld;'f");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("jejjeje\njfjfdnd\nfsf;ksdf\nfnfkmdsf.\n");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout userPannelLayout = new javax.swing.GroupLayout(userPannel);
        userPannel.setLayout(userPannelLayout);
        userPannelLayout.setHorizontalGroup(
            userPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signOut, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPannelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPannelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(userPannelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        userPannelLayout.setVerticalGroup(
            userPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPannelLayout.createSequentialGroup()
                .addGroup(userPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signOut))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        allPannel.add(userPannel, "card4");
    }
    
    
    
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
            java.util.logging.Logger.getLogger(UserJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJframe().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel allPannel;
    private javax.swing.JButton buttpnRegister;
    private javax.swing.JButton buttpnRegister1;
    private javax.swing.JButton changeToSign;
    private javax.swing.JButton changeToSign1;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JLabel confirmText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelShowId1;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameUserText;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel passwordWrong;
    private javax.swing.JPanel registerPannel;
    private javax.swing.JButton signOut;
    private javax.swing.JPanel signinPannel;
    private javax.swing.JPanel userPannel;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JLabel warningLabel;
    
}
