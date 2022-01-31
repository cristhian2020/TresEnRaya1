package dba;


import javax.swing.JButton;
import javax.swing.JLabel;
//import com.sun.prism.paint.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    private JLabel [][] casillas;
     JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;    
    public Vista() {
        
        casillas = new JLabel[5][5];     
        initComponents();
        asignarCasillas();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo,this);
        rsscalelabel.RSScaleLabel.setScaleLabel(J1icon,"src/LetraOCincoEnRaya.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(J2icon,"src/XcincoEnRaya.png");
    }
    public String GuardarArchivo(File archivo, String documento){
     String mensaje = null;
     try{
        salida = new FileOutputStream(archivo);
        byte[] bytxt=documento.getBytes();
        salida.write(bytxt);
        mensaje = "archivo Guardado Exitosamente";
     }catch(Exception e){}  
     return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla3 = new javax.swing.JLabel();
        casilla4 = new javax.swing.JLabel();
        casilla5 = new javax.swing.JLabel();
        casilla6 = new javax.swing.JLabel();
        casilla7 = new javax.swing.JLabel();
        casilla8 = new javax.swing.JLabel();
        casilla9 = new javax.swing.JLabel();
        casilla10 = new javax.swing.JLabel();
        casilla11 = new javax.swing.JLabel();
        casilla12 = new javax.swing.JLabel();
        casilla13 = new javax.swing.JLabel();
        casilla14 = new javax.swing.JLabel();
        casilla15 = new javax.swing.JLabel();
        casilla16 = new javax.swing.JLabel();
        casilla17 = new javax.swing.JLabel();
        casilla18 = new javax.swing.JLabel();
        casilla19 = new javax.swing.JLabel();
        casilla20 = new javax.swing.JLabel();
        casilla21 = new javax.swing.JLabel();
        casilla22 = new javax.swing.JLabel();
        casilla23 = new javax.swing.JLabel();
        casilla24 = new javax.swing.JLabel();
        casilla25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        j1victorias = new javax.swing.JLabel();
        j2Victorias = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        botonReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        J2icon = new javax.swing.JLabel();
        J1icon = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        casilla1.setBackground(new java.awt.Color(255, 255, 255));
        casilla1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla1.setOpaque(true);
        casilla1.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla2.setBackground(new java.awt.Color(255, 255, 255));
        casilla2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla2.setOpaque(true);
        casilla2.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla3.setBackground(new java.awt.Color(255, 255, 255));
        casilla3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla3.setOpaque(true);
        casilla3.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla4.setBackground(new java.awt.Color(255, 255, 255));
        casilla4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla4.setOpaque(true);
        casilla4.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla5.setBackground(new java.awt.Color(255, 255, 255));
        casilla5.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla5.setOpaque(true);
        casilla5.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla6.setBackground(new java.awt.Color(255, 255, 255));
        casilla6.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla6.setOpaque(true);
        casilla6.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla7.setBackground(new java.awt.Color(255, 255, 255));
        casilla7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla7.setOpaque(true);
        casilla7.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla8.setBackground(new java.awt.Color(255, 255, 255));
        casilla8.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla8.setOpaque(true);
        casilla8.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla9.setBackground(new java.awt.Color(255, 255, 255));
        casilla9.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla9.setOpaque(true);
        casilla9.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla10.setBackground(new java.awt.Color(255, 255, 255));
        casilla10.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla10.setOpaque(true);
        casilla10.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla11.setBackground(new java.awt.Color(255, 255, 255));
        casilla11.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla11.setOpaque(true);
        casilla11.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla12.setBackground(new java.awt.Color(255, 255, 255));
        casilla12.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla12.setOpaque(true);
        casilla12.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla13.setBackground(new java.awt.Color(255, 255, 255));
        casilla13.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla13.setOpaque(true);
        casilla13.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla14.setBackground(new java.awt.Color(255, 255, 255));
        casilla14.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla14.setOpaque(true);
        casilla14.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla15.setBackground(new java.awt.Color(255, 255, 255));
        casilla15.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla15.setOpaque(true);
        casilla15.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla16.setBackground(new java.awt.Color(255, 255, 255));
        casilla16.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla16.setOpaque(true);
        casilla16.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla17.setBackground(new java.awt.Color(255, 255, 255));
        casilla17.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla17.setOpaque(true);
        casilla17.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla18.setBackground(new java.awt.Color(255, 255, 255));
        casilla18.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla18.setOpaque(true);
        casilla18.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla19.setBackground(new java.awt.Color(255, 255, 255));
        casilla19.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla19.setOpaque(true);
        casilla19.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla20.setBackground(new java.awt.Color(255, 255, 255));
        casilla20.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla20.setOpaque(true);
        casilla20.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla21.setBackground(new java.awt.Color(255, 255, 255));
        casilla21.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla21.setOpaque(true);
        casilla21.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla22.setBackground(new java.awt.Color(255, 255, 255));
        casilla22.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla22.setOpaque(true);
        casilla22.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla23.setBackground(new java.awt.Color(255, 255, 255));
        casilla23.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla23.setOpaque(true);
        casilla23.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla24.setBackground(new java.awt.Color(255, 255, 255));
        casilla24.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla24.setOpaque(true);
        casilla24.setPreferredSize(new java.awt.Dimension(50, 50));

        casilla25.setBackground(new java.awt.Color(255, 255, 255));
        casilla25.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        casilla25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla25.setOpaque(true);
        casilla25.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(casilla16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(casilla17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casilla25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 310, 310));

        jLabel27.setText("Jugador 1:");
        jLabel27.setOpaque(true);
        jLabel27.setPreferredSize(new java.awt.Dimension(40, 25));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 60, -1));

        jLabel28.setText("Jugador 2:");
        jLabel28.setOpaque(true);
        jLabel28.setPreferredSize(new java.awt.Dimension(40, 25));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, -1));

        j1victorias.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        j1victorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j1victorias.setText("0");
        j1victorias.setOpaque(true);
        j1victorias.setPreferredSize(new java.awt.Dimension(40, 25));
        getContentPane().add(j1victorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 60, -1));

        j2Victorias.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        j2Victorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j2Victorias.setText("0");
        j2Victorias.setOpaque(true);
        j2Victorias.setPreferredSize(new java.awt.Dimension(40, 25));
        getContentPane().add(j2Victorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 60, -1));

        jLabel31.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel31.setText("Victorias:");
        jLabel31.setOpaque(true);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, -1));

        botonReset.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        botonReset.setText("Reiniciar ");
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });
        getContentPane().add(botonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        j1.setText("Nombre");
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        j2.setText("Nombre 2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 40));
        getContentPane().add(J2icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 90, 70));
        getContentPane().add(J1icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 90, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            if( seleccionar.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION ){
        archivo=seleccionar.getSelectedFile();
        if(archivo.getName().endsWith("txt")){
           String Documento=j1.getText()+ "    =" + "    " +j1victorias.getText()+
                   "     ="+j2.getText()+ "   " +j2Victorias.getText();
           //String doc=j2.getText();
           String mensaje = GuardarArchivo(archivo,Documento);
           if(mensaje!=null){
              JOptionPane.showMessageDialog(null, mensaje);
           }else{
               JOptionPane.showMessageDialog(null, "Archivo no compatible");
           }
        }else{
            JOptionPane.showMessageDialog(null,"Guardar documento de texto");
        }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J1icon;
    private javax.swing.JLabel J2icon;
    private javax.swing.JButton botonReset;
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla10;
    private javax.swing.JLabel casilla11;
    private javax.swing.JLabel casilla12;
    private javax.swing.JLabel casilla13;
    private javax.swing.JLabel casilla14;
    private javax.swing.JLabel casilla15;
    private javax.swing.JLabel casilla16;
    private javax.swing.JLabel casilla17;
    private javax.swing.JLabel casilla18;
    private javax.swing.JLabel casilla19;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla20;
    private javax.swing.JLabel casilla21;
    private javax.swing.JLabel casilla22;
    private javax.swing.JLabel casilla23;
    private javax.swing.JLabel casilla24;
    private javax.swing.JLabel casilla25;
    private javax.swing.JLabel casilla3;
    private javax.swing.JLabel casilla4;
    private javax.swing.JLabel casilla5;
    private javax.swing.JLabel casilla6;
    private javax.swing.JLabel casilla7;
    private javax.swing.JLabel casilla8;
    private javax.swing.JLabel casilla9;
    private javax.swing.JTextField j1;
    private javax.swing.JLabel j1victorias;
    private javax.swing.JTextField j2;
    private javax.swing.JLabel j2Victorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables

    private void asignarCasillas() {
        casillas[0][0] = casilla1;
        casillas[0][1] = casilla2;
        casillas[0][2] = casilla3;
        casillas[0][3] = casilla4;
        casillas[0][4] = casilla5;
        casillas[1][0] = casilla6;
        casillas[1][1] = casilla7;
        casillas[1][2] = casilla8;
        casillas[1][3] = casilla9;
        casillas[1][4] = casilla10;
        casillas[2][0] = casilla11;
        casillas[2][1] = casilla12;
        casillas[2][2] = casilla13;
        casillas[2][3] = casilla14;
        casillas[2][4] = casilla15;
        casillas[3][0] = casilla16;
        casillas[3][1] = casilla17;
        casillas[3][2] = casilla18;
        casillas[3][3] = casilla19;
        casillas[3][4] = casilla20;
        casillas[4][0] = casilla21;
        casillas[4][1] = casilla22;
        casillas[4][2] = casilla23;
        casillas[4][3] = casilla24;
        casillas[4][4] = casilla25;
    }
    public JLabel[][]getCasillas(){
        return casillas;
    }
    public JLabel getVictoriasJ1(){
        return j1victorias;
    }
    public JLabel getVictoriasJ2(){
        return j2Victorias;
    }
    public JButton getbotonReset(){
        return botonReset;
    }
}
