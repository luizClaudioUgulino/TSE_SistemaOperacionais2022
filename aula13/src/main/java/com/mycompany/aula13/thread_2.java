/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author luiz claudio
 */
public class thread_2 extends Thread {
      filosofo f1 = new filosofo(); //g1 //g2
        filosofo f2 = new filosofo(); //g2 //g3
        filosofo f3 = new filosofo(); //g3  //g4
        filosofo f4 = new filosofo(); //g4  //g5
        filosofo f5 = new filosofo();  //g5 //g1 
        
        garfo g1 = new garfo();
        garfo g2 = new garfo();
        garfo g3 = new garfo();
        garfo g4 = new garfo();
        garfo g5 = new garfo();
 
         private int tempo;
        
    public thread_2(){
    this.tempo = tempo;
    Thread t = new Thread(this);
    t.start();
    }
    
    
    @Override
    public void run(){
    
     int x = 500;
    while(x > 0){
    x--;
    try{
           if(f2.estado == "pensar" && g2.estado == "livre" && g3.estado == "livre"){
            f2.comer();
            g2.oculpado();
            g3.oculpado();
            System.out.println("//// Filosofo 2 esta comendo ////");
            }else if(f2.estado == "comer"){
            f2.pensar();
            g2.livre();
            g3.livre();
            System.out.println("//// Filosofo 2 esta pensando ////");
            }else if(f2.estado == "pensar"){
            System.out.println("//// Filosofo 2 tentou comer mas nao tem garfo////");
            }Thread.sleep(600);
    } catch(InterruptedException e){
    e.printStackTrace();
    }
    
    
    }
  
    
    
    }
        
}
