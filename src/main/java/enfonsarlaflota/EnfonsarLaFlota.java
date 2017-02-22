/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

/**
 *
 * @author marc
 */
public class EnfonsarLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tauler t = new Tauler();
        
        t.CreaTauler();
        t.OmplirTauler();
        t.ImprimirTauler();
        
            
        Disparar d = new Disparar();
        int[] Dispar = null;
        d.Disparar(Dispar);
       
    }
    
}
