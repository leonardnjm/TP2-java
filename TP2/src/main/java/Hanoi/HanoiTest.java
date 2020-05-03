/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hanoi;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Alexandre
 */
public class HanoiTest {
    
    static void disques(int n){
        Hanoi iHanoi = new Hanoi();
        ArrayList<Integer> diametres = new ArrayList<>();
        for(int i=0; i<n; i++){
            int iInt = (int)(Math.random()*100);
            iHanoi.setDiameter(iInt);
            diametres.add(iHanoi.getDiameter());
        }
        Collections.sort(diametres);
        Collections.reverse(diametres);
        for(int i=0; i<n; i++){
            iHanoi.iPE1.empiler(diametres.get(i));
        }
        iHanoi.iPE1.affichage();
    }
    
    static void tourHanoi(int n, String pile1, String pile2, String pile3){
        if (n==0){
            return;
        }
        tourHanoi(n-1, pile1, pile3, pile2);
        System.out.println("Mouvement du disque " + n + " pile de départ " + pile1 + " pile d'arrivée " + pile3);
        tourHanoi(n-1, pile2, pile1, pile3);
    }
    
    public static void main(String[] args) {
        java.util.Scanner entree =   new java.util.Scanner(System.in);
        System.out.println("Entrez le nombre de disque: ");
        int n=entree.nextInt();
        while (n<0 || n>10){
            System.out.println("Cette valeur n'est pas valable! Entrez un nombre compris entre 0 et 10.");
            System.out.println("");
            System.out.println("Entrez le nombre de disque: ");
            n = entree.nextInt();
        }
        disques(n);
        tourHanoi(n, "pile1", "pile2", "pile3");
        System.out.println("Votre partie est terminée. Vous pouvez voir ci-dessus les action a effectuer pour réaliser un minumum de coup");
	}
}
