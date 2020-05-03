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
    bonjour leo
    public Liste iListe;
    
    public Pile (){
        iListe= new Liste(null);
    }
    
    public void empiler (Object ob){
        iListe.Ajouter(ob);
    }
    
    public void dépiler (){
        iListe.Supprimer();
    }
}
