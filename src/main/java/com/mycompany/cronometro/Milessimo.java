/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

/**
 *
 * @author Fabrício
 */
public class Milessimo implements Runnable {
    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMil.getText());
        while (!Thread.currentThread().isInterrupted()) {
            Tela.txtMil.setText(i + "");
            i++;
            if (i == 1000) {
                i = 0;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // Interrompe o thread ao receber a interrupção
                Thread.currentThread().interrupt(); // Manter o status de interrupção
            }
        }
    }
}
