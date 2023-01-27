/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_luismendoza;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_LuisMendoza {
    
    public static Usuario addUsuario(){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        System.out.println("Ingrese su username");
        String user = sc.nextLine();

        System.out.println("Ingrese su password");
        String pass = sc.nextLine();
        
        Usuario u = new Usuario(nombre,edad,user,pass);
        
        return u;

    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        ArrayList propiedades = new ArrayList();
        ArrayList <Usuario> usuarios = new ArrayList();
        
        System.out.println("Bienvenido a inmobiliaria Black Floyd");
        
                
            do{
        
                System.out.println("1. Login");
                System.out.println("2. Create User");
                System.out.println("3. Salir");

                opcion = sc.nextInt();

                if (opcion == 1 && (usuarios.size() != 0)) {
                    
                    System.out.println("Ingrese el Username");
                    
                    
                    System.out.println("Ingrese el Password");
                    
                
                    

                } else if (opcion == 2) {

                    usuarios.add(addUsuario());

                } else if (opcion == 3) {

                System.out.println("Hasta la vista");

                } else{
                    System.out.println("Opción no valida");
                }
        
            } while(opcion != 3);
            
            
        
        
        
    }
    
}
