/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula13;

import java.util.Random;

/**
 *
 * @author lcunha
 */
public class Aula13 {

    public static void main(String[] args) {
        
        thread_1 thread1 = new thread_1();
       thread_2 thread2 = new thread_2();
       thread_3 thread3 = new thread_3();
       thread_4 thread4 = new thread_4();
       thread_5 thread5 = new thread_5();
        
            Thread t1= new Thread(thread2);
            Thread t2= new Thread(thread3);
            Thread t3= new Thread(thread4);
            Thread t4= new Thread(thread5);
            Thread t5= new Thread(thread1);
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            
        
        
        }
        
        
        
        
        
        
        
    }

