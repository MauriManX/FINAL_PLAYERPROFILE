/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_edd;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Mauricio
 */
public class MetodosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //Abrir un Link
        public void enlace (String enlaceAAceder){
        Desktop enlace=Desktop.getDesktop();
        try {
                enlace.browse(new URI(enlaceAAceder));
        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }
}
