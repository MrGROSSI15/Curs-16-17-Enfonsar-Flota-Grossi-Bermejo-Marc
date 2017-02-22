/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marc
 */
public class Tauler {

    public String[][] tauler = new String[11][11];
    private final int POSICIO = 11;

    public void CreaTauler() {

        tauler[0][0] = "-";
        tauler[1][0] = "1";
        tauler[2][0] = "2";
        tauler[3][0] = "3";
        tauler[4][0] = "4";
        tauler[5][0] = "5";
        tauler[6][0] = "6";
        tauler[7][0] = "7";
        tauler[8][0] = "8";
        tauler[9][0] = "9";
        tauler[10][0] = "10";

        tauler[0][1] = "A";
        tauler[0][2] = "B";
        tauler[0][3] = "C";
        tauler[0][4] = "D";
        tauler[0][5] = "E";
        tauler[0][6] = "F";
        tauler[0][7] = "G";
        tauler[0][8] = "H";
        tauler[0][9] = "I";
        tauler[0][10] = "J";

    }

    public void OmplirTauler() {

        int i = 1;
        int y = 1;

        while (i < POSICIO) {

            y = 1;
            while (y < POSICIO) {

                tauler[i][y] = "[]";

                y++;
            }

            i++;
        }

    }

    public void ImprimirTauler() {

        int i = 0;
        int y = 0;

        while (i < POSICIO) {

            y = 0;
            System.out.println();

            while (y < POSICIO) {

                System.out.print(tauler[i][y] + "\t");

                y++;
            }

            i++;
        }

    }
}
