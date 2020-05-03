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
    
        
    
    static void tourHanoi(int n, String pile1, String pile2, String pile3, int compteur){
        if (n==0){
            System.out.println("nombre de coup: " + compteur);
            return;
        }
        tourHanoi(n-1, pile1, pile3, pile2, compteur);
        System.out.println("Mouvement du disque " + n + " pile de départ " + pile1 + " pile d'arrivée " + pile3);
        tourHanoi(n-1, pile2, pile1, pile3, compteur);
    }
    
    public static void main(String[] args) {
        java.util.Scanner entree =   new java.util.Scanner(System.in);
        System.out.println("Entrez le nombre de disque: ");
	int n = entree.nextInt();
        int compteur= 0;
        tourHanoi(n, "pile1", "pile2", "pile3", compteur++);
	}
}
