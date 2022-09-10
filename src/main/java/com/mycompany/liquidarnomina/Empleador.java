/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liquidarnomina;

/**
 *
 * @author elfos
 */
public class Empleador {
    
    private double salarioBase;

    public Empleador(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalud(){
        return getSalarioBase()*0.12; 
    }
    
    public double calcularPension(){
        return getSalarioBase()*0.085; 
    }
    
    public double calcularArl(){
        return getSalarioBase()*0.00522;
    }
    
    public double calcularProvisionPrima(){
        return getSalarioBase()*0.0833;
    }
    
    public double calcularProvisionVacaciones(){
        return getSalarioBase()*0.0417;
    }
    
    public double calcularProvisionCesantias(){
        return getSalarioBase()*0.0833;
    }
    
    public double calcularProvisionInteresesCesantias(){
        return getSalarioBase()*0.01;
    }
    
    public double calcularParafiscales(){
        return getSalarioBase()*0.09;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

      
}
