/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentapalabras;

import java.util.Scanner;

/**
 *
 * @author ejerper
 */
public class CuentaPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contrasena = "";
        boolean validacontrasena = true;
        Scanner scanner = new Scanner(System.in);
       
        /**
         * Llama a la funcion validarContrasenia
         */
        do {
            System.out.println("Ingrese contraseña");
            contrasena = scanner.nextLine();
            validacontrasena = validapasswd(contrasena);
        } while (validacontrasena);

        
        /**
         * <pre>
         * Pregunta la palabra y llama a cuentaPalabras
         * Pregunta si desea continuar y llama a la funcion retornaEseEne para ver si continua o no en el do{}while
         * </pre>
         */
        String eseoene = "n";
        do {
            String palabra = "";
            System.out.println("Digite la palabra");
            palabra = scanner.nextLine();
            if (isAlpha(palabra) == true){
                cuentaPalabras(palabra);
            }else{
            System.out.println("Ingreso numeros pailas");
            }
            
            
            System.out.println("Desea continuar ? ( s/n)");
            eseoene = scanner.nextLine();
        } while (retornaEseEne(eseoene)); 
    }    
        
    public static boolean isAlpha(String palabra) {
    return palabra.matches("[a-zA-Z]+");
}  
    public static boolean retornaEseEne(String eseoene) {
        if (eseoene.compareTo("s") == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Boolean validapasswd (String Contrasena){
            String contrasenaquemada = "password";
        if (contrasenaquemada.compareTo(Contrasena) == 0) {
            return false;
        } else {
            System.out.println("Contraseña errada");
            return true;
        }
           
}  
       
    public static String cuentaPalabras(String palabra) {
        int longitudPalabra = 0;
        String NumPalabra;
        NumPalabra = mapeo(longitudPalabra = palabra.length());
        //System.out.println("La longitud de la palabra es: " + NumPalabra);
        return NumPalabra;
    }

    
    public static String mapeo (int n){
        String numero="cero";
        switch(n) {
            case 1:
                System.out.println("La longitud de la palabra es uno");
                break;
            case 2:
               System.out.println("La longitud de la palabra es dos");
                break;
            case 3:
                System.out.println("La longitud de la palabra es tres");
                break;
            case 4:
                System.out.println("La longitud de la palabra es cuatro");
                break;
            case 5:
               System.out.println("La longitud de la palabra es cinco");
                break;
            case 6:
                System.out.println("La longitud de la palabra es seis");
                break;
            case 7:
                System.out.println("La longitud de la palabra es siete");
                break;
            case 8:
               System.out.println("La longitud de la palabra es ocho");
                break;
            case 9:
                System.out.println("La longitud de la palabra es nueve");
                break;
            case 10:
                System.out.println("La longitud de la palabra es diez");
                break;
            case 11:
               System.out.println("La longitud de la palabra es once");
                break;
            case 12:
                System.out.println("La longitud de la palabra es doce");
                break;
            case 13:
                System.out.println("La longitud de la palabra es trece");
                break;
            case 14:
               System.out.println("La longitud de la palabra es catorce");
                break;
            case 15:
                System.out.println("La longitud de la palabra es quince");
                break;
            case 16:
                System.out.println("La longitud de la palabra es dieciseis");
                break;
            case 17:
               System.out.println("La longitud de la palabra es diecisiete");
                break;
            case 18:
                System.out.println("La longitud de la palabra es dieciocho");
                break;
            case 19:
                System.out.println("La longitud de la palabra es diecinueve");
                break;
            case 20:
               System.out.println("La longitud de la palabra es veinte");
                break;
            default:
               System.out.println("La longitud de la palabra es mayor a veinte caracteres"); 
// code block
        }
        
        return numero;
    }
    }
    

