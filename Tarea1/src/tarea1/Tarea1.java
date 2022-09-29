package tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Tarea1 {

    public static void main(String[] args) {

        float diagonal1 = 0;
        float diagonal2 = 0;
        float total = 0;

        //float cont = 1; //prueba mas sencilla
        
        float[][] matriz = new float[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                //matriz [i][j] = cont++ //prueba mas sencilla
                matriz[i][j] = Float.parseFloat(JOptionPane.showInputDialog("ingrese el valor"
                        + " de la matriz en la posicion " + i + ", " + j));

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i == j) {
                    diagonal1 += matriz[i][j];
                }

                if (i + j == matriz.length - 1) {

                    diagonal2 += matriz[i][j];
                }
            }
        }
        
        total = diagonal1 + diagonal2;

        System.out.println("La primera diagonal suma: " + diagonal1);
        System.out.println("La segunda diagonal suma: " + diagonal2);
        System.out.println("Suma total de las 2 diagonales es: " + total);
    }

}
