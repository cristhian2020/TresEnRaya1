package dba;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Controlador {
    private Vista vista;
    private Modelo modelo;
    private JLabel[][] casillas;
    
   

    Controlador(Modelo modelo, Vista vista) {
        this.vista = vista;
        this.modelo = modelo;
        casillas = vista.getCasillas();
        agregarListeners();
        crearJugadores();
    }

    private void agregarListeners() {
        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
              agregarEventoMouse(i,j);
            
            }
        }
        JButton botonReset = vista.getbotonReset();
         botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.resetGame(casillas);
            }
        });
    }

    private void agregarEventoMouse(int i, int j) {
       JLabel casillaAct = casillas [i][j];
       casillaAct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modelo.marcarCasilla(i,j,casillas);
            }
        });
    }
    private void crearJugadores() {
        JLabel j1 = vista.getVictoriasJ1();
        JLabel j2 = vista.getVictoriasJ2();
        modelo.setJugadores(j1,j2);
    }
    
}
