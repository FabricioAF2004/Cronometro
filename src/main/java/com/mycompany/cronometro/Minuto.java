/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author Fabrício
 */
public class Minuto implements Runnable{
    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMin.getText());
        while (!Thread.currentThread().isInterrupted()) {
            Tela.txtMin.setText(i + "");
            i++;
            if (i == 59) {
                i = 0;
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // Interrompe o thread ao receber a interrupção
                Thread.currentThread().interrupt(); // Manter o status de interrupção
            }
        }
    }
}

