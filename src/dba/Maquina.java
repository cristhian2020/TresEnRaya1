package dba;

import com.sun.prism.paint.Color;

public class Maquina
{
  public int NivelDios(int modo, Tablero ta)
  {
    int mflocal = 0; int mclocal = 0;
    Color color = Color.BLUE;
    int valor = eval(ta);
    if (valor != 2) return valor;
    if (modo == 1) valor = -100; else
      valor = 100;
    for (int i = 1; i < 4; i++)
      for (int j = 1; j < 4; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelDios(2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelDios(1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  
  public int NivelNormal(int iteraciones, int modo, Tablero ta){
    int mflocal = 0; int mclocal = 0;
    int valor = eval(ta);
    if (valor != 2 || iteraciones==5) return valor;
    if (modo == 1) valor = -100; 
    else valor = 100;
    for (int i = 1; i < 4; i++)
      for (int j = 1; j < 4; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelNormal(iteraciones+1,2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelNormal(iteraciones+1, 1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  
  public int NivelFacil(int iteraciones, int modo, Tablero ta){
      int mflocal = 0; int mclocal = 0;
    int valor = eval(ta);
    if (valor != 2 || iteraciones==2) return valor;
    if (modo == 1) valor = -100; 
    else valor = 100;
    for (int i = 1; i < 4; i++)
      for (int j = 1; j < 4; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelNormal(iteraciones+1,2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelNormal(iteraciones+1, 1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  public int eval(Tablero ta)
  {
      int i, j;
    String ganador = "-";
    for (i = 1; i < 4; i++) {
      if ((!ta.matriz[i][1].equals("-")) && (ta.matriz[i][1].equals(ta.matriz[i][2])) && (ta.matriz[i][2].equals(ta.matriz[i][3])))
        ganador = ta.matriz[i][1];
    }
    for (j = 1; j < 4; j++) {
      if ((!ta.matriz[1][j].equals("-")) && (ta.matriz[1][j].equals(ta.matriz[2][j])) && (ta.matriz[2][j].equals(ta.matriz[3][j])))
        ganador = ta.matriz[1][j];
    }
    if ((!ta.matriz[1][1].equals("-")) && (ta.matriz[1][1].equals(ta.matriz[2][2])) && (ta.matriz[2][2].equals(ta.matriz[3][3]))) {
      ganador = ta.matriz[1][1];
    }
    if ((!ta.matriz[1][3].equals("-")) && (ta.matriz[1][3].equals(ta.matriz[2][2])) && (ta.matriz[2][2].equals(ta.matriz[3][1]))) {
      ganador = ta.matriz[1][3];
    }
    if ("X".equals(ganador)) return -1;
    if ("O".equals(ganador)) return 1;
    for (i = 1; i < 4; i++)
      for (j = 1; j < 4; j++)
        if (ta.matriz[i][j].equals("-")) return 2;
    return 0;
  }
}