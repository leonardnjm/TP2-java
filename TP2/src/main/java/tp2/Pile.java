/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Leo
 */
public class Pile {

    protected Liste maListe;
    
    
    public Pile (){
        maListe= new Liste();
    }

   
    public void empiler (Object ob){
        maListe.dernier();
        maListe.ajouter(ob);
    }
    
    public void depiler (){
        maListe.dernier();
        maListe.supprimer();
    }
    
        public void affichage(){
    
    System.out.println("ma Pile1 : " + maListe.liste);
    }
    
}
