/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liquidarnomina;

/**
 *
 * @author elfos
 */
public class Empleado {
    
    private String nombre;
    private int tipoEmpleado;
    private double salarioBase;
    private double auxilioTransporte;

    public Empleado(String nombre, int tipoEmpleado) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        auxilioTransporte=117172;
        if(tipoEmpleado==1)
            salarioBase=1000000;
        else if(tipoEmpleado==2)
            salarioBase=1500000;
    }
    
    public double liquidarEpsEmpleado(){   
        return (getSalarioBase()*0.04);
    }
    
    public double liquidarPensionEmpleado(){
        return (getSalarioBase()*0.04);
    }
    
    public double salarioADevengar(){
        return (getSalarioBase()-liquidarEpsEmpleado()-liquidarPensionEmpleado()+getAuxilioTransporte());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(int auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
    
    
    
}
