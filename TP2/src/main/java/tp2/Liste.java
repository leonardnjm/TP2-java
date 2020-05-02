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
public class Liste {
    
    public Liste(Object ob){
    iOb = ob;
    System.out.println("initialisation= "+iOb);
    }
    
    public void dernier(){
    int dernier=objectArray.length-1;
    }
    
    
    public void Ajouter (Object ob){
    iOb=ob;
    ////utilisation de la methode add
    Liste.add(ObjectAjouter);
    System.out.println(ObjectAjouter);
    }
    
    //possitionement sur premier element
    public int Premier ()
    {
    //recuperation du 1er element (position 0)
        PremierElement=Liste.get(0);
    }
    
    //Positionement sur dernier element
    public int Dernier()
    {
        //recuperation de la taille de la liste pour recup le dernier
        DernierElement=Liste.get(Liste.size()-1);
    }
    
    
}
