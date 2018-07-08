/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Main.Welcome_Screen;

/**
 *
 * @author USER
 */
public class PCU_ManagementSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Welcome_Screen wc = new Welcome_Screen();
        wc.setExtendedState(Welcome_Screen.MAXIMIZED_BOTH);
        wc.setVisible(true); 
    }
    
}
