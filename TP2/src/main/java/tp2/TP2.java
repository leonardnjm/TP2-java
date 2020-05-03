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
        PileEntiers pile3 = new PileEntiers();     
        for(int i=0;i<5;i++){
        int a = 1+(int)(Math.random()*100);
            if(a%2==0){
                pile1.empiler(a);
            }
            else pile3.empiler(a);
        }
        pile1.depiler();
        System.out.println(pile1.maListe.liste);
        System.out.println(pile3.maListe.liste);
}
}