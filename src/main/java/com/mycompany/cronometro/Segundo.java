/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

/**
 *
 * @author Fabrício
 */
public class Segundo implements Runnable{
    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtSeg.getText());
        while (!Thread.currentThread().isInterrupted()) {
            Tela.txtSeg.setText(i + "");
            i++;
            if (i == 59) {
                i = 0;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Interrompe o thread ao receber a interrupção
                Thread.currentThread().interrupt(); // Manter o status de interrupção
            }
        }
    }
}
