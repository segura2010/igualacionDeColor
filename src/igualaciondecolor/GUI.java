/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igualaciondecolor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author alberto
 */
public class GUI extends javax.swing.JFrame {

    private PrintWriter writer = null;
    
    // Actual Image mean RGB
    private int blue = 0;
    private int red = 0;
    private int green = 0;
    // Actual color saves
    private HashMap<String, Integer> colorSaves;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        colorSaves = new HashMap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        greenVariableInput = new javax.swing.JTextField();
        blueVariableInput = new javax.swing.JTextField();
        redVariableInput = new javax.swing.JTextField();
        originalColor = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        variableColor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outFileInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fileChooser = new javax.swing.JFileChooser();
        redSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        colorSavesNumberTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Igualador de Colores");

        greenVariableInput.setText("0");
        greenVariableInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                greenVariableInputKeyTyped(evt);
            }
        });

        blueVariableInput.setText("0");
        blueVariableInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                blueVariableInputKeyTyped(evt);
            }
        });

        redVariableInput.setText("0");
        redVariableInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                redVariableInputKeyTyped(evt);
            }
        });

        originalColor.setBackground(new java.awt.Color(0, 0, 0));
        originalColor.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout originalColorLayout = new javax.swing.GroupLayout(originalColor);
        originalColor.setLayout(originalColorLayout);
        originalColorLayout.setHorizontalGroup(
            originalColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        originalColorLayout.setVerticalGroup(
            originalColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        exitBtn.setText("SALIR");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Guardar >>");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        variableColor.setBackground(new java.awt.Color(0, 0, 0));
        variableColor.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout variableColorLayout = new javax.swing.GroupLayout(variableColor);
        variableColor.setLayout(variableColorLayout);
        variableColorLayout.setHorizontalGroup(
            variableColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        variableColorLayout.setVerticalGroup(
            variableColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabel4.setText("Verde");

        jLabel5.setText("Rojo");

        jLabel6.setText("Azul");

        jLabel7.setText("Nombre del archivo de salida:");

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        redSlider.setMaximum(255);
        redSlider.setValue(0);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        blueSlider.setMaximum(255);
        blueSlider.setValue(0);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderStateChanged(evt);
            }
        });

        greenSlider.setMaximum(255);
        greenSlider.setValue(0);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderStateChanged(evt);
            }
        });

        colorSavesNumberTxt.setText("Has realizado: 0 igualaciones para el color actual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorSavesNumberTxt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outFileInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(386, 386, 386))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(originalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variableColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(redVariableInput)
                                    .addComponent(greenVariableInput)
                                    .addComponent(blueVariableInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exitBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveBtn))
                            .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outFileInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(redVariableInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(greenVariableInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(blueVariableInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(originalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(variableColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31)
                .addComponent(colorSavesNumberTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn)
                    .addComponent(saveBtn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void redVariableInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redVariableInputKeyTyped
        refreshVariableColor();
    }//GEN-LAST:event_redVariableInputKeyTyped

    private void greenVariableInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_greenVariableInputKeyTyped
        refreshVariableColor();
    }//GEN-LAST:event_greenVariableInputKeyTyped

    private void blueVariableInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blueVariableInputKeyTyped
        refreshVariableColor();
    }//GEN-LAST:event_blueVariableInputKeyTyped

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked

        try {
            
            
            if(writer == null)
                writer = new PrintWriter(outFileInput.getText(), "UTF-8");

            int redV = Integer.parseInt( redVariableInput.getText() );
            int greenV = Integer.parseInt( greenVariableInput.getText() );
            int blueV = Integer.parseInt( blueVariableInput.getText() );

            String promedio = red+";"+green+";"+blue;
            writer.println(promedio+";"+redV+";"+greenV+";"+blueV);
            writer.flush();
            colorSaves.put(promedio, colorSaves.get(promedio)+1);
            refreshColorSaves(promedio);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar archivo! :S");
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        try {
            
            if(writer != null)
            {
                writer.flush();
                writer.close();
            }
            
            System.exit(0);

            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar archivo! :S");
        }
    }//GEN-LAST:event_exitBtnMouseClicked

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        
        try{
            File photo = fileChooser.getSelectedFile();
            BufferedImage img = ImageIO.read(photo);
            
            int[] pixels = img.getRGB(0,0, img.getWidth(), img.getHeight(), null, 0, img.getWidth());
            System.out.println(pixels.length);
            
            int blueSum = 0; int redSum = 0; int greenSum = 0;
            // Calculate mean
            for(int i=0;i<pixels.length;i++)
            {
                Color c = new Color(pixels[i]);
                blueSum += c.getBlue();
                redSum += c.getRed();
                greenSum += c.getGreen();
            }
            
            blue = blueSum / pixels.length;
            red = redSum / pixels.length;
            green = greenSum / pixels.length;
            
            refreshOriginalColor();
            String promedio = red+";"+green+";"+blue;
            if(!colorSaves.containsKey(promedio))
            {
                colorSaves.put(promedio, 0);
            }
            refreshColorSaves(promedio);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al leer archivo! Asegurate de que es una imagen! :S");
            System.err.println(e);
        }
        
    }//GEN-LAST:event_fileChooserActionPerformed

    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        redVariableInput.setText(""+redSlider.getValue());
        refreshVariableColor();
    }//GEN-LAST:event_redSliderStateChanged

    private void blueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        blueVariableInput.setText(""+blueSlider.getValue());
        refreshVariableColor();
    }//GEN-LAST:event_blueSliderStateChanged

    private void greenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        greenVariableInput.setText(""+greenSlider.getValue());
        refreshVariableColor();
    }//GEN-LAST:event_greenSliderStateChanged

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    void refreshOriginalColor()
    {
        try{
            Color color = new Color(red, green, blue);
            originalColor.setBackground(color);
        }catch(Exception e)
        {
            System.err.println("ERROR");
        }
    }
    
    void refreshVariableColor()
    {
        try{
            int redI = Integer.parseInt( redVariableInput.getText() );
            int greenI = Integer.parseInt( greenVariableInput.getText() );
            int blueI = Integer.parseInt( blueVariableInput.getText() );

            Color color = new Color(redI, greenI, blueI);
            variableColor.setBackground(color);
        }catch(Exception e)
        {
            System.err.println("ERROR");
        }
    }
    
    void refreshColorSaves(String promedio)
    {
        colorSavesNumberTxt.setText("Has realizado: "+colorSaves.get(promedio)+" igualaciones para el color actual");
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider blueSlider;
    private javax.swing.JTextField blueVariableInput;
    private javax.swing.JLabel colorSavesNumberTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JTextField greenVariableInput;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel originalColor;
    private javax.swing.JTextField outFileInput;
    private javax.swing.JSlider redSlider;
    private javax.swing.JTextField redVariableInput;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel variableColor;
    // End of variables declaration//GEN-END:variables
}
