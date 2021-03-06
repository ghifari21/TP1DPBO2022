/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp1dpbo2022;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Main extends javax.swing.JFrame {
    // attribute
    dbConnection db = new dbConnection();
    private boolean isAuthor = true;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        db.readTableAuthor(dataTable);
    }

    public int deleteData(){
        int option = JOptionPane.showConfirmDialog(null, "Are you sure?","Confirm",JOptionPane.YES_NO_OPTION);
        return option;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        authorBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        labelTitle.setText("Library");

        authorBtn.setText("Author");
        authorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorBtnActionPerformed(evt);
            }
        });

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(labelTitle)
                .addGap(0, 454, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(authorBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)))
                .addGap(14, 14, 14))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // when user click author button
    private void authorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorBtnActionPerformed
        // TODO add your handling code here:
        isAuthor = true;
        db.readTableAuthor(dataTable);
    }//GEN-LAST:event_authorBtnActionPerformed

    // when user click book button
    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        isAuthor = false;
        db.readTableBook(dataTable);
    }//GEN-LAST:event_bookBtnActionPerformed

    // when user click add button
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (isAuthor == true) {
            AuthorForm aForm = new AuthorForm();
            aForm.setVisible(true);
        }else {
            BookForm bForm = new BookForm();
            bForm.setVisible(true);
        }
    }//GEN-LAST:event_addBtnActionPerformed
    
    // when user click delete button
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if (deleteData() == 0) {
            try {
                int selectedRow = dataTable.getSelectedRow();
                String id = dataTable.getValueAt(selectedRow, 0).toString();
        
                String table = "";
                if (isAuthor) {
                    table = "tauthors";
                }else {
                    table = "tbooks";
                }

                try {
                    String sql = "DELETE FROM `"+table+"` WHERE id='"+id+"';";
                    db.Query(sql);
                }catch(Exception e) {
                    System.err.println("Delete gagal " +e.getMessage());
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
            }
            if (isAuthor) {
                db.readTableAuthor(dataTable);
            }else {
                db.readTableBook(dataTable);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = dataTable.getSelectedRow();
        String id = dataTable.getValueAt(selectedRow, 0).toString();

        if (isAuthor == true) {
            String sql = "SELECT * FROM tauthors WHERE id='"+id+"';";
            String urlImg = db.getValueDb(sql, "img");
            String nama = dataTable.getValueAt(selectedRow, 2).toString();
            String jumlah_buku = dataTable.getValueAt(selectedRow, 3).toString();
            System.out.println(id);
            System.out.println(urlImg);
            System.out.println(nama);
            System.out.println(jumlah_buku);
            AuthorEditForm aEditForm = new AuthorEditForm();
            aEditForm.editAuthor(id, urlImg, nama, jumlah_buku);
            aEditForm.setVisible(true);
        }else {
            String sql = "SELECT * FROM tbooks WHERE id='"+id+"';";
            String urlImg = db.getValueDb(sql, "img");
            String penerbit = dataTable.getValueAt(selectedRow, 2).toString();
            String author = dataTable.getValueAt(selectedRow, 3).toString();
            String desc = dataTable.getValueAt(selectedRow, 4).toString();
            BookEditForm bEditForm = new BookEditForm();
            bEditForm.editBook(id, urlImg, penerbit, author, desc);
            bEditForm.setVisible(true);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        if (isAuthor == true) {
            db.readTableAuthor(dataTable);
        }else {
            db.readTableBook(dataTable);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton authorBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
