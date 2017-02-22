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
public class Acorazado extends Barco{
    
    public Acorazado(int x, int y) {
        super(x, y);
        this.bombes = 6;
        
    }
    public boolean bombardejar(){
        return false;
        
    }
    
}
