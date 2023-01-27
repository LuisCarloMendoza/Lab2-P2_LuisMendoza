/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_luismendoza;

import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
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
        
        System.out.println("Ingrese el numero de la casa");
        int numeroCasa = entrada.nextInt();
        System.out.println("Ingrese el numero del bloque");
        int numeroBloque = entrada.nextInt();
        System.out.println("Ingrese el color de la casa");
        Color color = JColorChooser.showDialog(null, "Elija un color", Color.yellow);
        System.out.println("Ingrese el ancho de la casa");
        double ancho = entrada.nextDouble();
        System.out.println("Ingrese el largo de la casa");
        double largo = entrada.nextDouble();
        System.out.println("Ingrese el numero de baños");
        int bath = entrada.nextInt();
        System.out.println("Ingrese el numero de habitaciones");
        int cuartos = entrada.nextInt();
        System.out.println("Ingrese el estado");
        String estado = entrada.next();
        estado += entrada.nextLine();
        
        Casa c = new Casa(numeroCasa,numeroBloque,color,ancho,largo,bath,cuartos,estado,"");
        return c;
        
    }
    
    public static Edificio addEdificio(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de pisos");
        int pisos = entrada.nextInt();
        
        System.out.println("Ingrese el numero de locales");
        int locales = entrada.nextInt();
        
        System.out.println("Ingrese la dirección");
        String cadena = entrada.next();
        cadena += entrada.nextLine();
        
        System.out.println("Ingrese el estado");
        String cadena2 = entrada.next();
        cadena2 += entrada.nextLine();
        
        Edificio e = new Edificio(pisos,locales,cadena,cadena2,"");
        
        return e;
        
        
    }
    
    public static Solar addSolar(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho del solar");
        double ancho = entrada.nextDouble();
        
        System.out.println("Ingrese el largo del solar");
        double largo = entrada.nextDouble();
        
        System.out.println("Ingrese el estado del solar");
        String cadena = entrada.next();
        cadena += entrada.nextLine();
        
        Solar s = new Solar(ancho,largo,cadena,"");
        
        return s;
        
    }
    
    
    
    

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Usuario admin = new Usuario("Administrador", 55, "admin","admin1234");
        
        int z =0;
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

                if (opcion == 1) {
                    
                    Usuario currentUser = new Usuario("lol", 175, "lol","lol");
                    
                    int opcion2 = 0;
                    
                    System.out.println("Ingrese el Username");
                    String user = sc.next();
                    user += sc.nextLine();
                    
                    System.out.println("Ingrese el Password");
                    String pass = sc.next();
                    pass += sc.nextLine();
                    
                    for (int i = 0; i < usuarios.size(); i++) {
                        if(usuarios.get(i).getUsername().equalsIgnoreCase(user) && usuarios.get(i).getPassword().equalsIgnoreCase(pass)){
                            System.out.println("Te haz log in " + usuarios.get(i).getNombre());
                            z = i;
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
                                        
                                        propiedades.add(addCasa());
                                      
                                    } else if(opcion5 == 2) {
                                        
                                        propiedades.add(addEdificio());
                                        
                                    } else if(opcion5 == 3){
                                        
                                        propiedades.add(addSolar());
                                        
                                    } else{
                                        System.out.println("Opción no valida");
                                    }
                                    
                                } else if(opcion4 == 2 && propiedades.size() > 0){
                                    
                                    for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println("");
                                        System.out.println(i +".");
                                        System.out.println(propiedades.get(i));
                                        System.out.println("");
                                        
                                    }
                                    
                                    
                                } else if(opcion4 == 3 && propiedades.size()>0){
                                    
                                    System.out.println("Elija la propiedad que desea modiciar");
                                    
                                    for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println("");
                                        System.out.println(i +".");
                                        System.out.println(propiedades.get(i));
                                        System.out.println("");
                                        
                                    }
                                    
                                    int modificar = sc.nextInt();
                                    
                                    if(propiedades.get(modificar) instanceof Casa){
                                        
                                        System.out.println("1. Modificar el numero de casa");
                                        System.out.println("2. Modificar el bloque");
                                        System.out.println("3. Modificar el Color");
                                        System.out.println("4. Modificar el ancho");
                                        System.out.println("5. Modificar el largo");
                                        System.out.println("6. Modificar baños");
                                        System.out.println("7. Modificar cuartos");
                                        
                                        int modificar2 = sc.nextInt();
                                        
                                        switch(modificar2){
                                            
                                            case 1: 
                                                
                                                System.out.println("Ingrese el numero de casa");
                                                int mod1 = sc.nextInt();
                                                ((Casa)propiedades.get(modificar)).setNumeroCasa(mod1);
                                                
                                                break;
                                            
                                            case 2:
                                                
                                                System.out.println("Ingrese el numero de bloque");
                                                int mod2 = sc.nextInt();
                                                ((Casa)propiedades.get(modificar)).setNumeroBloque(mod2);
                                                
                                                break;
                                                
                                            case 3: 
                                                
                                                System.out.println("Ingrese el Color");
                                                Color mod3 = JColorChooser.showDialog(null, "Elija un color", Color.yellow);
                                                ((Casa)propiedades.get(modificar)).setColor(mod3);
                                                
                                                break;
                                                
                                            case 4: 
                                                
                                                System.out.println("Ingrese el ancho");
                                                double mod4 = sc.nextDouble();
                                                ((Casa)propiedades.get(modificar)).setAncho(mod4);
                                                
                                                break;
                                                
                                            case 5:
                                                
                                                System.out.println("Ingrese el largo");
                                                double mod5 = sc.nextDouble();
                                                ((Casa)propiedades.get(modificar)).setLargo(mod5);
                                                
                                                break;
                                                
                                                
                                            case 6:
                                                
                                                System.out.println("Ingrese la cantidad de baños");
                                                int mod6 = sc.nextInt();
                                                ((Casa)propiedades.get(modificar)).setBath(mod6);
                                                
                                                break;
                                                
                                            case 7:
                                                
                                                System.out.println("Ingrese la cantidad de cuartos");
                                                int mod7 = sc.nextInt();
                                                ((Casa)propiedades.get(modificar)).setCuartos(mod7);
                                                
                                                
                                                break;
                                                
                                            default:
                                                
                                                System.out.println("Opción no valida");
                                                
                                                break;
                                        }
                                        
                                        
                                    } else if(propiedades.get(modificar) instanceof Edificio){
                                        
                                        System.out.println("1. Modificar pisos");
                                        System.out.println("2. Modificar locales");
                                        System.out.println("3. Modiciar Dirección");
                                        
                                        int modificar3 = sc.nextInt();
                                        
                                        switch(modificar3){
                                            
                                            case 1:
                                                
                                                System.out.println("Ingrese la cantidad de pisos");
                                                int mod8 = sc.nextInt();
                                                ((Edificio)propiedades.get(modificar)).setPisos(mod8);
                                                
                                                break;
                                                
                                            case 2:
                                                
                                                System.out.println("Ingrese la cantidad de locales");
                                                int mod9 = sc.nextInt();
                                                ((Edificio)propiedades.get(modificar)).setLocales(mod9);
                                                
                                                break;
                                                
                                                
                                            case 3: 
                                                
                                                System.out.println("Ingrese la dirección");
                                                String mod10 = sc.next();
                                                mod10 += sc.nextLine();
                                                ((Edificio)propiedades.get(modificar)).setDireccion(mod10);
                                                
                                                break;
                                                
                                            default:
                                                
                                                System.out.println("Opción no valida");
                                                
                                                break;
                                                
                                            
                                        }
                                        
                                        
                                    } else{
                                        
                                        System.out.println("1. Ancho");
                                        System.out.println("2. Largo");
                                        
                                        int modificar4 = sc.nextInt();
                                        
                                        switch(modificar4){
                                            
                                            case 1: 
                                                
                                                System.out.println("Ingrese el ancho");
                                                double mod11= sc.nextDouble();
                                                ((Solar)propiedades.get(modificar)).setAncho(mod11);
                                                
                                                break;
                                           
                                            case 2: 
                                                
                                                System.out.println("Ingrese el largo");
                                                double mod12= sc.nextDouble();
                                                ((Solar)propiedades.get(modificar)).setAncho(mod12);
                                                
                                                break;
                                                
                                            default:
                                                
                                                System.out.println("Opción no valida");
                                                
                                                break;
                                            
                                            
                                        }
                                        
                                    }
                                    
                                    
                                    
                                } else if(opcion4 == 4 && propiedades.size() > 0){
                                    
                                    for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println("");
                                        System.out.println(i +".");
                                        System.out.println(propiedades.get(i));
                                        System.out.println("");
                                        
                                    }
                                    
                                    System.out.println("Elija la propiedad que desea eliminar");
                                    int remove = sc.nextInt();
                                    propiedades.remove(remove);
                                    
                                    
                                    
                                } else {
                                    System.out.println("Opción no valida");
                                }
                                
                                
                                
                                
                                 
                                
                            } else if(opcion3 == 2 && propiedades.size()>0) {
                                
                                for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println(i+".");
                                        System.out.println(propiedades.get(i));
                                        
                                    }
                                
                                    int manejo = sc.nextInt();
                                    
                                    if(propiedades.get(manejo) instanceof Casa){
                                        
                                        System.out.println("Ingrese el nuevo estado");
                                        String estado = sc.next();
                                        estado += sc.nextLine();
                                        ((Casa)propiedades.get(manejo)).setEstado(estado);
                                        
                                        
                                    } else if(propiedades.get(manejo) instanceof Edificio){
                                        
                                        System.out.println("Ingrese el nuevo estado");
                                        String estado2 = sc.next();
                                        estado2 += sc.nextLine();
                                        ((Edificio)propiedades.get(manejo)).setEstado(estado2);
                                        
                                        
                                    } else{
                                        
                                        System.out.println("Ingrese el nuevo estado");
                                        String estado3 = sc.next();
                                        estado3 += sc.nextLine();
                                        ((Solar)propiedades.get(manejo)).setEstado(estado3);
                                        
                                    }
                                
                                
                                
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
                            
                            System.out.println("1. Ver Lista");
                            System.out.println("2. Comprar");
                            System.out.println("3. Logout");
                            
                            int opcionUsuario = sc.nextInt();
                            
                            switch(opcionUsuario){
                                
                                case 1: 
                                    
                                    for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println("");
                                        System.out.println(i +".");
                                        System.out.println(propiedades.get(i));
                                        System.out.println("");
                                        
                                    }
                                    
                                    
                                    break;
                                    
                                case 2: 
                                    
                                    for (int i = 0; i < propiedades.size(); i++) {
                                        
                                        System.out.println("");
                                        System.out.println(i+".");
                                        System.out.println(propiedades.get(i));
                                        System.out.println("");
                                        
                                    }
                                    
                                    int compra = sc.nextInt();
                                    
                                    if(propiedades.get(compra) instanceof Casa && ((Casa)propiedades.get(compra)).owner.equalsIgnoreCase("")  ){
                                        
                                        
                                        ((Casa)propiedades.get(compra)).setOwner(currentUser.getNombre());
                                        
                                        
                                    } else if(propiedades.get(compra) instanceof Edificio && ((Edificio)propiedades.get(compra)).owner.equalsIgnoreCase("")) {
                                        
                                        ((Edificio)propiedades.get(compra)).setOwner(currentUser.getNombre());
                                        
                                    } else if(propiedades.get(compra) instanceof Solar && ((Solar)propiedades.get(compra)).owner.equalsIgnoreCase("")) {
                                        
                                        ((Solar)propiedades.get(compra)).setOwner(currentUser.getNombre());
                                    }
                                    
                                    break;
                                    
                                    
                                case 3: 
                                    
                                    opcion2 = 3;
                                    System.out.println("Hasta la vista");
                                    
                                    break;
                                    
                                default:
                                    
                                    System.out.println("Opcion no valida");
                                    
                                    break;
                                
                                
                            }
                            
                            
                        
                        } while(opcion2 != 3);
                        
                        opcion2 = 0;
                        z =0;
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
