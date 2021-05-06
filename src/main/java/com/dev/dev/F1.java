package com.dev.dev;

import com.dev.dev.Frames.Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * @author Welington Fernandes
 */
public class F1 extends JFrame {

    public F1() {
        try {
            tempo();
        } catch (InterruptedException ex) {
            Logger.getLogger(F1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    private void tempo() throws InterruptedException {
        System.out.println("TELA-01");
        Inicio inicio = new Inicio();
        int i;
        for (i = 1; i <= 6; i++) {
            Thread.sleep(1 * 1000); // aguarda 5segundos
            System.out.println("CONTADOR: " + i);
            inicio.pg.setValue(i * 20);

        }
        inicio.dispose();
    }

}
