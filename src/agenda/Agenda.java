/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import agenda.gui.AgendaFrame;

/**
 *
 * @author Lucas Rosario de Oliveira - 2017101742
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgendaFrame AgendaFrame = new AgendaFrame(); //Cria o objeto Janela
        AgendaFrame.setTitle("Agenda"); //Define o título na Janela
        AgendaFrame.setLocationRelativeTo(null); //Coloca a janela no centro da tela
        AgendaFrame.setVisible(true); //Mostra a janela

    }
    
}
