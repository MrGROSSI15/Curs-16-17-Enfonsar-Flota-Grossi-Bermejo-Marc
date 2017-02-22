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
public class Portaavions extends Barco{
    
    public Portaavions(int x, int y) {
        super(x, y);
        bombes = 5;
    }
    public boolean bombardejar (){
        if (enfonsat == false && bombes > 0){
            
        }
        return false;
    }
    
}
