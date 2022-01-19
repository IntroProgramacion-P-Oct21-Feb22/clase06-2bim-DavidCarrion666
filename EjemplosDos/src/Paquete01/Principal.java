/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete01;

import Paquete02.DatoPersonal;
import Paquete03.DatosUbicacion;
import Paquete02.DatoTrabajo;
import Paquete04.DatoAcademico;
import Paquete05.DatoFinal;


/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        nombreEmpresa = DatoTrabajo.nombreEmpresa();
        direccionEmpresa = DatoTrabajo.direccionEmpresa();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la Empresa: %s\n"
                + "Dirección de la Empresa: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                nombreEmpresa,
                direccionEmpresa,
                promedio);
    }
    
}
