/*
    QueryConnector - Attach a query to a Calc document
    Copyright (C) 2013 Enrico Giuseppe Messina

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.meserico.queryconnector;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;

/**
 *
 * @author Enrico Messina
 */
public class InfoDialog extends JExtDialog {

    /**
     * Creates new form InfoDialog
     */
    public InfoDialog() {
        super((Dialog) null, false);
        initComponents();
        this.setSize(422, 246);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x_pos = (dim.width - this.getWidth())/2;
        int y_pos = (dim.height - this.getHeight())/2;
        this.setLocation(x_pos, y_pos);
    }
    
    public InfoDialog(String url, String username, String startCell, String rowCount, 
                String columnCount, String driverClass){
        this();
        this.setText(this.connectionURL, url);
        this.setText(this.username, username);
        this.setText(this.startCell, startCell);
        this.setText(this.rowCount, rowCount);
        this.setText(this.columnCount, columnCount);
        this.setText(this.driverClass, driverClass);
    }
    
    private void setText(JLabel label, String text){
        label.setText(text);
        label.setToolTipText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        connectionURL = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        startCell = new javax.swing.JLabel();
        rowCount = new javax.swing.JLabel();
        columnCount = new javax.swing.JLabel();
        driverClass = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        mainContainer.setLayout(new java.awt.BorderLayout());

        closeButton.setText(tr("CLOSE_BUTTON")); // NOI18N
        closeButton.setPreferredSize(new java.awt.Dimension(120, 25));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel4.add(closeButton);

        mainContainer.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.BorderLayout(15, 0));

        jPanel2.setLayout(new java.awt.GridLayout(6, 0));

        jLabel1.setText(tr("CONNECTION_URL")); // NOI18N
        jPanel2.add(jLabel1);

        jLabel2.setText("Username:");
        jPanel2.add(jLabel2);

        jLabel3.setText(tr("START_SHEET_CELL")); // NOI18N
        jPanel2.add(jLabel3);

        jLabel5.setText(tr("ROW_COUNT")); // NOI18N
        jPanel2.add(jLabel5);

        jLabel6.setText(tr("COLUMN_COUNT")); // NOI18N
        jPanel2.add(jLabel6);

        jLabel8.setText(tr("USED_DRIVER")); // NOI18N
        jPanel2.add(jLabel8);

        jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new java.awt.GridLayout(6, 0));

        connectionURL.setText("<url>");
        jPanel3.add(connectionURL);

        username.setText("<username>");
        jPanel3.add(username);

        startCell.setText("<cella di partenza>");
        jPanel3.add(startCell);

        rowCount.setText("<numero di righe>");
        jPanel3.add(rowCount);

        columnCount.setText("<numero di colonne>");
        jPanel3.add(columnCount);

        driverClass.setText("<driver usato>");
        jPanel3.add(driverClass);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        mainContainer.add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel4.setText(tr("CONNECTION_INFORMATION")); // NOI18N
        mainContainer.add(jLabel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(mainContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel columnCount;
    private javax.swing.JLabel connectionURL;
    private javax.swing.JLabel driverClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JLabel rowCount;
    private javax.swing.JLabel startCell;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
