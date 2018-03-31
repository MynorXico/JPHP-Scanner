/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        StyledDocument doc = (StyledDocument)jTextPane1.getDocument();
    
        // Create a style object and then set the style attributes
        Style style = doc.addStyle("StyleName", null);

        StyleConstants.setBackground(style, new Color(0, 0, 51));
    

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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOriginal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel3.setText("PHP Lexical Analyzer");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Original PHP File");

        taOriginal.setColumns(20);
        taOriginal.setRows(5);
        jScrollPane2.setViewportView(taOriginal);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 0, 102));
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextPane1);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Corrected PHP File");

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {  
            this.Analyze();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
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
    public void Analyze() throws FileNotFoundException, BadLocationException{
        jTextPane1.setStyledDocument(new DefaultStyledDocument());
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
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter asmFilter = new FileNameExtensionFilter(".php files (*.php)", "php");
        fc.addChoosableFileFilter(asmFilter);
        fc.setFileFilter(asmFilter);
        fc.showOpenDialog(this);
        System.out.println("Closed");
        
        if(fc.getSelectedFile()==null)
            return;
        filePath = fc.getSelectedFile().getPath();
        
        FileReader fr=new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();
        String tmpString = "";
        while(currentLine != null){
            tmpString = tmpString + currentLine+"\n";
            currentLine = br.readLine();
        }
        taOriginal.setText(tmpString);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interfaz().setVisible(true);
                } catch (BadLocationException ex) {
                    java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void probarLexerFile(String filename) throws IOException, BadLocationException{
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
        String ResultadoConsola = "";
        String ResultadoArchivoErrores = "";
        String ResultadoArchivoSalida = "";
        int errores = 0;
        Style style = jTextPane1.addStyle("", null);
        while(true){
            Token token = lexer.yylex();
            if(token == null){
                ResultadoConsola = ResultadoConsola+"EOF";
                jTextArea1.setText(ResultadoConsola);
                break;
            }
            if(token == Token.ERROR){
                errores++;
                ResultadoArchivoErrores +=lexer.lineNumber+":"+ lexer.chars + "\tNot valid token:'"+lexer.lexeme+"'\n";
                ResultadoConsola = ResultadoConsola +  "Not valid token: '" +lexer.lexeme+ "' |Line Number: " + lexer.lineNumber +" \n";
                Document doc = jTextPane1.getDocument();
                StyleConstants.setBackground(style,Color.RED);
                doc.insertString(doc.getLength(), lexer.lexeme,style);
                StyleConstants.setBackground(style, Color.WHITE);
            }
            else{
                ResultadoConsola = ResultadoConsola + "TOKEN: " + token + " " + ((token==Token.NEWLINE)? "": lexer.lexeme) + "\n";
                Document doc = jTextPane1.getDocument();
                if(token == Token.VARID){
                    StyleConstants.setForeground(style, new Color(0x5C, 0X35, 0X66));
                }else if(token == Token.STRING){
                    StyleConstants.setForeground(style, new Color(0x4E,0x9A, 0x06));
                }else if(token == Token.FUNC){
                    StyleConstants.setBold(style, true);
                    StyleConstants.setForeground(style, new Color(0x55,0x57, 0x53));
                }else if(token == Token.RSRVWRDS){
                    StyleConstants.setForeground(style, new Color(0xF9,0x26, 0x72));
                }else if(token == Token.BOOL){
                    StyleConstants.setForeground(style, new Color(0xAE,0x81, 0xFF));
                }else if(token == Token.INT || token == Token.DOUBLE){
                    StyleConstants.setForeground(style, new Color(0x72,0x9F, 0xCF));
                }else if(token == Token.CTRLSTRCT){
                    if(!lexer.lexeme.equals(lexer.lexeme.toLowerCase())){
                        ResultadoArchivoErrores += lexer.lineNumber+":"+ lexer.chars + "\tLowercase control structure expected\n";
                        StyleConstants.setBackground(style,Color.YELLOW);
                        lexer.lexeme = lexer.lexeme.toLowerCase();
                    }
                    StyleConstants.setForeground(style, new Color(0xF9,0x26, 0x72));
                }else if(token == Token.CONSTANT){
                    StyleConstants.setForeground(style, new Color(0xAE, 0x81, 0xFF));
                }else if(token == Token.COMMENT){
                    StyleConstants.setForeground(style, new Color(0xC4, 0xA0, 0x00));
                }else if(token == Token.PHP){
                    StyleConstants.setForeground(style, Color.LIGHT_GRAY);
                }else if(token == Token.DB){
                    StyleConstants.setForeground(style, Color.ORANGE);
                    String content = lexer.lexeme.substring(12, lexer.lexeme.length()-2);
                    System.out.println(content);
                    if(!content.equals(content.toUpperCase())){
                        ResultadoArchivoErrores += lexer.lineNumber+":"+ lexer.chars + "\tUppercase AccessField Expected\n";
                        content = content.toUpperCase();
                        StyleConstants.setBackground(style,Color.YELLOW);
                        lexer.lexeme = "$recordset['"+content+"']";
                    }
                }
                ResultadoArchivoSalida += lexer.lexeme;
                doc.insertString(doc.getLength(), lexer.lexeme,style);
                StyleConstants.setBold(style, false);
                StyleConstants.setBackground(style, Color.WHITE);
                StyleConstants.setForeground(style, Color.black);
            }
        
               
        }
        if(errores == 0){
            // No hay errores
            File fichero = new File("errorslog.txt");
            PrintWriter writer;
            try{
                writer = new PrintWriter(fichero);
                writer.print(ResultadoArchivoErrores);
                writer.close();
            }catch (FileNotFoundException ex){
                System.out.println("An error ocurred");
            }
            fichero = new File(filePath+".out");
            try{
                writer = new PrintWriter(fichero);
                writer.print(ResultadoArchivoSalida);
                writer.close();
            }catch (FileNotFoundException ex){
                System.out.println("An error ocurred");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Analized file contains incorrigible lexical errors.\n"
                    + "open errorslog.txt to see them.");
            File fichero = new File("errorslog.txt");
            PrintWriter writer;
            try{
                writer = new PrintWriter(fichero);
                writer.print(ResultadoArchivoErrores);
                writer.close();
            }catch (FileNotFoundException ex){
                System.out.println("An error ocurred");
            }
        } 
    }
    public void validarArchivo(String filePath) throws FileNotFoundException, IOException, BadLocationException{
        this.probarLexerFile(filePath);
    }
    
 
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextArea taOriginal;
    // End of variables declaration//GEN-END:variables
}
