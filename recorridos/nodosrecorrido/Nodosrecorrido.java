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
public class Nodosrecorrido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long matrizA[][]={{0,3,4,999999999,8,999999999},{999999999,0,999999999,999999999,999999999},{999999999,999999999,999999999,7,0,3},{999999999,999999999,999999999,2,999999999,0}};
               caminosmin ruta=new caminosmin(); 
               System.out.println(ruta.algoritmoFLoyd(matrizA));
                }
    
}
