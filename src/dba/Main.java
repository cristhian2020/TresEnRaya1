package dba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Main {
    public static void main(String args[]){
       Inicio inicio = new Inicio();
       Modelo modelo = new Modelo();
       Vista vista = new Vista();
       Controlador controlador = new Controlador(modelo, vista);
       vista.setLocationRelativeTo(null);
       inicio.setVisible(true);
    }
}
