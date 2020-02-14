/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdftopng;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import view.TelaPrincipal;

/**
 *
 * @author Christian
 */
public class PDFtoPNG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            
           // WebLookAndFeel.install();
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {
            System.out.println("Erro ao carregar um layout.");
            JOptionPane.showMessageDialog(null, "Erro ao carregar um layout.");
        } 
        TelaPrincipal novaTela = new TelaPrincipal();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
        
        
    }

}
