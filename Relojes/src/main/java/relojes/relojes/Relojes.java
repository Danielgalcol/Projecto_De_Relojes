/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package relojes.relojes;

import cronometro.CronometroF;
import java.util.*;
import relojNormal.NormalJF;

/**
 *
 * @author walls
 */
// la interfaz se creara aqui
public class Relojes {

    public static void main(String[] args) {
        boolean cerrado = true;
        CronometroF cR = new CronometroF();
        NormalJF reloj = new NormalJF();
        // variable q detecta q escribes en pantalla
        Scanner s = new Scanner(System.in);
        while (cerrado) {
            System.out.println("A que aplicacion quieres entrar");
            System.out.println("1. Cronometro");
            System.out.println("2. Reloj");
            System.out.println("3. Si quieres salir");
            System.out.println("Escribe un numero a continuacion: ");
            int num = s.nextInt();

            if (num == 1) {
                cR.setVisible(true);
            }

            if (num == 2) {
                reloj.setVisible(true);
            }
            // cerrar la app
            if (num == 3) {
                cerrado = false;
                s.close();
                cR.dispose();
                reloj.dispose();
                break;
            }
        }
    }
}
