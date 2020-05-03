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
    public ArrayList<Object> liste;
    
    public Liste(){
        liste= new ArrayList<>();
        posAct=0;
    }
    
    public void dernier(){
        posAct=liste.size()-1;
    }
    
    public Object suivant(){
        Object c=null;
        if(posAct<liste.size()){
            c=liste.get(posAct+1);
        }
        return c;
    }
    
    public void ajouter (Object ob){
    ////utilisation de la methode add
    liste.add(posAct,ob);
    posAct++;
    }
    
    public void premier (){
        posAct=0;
    }
    
    public Object supprimer(){
        Object b=null;
        if(liste.isEmpty()==false){
            b=liste.remove(posAct);
            posAct--;
        }
        return b;
    }
    
    public void affichage(){
    
    System.out.println("ArrayList : " + liste);
    }
}
