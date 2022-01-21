/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_edd;

import javax.swing.ImageIcon;

/**
 *
 * @author Mauricio
 */
public class Usuario {
    
    ImageIcon iImagen = new ImageIcon();
    private String sApodo, sNombre, sDescripcion, sPSN, sNSFCode, sXboxGT, sSteam, sTwitter, sDiscord;
    private int iNoJuegos, iHoraxjuego;

    
    //Getters y Setters
    public String getsApodo() {
        return sApodo;
    }

    public void setsApodo(String sApodo) {
        this.sApodo = sApodo;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripción) {
        this.sDescripcion = sDescripción;
    }

    public int getiNoJuegos() {
        return iNoJuegos;
    }

    public void setiNoJuegos(int iNoJuegos) {
        this.iNoJuegos = iNoJuegos;
    }

    public int getiHoraxjuego() {
        return iHoraxjuego;
    }

    public void setiHoraxjuego(int iHoraxjuego) {
        this.iHoraxjuego = iHoraxjuego;
    }

    public String getsPSN() {
        return sPSN;
    }

    public void setsPSN(String sPSN) {
        this.sPSN = sPSN;
    }

    public String getsNSFCode() {
        return sNSFCode;
    }

    public void setsNSFCode(String sNSFCode) {
        this.sNSFCode = sNSFCode;
    }

    public String getsXboxGT() {
        return sXboxGT;
    }

    public void setsXboxGT(String sXboxGT) {
        this.sXboxGT = sXboxGT;
    }

    public String getsSteam() {
        return sSteam;
    }

    public void setsSteam(String sSteam) {
        this.sSteam = sSteam;
    }

    public String getsTwitter() {
        return sTwitter;
    }

    public void setsTwitter(String sTwitter) {
        this.sTwitter = sTwitter;
    }

    public String getsDiscord() {
        return sDiscord;
    }

    public void setsDiscord(String sDiscord) {
        this.sDiscord = sDiscord;
    }
    
    
    
}
