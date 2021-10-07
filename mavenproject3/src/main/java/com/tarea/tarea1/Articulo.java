/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

import java.util.ArrayList;

/**
 *
 * @author noisex
 */
abstract class Articulo {
    private String codigo;
    private String nombre;
    private ArrayList<Costo> costo = new ArrayList<Costo>();
    private ArrayList<Ventas> venta = new ArrayList<Ventas>();

    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCosto(Costo costo) {
        this.costo.add(costo);
    }
    public ArrayList<Costo> getCosto (){
        return this.costo;
    }
    
    public void setVentas (Ventas venta){
        this.venta.add(venta);
    }
    
    public ArrayList<Ventas> getVenta (){
        return this.venta;
    }
    
    abstract void costeo();

}


