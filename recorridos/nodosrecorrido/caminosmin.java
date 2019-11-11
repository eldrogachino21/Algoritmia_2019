/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodosrecorrido;

/**
 *
 * @author eldro
 */
public class caminosmin {
     private static long negativeZeroFloatBits  = Float.floatToRawIntBits(-0.0f);
    private static long negativeZeroDoubleBits = Double.doubleToRawLongBits(-0.0d);

    ///metodo para determinar todos los caminos 

    public String algoritmoFLoyd(long[][] mAdy) {
        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminoAux[][] = new String[vertices][vertices];
        String caminorrecorrido = "", cadena = "", caminitos = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        //iniciailizar matrices y caminos y caminos aux 
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminoAux[i][j] = "";
            }
        }
        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    //encontrando al camino min
                    minimo = min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminorrecorrido = "";
                            caminoAux[i][j] = k + "";
                            caminos[i][j] = caminoR(i, k, caminoAux, caminorrecorrido) + (k + 1);
                        }
                    }
                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }
        //agregando el camino a dcadena 
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena = cadena + "(" + matrizAdyacencia[i][j] + ")";
            }
            cadena = cadena + "\n";
        }
        /////////////////////////////7
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "de (" + (i + 1) + "----->" + (j + 1) + ") irse por...(" + (i + 1) + ", " + (j + 1) + ")\n";
                        } else {
                            caminitos += "de (" + (i + 1) + "----->" + (j + 1) + ") irse por (" + (i + 1) + ", " + (caminos[i][j]) + ", " + (j + 1) + ")\n";
                        }
                    }
                }
            }
        }
        return "la matriz de caminos mas cortos entre los diferentes vertices es :\n "+cadena+"\n los diferentes caminos mas cortos entre vertices son:\n"+caminitos;
    }
 public String caminoR(int i, int k , String[][]caminosauxiliares,String caminoRecorrido){
    if(caminosauxiliares[i][k].equals("")){
    return "";
    }else{
        //recursividad al millon
        caminoRecorrido +=caminoR(i, Integer.parseInt(caminosauxiliares[i][k].toString()), caminosauxiliares, caminoRecorrido)+(Integer.parseInt(caminosauxiliares[i][k].toString())+1)+", ";
    return caminoRecorrido;
    }
    }
 public static float min(float a, float b) {
        if (a != a)
            return a;   // a is NaN
        if ((a == 0.0f) &&
            (b == 0.0f) &&
            (Float.floatToRawIntBits(b) == negativeZeroFloatBits)) {
            // Raw conversion ok since NaN can't map to -0.0.
            return b;
        }
        return (a <= b) ? a : b;
    }
 
}