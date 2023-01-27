/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismendoza;

import java.awt.Color;


public class Casa {
    
    int numeroCasa;
    int numeroBloque;
    Color color;
    double ancho;
    double largo;
    int bath;
    int cuartos;

    public Casa() {
    }

    
    
    public Casa(int numeroCasa, int numeroBloque, Color color, double ancho, double largo, int bath, int cuartos) {
        this.numeroCasa = numeroCasa;
        this.numeroBloque = numeroBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.bath = bath;
        this.cuartos = cuartos;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroBloque() {
        return numeroBloque;
    }

    public void setNumeroBloque(int numeroBloque) {
        this.numeroBloque = numeroBloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

   
    
    
    
    
    
    
    
}
