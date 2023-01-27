/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_luismendoza;

import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JColorChooser;

public class Lab2P2_LuisMendoza {
    
    public static Usuario addUsuario(){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        nombre += sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        System.out.println("Ingrese su username");
        String user = sc.next();
        user += sc.nextLine();

        System.out.println("Ingrese su password");
        String pass = sc.next();
        pass += sc.nextLine();
        
        Usuario u = new Usuario(nombre,edad,user,pass);
        
        return u;

    }
    
    public static Casa addCasa(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        int numeroCasa = entrada.nextInt();
        int numeroBloque = entrada.nextInt();
        Color color = JColorChooser.showDialog(null, "Elija un color", Color.yellow);
        double ancho = entrada.nextDouble();
        double largo = entrada.nextDouble();
        int bath = entrada.nextInt();
        int cuartos = entrada.nextInt();
        String estado = entrada.next();
        estado += entrada.nextLine();
        
        Casa c = new Casa(numeroCasa,numeroBloque,color,ancho,largo,bath,cuartos,estado);
        
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Usuario admin = new Usuario("Administrador", 55, "admin","admin1234");
        
        
        int opcion = 0;
        
        ArrayList propiedades = new ArrayList();
        ArrayList <Usuario> usuarios = new ArrayList();
        usuarios.add(admin);
        
        System.out.println("Bienvenido a inmobiliaria Black Floyd");
        
                
            do{
        
                System.out.println("1. Login");
                System.out.println("2. Create User");
                System.out.println("3. Salir");

                opcion = sc.nextInt();

                if (opcion == 1 && (usuarios.size() > 1)) {
                    
                    Usuario currentUser = new Usuario("lol", 175, "lol","lol");
                    
                    int opcion2 = 0;
                    
                    System.out.println("Ingrese el Username");
                    String user = sc.nextLine();
                    
                    System.out.println("Ingrese el Password");
                    String pass = sc.nextLine();
                    
                    for (int i = 0; i < usuarios.size(); i++) {
                        if(usuarios.get(i).getUsername().equalsIgnoreCase(user) && usuarios.get(i).getPassword().equalsIgnoreCase(pass)){
                            System.out.println("Te haz log in " + usuarios.get(i).getNombre());
                            currentUser = usuarios.get(i);
     
                        } else if(usuarios.get(i).getUsername().equalsIgnoreCase("admin") && usuarios.get(i).getPassword().equalsIgnoreCase("admin1234")){
                            System.out.println("Bienvenido Administrador");
                            currentUser = usuarios.get(0);
                        } else{
                            System.out.println("No se encontro nadie con esos datos");
                        }
                    }
                    
                    // Experiencia de Admin
                    
                    
                    if(currentUser.equals(usuarios.get(0))){
                    
                        do{
                            System.out.println("1. Registro de Inmueble/Solar ");
                            System.out.println("2. Manejo de estados");
                            System.out.println("3. Log out ");
                            int opcion3 = sc.nextInt();
                            
                            if(opcion3 == 1){
                                
                                System.out.println("1. Crear propiedad");
                                System.out.println("2. Listar propiedades");
                                System.out.println("3. Modificar propiedad");
                                System.out.println("4. Borrar propiedad");
                                
                                int opcion4 = sc.nextInt();
                                
                                if(opcion4 == 1){
                                    
                                    System.out.println("1. Agregar casa");
                                    System.out.println("2. Agregar edificio");
                                    System.out.println("3. Agregar Solar Baldío");
                                    
                                    int opcion5 = sc.nextInt();
                                    
                                    if(opcion5 == 1){
                                        
                                        
                                        
                                    } else if(opcion == 2) {
                                        
                                    } else if(opcion == 3){
                                        
                                    } else{
                                        System.out.println("Opción no valida");
                                    }
                                    
                                    
                                    
                                    
                                    
                                } else if(opcion4 == 2){
                                    
                                } else if(opcion4 == 3){
                                    
                                } else if(opcion4 == 4){
                                    
                                } else {
                                    System.out.println("Opción no valida");
                                }
                                
                                
                                
                                
                                 
                                
                            } else if(opcion3 == 2) {
                                
                            } else if(opcion3 == 3){
                                
                                opcion2 = 3;
                                
                                System.out.println("Hasta la vista administrador");
                                
                            } else{
                                System.out.println("Opción no valida");
                            }
                           
                        } while(opcion2 != 3);
                    
                    
                    // Experiencia de Usuario   
                        opcion2 = 0;
                        
                    } else if (!currentUser.equals(usuarios.get(0)) && currentUser.getEdad() != 175){
                        
                        do{
                            
                            
                        
                        
                        } while(opcion2 != 4);
                        
                        
                    }
                    
                    
                    
                
                    
                    
                    

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
