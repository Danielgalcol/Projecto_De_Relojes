/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizador;

/**
 *
 * @author walls
 */



import javax.swing.SpinnerNumberModel;

public class Controlador_De_Tiempo extends SpinnerNumberModel {
    @Override
    public Object getNextValue() {
        int valor = (int) getValue();

        if (valor == 23) {
            return 0;
        }

        return valor + 1;
    }

    @Override
    public Object getPreviousValue() {
        int valor = (int) getValue();

        if (valor == 0) {
            return 23;
        }

        return valor - 1;
    }
}

