/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

import java.util.Scanner;

/**
 *
 * @author marc
 */
public class Disparar {
    
    public void Disparar (int[] Dispar){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fila: ");
        Dispar[0] = input.nextInt();
        Dispar[0]--;
        
        System.out.print("Columna: ");
        Dispar[1] = input.nextInt();
        Dispar[1]--;
}
}
