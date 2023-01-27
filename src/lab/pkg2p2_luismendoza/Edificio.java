/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismendoza;


public class Edificio {
    
    int pisos;
    int locales;
    String direccion;
    String estado;

    public Edificio() {
    }

    public Edificio(int pisos, int locales, String direccion, String estado) {
        this.pisos = pisos;
        this.locales = locales;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    
    
    
    
    
}
