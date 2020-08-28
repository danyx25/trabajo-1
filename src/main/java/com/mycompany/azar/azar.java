
package com.mycompany.azar;

import java.util.Random;
import java.util.Scanner;

public class azar {
      public void arreglo() {
        
        System.out.println("El numero random se encontrará en el doble de la cantidad de números que elija.");
        System.out.println("Ingrese el total de números que quiere usar: ");
        Scanner ent=new Scanner(System.in);
        int b=ent.nextInt();
        int[] arreglo = new int[b];
        Random r= new Random();
        int ram=r.nextInt(b*2)+1;
        int aux=0;
        int a=0;
        while(aux==0){
            System.out.println("Ingrese sus números");
            for(int i=0;i<arreglo.length;i++){ 
            arreglo[i]=ent.nextInt();}
            for(int i=0;i<arreglo.length;i++){
                a=arreglo[i];
            if(a==ram){
                    aux=1;
                }
            }
            System.out.println("El número ganador es: "+ram);
            aux=2;
            }
        if(aux==1){
            System.out.println("Felicidades has ganado");
        }else{System.out.println("Lo siento has perdido");}   
           
        
    }
}


