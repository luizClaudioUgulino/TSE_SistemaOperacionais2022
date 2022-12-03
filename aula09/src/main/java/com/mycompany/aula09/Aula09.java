/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula09;

import java.util.Random;

/**
 *
 * @author lcunha
 */
public class Aula09 {

    public static void main(String[] args) {
        int  lA = 10;
        int  lB = 100;
        int  coluna = 5;
        
        int[][] grupoA = new int[lA][coluna]; 
        int[][] grupoB = new int [lB][5]; 
        Random gerador = new Random();
  
        int x= 0;
        for(int l= 0 ;  l < lB; l++ ){      
       grupoB[l][0] = x;
       x++;
        }
        x = 1;
        for(int l= 0 ;  l < lB; l++ ){      
       grupoB[l][1] = x;
       x++;
        } 
        for(int l= 0 ;  l < lB; l++ ){      
       grupoB[l][2] = gerador.nextInt(50);}
        int valor;
        for(int l =0; l < lA; l++){    
            valor = gerador.nextInt(100);
        for(int c = 0; c < coluna;c++){     
        grupoA[l][c] = grupoB[valor][c]; 
        }}

        int k = 0;
        int processo;
        int caso;
        while(k < 2000){
        
           processo = gerador.nextInt(100);
            
            for(int l=0; l < lA; l++){
           
               if( grupoA[l][1] == processo){
               
                   grupoA[l][3] = grupoA[1][3]+1;
                   caso = gerador.nextInt(100);
                   
               if(caso >= 0 && caso <= 30){
                 
                   grupoA[l][2] = grupoA[l][2] +1;
                   grupoA[l][4] = 1;
               }}}
             for(int l=0; l < lA; l++){
               
               if(grupoA[l][4] == 1){

                    valor = gerador.nextInt(100);      
                    for(int c = 0; c < coluna;c++){   
                        if(grupoA[l][1] != valor ){
                    grupoA[l][c] = grupoB[valor][c]; 
                        }
        } } }
            
           k++; 
    }       
          //  System.out.println("---N---I---D---R---M---");
        for(int l =0;l < lA ; l++){

            System.out.print("linha :"+l+"/N-"+grupoA[l][0]);
            System.out.print("-I-"+grupoA[l][1]);
            System.out.print("-D-"+grupoA[l][2]);
            System.out.print("-R-"+grupoA[l][3]);
            System.out.print("-M-"+grupoA[l][4]);
            System.out.println();
        }
}}
