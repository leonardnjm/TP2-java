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
    public int N;
    private Object iOb;
    Object objectArray[];
    public ArrayList<Object> liste= new ArrayList();
    
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
    
    public void premier (){
        int premier=objectArray[0];
    }
    
    public void Supprimer(){
        liste.remove(posAct);
    }
}
