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
    
 /*   public Pile (){
        maListe= new Liste(null);
    }
  */  
    public void empiler (Object ob){
        maListe.dernier();
        maListe.Ajouter(ob);
    }
    
    public void depiler (Object ob){
        maListe.dernier();
        maListe.Supprimer();
    }
}
