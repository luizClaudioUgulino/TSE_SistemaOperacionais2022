/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author lcunha
 */
public class filosofo {
    
    String pensar = "pensar";
    String comer = "comer";
    String estado = "pensar";
    
    
    
    public String pensar(){
     estado = this.pensar;
        return estado;
    }
    
    
    public String comer(){
     estado = this.comer;
        return estado;
    }
    
    
    
    
}
