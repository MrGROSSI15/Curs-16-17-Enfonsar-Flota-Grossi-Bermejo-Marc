/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

import javax.swing.JLabel;

/**
 *
 * @author marc
 */
public class Barco extends JLabel {
    int x;
    int y;
    int bombes;
    boolean enfonsat;
    
    public Barco (int x, int y ){
        this.x = x;
        this.y = y;
        enfonsat = false;
    
}
    public boolean bombardejar(){
        return false;
    }
    public void setEnfonsat(boolean enfonsat) {
        this.enfonsat = enfonsat;
        
    }
    public void setX(int x){
        this.x= x;
    }
    public void setY(int y){
        this.y= y;
    }
    public class Acorazado extends Barco{
    
    public Acorazado(int x, int y) {
        super(x, y);
        this.bombes = 6;
        
    }
    public boolean bombardejar(){
        return false;
        
    }
    
}
    public class Destructor extends Barco {
    
    public Destructor(int x, int y) {
        super(x, y);
    }
    public boolean bombardejar() {
        return false;
    
}
    
}
    public class Motora extends Barco {
    
    public Motora(int x, int y) {
        super(x, y);
    }
    public boolean bombardejar (){
        return false;
        
    }
    
}
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
    public class Submari extends Barco {
    
    public Submari(int x, int y) {
        super(x, y);
    }
    public boolean bombardejar (){
        return false;
        
    }
    
}
    
}
