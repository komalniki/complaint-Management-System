/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaint_management;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class frmact extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmact
     */
    public frmact() throws IOException, ClassNotFoundException, SQLException {
        initComponents();
        setClosable(true);
        loaddata();
        setTitle("MANAGE ACCOUNTS");
        setResizable(false);
        setLocation(350,75);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        labelactname = new javax.swing.JLabel();
        txtactname = new javax.swing.JTextField();
        labelacttype = new javax.swing.JLabel();
        comboacctype = new javax.swing.JComboBox<>();
        labellocation = new javax.swing.JLabel();
        combolocation = new javax.swing.JComboBox<>();
        labelcontactno = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        labeladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        buttonsave = new javax.swing.JButton();
        buttonupdate = new javax.swing.JButton();
        buttondelete = new javax.swing.JButton();
        buttoncancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));
        setTitle("Accounts");
        setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        labelactname.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labelactname.setForeground(new java.awt.Color(0, 153, 0));
        labelactname.setText("Account Name");

        txtactname.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        txtactname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelacttype.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labelacttype.setForeground(new java.awt.Color(0, 153, 0));
        labelacttype.setText("Product");

        comboacctype.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        comboacctype.setForeground(new java.awt.Color(0, 153, 0));
        comboacctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop / Notebook", "Mobile & Tablet", "Desktop Computers", "Smart TV", "Digital Camera", " " }));
        comboacctype.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labellocation.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labellocation.setForeground(new java.awt.Color(0, 153, 0));
        labellocation.setText("Location");

        combolocation.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        combolocation.setForeground(new java.awt.Color(0, 153, 0));
        combolocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Mohali", "Patiala", "Panchkula", "Rajpura" }));
        combolocation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelcontactno.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labelcontactno.setForeground(new java.awt.Color(0, 153, 0));
        labelcontactno.setText("Contact number");

        txtcontactno.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        txtcontactno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labeladdress.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labeladdress.setForeground(new java.awt.Color(0, 153, 0));
        labeladdress.setText("Address");

        txtaddress.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        buttonsave.setBackground(new java.awt.Color(255, 255, 255));
        buttonsave.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttonsave.setForeground(new java.awt.Color(0, 153, 0));
        buttonsave.setText("Save");
        buttonsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsaveActionPerformed(evt);
            }
        });

        buttonupdate.setBackground(new java.awt.Color(255, 255, 255));
        buttonupdate.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttonupdate.setForeground(new java.awt.Color(0, 153, 0));
        buttonupdate.setText("Update");
        buttonupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonupdateActionPerformed(evt);
            }
        });

        buttondelete.setBackground(new java.awt.Color(255, 255, 255));
        buttondelete.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttondelete.setForeground(new java.awt.Color(0, 153, 0));
        buttondelete.setText("Delete");
        buttondelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeleteActionPerformed(evt);
            }
        });

        buttoncancel.setBackground(new java.awt.Color(255, 255, 255));
        buttoncancel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttoncancel.setForeground(new java.awt.Color(0, 153, 0));
        buttoncancel.setText(" Cancel");
        buttoncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jTable2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 153, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Account Code", "Account Name", "Account Type", "Location", "Contact Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(buttonsave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(buttonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(buttondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelactname)
                            .addComponent(labelacttype)
                            .addComponent(labellocation)
                            .addComponent(labelcontactno)
                            .addComponent(labeladdress))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtactname)
                            .addComponent(comboacctype, 0, 239, Short.MAX_VALUE)
                            .addComponent(combolocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcontactno)
                            .addComponent(txtaddress))))
                .addGap(41, 41, 41)
                .addComponent(buttoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelactname)
                    .addComponent(txtactname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelacttype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboacctype))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labellocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combolocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelcontactno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcontactno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labeladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtaddress))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonsave)
                    .addComponent(buttonupdate)
                    .addComponent(buttondelete)
                    .addComponent(buttoncancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void buttonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsaveActionPerformed

        if(txtactname.getText().equals("")||txtaddress.getText().equals("")||txtcontactno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please fill entries");
        }
        else
        {
                clsaccprp objprp=new clsaccprp();
                clsacc obj=new clsacc();
                objprp.setAccnam(txtactname.getText());
                objprp.setAccadd(txtaddress.getText());
                objprp.setAccloc(combolocation.getSelectedItem().toString());
                objprp.setAcctyp(comboacctype.getSelectedItem().toString());
                objprp.setAccphnno(txtcontactno.getText());
                objprp.setAccdat(new Date(4,2,2));
               try {
                obj.insacc(objprp);
                loaddata();
                clear();
            } catch (ClassNotFoundException | IOException | SQLException ex) {
                Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonsaveActionPerformed

    private void buttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
       if(txtactname.getText().equals((""))||txtaddress.getText().equals("")||txtcontactno.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Please fill entries");
       }
       else
       {
           clsaccprp objprp=new clsaccprp();
           clsacc obj=new clsacc();
           objprp.setAccnam(txtactname.getText());
           objprp.setAccadd(txtaddress.getText());
           objprp.setAccloc(combolocation.getSelectedItem().toString());
           objprp.setAcctyp(comboacctype.getSelectedItem().toString());
           objprp.setAccphnno(txtcontactno.getText());
           objprp.setAccno(acod);
           try {
               obj.updacc(objprp);
               loaddata();
               clear();
           } catch (IOException | ClassNotFoundException | SQLException ex) {
               Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
    }//GEN-LAST:event_buttonupdateActionPerformed

    private void buttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
        try {
            clsacc obj=new clsacc();
            clsaccprp objprp=new clsaccprp();
            objprp.setAccno(acod);
            obj.delacc(objprp);
            clear();
            loaddata();
        } catch (IOException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
        }
        buttonupdate.setEnabled(false);
        buttondelete.setEnabled(false);
    }//GEN-LAST:event_buttondeleteActionPerformed
    int acod;
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int idx=jTable2.getSelectedRow();
       if(idx!=-1)
       {
           try {
               acod=(int) jTable2.getValueAt(idx, 0);
               txtactname.setText((jTable2.getValueAt(idx, 1)).toString());
               txtcontactno.setText((String) jTable2.getValueAt(idx, 4));
               comboacctype.setSelectedItem(jTable2.getValueAt(idx, 2));
               combolocation.setSelectedItem(jTable2.getValueAt(idx, 3));
               clsacc obj=new clsacc();
               clsaccprp p = obj.fndacc(acod);
               txtaddress.setText(p.getAccadd());
               buttonupdate.setEnabled(true);
               buttondelete.setEnabled(true);
           } catch (IOException ex) {
               Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(frmact.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }//GEN-LAST:event_jTable2MouseClicked
    private void clear()
    {
        txtactname.setText(null);
        txtaddress.setText(null);
        txtcontactno.setText(null);
    }
    private void loaddata() throws IOException, ClassNotFoundException, SQLException
    {
        DefaultTableModel mod = (DefaultTableModel)(jTable2.getModel());
        clsacc obj=new clsacc();
        List <clsaccprp> k=obj.dspacc();
        mod.setRowCount(0);
        for(clsaccprp p:k)
        {
            Object[] rowdata = new Object[6];
            rowdata[0]=p.getAccno();
            rowdata[1]=p.getAccnam();
            rowdata[2]=p.getAcctyp();
            rowdata[3]=p.getAccloc();
            rowdata[4]=p.getAccphnno();
            rowdata[5]=p.getAccadd();
            mod.addRow(rowdata);
        }
    }
    private void buttoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelActionPerformed
        clear();
        buttondelete.setEnabled(false);
        buttonupdate.setEnabled(false);
    }//GEN-LAST:event_buttoncancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancel;
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttonsave;
    private javax.swing.JButton buttonupdate;
    private javax.swing.JComboBox<String> comboacctype;
    private javax.swing.JComboBox<String> combolocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelactname;
    private javax.swing.JLabel labelacttype;
    private javax.swing.JLabel labeladdress;
    private javax.swing.JLabel labelcontactno;
    private javax.swing.JLabel labellocation;
    private javax.swing.JTextField txtactname;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontactno;
    // End of variables declaration//GEN-END:variables

}
