package dba;

public class Maquina5 
{
    public int NivelDios5(int modo, Tablero5 ta)
  {
    int mflocal = 0; int mclocal = 0;
    int valor = eval(ta);
    if (valor != 2)
        return valor;
    if (modo == 1) valor = -100; else
      valor = 100;
    for (int i = 1; i < 6; i++)
      for (int j = 1; j < 6; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelDios5(2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelDios5(1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  
  public int NivelNormal5(int iteraciones, int modo, Tablero5 ta){
    int mflocal = 0; int mclocal = 0;
    int valor = eval(ta);
    if (valor != 2 || iteraciones==5) return valor;
    if (modo == 1) valor = -100; 
    else valor = 100;
    for (int i = 1; i < 6; i++)
      for (int j = 1; j < 6; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelNormal5(iteraciones+1,2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelNormal5(iteraciones+1, 1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  
  public int NivelFacil5(int iteraciones, int modo, Tablero5 ta){
      int mflocal = 0; int mclocal = 0;
    int valor = eval(ta);
    if (valor != 2 || iteraciones==2) return valor;
    if (modo == 1) valor = -100; 
    else valor = 100;
    for (int i = 1; i < 6; i++)
      for (int j = 1; j < 6; j++)
        if (ta.matriz[i][j].equals("-")) {
          if (modo == 1) {
            ta.matriz[i][j] = "O";
            int val = NivelNormal5(iteraciones+1,2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.matriz[i][j] = "X";
            int val = NivelNormal5(iteraciones+1, 1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.matriz[i][j] = "-";
        }
    ta.mejorfila = mflocal;
    ta.mejorcolumna = mclocal;
    return valor;
  }
  public int eval(Tablero5 ta)
  {
      int i, j;
    String ganador = "-";
    /*for (i = 1; i < 6; i++) {
      if ((!ta.matriz[i][1].equals("-")) && (ta.matriz[i][1].equals(ta.matriz[i][2])) && (ta.matriz[i][2].equals(ta.matriz[i][3]))&& (ta.matriz[i][3].equals(ta.matriz[i][4]))&& (ta.matriz[i][4].equals(ta.matriz[i][5])))
        ganador = ta.matriz[i][1];
    }
    for (j = 1; j < 6; j++) {
      if ((!ta.matriz[1][j].equals("-")) && (ta.matriz[1][j].equals(ta.matriz[2][j])) && (ta.matriz[2][j].equals(ta.matriz[3][j])) && (ta.matriz[3][j].equals(ta.matriz[4][j])) && (ta.matriz[4][j].equals(ta.matriz[5][j])))
        ganador = ta.matriz[1][j];
    }
    if ((!ta.matriz[1][1].equals("-")) && (ta.matriz[1][1].equals(ta.matriz[2][2]))  && (ta.matriz[2][2].equals(ta.matriz[3][3])) && (ta.matriz[3][3].equals(ta.matriz[4][4]))&& (ta.matriz[4][4].equals(ta.matriz[5][5]))) {
      ganador = ta.matriz[1][1];
    }
    if ((!ta.matriz[1][5].equals("-")) && (ta.matriz[1][5].equals(ta.matriz[2][4])) && (ta.matriz[2][4].equals(ta.matriz[3][3])) && (ta.matriz[3][3].equals(ta.matriz[4][2]))&& (ta.matriz[4][2].equals(ta.matriz[5][1]))) {
      ganador = ta.matriz[1][3];
    }
    if ("X".equals(ganador)) return -1;
    if ("O".equals(ganador)) return 1;
    for (i = 1; i < 6; i++)
      for (j = 1; j < 6; j++)
        if (ta.matriz[i][j].equals("-")) return 2;
    */for (i = 1; i < 6; i++) {
      if ((!ta.matriz[i][1].equals("-")) && (ta.matriz[i][1].equals(ta.matriz[i][2])) && (ta.matriz[i][2].equals(ta.matriz[i][3])))
              ganador = ta.matriz[i][1];
    else if((!ta.matriz[i][2].equals("-")) && (ta.matriz[i][2].equals(ta.matriz[i][3])) && (ta.matriz[i][3].equals(ta.matriz[i][4])))
        ganador = ta.matriz[i][2];
      else if((!ta.matriz[i][3].equals("-")) && (ta.matriz[i][3].equals(ta.matriz[i][4])) && (ta.matriz[i][4].equals(ta.matriz[i][5])))
        ganador = ta.matriz[i][3];
    }
    
    
    for (j = 1; j < 6; j++) {
      if ((!ta.matriz[1][j].equals("-")) && (ta.matriz[1][j].equals(ta.matriz[2][j])) && (ta.matriz[2][j].equals(ta.matriz[3][j])))
        ganador = ta.matriz[1][j];
      else if ((!ta.matriz[2][j].equals("-")) && (ta.matriz[2][j].equals(ta.matriz[3][j])) && (ta.matriz[3][j].equals(ta.matriz[4][j])))
        ganador = ta.matriz[2][j];
      else if ((!ta.matriz[3][j].equals("-")) && (ta.matriz[3][j].equals(ta.matriz[4][j])) && (ta.matriz[4][j].equals(ta.matriz[5][j])))
        ganador = ta.matriz[3][j];
    }
    
    
    if ((!ta.matriz[1][1].equals("-")) && (ta.matriz[1][1].equals(ta.matriz[2][2])) && (ta.matriz[2][2].equals(ta.matriz[3][3]))) {
      ganador = ta.matriz[1][1];
    }else{ if((!ta.matriz[2][2].equals("-")) && (ta.matriz[2][2].equals(ta.matriz[3][3])) && (ta.matriz[3][3].equals(ta.matriz[4][4]))){
        ganador = ta.matriz[2][2];
    }else{
         if((!ta.matriz[3][3].equals("-")) && (ta.matriz[3][3].equals(ta.matriz[4][4])) && (ta.matriz[4][4]).equals(ta.matriz[5][5])){
          ganador = ta.matriz[3][3];
         }else{
             if((!ta.matriz[1][3].equals("-")) && (ta.matriz[1][3].equals(ta.matriz[2][4])) && (ta.matriz[2][4].equals(ta.matriz[3][5]))){
             ganador = ta.matriz[1][3];
         }else{
                 if((!ta.matriz[1][2].equals("-")) && (ta.matriz[1][2].equals(ta.matriz[2][3])) && (ta.matriz[2][3].equals(ta.matriz[3][4]))){
                   ganador=ta.matriz[1][2];
                 }else{
                      if((!ta.matriz[2][3].equals("-")) && (ta.matriz[2][3].equals(ta.matriz[3][4])) && (ta.matriz[3][4].equals(ta.matriz[4][5]))){
                        ganador = ta.matriz[2][3];
                      }else{
                          if((!ta.matriz[2][1].equals("-")) && (ta.matriz[2][1].equals(ta.matriz[3][2])) && (ta.matriz[3][2].equals(ta.matriz[4][3]))){
                              ganador = ta.matriz[2][1];
                          }else{
                              if((!ta.matriz[3][2].equals("-")) && (ta.matriz[3][2].equals(ta.matriz[4][3])) && (ta.matriz[4][3].equals(ta.matriz[5][4]))){
                                  ganador = ta.matriz[3][2];
                              }else{
                                  if((!ta.matriz[3][1].equals("-")) && (ta.matriz[3][1].equals(ta.matriz[4][2])) && (ta.matriz[4][2].equals(ta.matriz[5][3]))){
                                  ganador= ta.matriz[3][1];
                                  }
                              }
                          }
                      }
                 }
             }
         }
    }}
    if((!ta.matriz[1][5].equals("-")) && (ta.matriz[1][5].equals(ta.matriz[2][4])) && (ta.matriz[2][4].equals(ta.matriz[3][3]))){
       ganador = ta.matriz[1][5];
    }else{
      if((!ta.matriz[2][4].equals("-")) && (ta.matriz[2][4].equals(ta.matriz[3][3])) && (ta.matriz[3][3].equals(ta.matriz[4][2]))){
          ganador = ta.matriz[2][4];
      }else{
        if((!ta.matriz[3][3].equals("-")) && (ta.matriz[3][3].equals(ta.matriz[4][2])) && (ta.matriz[4][2].equals(ta.matriz[5][1]))){
        }else{
          if((!ta.matriz[1][3].equals("-")) && (ta.matriz[1][3].equals(ta.matriz[2][2])) && (ta.matriz[2][2].equals(ta.matriz[3][1]))){
               ganador = ta.matriz[1][3];
          }else{
              if((!ta.matriz[1][4].equals("-")) && (ta.matriz[1][4].equals(ta.matriz[2][3])) && (ta.matriz[2][3].equals(ta.matriz[3][2]))){
                  ganador =ta.matriz[1][4];
              }else{
                  if((!ta.matriz[2][3].equals("-")) && (ta.matriz[2][3].equals(ta.matriz[3][2])) && (ta.matriz[3][2].equals(ta.matriz[4][1]))){
                      ganador = ta.matriz[2][3];
                  }else{
                    if((!ta.matriz[2][5].equals("-")) && (ta.matriz[2][5].equals(ta.matriz[3][4])) && (ta.matriz[3][4].equals(ta.matriz[4][3]))){
                        ganador = ta.matriz[2][5];
                    }else{
                       if((!ta.matriz[3][4].equals("-")) && (ta.matriz[3][4].equals(ta.matriz[4][3])) && (ta.matriz[4][3].equals(ta.matriz[5][2]))){
                           ganador = ta.matriz[3][4];
                       }else{
                            if((!ta.matriz[3][5].equals("-")) && (ta.matriz[3][5].equals(ta.matriz[4][4])) && (ta.matriz[4][4].equals(ta.matriz[5][3]))){
                                ganador= ta.matriz[3][5];
                            }
                       }
                    }
                  }
              }
                      }
          }
        }
      }
    
    if ("X".equals(ganador)) return -1;
    if ("O".equals(ganador)) return 1;
    for (i = 1; i < 6; i++)
      for (j = 1; j < 6; j++)
        if (ta.matriz[i][j].equals("-")) return 2;
    return 0;
  }
}
