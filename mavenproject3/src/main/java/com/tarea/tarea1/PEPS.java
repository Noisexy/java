/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

/**
 *
 * @author noisex
 */
public class PEPS extends Articulo
{

    @Override
    void costeo() {
       for (int i = 0; i<this.getCosto().size(); i++){
           System.out.println(this.getCosto().get(i).getNumero());
       }
    }
    
}
