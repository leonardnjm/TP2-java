/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Leo
 */
public class TP2 {
    
    public static void main(String[] args) {
        PileEntiers pile1 = new PileEntiers();     
        PileEntiers pile2 = new PileEntiers();     
        PileEntiers pile3 = new PileEntiers();     
        for(int i=0;i<5;i++){
        int a = 1+(int)(Math.random()*100);
        pile1.empiler(a);
            if(a%2==0){
                System.out.println("Déplacement de l'élément "+i+" de pile1 vers pile2");
                pile2.empiler(a);
            }
            else pile3.empiler(a);
            System.out.println("Déplacement de l'élément "+i+" de pile1 vers pile3 ");
        }
        System.out.println("Pile 1: "+pile1.maListe.liste);
        System.out.println("Pile 2: "+pile2.maListe.liste);
        System.out.println("Pile 3: "+pile3.maListe.liste);
}
}