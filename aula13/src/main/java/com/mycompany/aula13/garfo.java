/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author lcunha
 */
public class garfo {
    
    String estado = "livre";
    String oculpado = "oculpado";
    String livre = "livre";
    
     public String oculpado(){
     estado = this.oculpado;
        return estado;
    }
    
    
    public String livre(){
     estado = this.livre;
        return estado;
    }
   
}
