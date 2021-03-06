/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. TR08
 */
package php.scanner;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.tools.*;
/**
 *
 * @author Maynor
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    String filePath;
    public Interfaz() throws BadLocationException {
        initComponents();
        // Define a default background color attribute
    
        // Create a style object and then set the style attributes

    

    }

    private static Interfaz interfazUnica;
    
    public static Interfaz getInterfaz() throws BadLocationException{
        if(interfazUnica == null){
            interfazUnica = new Interfaz();
        }
        return interfazUnica;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOriginal = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 204, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Analize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("C# Semantic Analyzer");

        taOriginal.setColumns(20);
        taOriginal.setRows(5);
        jScrollPane2.setViewportView(taOriginal);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(jButton1)))
                .addGap(0, 531, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            interfazUnica.jTextArea1.setText("");
            ManejadorScopes.ResetSymboltable();
            Directory.resetDirectory();
            this.Analyze();
        } catch (Exception ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            this.LoadFile();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        String sourcePath=null;
        try {
            sourcePath = new File(".").getCanonicalPath()+"\\src" + "\\php\\scanner\\";
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

        new File(sourcePath+"Interfaz.class").delete();
        new File(sourcePath+"Interfaz$1.class").delete();
        new File(sourcePath+"Interfaz$2.class").delete();
        new File(sourcePath+"Interfaz$3.class").delete();
        new File(sourcePath+"Lexer.class").delete();
        new File(sourcePath+"Lexer.java").delete();
        new File(sourcePath+"Token.class").delete();
    }//GEN-LAST:event_formWindowClosed
    public void Analyze() throws FileNotFoundException, BadLocationException, Exception{
        
        long start = 0;
        long end = 0;
        
        start = System.currentTimeMillis();
        if(filePath==null)
            return;
        try {
            this.validarArchivo(filePath);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        end = System.currentTimeMillis();
    }
    
    public void LoadFile() throws FileNotFoundException, IOException, BadLocationException{
        // File Choosing
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter asmFilter = new FileNameExtensionFilter(".frag files (*.frag)", "frag");
        fc.addChoosableFileFilter(asmFilter);
        fc.setFileFilter(asmFilter);
        fc.showOpenDialog(this);
        
        if(fc.getSelectedFile()==null)
            return;
        filePath = fc.getSelectedFile().getPath();
        Directory.getInstancia().setPath(filePath.substring(0, filePath.lastIndexOf("\\")+1));
        FileReader fr=new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();
        String tmpString = "";
        while(currentLine != null){
            tmpString = tmpString + currentLine+"\n";
            currentLine = br.readLine();
        }
        // Fills text area with original PHP file content
        taOriginal.setText(tmpString);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws BadLocationException {
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Interfaz.getInterfaz().show();
    }
    
    public void probarLexerFile(String filename) throws IOException, BadLocationException, Exception{
        /*
        File fichero = new File("fichero.txt");
        PrintWriter writer;
        try{
            writer = new PrintWriter(fichero);
            writer.print(jTextField1.getText());
            writer.close();
        }catch (FileNotFoundException ex){
            System.out.println("An error ocurred");
        }
        */
        Reader reader = new BufferedReader(new FileReader(filename));
        Lexer lexer = new Lexer(reader);
        Directory.AddFile(new File(filename).getName());
        Directory.SetCurrentFile(new File(filename).getName());
        parser p = new parser(lexer);
        
        String consola = "";
        try{
            System.out.println("*************************************");        
       
            p.parse();
            AddTextToJTextArea("El analisis finalizo exitosamente.");
            System.out.println("Terminó exitosamente el análisis");        
        }catch(Exception e){
            AddTextToJTextArea("Ocurrio un error irrecuperable.");
            System.out.println("Terminó el análisis con errores.");          
        }
        ManejadorScopes.getInstancia().CreateSymbolTable();
        String ResultadoConsola = "";
        String ResultadoArchivoErrores = "";
        String ResultadoArchivoSalida = "";
        int errores = 0;
      
        
    }
    public void validarArchivo(String filePath) throws FileNotFoundException, IOException, BadLocationException, Exception{
        this.probarLexerFile(filePath);
    }
    
    public void AddTextToJTextArea(String s){
        jTextArea1.setText(jTextArea1.getText()+s);
    }
 
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea taOriginal;
    // End of variables declaration//GEN-END:variables
}
