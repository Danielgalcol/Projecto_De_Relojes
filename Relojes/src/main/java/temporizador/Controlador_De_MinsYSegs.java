/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizador;

import javax.swing.SpinnerNumberModel;

/**
 *
 * @author walls
 */
public class Controlador_De_MinsYSegs extends SpinnerNumberModel{
    
    @Override
    public Object getNextValue(){        
        int valor = (int) getValue();
        if (valor == 59){
            valor= 0;            
        }
        return valor + 1;    
    } 
    
    @Override
    public Object getPreviousValue(){
        int valor = (int) getValue();
        
        if(valor == 0){
            valor = 60;
        }
        return valor - 1;
    }
    
}
