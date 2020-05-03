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
    
    static void tourHanoi(int n, String pile1, String pile2, String pile3){
        if (n==1){
            System.out.println("Mouvement du disque 1 pile de départ " + pile1 + " pile d'arrivée " + pile2);
            return;
        }
        tourHanoi(n-1, pile1, pile2, pile3);
        System.out.println("Mouvement du disque " + n + " pile de départ " + pile1 + " pile d'arrivée " + pile2);
        tourHanoi(n-1, pile1, pile2, pile3);
    }
    
    public static void main(String[] args) {
	    	int n = 5;
                tourHanoi(n, "pile1", "pile2", "pile3");
	    }
}
