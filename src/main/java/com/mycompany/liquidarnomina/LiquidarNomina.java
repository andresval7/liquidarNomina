/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.liquidarnomina;

import java.util.Scanner;

/**
 *
 * @author elfos
 */
public class LiquidarNomina {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("****Bienvenido a la App Cooperativa XYZ.****");
        System.out.println("****Ingrese por favor el nombre del empleado");
        String nombre= inputData.next();
        System.out.println("****Digite 1 si el empleado es operativo o 2 si es comercial");
        int tipoEmpleado= inputData.nextInt();
        Empleado empleado = new Empleado(nombre,tipoEmpleado);
        Empleador empleador = new Empleador (empleado.getSalarioBase());
        System.out.println("*********************************************");
        System.out.println("****El empleado:"+empleado.getNombre());
        System.out.println("****Salario base: $"+empleado.getSalarioBase());
        System.out.println("****Descuento salud: -$"+empleado.liquidarEpsEmpleado());
        System.out.println("****Descuento pensión: -$"+empleado.liquidarPensionEmpleado());
        System.out.println("****Auxilio de transporte: $"+empleado.getAuxilioTransporte());
        System.out.println("****Total a devengar: $"+empleado.salarioADevengar());
        System.out.println("*********************************************");
        System.out.println("****El empleador debe pagar:");
        System.out.println("****Salud: $"+empleador.calcularSalud());
        System.out.println("****Pensiones: $"+empleador.calcularPension());
        System.out.println("****ARL: $"+empleador.calcularArl());
        System.out.println("****provisión de prima: $"+empleador.calcularProvisionPrima());
        System.out.println("****provisión de Cesantías: $"+empleador.calcularProvisionCesantias());
        System.out.println("****provisión de Intereses de Cesantías: $"+empleador.calcularProvisionInteresesCesantias());
        System.out.println("****provisión de vacaciones: $"+empleador.calcularProvisionVacaciones());
        
    }
}
