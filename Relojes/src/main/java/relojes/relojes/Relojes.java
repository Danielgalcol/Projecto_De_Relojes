/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package relojes.relojes;

import cronometro.CronometroF;
import java.util.*;
import relojNormal.NormalJF;
import temporizador.Temporizador;

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
        Temporizador temp = new Temporizador();
        // variable q detecta q escribes en pantalla
        Scanner s = new Scanner(System.in);
        while (cerrado) {
            mostrarMenu();
            // comprobar si es un num
            if (!s.hasNextInt()) {
                System.out.println("Error: solo se admiten numeros");
                s.next(); // limpiar la entrada incorrecta
                mostrarMenu();
            }
            int num = s.nextInt();
            switch (num) {
                case 1 -> cR.setVisible(true);
                case 2 -> reloj.setVisible(true);
                case 3 -> temp.setVisible(true);
                case 4 -> {
                    // cerrar la app
                    cerrado = false;
                    s.close();
                    cR.dispose();
                    reloj.dispose();
                    temp.dispose();
                }
                default -> System.out.println("Esta opcion no existe, intentelo de nuevo");
            }
        }
    }
    public static void mostrarMenu(){
            System.out.println("A que aplicacion quieres entrar");
            System.out.println("1. Cronometro");
            System.out.println("2. Reloj");
            System.out.println("3. Temporizador");
            System.out.println("4. Si quieres salir");
            System.out.println("Escribe un numero a continuacion: ");
    }
}
