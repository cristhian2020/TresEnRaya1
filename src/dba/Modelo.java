package dba;


import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
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
public class Modelo {

    private boolean termino;
    private boolean empate;
    private JLabel cuadroj1;
    private JLabel cuadroj2;
    private String[][] tablero;
    private String turno;
    private int cantMovidas;
    private int victoriasJ1;
    private int victoriasJ2;
    Color colorjugador1 = Color.RED;
    Color lalo = JColorChooser.showDialog(cuadroj1, turno, colorjugador1);
    
    public Modelo(){
     turno = "x";
     termino = false;
     empate = false;
     tablero = new String[5][5];
     
    }

    public void marcarCasilla(int i, int j, JLabel[][] casillas) {
        if (!termino) {
            if (tablero[i][j] == null) {
                tablero[i][j] = turno;
                casillas[i][j].setText(turno);
                casillas[i][j].setForeground(lalo);
                cantMovidas++;
                verificarEstado();
                if (!termino) {
                    if (turno.equals("X")) {
                        turno = "O";
                    } else {
                        turno = "X";
                    }
                }else{
                    terminarJuego();
                }
            }
        }
        
    }

    void setJugadores(JLabel j1, JLabel j2) {
        cuadroj1 = j1;
        cuadroj2 = j2;
        
    }

    void resetGame(JLabel[][] casillas) {
        turno = "X";
        termino = false;
        empate = false;
        cantMovidas = 0;
        for (int i = 0; i < 5; i++) {        
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = null;
                casillas[i][j].setText("");
            }
        }
    
    }

    private void terminarJuego() {
        if(empate){
            JOptionPane.showMessageDialog(null, "Empate");
        }else{
            if(turno.equals("X")){
                victoriasJ1++;
                cuadroj1.setText(String.valueOf(victoriasJ1));
                JOptionPane.showMessageDialog(null, "Victoria del jugador 1");  
            }else{
                victoriasJ2++;
                cuadroj2.setText(String.valueOf(victoriasJ2));
                JOptionPane.showMessageDialog(null, "victoria del jugador 2");
            }
        }
    }

    private void verificarEstado() {
      verificarFilas();
        if (!termino) {
            verificarColumnas();
            if (!termino) {
                verificarDiagonalP();
                if (!termino) {
                    verificarDiagonalS();
                    if (!termino) {
                        if (cantMovidas >= 21) {
                            verificarFilas();
                            verificarColumnas();
                            verificarDiagonalS();
                            empate = true;
                            termino = true;
                        
                        }
                    }

                }
            }
        }
    }

    private void verificarFilas() {
        for (int i = 0; i < 5 && !termino; i++) {
            boolean win = true;
            for (int j = 0; j < 5 && win; j++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
            }
            if (win) {
                termino = true;
            }
        }
    }

    private void verificarColumnas() {
        for (int j = 0; j < 5 && !termino; j++) {
            boolean win = true;
            for (int i = 0; i < 5 && win; i++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
            }
            if (win) {
                termino = true;
            }
        }
    }

    private void verificarDiagonalP() {

        boolean win = true;
        for (int i = 0; i < 5 && win; i++) {
            if (tablero[i][i] == null || !tablero[i][i].equals(turno)) {
                win = false;
            }
        }
        if (win) {
            termino = true;
        }

    }
     private void verificarDiagonalS() {

        boolean win = true;
        int j = 4;
        for (int i = 0; i < 5 && win; i++, j--) {
            if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                win = false;
            }
        }
        if (win) {
            termino = true;
        }

    }
    
}
