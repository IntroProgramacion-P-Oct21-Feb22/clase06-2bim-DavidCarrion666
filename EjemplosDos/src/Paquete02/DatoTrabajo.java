/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
     public static String nombreEmpresa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();
        
        return nombreEmpresa;
    }
    
    public static String direccionEmpresa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dirección de la empresa");
        String direccionEmpresa = entrada.nextLine();
        
        return direccionEmpresa;
    }
}
