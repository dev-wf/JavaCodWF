package com.dev.dev;

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

    protected void param() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    private void tempo() throws InterruptedException {
        System.out.println("TELA-1");

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1 * 1000); // aguarda 5segundos
            System.out.println("CONTADOR: " + i);
            param();

        }
        this.dispose();
    }

}
