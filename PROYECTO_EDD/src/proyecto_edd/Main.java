/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package proyecto_edd;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Usuario> usuarios = new LinkedList();
        Usuario nUsuario = new Usuario();
        Scanner input = new Scanner(System.in);
        String[]sOpciones={"Crear Usuario", "Ver un usuario"};
        int iNumeroU, cerrar, hacer;}}
        /*String seleccion;
        
        do{
            hacer = JOptionPane.showOptionDialog(null, "Elige una opción", "Menú de opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sOpciones, sOpciones[0]);
            
            switch(hacer){ 
                
            case 0:
                usuarios.add(nUsuario);
                CrearUsuario crear = new CrearUsuario(usuarios.getLast());
                crear.setVisible(true);
            break;
            
            case 1:
                seleccion = JOptionPane.showInputDialog(null, "Escribe el número de la posición en la cual se encuentra el usuario que deseas ver \n Actualmente hay "+usuarios.size()+" usuarios creados",
                        JOptionPane.PLAIN_MESSAGE);
                iNumeroU = Integer.valueOf(seleccion);
                VerUsuario ver = new VerUsuario(usuarios.get(iNumeroU));
                ver.setVisible(true);
            break;
            }
            
            System.out.println("Quieres volver al menú de elección \nEscribe 0 para repetir \nEscribe 1 para terminar");
            cerrar = input.nextInt();
        }while(cerrar==0);
        System.exit(0);
        }
    }


*/