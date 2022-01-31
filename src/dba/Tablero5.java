package dba;
import javax.swing.JOptionPane;
/**
 *
 * @author jesus
 */
public class Tablero5 extends javax.swing.JFrame {

    String[][] matriz=new String[6][6];
    int mejorfila, mejorcolumna;
    public Tablero5() {
        initComponents();
        InicializarMatriz5();
        this.setLocationRelativeTo(null);
    }
     private void InicializarMatriz5(){
        matriz[1][1]="-";
        matriz[1][2]="-";
        matriz[1][3]="-";
        matriz[1][4]="-";
        matriz[1][5]="-";
        matriz[2][1]="-";
        matriz[2][2]="-";
        matriz[2][3]="-";
        matriz[2][4]="-";
        matriz[2][5]="-";
        matriz[3][1]="-";
        matriz[3][2]="-";
        matriz[3][3]="-";
        matriz[3][4]="-";
        matriz[3][5]="-";
        matriz[4][1]="-";
        matriz[4][2]="-";
        matriz[4][3]="-";
        matriz[4][4]="-";
        matriz[4][5]="-";
        matriz[5][1]="-";
        matriz[5][2]="-";
        matriz[5][3]="-";
        matriz[5][4]="-";
        matriz[5][5]="-";
           
    }
     
     
    private void unounoMouseClicked (java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.unouno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[1][1] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.unouno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[1][1]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
            
        else if ((this.unouno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(dios.isSelected())) {
            this.matriz[1][1] = "X";
            impTablero5();
            Maquina5 m = new Maquina5();
            this.turno.setText("Maquina");
            m.NivelDios5(1, this);
            this.matriz[this.mejorfila][this.mejorcolumna] = "O";
            impTablero5();
            this.turno.setText("Humano"); 
            Evaluar(m);
      }
    }                                   
    private void unounoMouseReleased(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
       
    }                                    
    private void unounoMouseEntered(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
         /*if(unouno.getText().equals("")){
             band=true;
            if(turno.getText().equals("Humano")) unouno.setText("X");
        }*/
    }                                   
    private void unounoMouseExited(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        /*if(band==true)unouno.setText("");
        band=false;*/
    }
    private void unodosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.unodos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[1][2] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.unodos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[1][2]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.unodos.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[1][2] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }  
    private void unotreMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.unotre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[1][3] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.unotre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[1][3]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.unotre.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[1][3] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }  
    private void unocuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.unocua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[1][4] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.unocua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[1][4]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.unocua.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[1][4] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }  
    private void unocinMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.unocin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[1][5] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.unocin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[1][5]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.unocin.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[1][5] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }                                
    
    private void dosunoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.dosuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[2][1] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.dosuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[2][1]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.dosuno.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[2][1] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void dosdosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.dosdos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[2][2] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.dosdos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[2][2]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.dosdos.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[2][2] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void dostreMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.dostre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[2][3] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.dostre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[2][3]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.dostre.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[2][3] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }             
    private void doscuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.doscua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[2][4] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.doscua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[2][4]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.doscua.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[2][4] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void doscinMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.doscin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[2][5] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.doscin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[2][5]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.doscin.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[2][5] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    } 
    
    private void treunoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.treuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[3][1] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.treuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[3][1]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.treuno.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[3][1] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }                                   
    private void tredosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.tredos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[3][2] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.tredos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[3][2]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
      if ((this.tredos.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[3][2] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }                                   
    private void tretreMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.tretre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[3][3] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.tretre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[3][3]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.tretre.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[3][3] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    } 
    private void trecuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.trecua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[3][4] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.trecua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[3][4]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.treuno.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[3][4] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void trecinMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.trecin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[3][5] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.trecin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[3][5]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.trecin.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[3][5] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    
    private void cuaunoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cuauno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[4][1] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cuauno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[4][1]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cuauno.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[4][1] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cuadosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cuados.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[4][2] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cuados.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[4][2]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cuados.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[4][2] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cuatreMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cuatre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[4][3] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cuatre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[4][3]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cuatre.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[4][3] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cuacuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cuacua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[4][4] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cuacua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[4][4]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cuacua.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[4][4] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cuacinMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cuatre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[4][5] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cuacin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[4][5]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cuacin.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[4][5] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    
    private void cinunoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cinuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[5][1] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cinuno.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[5][1]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cinuno.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[5][1] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cindosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cindos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[5][2] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cindos.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[5][2]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cindos.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[5][2] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cintreMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cintre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[5][3] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cintre.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[5][3]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cintre.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[5][3] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cincuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cincua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[5][4] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cincua.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[5][4]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cincua.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[5][4] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
    }
    private void cincinMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if((this.cincin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(facil.isSelected())){
            this.matriz[5][5] = "X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelFacil5(0,1,this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        else if((this.cincin.getText().equals("")) && (this.turno.getText().equals("Humano")) &&(normal.isSelected())){
            this.matriz[5][5]="X";
            impTablero5();
            Maquina5 m=new Maquina5();
            this.turno.setText("Maquina");
            m.NivelNormal5(0, 1, this);
            this.matriz[this.mejorfila][this.mejorcolumna]="O";
            impTablero5();
            this.turno.setText("Humano");
            Evaluar(m);
        }
        
        if ((this.cincin.getText().equals("")) && (this.turno.getText().equals("Humano"))&&(dios.isSelected())) {
      this.matriz[5][5] = "X";
      impTablero5();
      Maquina5 m = new Maquina5();
      this.turno.setText("Maquina");
      m.NivelDios5(1, this);
      this.matriz[this.mejorfila][this.mejorcolumna] = "O";
      impTablero5();
      this.turno.setText("Humano");
      Evaluar(m);
    }
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
        unouno = new javax.swing.JLabel();
        unodos = new javax.swing.JLabel();
        unotre = new javax.swing.JLabel();
        unocua = new javax.swing.JLabel();
        unocin = new javax.swing.JLabel();
        dosuno = new javax.swing.JLabel();
        dosdos = new javax.swing.JLabel();
        dostre = new javax.swing.JLabel();
        doscua = new javax.swing.JLabel();
        doscin = new javax.swing.JLabel();
        treuno = new javax.swing.JLabel();
        tredos = new javax.swing.JLabel();
        tretre = new javax.swing.JLabel();
        trecua = new javax.swing.JLabel();
        trecin = new javax.swing.JLabel();
        cuauno = new javax.swing.JLabel();
        cuados = new javax.swing.JLabel();
        cuatre = new javax.swing.JLabel();
        cuacua = new javax.swing.JLabel();
        cuacin = new javax.swing.JLabel();
        cinuno = new javax.swing.JLabel();
        cindos = new javax.swing.JLabel();
        cintre = new javax.swing.JLabel();
        cincua = new javax.swing.JLabel();
        cincin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        facil = new javax.swing.JCheckBox();
        normal = new javax.swing.JCheckBox();
        dios = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        human = new javax.swing.JTextField();
        compu = new javax.swing.JTextField();
        turno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        unouno.setBackground(new java.awt.Color(255, 255, 255));
        unouno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        unouno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unouno.setOpaque(true);
        unouno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unounoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unounoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unounoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                unounoMouseReleased(evt);
            }
        });

        unodos.setBackground(new java.awt.Color(255, 255, 255));
        unodos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        unodos.setForeground(new java.awt.Color(0, 0, 0));
        unodos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unodos.setOpaque(true);
        unodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unodosMouseClicked(evt);
            }
        });

        unotre.setBackground(new java.awt.Color(255, 255, 255));
        unotre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        unotre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unotre.setOpaque(true);
        unotre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unotreMouseClicked(evt);
            }
        });

        unocua.setBackground(new java.awt.Color(255, 255, 255));
        unocua.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        unocua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unocua.setOpaque(true);
        unocua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unocuaMouseClicked(evt);
            }
        });

        unocin.setBackground(new java.awt.Color(255, 255, 255));
        unocin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        unocin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unocin.setOpaque(true);
        unocin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unocinMouseClicked(evt);
            }
        });

        dosuno.setBackground(new java.awt.Color(255, 255, 255));
        dosuno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dosuno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dosuno.setOpaque(true);
        dosuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosunoMouseClicked(evt);
            }
        });

        dosdos.setBackground(new java.awt.Color(255, 255, 255));
        dosdos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dosdos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dosdos.setOpaque(true);
        dosdos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosdosMouseClicked(evt);
            }
        });

        dostre.setBackground(new java.awt.Color(255, 255, 255));
        dostre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dostre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dostre.setOpaque(true);
        dostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dostreMouseClicked(evt);
            }
        });

        doscua.setBackground(new java.awt.Color(255, 255, 255));
        doscua.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        doscua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doscua.setOpaque(true);
        doscua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doscuaMouseClicked(evt);
            }
        });

        doscin.setBackground(new java.awt.Color(255, 255, 255));
        doscin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        doscin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doscin.setOpaque(true);
        doscin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doscinMouseClicked(evt);
            }
        });

        treuno.setBackground(new java.awt.Color(255, 255, 255));
        treuno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        treuno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        treuno.setOpaque(true);
        treuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treunoMouseClicked(evt);
            }
        });

        tredos.setBackground(new java.awt.Color(255, 255, 255));
        tredos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tredos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tredos.setOpaque(true);
        tredos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tredosMouseClicked(evt);
            }
        });

        tretre.setBackground(new java.awt.Color(255, 255, 255));
        tretre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tretre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tretre.setOpaque(true);
        tretre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tretreMouseClicked(evt);
            }
        });

        trecua.setBackground(new java.awt.Color(255, 255, 255));
        trecua.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        trecua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trecua.setOpaque(true);
        trecua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trecuaMouseClicked(evt);
            }
        });

        trecin.setBackground(new java.awt.Color(255, 255, 255));
        trecin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        trecin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trecin.setOpaque(true);
        trecin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trecinMouseClicked(evt);
            }
        });

        cuauno.setBackground(new java.awt.Color(255, 255, 255));
        cuauno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cuauno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuauno.setOpaque(true);
        cuauno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuaunoMouseClicked(evt);
            }
        });

        cuados.setBackground(new java.awt.Color(255, 255, 255));
        cuados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cuados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuados.setOpaque(true);
        cuados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadosMouseClicked(evt);
            }
        });

        cuatre.setBackground(new java.awt.Color(255, 255, 255));
        cuatre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cuatre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuatre.setOpaque(true);
        cuatre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuatreMouseClicked(evt);
            }
        });

        cuacua.setBackground(new java.awt.Color(255, 255, 255));
        cuacua.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cuacua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuacua.setOpaque(true);
        cuacua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuacuaMouseClicked(evt);
            }
        });

        cuacin.setBackground(new java.awt.Color(255, 255, 255));
        cuacin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cuacin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuacin.setOpaque(true);
        cuacin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuacinMouseClicked(evt);
            }
        });

        cinuno.setBackground(new java.awt.Color(255, 255, 255));
        cinuno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cinuno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cinuno.setOpaque(true);
        cinuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cinunoMouseClicked(evt);
            }
        });

        cindos.setBackground(new java.awt.Color(255, 255, 255));
        cindos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cindos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cindos.setOpaque(true);
        cindos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cindosMouseClicked(evt);
            }
        });

        cintre.setBackground(new java.awt.Color(255, 255, 255));
        cintre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cintre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cintre.setOpaque(true);
        cintre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cintreMouseClicked(evt);
            }
        });

        cincua.setBackground(new java.awt.Color(255, 255, 255));
        cincua.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cincua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cincua.setOpaque(true);
        cincua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincuaMouseClicked(evt);
            }
        });

        cincin.setBackground(new java.awt.Color(255, 255, 255));
        cincin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cincin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cincin.setOpaque(true);
        cincin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dosuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(treuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuauno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dosdos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dostre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doscua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doscin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tredos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tretre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trecua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trecin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cuados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cuatre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cuacua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cuacin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cinuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cindos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cintre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(unouno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unodos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unotre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unocua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unocin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unouno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unodos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unotre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unocin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unocua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dosdos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dostre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doscua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doscin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trecua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trecin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(treuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tredos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tretre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuauno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuacin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuacua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cincin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cintre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cindos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 290));
        jPanel1.getAccessibleContext().setAccessibleName("juego\n");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setText("Juego Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, -1));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 90, -1));

        jLabel26.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel26.setText("Turno de:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 90, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        facil.setText("Nivel Facil");
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });

        normal.setText("Nivel Medio");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        dios.setText("Nivel Dios");
        dios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 140, 100));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Puntaje");
        jLabel27.setOpaque(true);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Maquina");
        jLabel29.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Humano");
        jLabel28.setOpaque(true);

        human.setText("0");

        compu.setText("0");
        compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(human, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(compu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(human, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 140, 70));

        turno.setText("Humano");
        turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoActionPerformed(evt);
            }
        });
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InicializarMatriz5();
        NuevaPartida();
        human.setText("0");
        compu.setText("0");
        facil.setSelected(false);
        normal.setSelected(false);
        dios.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        // TODO add your handling code here:
        normal.setSelected(false);
        dios.setSelected(false);
        human.setText("0");
        compu.setText("0");
        NuevaPartida();
        InicializarMatriz5();
    }//GEN-LAST:event_facilActionPerformed

    private void diosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diosActionPerformed
        // TODO add your handling code here:
        facil.setSelected(false);
        normal.setSelected(false);
        human.setText("0");
        compu.setText("0");
        NuevaPartida();
        InicializarMatriz5();
    }//GEN-LAST:event_diosActionPerformed

    private void compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compuActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        // TODO add your handling code here:
        facil.setSelected(false);
        dios.setSelected(false);
        human.setText("0");
        compu.setText("0");
        NuevaPartida();
        InicializarMatriz5();
    }//GEN-LAST:event_normalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    public void impTablero5(){
        if(!matriz[1][1].equals("-"))unouno.setText(matriz[1][1]);
        if(!matriz[1][2].equals("-"))unodos.setText(matriz[1][2]);
        if(!matriz[1][3].equals("-"))unotre.setText(matriz[1][3]);
        if(!matriz[1][4].equals("-"))unocua.setText(matriz[1][4]);
        if(!matriz[1][5].equals("-"))unocin.setText(matriz[1][5]);
       
        if(!matriz[2][1].equals("-"))dosuno.setText(matriz[2][1]);
        if(!matriz[2][2].equals("-"))dosdos.setText(matriz[2][2]);
        if(!matriz[2][3].equals("-"))dostre.setText(matriz[2][3]);
        if(!matriz[2][4].equals("-"))doscua.setText(matriz[2][4]);
        if(!matriz[2][5].equals("-"))doscin.setText(matriz[2][5]);
        
        if(!matriz[3][1].equals("-"))treuno.setText(matriz[3][1]);
        if(!matriz[3][2].equals("-"))tredos.setText(matriz[3][2]);
        if(!matriz[3][3].equals("-"))tretre.setText(matriz[3][3]);
        if(!matriz[3][4].equals("-"))trecua.setText(matriz[3][4]);
        if(!matriz[3][5].equals("-"))trecin.setText(matriz[3][5]);
        
        if(!matriz[4][1].equals("-"))cuauno.setText(matriz[4][1]);
        if(!matriz[4][2].equals("-"))cuados.setText(matriz[4][2]);
        if(!matriz[4][3].equals("-"))cuatre.setText(matriz[4][3]);
        if(!matriz[4][4].equals("-"))cuacua.setText(matriz[4][4]);
        if(!matriz[4][5].equals("-"))cuacin.setText(matriz[4][5]);
        
        if(!matriz[5][1].equals("-"))cinuno.setText(matriz[5][1]);
        if(!matriz[5][2].equals("-"))cindos.setText(matriz[5][2]);
        if(!matriz[5][3].equals("-"))cintre.setText(matriz[5][3]);
        if(!matriz[5][4].equals("-"))cincua.setText(matriz[5][4]);
        if(!matriz[5][5].equals("-"))cincin.setText(matriz[5][5]);
       }
    public void Evaluar(Maquina5 m){
        if(m.eval(this)==-1) {
                JOptionPane.showMessageDialog(this, "Increible!!! Usted gana la partida!"); 
                NuevaPartida();
                InicializarMatriz5();
                human.setText((Integer.parseInt(human.getText())+1)+"");
            }
            else if(m.eval(this)==1) {
                JOptionPane.showMessageDialog(this, "La computadora gana!! "); 
                NuevaPartida();
                InicializarMatriz5();
                compu.setText((Integer.parseInt(compu.getText())+1)+"");
            }
            else if(m.eval(this)==0) {
                JOptionPane.showMessageDialog(this, "Felicidades! Logró empatar :D"); 
                NuevaPartida();
                InicializarMatriz5();
            }
    }
    public void NuevaPartida(){
        unouno.setText("");
        unodos.setText("");
        unotre.setText("");
        unocua.setText("");
        unocin.setText("");
        dosuno.setText("");
        dosdos.setText("");
        dostre.setText("");
        doscua.setText("");
        doscin.setText("");
        treuno.setText("");
        tredos.setText("");
        tretre.setText("");
        trecua.setText("");
        trecin.setText("");
        cuauno.setText("");
        cuados.setText("");
        cuatre.setText("");
        cuacua.setText("");
        cuacin.setText("");
        cinuno.setText("");
        cindos.setText("");
        cintre.setText("");
        cincua.setText("");
        cincin.setText("");
        
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
            java.util.logging.Logger.getLogger(Tablero5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cincin;
    private javax.swing.JLabel cincua;
    private javax.swing.JLabel cindos;
    private javax.swing.JLabel cintre;
    private javax.swing.JLabel cinuno;
    private javax.swing.JTextField compu;
    private javax.swing.JLabel cuacin;
    private javax.swing.JLabel cuacua;
    private javax.swing.JLabel cuados;
    private javax.swing.JLabel cuatre;
    private javax.swing.JLabel cuauno;
    private javax.swing.JCheckBox dios;
    private javax.swing.JLabel doscin;
    private javax.swing.JLabel doscua;
    private javax.swing.JLabel dosdos;
    private javax.swing.JLabel dostre;
    private javax.swing.JLabel dosuno;
    private javax.swing.JCheckBox facil;
    private javax.swing.JTextField human;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox normal;
    private javax.swing.JLabel trecin;
    private javax.swing.JLabel trecua;
    private javax.swing.JLabel tredos;
    private javax.swing.JLabel tretre;
    private javax.swing.JLabel treuno;
    private javax.swing.JTextField turno;
    private javax.swing.JLabel unocin;
    private javax.swing.JLabel unocua;
    private javax.swing.JLabel unodos;
    private javax.swing.JLabel unotre;
    private javax.swing.JLabel unouno;
    // End of variables declaration//GEN-END:variables
}
