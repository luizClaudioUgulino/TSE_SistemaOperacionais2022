/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;
import java.util.Random;
/**
 *
 * @author lcunha
 */
public class ciclo {
    private int pid[] = {10000,5000,7000,3000,3000,8000,2000,5000,4000,10000};
    private String[] Estado = new String[10]; 
    private int qt;
         
    private int[] tp = new int[10];
    private int[] nes = new int[10];
    private int[] cp = new int[10];
    private int Pid[] = {0,1,2,3,4,5,6,7,8,9};
    
    
    private String realizando = "executando";
    private String pausado = " pausado"; 
    private String ok = "ok";   
    
        Random aleatorio = new Random(); 
        
   
    
    public void cicloExecutando(){
         
         
                 
         for(int y = 0 ; y < 10 ; y ++){
            int qta= 0; 
            int nal= 0; 
            
            Estado[y] = realizando;
            
            if( Estado[y] == realizando){
                
             for(int x = pid[y]; x >= 0 ; x-- ){
                 
                 tp[y]++;
                 cp[y]= cp[y]+1;
                 nal = aleatorio.nextInt(100)+1;             
                 if(nal >=1 && nal <= 5  ){
                 
                     
                    Estado[y] =  pausado;
             
                    System.out.println("///////////////////////// atualizar /////////////////////////////////");      
                    System.out.println("(PID) :" + Pid[y] + " / (TP) :" +tp[y] + " / (CP) :"+ cp[y] + "\n (EP) :"+ Estado[y] + " / (NES) :"+nes[y] + " / (QT) :" + qt);
                   
                 cp[y]= cp[y]+1;
                 nes[y]++;
                 }
                 
                 else if(nal >=1 && nal <= 30 && Estado[y] == pausado ){
                 //System.out.println(" ok :" + y + "/ valor aleatorio 2 " +nal);
                 Estado[y] = ok;
                 x = 0;
                 cp[y]= tp[y]+1;
                 cp[y]= cp[y]+1;                 
                 }
                 
                 
                 qta++;
                 if(qta >= 1000){
                  qt++; 
                  Estado[y] = ok;
                  cp[y]= cp[y]+1;
                 qta = 0;
                 
                 x=0;
                 cp[y]= tp[y]+1;
                 
                   System.out.println("(PID) :" + Pid[y] + " / (TP) :" +tp[y] + " / (CP) :"+ cp[y] + "\n (EP) :"+ Estado[y] + " / (NES) :"+nes[y] + " / (QT) :" + qt);

                 }}}

             System.out.println("///////////////////////// Ultimo atualizacao /////////////////////////////////");
              System.out.println("(PID) :" + Pid[y] + "/ (TP) :" +tp[y] + "/ (CP) :"+ cp[y] + "\n (EP) :"+ Estado[y] + "/ (NES) :"+nes[y] + "/ (QT) :" + qt);    
         }}
       
        
     
      
        
        
    
    
    
    
    
    
    }
    
    
    
    

