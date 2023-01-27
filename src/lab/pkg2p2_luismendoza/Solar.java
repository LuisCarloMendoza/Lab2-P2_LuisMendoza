/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismendoza;

/**
 *
 * @author luiscarlomendoza
 */
public class Solar {
    
    double ancho;
    double largo;
    String estado;
    String owner;

    public Solar() {
    }

    public Solar(double ancho, double largo, String estado, String owner) {
        this.ancho = ancho;
        this.largo = largo;
        this.estado = estado;
        this.owner = owner;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Solar{" + "ancho=" + ancho + ", largo=" + largo + ", estado=" + estado + ", owner=" + owner + '}';
    }
    
    
    
    
    
    
    
    
}
