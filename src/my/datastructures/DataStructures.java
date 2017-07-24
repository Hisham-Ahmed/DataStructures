package my.datastructures;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DataStructures extends JFrame 
{
    int cht=0, chd=0;
    String inpt="";
    boolean in = false;
    public DataStructures() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bst = new javax.swing.JRadioButton();
        avl = new javax.swing.JRadioButton();
        rbt = new javax.swing.JRadioButton();
        maxheap = new javax.swing.JRadioButton();
        twothree = new javax.swing.JRadioButton();
        inorder = new javax.swing.JRadioButton();
        preorder = new javax.swing.JRadioButton();
        postorder = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        credit = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        traverse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input = new java.awt.TextField();
        minheap = new javax.swing.JRadioButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 210));
        setMinimumSize(new java.awt.Dimension(397, 23));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "               DATA STRUCTURES (TREES)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Trajan Pro", 1, 16))); // NOI18N
        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(397, 504));
        jPanel1.setMinimumSize(new java.awt.Dimension(397, 504));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MENU:");

        buttonGroup1.add(bst);
        bst.setText("Binary Search Tree");
        bst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bstActionPerformed(evt);
            }
        });

        buttonGroup1.add(avl);
        avl.setText("Avl Tree");
        avl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avlActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt);
        rbt.setText("Red Black Tree");
        rbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtActionPerformed(evt);
            }
        });

        buttonGroup1.add(maxheap);
        maxheap.setText("MaxHeap");
        maxheap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxheapActionPerformed(evt);
            }
        });

        buttonGroup1.add(twothree);
        twothree.setText("2-3 Tree");
        twothree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twothreeActionPerformed(evt);
            }
        });

        buttonGroup2.add(inorder);
        inorder.setText("InOrder");
        inorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inorderActionPerformed(evt);
            }
        });

        buttonGroup2.add(preorder);
        preorder.setText("PreOrder");
        preorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preorderActionPerformed(evt);
            }
        });

        buttonGroup2.add(postorder);
        postorder.setText("PostOrder");
        postorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postorderActionPerformed(evt);
            }
        });

        jLabel2.setText("Selected Traversing:");

        btnExit.setBackground(new java.awt.Color(204, 204, 255));
        btnExit.setText("Exit");
        btnExit.setActionCommand("btnExit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        credit.setBackground(new java.awt.Color(204, 204, 255));
        credit.setText("Credits");
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });

        proceed.setBackground(new java.awt.Color(204, 204, 255));
        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Values To Insert:");

        input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputMouseClicked(evt);
            }
        });
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        buttonGroup1.add(minheap);
        minheap.setText("MinHeap");
        minheap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minheapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bst)
                            .addComponent(avl)
                            .addComponent(rbt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maxheap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minheap))
                            .addComponent(twothree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postorder)
                            .addComponent(jLabel3)
                            .addComponent(preorder)
                            .addComponent(inorder))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(traverse)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(proceed)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(credit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bst)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avl))
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt)
                            .addComponent(preorder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxheap)
                            .addComponent(inorder)
                            .addComponent(minheap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twothree))
                    .addComponent(postorder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceed)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traverse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credit)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minheapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minheapActionPerformed
        cht=6;
    }//GEN-LAST:event_minheapActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        System.out.println("Reading String!");
    }//GEN-LAST:event_inputActionPerformed

    private void inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMouseClicked

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        DS_Project obj = new DS_Project();
        traverse.setText("");
        inpt = input.getText();
        if(inpt.length()>0)
        {
            in=true;
        }
        if(cht==0 || chd==0 || in==false)
        {
            JOptionPane.showMessageDialog(null,"*Please Fill Required Feilds!");
            in = false;
            inpt = "";
        }
        else
        {
            obj.function(cht, chd, inpt);
        }
        System.out.println(inpt);
    }//GEN-LAST:event_proceedActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        JOptionPane.showMessageDialog(null, "               "+"*GROUP MEMBERS*\n"
            + "\n\tHISHAM AHMED    (Group Leader)"
            + "\n\tSHAHERYAR RASHID");
    }//GEN-LAST:event_creditActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void postorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postorderActionPerformed
        chd=3;
    }//GEN-LAST:event_postorderActionPerformed

    private void preorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preorderActionPerformed
        chd=2;
    }//GEN-LAST:event_preorderActionPerformed

    private void inorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inorderActionPerformed
        chd=1;
    }//GEN-LAST:event_inorderActionPerformed

    private void twothreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twothreeActionPerformed
        cht=5;
    }//GEN-LAST:event_twothreeActionPerformed

    private void maxheapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxheapActionPerformed
        cht=4;
    }//GEN-LAST:event_maxheapActionPerformed

    private void rbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtActionPerformed
        cht = 3;
    }//GEN-LAST:event_rbtActionPerformed

    private void avlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avlActionPerformed
        cht=2;
    }//GEN-LAST:event_avlActionPerformed

    private void bstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bstActionPerformed
        cht=1;
    }//GEN-LAST:event_bstActionPerformed
    
    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new DataStructures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avl;
    private javax.swing.JRadioButton bst;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton credit;
    private javax.swing.JRadioButton inorder;
    private java.awt.TextField input;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButton maxheap;
    private javax.swing.JRadioButton minheap;
    private java.awt.Panel panel1;
    private javax.swing.JRadioButton postorder;
    private javax.swing.JRadioButton preorder;
    private javax.swing.JButton proceed;
    private javax.swing.JRadioButton rbt;
    public static javax.swing.JTextField traverse;
    private javax.swing.JRadioButton twothree;
    // End of variables declaration//GEN-END:variables
}