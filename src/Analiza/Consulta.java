
package Analiza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Consulta extends javax.swing.JFrame {

    List<identificador> tokenslist;
    public Consulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        Consulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setText("Error sintaxis");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setDisabledTextColor(new java.awt.Color(102, 0, 204));
        jTextArea3.setDragEnabled(true);
        jTextArea3.setEnabled(false);
        jScrollPane4.setViewportView(jTextArea3);

        jLabel3.setText("Escribe la consulta");

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(242, 112, 112));
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(196, 171, 35));
        jTextArea1.setDisabledTextColor(new java.awt.Color(242, 21, 13));
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mensaje");

        jButton1.setText("Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(196, 196, 196))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jButton2)
                                    .addGap(10, 10, 10))))
                        .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)))
                    .addContainerGap()))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel3)))
                    .addGap(15, 15, 15)
                    .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        Escritorio.setLayer(Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            probarLexerFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("");
        Consulta.setText("");
        jTextArea3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }
    public void probarLexerFile() throws IOException{
        int contIDs=0;
        tokenslist = new LinkedList<identificador>();
        File fichero = new File ("fichero.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(Consulta.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        String resultado2="";
        while (true){
            Token token =lexer.yylex();
            identificador tokenitem=new identificador();
            if (token == null){
                for(int i=0;i<tokenslist.size();i++){
                    System.out.println(tokenslist.get(i).nombre + "=" + tokenslist.get(i).ID + tokenslist.get(i).Tiṕo);
                }
                
                jTextArea1.setText(resultado);
               // JOptionPane.showMessageDialog(this," "+ resultado2);
              jTextArea3.setText(resultado2);
                return;
            }
            switch (token){
               case SELEC:
                    contIDs++;                   
                    tokenitem.nombre="consulta";
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "Select correcto";                 
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "Consulta Exitosa \n";
                      Select p=new Select();
        Escritorio.add(p);
           p.setVisible(true);
           p.toFront();
                   
                    break;
                case SELECDIR:
                    contIDs++;                   
                    tokenitem.nombre="consulta";
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "Select correcto directo ";                 
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "Consulta Exitosa \n";
                    
                    
                    break;
                   
                case INSER:
                     contIDs++;                   
                    tokenitem.nombre="consulta";
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "consulta";                 
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "<Ingreso Exitoso\n";
                    break;
                    
                case UPDAT:
                     contIDs++;                   
                    tokenitem.nombre="consulta";
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "consulta";                 
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "Actualizacion exitosa \n";
                    break;
                    
                case DELET:
                     contIDs++;                   
                    tokenitem.nombre="delete";
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "consulta";                 
                    tokenslist.add(tokenitem);
                    resultado=resultado+ " Borrado exitoso\n";
                    break;
                    
                case ERRO:
                    contIDs=0;
                     contIDs++;                   
                    tokenitem.nombre="Error";
                 
                    tokenitem.ID=contIDs;
                    tokenitem.Tiṕo= "Error";                 
                    tokenslist.add(tokenitem);
                    resultado2=resultado2+ "Error de sintaxis\n";
                    break;
    
                default:
                    resultado2=resultado2+ "Error de sintaxis \n";
                    break;
            
               
            }
    }
 }
    
             
 
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Consulta;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables

   
}
