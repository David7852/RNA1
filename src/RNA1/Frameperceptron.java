package RNA1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frameperceptron extends javax.swing.JFrame 
{
    private final File vr;
    ArrayList<Pun> liX=new ArrayList<>();
    Perceptron N=new Perceptron();
    
    ImageIcon icon = new ImageIcon("ico.png");
    
    public Frameperceptron() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
        vr=new File("./puntos.txt");
        read();
        
        setVisible(true);
        setLocation(30, 30);
        Mensaje.setVisible(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBlimpiar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBprocesar = new javax.swing.JButton();
        Slideralpha = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SliderIterations = new javax.swing.JSlider();
        JTA = new javax.swing.JTextField();
        JTN = new javax.swing.JTextField();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perceptron");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImage(icon.getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        JBlimpiar.setBackground(new java.awt.Color(255, 255, 255));
        JBlimpiar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        JBlimpiar.setText("Limpiar");
        JBlimpiar.setEnabled(false);
        JBlimpiar.setFocusPainted(false);
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        JBguardar.setBackground(new java.awt.Color(255, 255, 255));
        JBguardar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        JBguardar.setText("Guardar");
        JBguardar.setEnabled(false);
        JBguardar.setFocusPainted(false);
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        JBingresar.setBackground(new java.awt.Color(255, 255, 255));
        JBingresar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        JBingresar.setText("Ingresar puntos");
        JBingresar.setFocusPainted(false);
        JBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBingresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perceptron");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        JBprocesar.setBackground(new java.awt.Color(255, 255, 255));
        JBprocesar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        JBprocesar.setText("Procesar");
        JBprocesar.setFocusPainted(false);
        JBprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprocesarActionPerformed(evt);
            }
        });

        Slideralpha.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Slideralpha.setMinimum(1);
        Slideralpha.setPaintLabels(true);
        Slideralpha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Slideralpha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlideralphaStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Taza de aprendizaje:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("No. de Iteraciones:");

        SliderIterations.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        SliderIterations.setMaximum(200);
        SliderIterations.setMinimum(1);
        SliderIterations.setToolTipText("");
        SliderIterations.setValue(100);
        SliderIterations.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderIterationsStateChanged(evt);
            }
        });

        JTA.setEditable(false);
        JTA.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        JTA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTA.setText("0.05");
        JTA.setBorder(null);

        JTN.setEditable(false);
        JTN.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        JTN.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTN.setText("100");
        JTN.setBorder(null);

        Mensaje.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(102, 102, 102));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Esperando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JTA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBprocesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Slideralpha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SliderIterations, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(JBingresar)
                        .addGap(18, 18, 18)
                        .addComponent(JBprocesar)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Slideralpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SliderIterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBlimpiar)
                    .addComponent(JBguardar)
                    .addComponent(Mensaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void read() throws FileNotFoundException, IOException
    {
        FileReader fvr=new FileReader(vr);
        BufferedReader Buff=new BufferedReader(fvr);
        String so;
        so=Buff.readLine();
        if(so==null)
            JBprocesar.setEnabled(false);
        else
        {
            JBprocesar.setEnabled(true);
            for(;so!=null;so=Buff.readLine())
            {
                int x,y;
                short signo;
                x= Integer.parseInt(so.substring(0,so.indexOf(",")));
                so=so.substring(so.indexOf(",")+1);
                y= Integer.parseInt(so.substring(0,so.indexOf(",")));
                so=so.substring(so.indexOf(",")+1);
                signo=(short)Integer.parseInt(so);
                Pun p=new Pun(x, y, signo);
                liX.add(p);
            }
        }
        
    }
    public void write(boolean w)
    {
        FileWriter fw = null;
        try {
            fw = new FileWriter(vr,w);
            BufferedWriter bw=new BufferedWriter(fw);
            for(Pun p: liX)
            {
                String t=(int)p.x+","+(int)p.y+","+p.signo+"\r\n";
                bw.append(t);
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
            
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
        if(jPanel1.getBackground()==Color.white&&liX.size()<100)
        {
            JBprocesar.setEnabled(false);
            if(evt.getButton()==MouseEvent.BUTTON1)
                liX.add(new Pun((double)evt.getX(), (double)evt.getY(), (short) 1));
            else if(evt.getButton()==MouseEvent.BUTTON3)
                liX.add(new Pun((double)evt.getX(), (double)evt.getY(), (short) -1));
            repaint();
        }
        if(liX.size()==100)
        {
            Mensaje.setVisible(true);
            Mensaje.setText("Maximo de 100 puntos");
        }
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        JBprocesar.setEnabled(false);
        liX.clear();
        N.OBLIVION();
        Mensaje.setVisible(false);
        repaint();
    }//GEN-LAST:event_JBlimpiarActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        JBprocesar.setEnabled(true);
        Mensaje.setVisible(false);
        write(false);
        //al guardar, crear archivo .txt con pos relativa al panel
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBingresarActionPerformed
        jPanel1.setBackground(Color.white);
        JBguardar.setEnabled(true);
        JBlimpiar.setEnabled(true);
        JBprocesar.setEnabled(false);
        Mensaje.setVisible(false);
        repaint();  
    }//GEN-LAST:event_JBingresarActionPerformed

    private void JBprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprocesarActionPerformed
        //leer el archivo y procesar los puntos
        jPanel1.setBackground(this.getBackground());
        Mensaje.setVisible(true);
        ArrayList<Pun> aux=new ArrayList<>();
        for(Pun p:liX)
        {
            aux.add(new Pun((double)(p.x-302/2)/10, (double)(302/2-p.y)/10, p.signo));
        }
        Mensaje.setText("Esperando...");
        N.Learn(aux);
        repaint();
    }//GEN-LAST:event_JBprocesarActionPerformed

    private void SlideralphaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlideralphaStateChanged
        double v=(double)Slideralpha.getValue()/1000;
        JTA.setText(""+v);
        N.alpha=v;
    }//GEN-LAST:event_SlideralphaStateChanged

    private void SliderIterationsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderIterationsStateChanged
        int v=SliderIterations.getValue();
        JTN.setText(""+v);
        N.iterations=v;
    }//GEN-LAST:event_SliderIterationsStateChanged

    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        Graphics h=jPanel1.getGraphics();
        
        for(Pun p:liX)
        {
            if(p.signo==1)
                h.setColor(Color.getHSBColor((float) 0.6, (float) 0.6, (float) 0.9));
            else
                h.setColor(Color.magenta);
            
            h.drawLine((int)p.x-3, (int)p.y, (int)p.x+3, (int)p.y);
            h.drawLine((int)p.x, (int)p.y-3, (int)p.x, (int)p.y+3);
        }
        if(N.ready)
        {
            double x1=-10;
            double y = (double) -(x1* N.w1 / N.w2) - ((N.x0 * N.w0) / N.w2);
            double shift=302/2;
            Point p1=new Point(0,(int)(shift-y*10));
            x1=10;
            double y2 =(double) -(x1* N.w1 / N.w2) + ((N.w0) / N.w2);
            Point p2=new Point(302,(int)(shift-y2*10));
            if(N.w2!=0)
            {
                h.setColor(Color.orange);
                h.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
            if(N.c==N.iterations)
                Mensaje.setText("Alcanzo el max. de iteraciones");
            else
                Mensaje.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(Frameperceptron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frameperceptron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frameperceptron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frameperceptron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frameperceptron().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Frameperceptron.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBingresar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JButton JBprocesar;
    private javax.swing.JTextField JTA;
    private javax.swing.JTextField JTN;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JSlider SliderIterations;
    private javax.swing.JSlider Slideralpha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
