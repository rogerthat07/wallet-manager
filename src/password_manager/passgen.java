/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_manager;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author sunnyladdy
 */
public class passgen extends javax.swing.JInternalFrame {

    /**
     * Creates new form passwordgenerator
     */
    boolean letterflag,upperflag,lowerflag,digitsflag,punctuationsflag;
    private static final String UPPER = "QWERTZUIOPASDFGHJKLYXCVBNM";
    private static final String LOWER = "qwertzuiopasdfghjklyxcvbnm";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "é,;.:-_*?=})](/{&%+$#'!<>\\\"`~!|@\\'";
    public passgen() {
        initComponents();
        letterflag = true;
        letters.setSelected(true);
        upperflag = false;
        lowerflag = false;
        digitsflag = false;
        punctuationsflag = false;
        slider.setMinorTickSpacing(5);  
        slider.setMajorTickSpacing(5);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);
        myfunc2();
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
        generatedpassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        strength = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        length = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        letters = new javax.swing.JCheckBox();
        lower = new javax.swing.JCheckBox();
        upper = new javax.swing.JCheckBox();
        digit = new javax.swing.JCheckBox();
        punctuation = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Password Generator");

        jPanel1.setBackground(new java.awt.Color(98, 190, 43));

        generatedpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generatedpassword.setForeground(new java.awt.Color(255, 255, 255));
        generatedpassword.setText("generatedpassword");
        generatedpassword.setToolTipText("");

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Copy Password");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Strength - ");

        strength.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        strength.setForeground(new java.awt.Color(255, 255, 255));
        strength.setText("15%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(strength))
                    .addComponent(generatedpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(generatedpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(strength))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabel2.setText("Length(");

        length.setText("4");

        jLabel4.setText(")");

        slider.setMaximum(29);
        slider.setMinimum(4);
        slider.setPaintTicks(true);
        slider.setValue(4);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        letters.setBackground(new java.awt.Color(255, 255, 255));
        letters.setText("Letters");
        letters.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lettersItemStateChanged(evt);
            }
        });

        lower.setBackground(new java.awt.Color(255, 255, 255));
        lower.setText(" Lower Case Leters");
        lower.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lowerItemStateChanged(evt);
            }
        });

        upper.setBackground(new java.awt.Color(255, 255, 255));
        upper.setText("Upper Case Leters");
        upper.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                upperItemStateChanged(evt);
            }
        });

        digit.setBackground(new java.awt.Color(255, 255, 255));
        digit.setText("Digits");
        digit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                digitItemStateChanged(evt);
            }
        });

        punctuation.setBackground(new java.awt.Color(255, 255, 255));
        punctuation.setText("Punctuations");
        punctuation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                punctuationItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(punctuation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(length)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 235, Short.MAX_VALUE))
                    .addComponent(letters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(digit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(length)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(letters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(punctuation)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String generate(boolean useLower,boolean useUpper,boolean useDigits,boolean usePunctuation) {
        // Argument Validation.
        int len = slider.getValue();
        length.setText(String.valueOf(slider.getValue()));
        if(len<=9)
        {
            jPanel1.setBackground(Color.RED);
            strength.setText("12%");
        }
        else if(len<=18)
        {
            jPanel1.setBackground(Color.ORANGE);
            strength.setText("45%");
        }
        else if(len<=23)
        {
            jPanel1.setBackground(Color.CYAN);
            strength.setText("88%");
        }
        else
        {
            jPanel1.setBackground(Color.GREEN);
            strength.setText("100%");
        }
        if (len <= 0) {
            return "";
        }

        // Variables.
        StringBuilder password = new StringBuilder(len);
        Random random = new Random(System.nanoTime());

        // Collect the categories to use.
        List<String> charCategories = new ArrayList<>(4);
        if (useLower) {
            charCategories.add(LOWER);
        }
        if (useUpper) {
            charCategories.add(UPPER);
        }
        if (useDigits) {
            charCategories.add(DIGITS);
        }
        if (usePunctuation) {
            charCategories.add(PUNCTUATION);
        }

        // Build the password.
        for (int i = 0; i < len; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }
    
    public void myfunc2()
    {
        if(letterflag==true)
        {
            generatedpassword.setText(generate(letterflag,letterflag,digitsflag,punctuationsflag));
        }
        else
        {
            generatedpassword.setText(generate(lowerflag,upperflag,digitsflag,punctuationsflag));
        }
    }
    
    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        myfunc2();
    }//GEN-LAST:event_sliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        myfunc2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lettersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lettersItemStateChanged
        if(letters.isSelected())
        {
            letterflag = true;
            upper.setSelected(false);
            upper.disable();
            upper.setBackground(Color.GRAY);
            upperflag = false;
            lower.setSelected(false);
            lowerflag = false;
            lower.setBackground(Color.GRAY);
            lower.disable();
        }
        else if(!digit.isSelected()&&!punctuation.isSelected())
        {
            letters.setSelected(true);
            letterflag = true;
            upper.disable();
            lower.disable();
        }
        else
        {
            upper.setBackground(Color.WHITE);
            lower.setBackground(Color.WHITE);
            upper.enable();
            lower.enable();
            letterflag = false;
        }
        if(letterflag==true)
        {
            myfunc2();
        }
    }//GEN-LAST:event_lettersItemStateChanged

    private void lowerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lowerItemStateChanged
        if(letterflag == true)
        {
            lowerflag = false;
            upperflag = false;
            lower.setSelected(false);
            upper.setSelected(false);
            letters.setSelected(true);
        }
        else
        {
            if(lowerflag != true)
            {
                lowerflag = true;
                upperflag = false;
                myfunc2();
            }
            else if(lower.isSelected()&&upper.isSelected())
            {
                lowerflag = false;
                upperflag = false;
                lower.setSelected(false);
                upper.setSelected(false);
                lower.disable();
                upper.disable();
                lower.setBackground(Color.GRAY);
                upper.setBackground(Color.GRAY);
                letters.setSelected(true);
            }
            else if(!upper.isSelected()&&!digit.isSelected()&&!punctuation.isSelected())
            {
                lowerflag = true;
                lower.setSelected(true);
            }
            else
            {
                lowerflag = false;
            }
        }
    }//GEN-LAST:event_lowerItemStateChanged

    private void upperItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_upperItemStateChanged
        if(letterflag == true)
        {
            lowerflag = false;
            upperflag = false;
            lower.setSelected(false);
            upper.setSelected(false);
            letters.setSelected(true);
        }
        else
        {
            if(upperflag != true)
            {
                lowerflag = false;
                upperflag = true;
                myfunc2();
            }
            else if(lower.isSelected()&&upper.isSelected())
            {
                lowerflag = false;
                upperflag = false;
                lower.setSelected(false);
                upper.setSelected(false);
                lower.disable();
                upper.disable();
                lower.setBackground(Color.GRAY);
                upper.setBackground(Color.GRAY);
                letters.setSelected(true);
            }
            else if(!lower.isSelected()&&!digit.isSelected()&&!punctuation.isSelected())
            {
                upperflag = true;
                upper.setSelected(true);
            }
            else
            {
                upperflag = false;
            }
        }
    }//GEN-LAST:event_upperItemStateChanged

    private void digitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_digitItemStateChanged
        if(digit.isSelected())
        {
            digitsflag = true;
            myfunc2();
        }
        else
        {
            digitsflag = false;
        }
    }//GEN-LAST:event_digitItemStateChanged

    private void punctuationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_punctuationItemStateChanged
        if(punctuation.isSelected())
        {
            punctuationsflag = true;
            myfunc2();
        }
        else
        {
            punctuationsflag = false;
        }
    }//GEN-LAST:event_punctuationItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StringSelection stringSelection = new StringSelection (generatedpassword.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        JOptionPane.showMessageDialog(this, "Copyied to Clipboard...");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox digit;
    private javax.swing.JLabel generatedpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel length;
    private javax.swing.JCheckBox letters;
    private javax.swing.JCheckBox lower;
    private javax.swing.JCheckBox punctuation;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel strength;
    private javax.swing.JCheckBox upper;
    // End of variables declaration//GEN-END:variables
}
