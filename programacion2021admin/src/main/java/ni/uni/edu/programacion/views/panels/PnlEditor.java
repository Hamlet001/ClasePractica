/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Sistemas-05
 */
public class PnlEditor extends javax.swing.JPanel {

    /**
     * Creates new form PnlEditor
     */
    public PnlEditor() {
        initComponents();
    }

    public JLabel getLblLetters() {
        return lblLetters;
    }

    public JLabel getLblLines() {
        return lblLines;
    }

    public JLabel getLblWords() {
        return lblWords;
    }

    public JTextPane getTxtpEditor() {
        return txtpEditor;
    }

 
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblLines = new javax.swing.JLabel();
        lblWords = new javax.swing.JLabel();
        lblLetters = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpEditor = new javax.swing.JTextPane();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblLines.setText("Lines:");
        jPanel1.add(lblLines);

        lblWords.setText("Words:");
        jPanel1.add(lblWords);

        lblLetters.setText("Letters:");
        jPanel1.add(lblLetters);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        txtpEditor.setMargin(new java.awt.Insets(10, 3, 3, 3));
        jScrollPane2.setViewportView(txtpEditor);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLetters;
    private javax.swing.JLabel lblLines;
    private javax.swing.JLabel lblWords;
    private javax.swing.JTextPane txtpEditor;
    // End of variables declaration//GEN-END:variables
}
