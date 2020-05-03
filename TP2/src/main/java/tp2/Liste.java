/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class Liste {

    public int posAct;
    public Object iOb;
    public int objectArray[];
    public ArrayList<Object> liste;
    
    public Liste(Object ob){
    iOb = ob;
    System.out.println("initialisation= "+iOb);
    }
    
    public void dernier(){
    int dernier=objectArray.length-1;
    }
    
    public Object Suivant(){
    posAct = posAct+1;
    return objectArray[posAct];
    }
    
    public void Ajouter (Object ob){
    iOb = ob;
    ////utilisation de la methode add
    liste.add(iOb);
    System.out.println(iOb);
    }
    
    //Suppression d'un objet de la liste
    public void Supprimer(){
        int element=objectArray[posAct];
        //Utilisation de la méthode remove
        liste.remove(element);
    }
    
    //possitionement sur premier element
    public void Premier ()
    {
    //recuperation du 1er element (position 0)
        int premier=objectArray[0];
    }
}
