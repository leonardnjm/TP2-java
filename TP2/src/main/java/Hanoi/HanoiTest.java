/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hanoi;

/**
 *
 * @author Alexandre
 */
public class HanoiTest {
    
    public void diques(int n){
        Hanoi iHanoi = new Hanoi();
        for(int i=0; i<n; i++){
            int iInt = (int)(Math.random()*100);
            iHanoi.setDiameter(iInt);
            iHanoi.iPE1.empiler(iHanoi.getDiameter());
        }
        iHanoi.iPE1.sort
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
	int n = entree.nextInt();
        disque(n);
        tourHanoi(n, "pile1", "pile2", "pile3");
	}
}
